package com.springboot.learn.Day_12_02_spring_state_machine;

import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.action.Action;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.StateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineConfigurationConfigurer;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;
import org.springframework.statemachine.listener.StateMachineListenerAdapter;
import org.springframework.statemachine.state.State;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.EnumSet;

@SpringBootApplication
@EnableJpaAuditing
public class Application implements CommandLineRunner {
    @Autowired
    private StateMachineService stateMachineService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Running.............................");
        stateMachineService.changeState();
    }

//    @Bean
//    public Action<OrderStates, OrderEvents> fulfilledToCancelAction()
}

@Service
@RequiredArgsConstructor
class StateMachineService{
    private final StateMachine<OrderStates, OrderEvents> stateMachine;
    public void changeState(){
        stateMachine.start();
        stateMachine.sendEvent(OrderEvents.PAY);
        stateMachine.sendEvent(OrderEvents.FULFILL);
    }
}

enum OrderStates {
    SUBMITTED,
    PAID,
    FULFILLED,
    CANCELED
}

enum OrderEvents {
    PAY,
    FULFILL,
    CANCEL
}

@Configuration
@EnableStateMachine
@RequiredArgsConstructor
class SimpleStateMachineConfig extends StateMachineConfigurerAdapter<OrderStates, OrderEvents> {
    private final PaymentAction paymentAction;

    @Override
    public void configure(StateMachineStateConfigurer<OrderStates, OrderEvents> states) throws Exception {
        states.withStates().
                initial(OrderStates.SUBMITTED)
                .states(EnumSet.allOf(OrderStates.class));
//                .state(OrderStates.PAID);
    }

    @Override
    public void configure(StateMachineTransitionConfigurer<OrderStates, OrderEvents> transitions) throws Exception {
        transitions.withExternal()
                .source(OrderStates.SUBMITTED)
                .target(OrderStates.PAID)
                .event(OrderEvents.PAY)
                .action(paymentAction)
                .and()
                .withExternal()
                .source(OrderStates.PAID)
                .target(OrderStates.FULFILLED)
                .event(OrderEvents.FULFILL)
                .action(config->{
                    System.out.println("PAID->FULFILLED ACTION");
                    System.out.println("transition: "+config.getTransition().getName());
                })
                .and()
                .withExternal()
                .source(OrderStates.FULFILLED)
                .target(OrderStates.CANCELED)
                .event(OrderEvents.CANCEL)
                .and()
                .withExternal()
                .source(OrderStates.PAID)
                .target(OrderStates.CANCELED)
                .event(OrderEvents.CANCEL);
    }


    @Override
    public void configure(StateMachineConfigurationConfigurer<OrderStates, OrderEvents> config) throws Exception {
        config.withConfiguration().listener(new StateMachineListenerAdapter<OrderStates, OrderEvents>(){
            @Override
            public void stateChanged(State<OrderStates, OrderEvents> from, State<OrderStates, OrderEvents>to) {
                System.out.println("State Changed: from : "+(from != null ? from.getId() : "null")+" to : "+to.getId());
            }
        });
    }
}


@Component
class PaymentAction implements Action<OrderStates, OrderEvents> {
    @Override
    public void execute(StateContext<OrderStates, OrderEvents> context) {
        State<OrderStates, OrderEvents> source = context.getSource();
        State<OrderStates, OrderEvents> target = context.getTarget();
        System.out.println("Action triggered");
        System.out.println("source : {} "+source.getId()+" target : "+target.getId());
    }
}

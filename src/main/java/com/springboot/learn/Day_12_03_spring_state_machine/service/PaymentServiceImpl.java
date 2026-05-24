package com.springboot.learn.Day_12_03_spring_state_machine.service;

import com.springboot.learn.Day_12_03_spring_state_machine.Payment;
import com.springboot.learn.Day_12_03_spring_state_machine.PaymentEvent;
import com.springboot.learn.Day_12_03_spring_state_machine.PaymentRepository;
import com.springboot.learn.Day_12_03_spring_state_machine.PaymentState;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineFactory;
import org.springframework.stereotype.Service;

import java.io.Serial;

@RequiredArgsConstructor
@Service
public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository paymentRepository;
    private final StateMachineFactory<PaymentState, PaymentEvent> stateMachineFactory;
    @Override
    public Payment newPayment(Payment payment) {
        return null;
    }

    @Override
    public StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId) {
        return null;
    }

    @Override
    public StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId) {
        return null;
    }

    @Override
    public StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId) {
        return null;
    }
}

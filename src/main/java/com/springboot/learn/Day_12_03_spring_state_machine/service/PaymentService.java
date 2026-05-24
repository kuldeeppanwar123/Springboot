package com.springboot.learn.Day_12_03_spring_state_machine.service;

import com.springboot.learn.Day_12_03_spring_state_machine.Payment;
import com.springboot.learn.Day_12_03_spring_state_machine.PaymentEvent;
import com.springboot.learn.Day_12_03_spring_state_machine.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {
    Payment newPayment(Payment payment);
    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);
    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);
    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);

}

package com.springboot.learn.Day_12_03_spring_state_machine;

public enum PaymentEvent {
    PRE_AUTHORIZE,
    PRE_AUTH_APPROVED,
    PRE_AUTH_DECLINED,
    AUTHORIZE,
    APPROVED,
    AUTH_DECLINED
}

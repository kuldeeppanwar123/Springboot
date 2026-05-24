package com.springboot.learn.Day_12_03_spring_state_machine;

public enum PaymentState {
    NEW,
    PRE_AUTH,
    PRE_AUTH_ERROR,
    AUTH,
    AUTH_ERROR
}

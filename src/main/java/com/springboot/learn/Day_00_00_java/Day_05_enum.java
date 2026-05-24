package com.springboot.learn.Day_00_00_java;

import java.util.Arrays;

enum Day {
    SUNDAY("sunday"),
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday");

    private String lowercase;

    Day(String lowercase) {
        this.lowercase = lowercase;
    }

    public String getLowercase() {
        return lowercase;
    }
}

enum Operation {
    ADD("+") {
        public int apply(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {
            public int apply(int a, int b){
                return a - b;
            }
    };

    private String symbol;

    Operation(String symbol) {
            this.symbol = symbol;
    }

    public abstract int apply(int a, int b);
}

public class Day_05_enum {
    public static void main(String[] args) {
        Operation op = Operation.ADD;
        System.out.println(op.apply(11,22));
    }
}

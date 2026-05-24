package com.springboot.learn.Day_00_00_java;

class ATM {
    synchronized void checkBalance(int balance) {
        System.out.println("balance is "+balance);
    }
   synchronized public void withdraw(String name, int withdraw) {
        System.out.println(name +" withdrawing "+withdraw);
    }
}

class Customer extends Thread{
    private ATM atm;
    private String name;
    private int amount;

    public Customer(String name, ATM atm, int amount) {
        this.atm = atm;
        this.name = name;
        this.amount = amount;
    }

    public void useAtm() {
        atm.checkBalance(amount);
        atm.withdraw(name, amount);
    }
    public void run() {
        useAtm();
    }
}
public class Day_02_Monitor {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Thread t1 = new Customer("Jack", atm, 100);
        Thread t2 = new Customer("Jane", atm, 200);
        t1.start();
        t2.start();
    }
}

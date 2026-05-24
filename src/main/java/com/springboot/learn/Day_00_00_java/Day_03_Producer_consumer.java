package com.springboot.learn.Day_00_00_java;
class MyDataCounter {
    int counter;
    boolean flag = true;
    synchronized void setCounter(int counter) {
        while(flag!=true) {
            try{wait();}catch(InterruptedException e){}
        }
        this.counter = counter;
        flag = false;
        notify();
    }
    synchronized int getCounter() {
        while(flag!=false) {
            try{wait();}catch(InterruptedException e){}
        }
        flag = true;
        notify();
        return counter;
    }
}

class Producer extends Thread {
    private MyDataCounter myDataCounter;
    public Producer(MyDataCounter myDataCounter) {
        this.myDataCounter = myDataCounter;
    }

    public void run () {
        int i=0;
        while (i<1000) {
            System.out.println("Producer : "+i);
            myDataCounter.setCounter(i++);
        }
    }
}

class Consumer extends Thread {
    private MyDataCounter myDataCounter;
    public Consumer(MyDataCounter myDataCounter) {
        this.myDataCounter = myDataCounter;
    }
    public void run () {
        int i=0;
        while(i<2000){
            System.out.println("Consumer : "+myDataCounter.getCounter());
            i++;
        }
    }
}

public class Day_03_Producer_consumer {
    public static void main(String[] args) {
        MyDataCounter myDataCounter = new MyDataCounter();
        Thread t1 = new Producer(myDataCounter);
        Thread t2 = new Consumer(myDataCounter);
        t1.start();
        t2.start();
    }
}

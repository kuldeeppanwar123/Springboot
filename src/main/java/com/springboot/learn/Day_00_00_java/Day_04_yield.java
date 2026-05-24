package com.springboot.learn.Day_00_00_java;

public class Day_04_yield extends Thread{
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(i + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
    public static void main(String[] args) {
        Day_04_yield d = new Day_04_yield();
        d.start();
        Thread.yield();
        for(int j=0;j<10;j++){
            System.out.println(j + " " + Thread.currentThread().getName());
        }
    }
}

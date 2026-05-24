package com.springboot.learn.Day_00_00_java;

class MyData{
    synchronized void print(String data) {
        data.chars().forEach(c -> System.out.print((char)c));
    }
}

class MyThread1 extends Thread{
    private MyData myData;
    public MyThread1(MyData myData){
        this.myData=myData;
    }
    @Override
    public void run() {
        myData.print("HelloWorld");
    }
}

class MyThread2 extends Thread{
    private MyData myData;
    public MyThread2(MyData myData){
        this.myData=myData;
    }
    @Override
    public void run() {
        myData.print("Welcome");
    }
}

public class Day_01_Monitor {
    public static void main(String[] args) {
        MyData myData=new MyData();
        MyThread1 myThread1 = new MyThread1(myData);
        MyThread2 myThread2 = new MyThread2(myData);
        myThread1.start();
        myThread2.start();
    }
}

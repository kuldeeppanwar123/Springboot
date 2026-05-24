package com.springboot.learn.Day_00_00_java;

import java.util.concurrent.*;

class CallableDemo implements Callable<Void> {
    int num;
    CallableDemo(int num) {
        this.num = num;
    }

    @Override
    public Void call() throws Exception {
        Integer i =1;
        System.out.println("call called");
        Thread.sleep(5000);
        System.out.println("call after 5sec");
        for(int j=1;j<num;j++){
            i=i*j;
        }
//        return i;
        return null;
    }
}
public class Day_06_Runnable {

    public static void main(String[] args) throws Exception {
        Callable<Void>myCallable = new CallableDemo(10);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Void> future = executor.submit(myCallable);
        System.out.println("started..");
        System.out.println("factorial: "+future.get());
        System.out.println("this is after main");
        executor.shutdown();
//        Executor
    }
}

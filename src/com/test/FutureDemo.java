package com.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {

    public static Future<RealCake> getCake() {
        ExecutorService threadpool = Executors.newCachedThreadPool();
        Future<RealCake> futureData = threadpool.submit(new Callable<RealCake>() {

            public RealCake call() throws Exception {
                RealCake realCake = new RealCake();
                Thread.currentThread().sleep(5000);;
                return realCake;
            }
        });
        return futureData;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Future<RealCake> cake = FutureDemo.getCake();
        System.out.println("买花去喽");
        // dosomething
        System.out.println("蛋糕的名字：" + cake.get().getName());
    }
}

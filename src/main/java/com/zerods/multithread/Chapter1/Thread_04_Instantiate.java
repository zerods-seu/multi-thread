package com.zerods.multithread.Chapter1;

/**
 * @author zerods
 * @version 1.0 20/10/2017
 */
public class Thread_04_Instantiate extends Thread {
    public Thread_04_Instantiate() {
        System.out.println("构造方法的打印" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法的打印" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread_04_Instantiate t = new Thread_04_Instantiate();
//        t.start();
        t.run();
    }
}

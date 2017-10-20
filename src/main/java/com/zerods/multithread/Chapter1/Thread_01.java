package com.zerods.multithread.Chapter1;

import java.util.concurrent.TimeUnit;

/**
 * @author zerods
 * @version 1.0 20/10/2017
 */
public class Thread_01 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread_01");
    }

    public static void main(String[] args) {
        Thread_01 t = new Thread_01();
        t.start();
        t.start();
        System.out.println("end");
    }
}

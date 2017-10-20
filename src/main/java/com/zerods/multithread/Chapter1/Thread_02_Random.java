package com.zerods.multithread.Chapter1;

import java.util.concurrent.TimeUnit;

/**
 * @author zerods
 * @version 1.0 20/10/2017
 */
public class Thread_02_Random extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                TimeUnit.MILLISECONDS.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread_02_Random t = new Thread_02_Random();
        t.setName("myThread_random");
        t.start();

        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                TimeUnit.MILLISECONDS.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

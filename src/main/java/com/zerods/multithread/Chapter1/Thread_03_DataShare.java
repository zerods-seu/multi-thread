package com.zerods.multithread.Chapter1;

/**
 * @author zerods
 * @version 1.0 20/10/2017
 */
public class Thread_03_DataShare extends Thread {
    private int count = 5;

    @Override
    public /*synchronized*/ void run() {
        while (count > 0) {
            count--;
            System.out.println(Thread.currentThread().getName() + ",count=" + count);
        }
    }

    public static void main(String[] args) {
        Thread_03_DataShare t = new Thread_03_DataShare();
        Thread a = new Thread(t, "A");
        Thread b = new Thread(t, "B");
        Thread c = new Thread(t, "C");
        Thread d = new Thread(t, "D");
        Thread e = new Thread(t, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}

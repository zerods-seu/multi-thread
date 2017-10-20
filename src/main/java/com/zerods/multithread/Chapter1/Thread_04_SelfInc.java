package com.zerods.multithread.Chapter1;

/**
 * @author zerods
 * @version 1.0 20/10/2017
 */
public class Thread_04_SelfInc extends Thread {
    private int i = 5;

    @Override
    public void run() {
        System.out.println("i=" + (i--) + " threadName=" + Thread.currentThread().getName());
    }

    public /*synchronized*/ static void main(String[] args) {
        Thread_04_SelfInc t = new Thread_04_SelfInc();
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

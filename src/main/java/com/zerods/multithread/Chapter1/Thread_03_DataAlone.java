package com.zerods.multithread.Chapter1;

/**
 * @author zerods
 * @version 1.0 20/10/2017
 */
public class Thread_03_DataAlone extends Thread {
    private int count = 5;

    public Thread_03_DataAlone(String name) {
        super(name);
        this.setName(name);
    }

    @Override
    public void run() {
        while (count > 0) {
            count--;
            System.out.println(Thread.currentThread().getName() + ",count=" + count);
        }
    }

    public static void main(String[] args) {
        Thread_03_DataAlone ta = new Thread_03_DataAlone("A");
        Thread_03_DataAlone tb = new Thread_03_DataAlone("B");
        Thread_03_DataAlone tc = new Thread_03_DataAlone("C");
        ta.start();
        tb.start();
        tc.start();
    }
}

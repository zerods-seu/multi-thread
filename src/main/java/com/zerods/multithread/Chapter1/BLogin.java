package com.zerods.multithread.Chapter1;

/**
 * @author zerods
 * @version 1.0 20/10/2017
 */
public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}

package com.zerods.multithread.Chapter1;

/**
 * @author zerods
 * @version 1.0 20/10/2017
 */
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;

    public synchronized static void doPost(String username, String password) {
        try {
            usernameRef = username;
            if (username.equals("a")) {
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username=" + usernameRef + " password=" + passwordRef);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }
}

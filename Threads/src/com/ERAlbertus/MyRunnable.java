package com.ERAlbertus;

import static com.ERAlbertus.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED+ "Hello from my Runnable's implementation of run()");
    }
}

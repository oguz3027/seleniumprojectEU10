package com.cydeo.tests.utilities;

public class BrowserUtils {

    public void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }


}

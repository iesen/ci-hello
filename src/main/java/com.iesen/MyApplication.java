package com.iesen;

/**
 * Created on 23/11/14.
 */
public class MyApplication {

    public static void main(String[] args) {
        EchoService echoService = new EchoService();
        System.out.println(echoService.echoArguments(args));
    }


}

package com.iesen;

/**
 * Created on 23/11/14.
 */
public class EchoService {

    public String echoArguments(String... arguments) {
        if (arguments.length == 0) {
            return "No arguments broken";
        }
        String result = "";
        for (String argument : arguments) {
            result += argument + ", ";
        }
        result = result.substring(0, result.length() - 2);
        return "Arguments: " + result;
    }
}

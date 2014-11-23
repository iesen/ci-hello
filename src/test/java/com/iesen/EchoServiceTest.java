package com.iesen;

import org.junit.Assert;
import org.junit.Test;

public class EchoServiceTest {

    @Test
    public void testEchoWithArguments() throws Exception {
        EchoService echoService = new EchoService();
        String result = echoService.echoArguments("hello", "world");
        Assert.assertEquals("Arguments: hello, world", result);
    }

    @Test
    public void testNoArguments() throws Exception {
        EchoService echoService = new EchoService();
        String result = echoService.echoArguments();
        Assert.assertEquals("No arguments", result);
    }
}
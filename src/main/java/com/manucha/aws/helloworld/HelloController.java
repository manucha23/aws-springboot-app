package com.manucha.aws.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {

    @GetMapping("/helloworld")
    public String get() throws UnknownHostException {
        String ip = InetAddress.getLocalHost().getHostAddress();
        return "Hello World from: " + ip;
    }
}

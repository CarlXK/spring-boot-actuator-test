package com.lee2.acutator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lee2
 */
@RestController
public class EchoController {

    @GetMapping("/test")
    public String test() {
        return "We are testing spring boot actuator now!";
    }
}

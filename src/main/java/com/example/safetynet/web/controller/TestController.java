package com.example.safetynet.web.controller;

import com.example.safetynet.web.dto.DataTest;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;

@RestController
@RequestMapping("/hello")
public class TestController {



    @GetMapping("/world")
    public String testEndpoint(@RequestParam(value = "nom", required = false, defaultValue = "inconnu") String name) {

        return "OK";
    }

    @GetMapping("/{type}")
    public String testEndpoint2(@PathVariable("type") Integer type) {
        switch (type) {
            case 1:
                return "Bonjour messieurs dames.";
            case 2:
                return "Salut la mif !";
            default:
                return "J'ai pas compris";
        }
    }

    @GetMapping("/data")
    public DataTest testEndpoint3() {
        DataTest test = new DataTest();
        test.setDate(new Date());
        test.setString("Ceci est une string");
        test.setString2("Ceci est aussi une string");
        test.setListe(Arrays.asList(1,5,4,7,8,5,14,658,241));

        return test;
    }
}

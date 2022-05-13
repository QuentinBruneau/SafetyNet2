package com.example.safetynet;

import com.example.safetynet.json.JsonInputReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SafetyNetApplication implements CommandLineRunner {

    @Autowired
    private JsonInputReader fichierJson;

    public static void main(String[] args) {
        SpringApplication.run(SafetyNetApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        fichierJson.loadJsonFile();
    }
}

package com.lsi.notifreader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*")
public class LsiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LsiApplication.class, args);
    }

}

package com.alexvicuna.testherokuspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class TestHerokuSpringApplication {

    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "Hello Everyone!";
    }

	public static void main(String[] args) {
		SpringApplication.run(TestHerokuSpringApplication.class, args);
	}

}

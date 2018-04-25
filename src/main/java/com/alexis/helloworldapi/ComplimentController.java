package com.alexis.helloworldapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ComplimentController {

    private Compliment[] compliments = {
            new Compliment("You look pretty today!"),
            new Compliment("You are a great programmer."),
            new Compliment("I hope you have a wonderful night!"),
            new Compliment("You are a nice person."),
            new Compliment("You have cool hair."),
            new Compliment("You are UNIQUE!"),
    };

    private Random rnd = new Random();

    @RequestMapping("/random")
    ResponseEntity<Compliment> randomCompliment() {
        Compliment randomCompliment = compliments[rnd.nextInt(compliments.length)];
        return new ResponseEntity<>(randomCompliment, HttpStatus.OK);
    }

}

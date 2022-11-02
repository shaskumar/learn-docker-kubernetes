package com.java.javapractice.controller;

import com.java.javapractice.model.PrintObject;
import com.java.javapractice.service.PrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class PrintRandomController {

    @Autowired
    PrintService printService;
    Random rnd = new Random();
    @GetMapping(path = "/random", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getRandom(){
        String str = "random number: " + rnd.nextInt(1, 100);
        return new ResponseEntity(new PrintObject(HttpStatus.OK.value(), printService.print(str)), HttpStatus.OK);
    }
}

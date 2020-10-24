package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    @GetMapping("/test")
    List<Double> getTest(){
    List<Double> list = new ArrayList<>();
    list.add(0.84654);
    list.add(65.485);
        return list;
    }
}

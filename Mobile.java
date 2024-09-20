package com.example.demo;

import com.example.demo.Legend;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Mobile {
    @GetMapping("/mobilelegends")
    public List<Legend> getProducts() {
        List<Legend> ml = new ArrayList<>();
        ml.add(new Legend(1L, "Kadita", 32000));
        ml.add(new Legend(2L, "Carmilla", 30000));

        return ml;
    }
}

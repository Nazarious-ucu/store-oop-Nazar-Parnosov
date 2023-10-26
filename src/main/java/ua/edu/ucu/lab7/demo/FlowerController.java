package ua.edu.ucu.lab7.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.lab7.demo.items.FlowerBucket;

@RestController
public class FlowerController extends  FlowerBucket {

    @GetMapping("/")
    public String home() {
        return "Hello, World!";
    }
}

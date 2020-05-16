package com.example.demo.space;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/space")
public class SpaceShipRestController {

    @GetMapping("/")
    public SpaceShip ship(){
        return new SpaceShip("Pyramid", 86);
    }
}

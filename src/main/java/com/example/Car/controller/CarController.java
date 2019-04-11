package com.example.Car.controller;

import com.example.Car.model.Car;
import com.example.Car.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(CarController.URL_CAR)
public class CarController {
    public static final String URL_CAR = "/api/v1/car";

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> getCars(){
        return this.carService.findAllCars();
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable Long id){
        return this.carService.findCarById(id);
    }

    @PostMapping
    public Car saveCar(@RequestBody Car c){
        return this.carService.saveCountry(c);
    }
}

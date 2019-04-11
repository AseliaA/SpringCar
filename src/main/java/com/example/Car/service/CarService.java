package com.example.Car.service;

import com.example.Car.model.Car;

import java.util.List;

public interface CarService {
    List<Car> findAllCars();
    Car findCarById(Long id);
    Car saveCountry(Car c);
}

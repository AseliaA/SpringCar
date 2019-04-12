package com.example.Car.service;

import com.example.Car.model.Car;
import com.example.Car.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> findAllCars() {
        return this.carRepository.findAll();
    }

    @Override
    public Car findCarById(Long id) {
        return carRepository.findById(id).get();
    }

    @Override
    public Car saveCountry(Car c) {
        return this.carRepository.save(c);
    }
}

package com.example.Car.repository;

import com.example.Car.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository
        extends JpaRepository<Car,Long> {
}

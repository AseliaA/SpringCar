package com.example.Car.bootstrap;

import com.example.Car.model.Car;
import com.example.Car.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CarBootstrap implements CommandLineRunner {

    private final CarRepository carRepository;

    public CarBootstrap(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Car c1 = new Car();
        c1.setName("Gran Torino");
        c1.setColor("Black");
        c1.setBrand("Ford");
        c1.setHorsePower(335);
        carRepository.save(c1);

        Car c2 = new Car();
        c2.setName("Light");
        c2.setColor("White");
        c2.setBrand("BMW");
        c2.setHorsePower(300);
        carRepository.save(c2);


        Car c3 = new Car();
        c3.setName("A");
        c3.setColor("Silver");
        c3.setBrand("Honda");
        c3.setHorsePower(250);
        carRepository.save(c3);

    }
}

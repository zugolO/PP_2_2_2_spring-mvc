package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {


    private List<Car> getCar;
    {
        getCar = new ArrayList<>();
        getCar.add(new Car("Car1",12345,"red"));
        getCar.add(new Car("Car2",23456,"blue"));
        getCar.add(new Car("Car3",34567,"white"));
        getCar.add(new Car("Car4",45678,"green"));
        getCar.add(new Car("Car5",56789,"black"));
    }

    @Override
    public List<Car> getCars(int count) {
        return getCar.stream().limit(count).collect(Collectors.toList());
    }


}

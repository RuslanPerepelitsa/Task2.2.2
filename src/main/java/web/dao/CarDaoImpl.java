package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("BMW",2012, 1_500_000));
        cars.add(new Car("Mercedes",2019, 3_200_000));
        cars.add(new Car("Audi",2020, 2_700_000));
        cars.add(new Car("Toyota",2021, 3_600_000));
        cars.add(new Car("Nissan",2008, 700_000));
    }

    @Override
    public List<Car> getCars(int number) {
        return cars.stream().limit(number).collect(Collectors.toList());
    }
}

package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> cars;

    public CarDaoImpl() {
        cars = getAllCars();
    }

    @Override
    public List<Car> getAllCars() {
        List<Car> init = new ArrayList<>();
        init.add(new Car("model1", 111, "color1"));
        init.add(new Car("model2", 222, "color2"));
        init.add(new Car("model3", 333, "color3"));
        init.add(new Car("model4", 444, "color4"));
        init.add(new Car("model5", 555, "color5"));
        return init;
    }

    @Override
    public List<Car> getSomeCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}

package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> list = new ArrayList<>();

    {
        list.add(new Car("model1", 111, "color1"));
        list.add(new Car("model2", 222, "color2"));
        list.add(new Car("model3", 333, "color3"));
        list.add(new Car("model4", 444, "color4"));
        list.add(new Car("model5", 555, "color5"));

    }

    @Override
    public void addCar(Car car) {
        list.add(car);
    }

    @Override
    public List<Car> getListCars(int count) {
        if (count < 1) {
            return new ArrayList<>();
        } else if (count > 5) {
            return list;
        } else {
            return list.subList(0, count);
        }
    }
}

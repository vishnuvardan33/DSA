
public class Automobile {

    protected String drive() {
        return "Driving vehicle";
    }

    public static void main(String[] wheels) {
        final Car car = new ElectricCar();
        System.out.print(car.drive());
    }
}

class Car extends Automobile {

    @Override
    protected String drive() {
        return "Driving car";
    }
}

class ElectricCar extends Car {

    @Override
    public final String drive() {
        return "Driving electric car";
    }
}

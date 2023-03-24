package src.chat2.ch19;

public class CarFactory {
    private static CarFactory instance = new CarFactory();
    private static int carNumber = 10001;

    private CarFactory() {}

    public static CarFactory getInstance() {
        return instance;
    }

    public Car createCar() {
        Car car = new Car(carNumber);
        carNumber++;
        return car;
    }
}

import builder.BerlinCarBuilder;
import builder.SportsCarBuilder;
import director.CarFactory;
import product.Car;

public class CarBuilderLauncher {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        BerlinCarBuilder berlinCarBuilder = new BerlinCarBuilder();
        SportsCarBuilder sportsCarBuilder = new SportsCarBuilder();

        carFactory.setCarBuilder(berlinCarBuilder);
        carFactory.constructCar();
        Car berlin = carFactory.getCar();
        System.out.println(berlin);

        carFactory.setCarBuilder(sportsCarBuilder);
        carFactory.constructCar();
        Car sportsCar = carFactory.getCar();
        System.out.println(sportsCar);
    }
}

package ex1;

import ex1.product.*;
import ex1.decorator.*;

public class CarDecoratorLauncher {
    public static void main(String[] args) {
        CarDecoratorLauncher launcher = new CarDecoratorLauncher();
        launcher.launch();
    }

    public void launch() {
        Car car1 = new CarBerlin();
        car1 = new AirbagDecorator(car1);
        car1 = new AirbagDecorator(car1);
        car1 = new EngineDecorator(car1);
        car1 = new ColorDecorator(car1);
        printCarInfos(car1);

        Car car2 = new CarSport();
        car2 = new AntiSlidingSystemDecorator(car2);
        car2 = new BreakingSystemDecorator(car2);
        printCarInfos(car2);

        Car car3 = new CarBreak();
        car3 = new AirbagDecorator(car3);
        car3 = new EngineDecorator(car3);
        car3 = new ColorDecorator(car3);
        car3 = new AntiSlidingSystemDecorator(car3);
        car3 = new BreakingSystemDecorator(car3);
        printCarInfos(car3);
    }

    public void printCarInfos(Car car) {
        System.out.println("Car description : " + car.getDescription());
        System.out.println("Car cost : " + car.cost());
        System.out.println("Car security level : " +
                car.securityLevel());
        System.out.println();
    }
}

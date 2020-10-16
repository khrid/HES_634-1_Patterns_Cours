package product;

public class Car {

    private String power;
    private String engine;
    private String breaks;
    private String seats;
    private String windows;
    private String fuelType;
    private String carType;

    public void setPower(String power) {
        this.power = power;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setBreaks(String breaks) {
        this.breaks = breaks;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "power='" + power + '\'' +
                ", engine='" + engine + '\'' +
                ", breaks='" + breaks + '\'' +
                ", seats='" + seats + '\'' +
                ", windows='" + windows + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", carType='" + carType + '\'' +
                '}';
    }
}

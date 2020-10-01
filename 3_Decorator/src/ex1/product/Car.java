package ex1.product;

public abstract class Car {
    String description = "Unkown car";

    public abstract int cost();

    public abstract int securityLevel();


    public String getDescription() {
        return description;
    }

}

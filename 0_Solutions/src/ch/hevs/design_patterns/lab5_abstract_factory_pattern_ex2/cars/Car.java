package ch.hevs.design_patterns.lab5_abstract_factory_pattern_ex2.cars;

/**
 * Lab 5
 * @author scz
 */
abstract public class Car {
	public String name;
    private String color;

	public String getName() {
		return name;
	}

    public String getColor() {
        return color;
    }

    public void installEngine() {
        System.out.println("Car " + name + " : Engine is installed.");
    }

    public void addExtras() {
        System.out.println("Car " + name + " : Extras are added");
    }
    
    public void paint(String color) {
        this.color = color;
        System.out.println("Car " + name + " : car is painted in color " + color);
    }

    @Override
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		return display.toString();
	}

}

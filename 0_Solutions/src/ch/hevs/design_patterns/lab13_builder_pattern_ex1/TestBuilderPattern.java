package ch.hevs.design_patterns.lab13_builder_pattern_ex1;

public class TestBuilderPattern {

	public static void main(String[] args) {
		CarBuilder carBuilder = new BerlinCarBuilder();
		CarDirector director = new CarDirector(carBuilder);
		director.build();
		Car car = carBuilder.getCar();
		System.out.println(car);
		
		carBuilder = new SportsCarBuilder();
		director = new CarDirector(carBuilder);
		director.build();
		car = carBuilder.getCar();
		System.out.println(car);
	}

}

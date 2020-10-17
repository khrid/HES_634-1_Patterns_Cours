package ch.hevs.design_patterns.lab13_builder_pattern_ex1;

public class SportsCarBuilder implements CarBuilder{
	
	private final Car car = new Car("SPORTS");

	@Override
	public void buildPower(){
		car.setPower("323 hp @ 6,800 rpm; 278 ft lb of torque @ 4,800 rpm");
	}

	@Override
	public void buildEngine() {
		car.setEngine("3.6L V 6 DOHC and variable valve timing");
	}

	@Override
	public void buildBreaks() {
		car.setBreaks("Four-wheel disc brakes: two ventilated. Electronic brake distribution. StabiliTrak stability control");
		
	}

	@Override
	public void buildSeats() {
		car.setSeats("Driver sports front seat with one power adjustments manual height, front passenger seat sports front seat with one power adjustments");
	}

	@Override
	public void buildWindows() {
		car.setWindows("Front windows with one-touch on two windows");
		
	}

	@Override
	public void buildFuelType() {
		car.setFuelType("Gasoline 17 MPG city, 28 MPG highway, 20 MPG combined and 380 mi. range");
	}
	
	@Override
	public Car getCar(){
		return car;
	}

}

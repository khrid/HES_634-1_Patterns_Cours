package ch.hevs.design_patterns.lab13_builder_pattern_ex1;

public class BerlinCarBuilder implements CarBuilder{
	
	private final Car car = new Car("BERLIN");

	@Override
	public void buildPower(){
		car.setPower("285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm");
	}

	@Override
	public void buildEngine() {
		car.setEngine("3.5L Duramax V 6 DOHC");
	}

	@Override
	public void buildBreaks() {
		car.setBreaks("Four-wheel disc brakes: two ventilated. Electronic brake distribution");
	}

	@Override
	public void buildSeats() {
		car.setSeats("Front seat center armrest.Rear seat center armrest.Split-folding rear seats");
	}

	@Override
	public void buildWindows() {
		car.setWindows("Laminated side windows.Fixed rear window with defroster");
		
	}

	@Override
	public void buildFuelType() {
		car.setFuelType("Gasoline 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range");
		
	}
	
	@Override
	public Car getCar(){
		return car;
	}
	
}

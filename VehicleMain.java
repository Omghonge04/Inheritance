package Inheriitancecode;

public class VehicleMain {
  public static void main(String[] args) {
	Bike b = new Bike();
	b.run();
	b.speed();
	
	int  maxSpeed = b.maxSpeed = 100;
	System.out.println("Bike maxmimun speed is " + maxSpeed);
}
}

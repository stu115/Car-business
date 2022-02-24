package Car;

public class TestCars 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("This is Cars test\n");
		
		Cars cars = new Cars();
		
	    Car car1 = new Car();
		car1.ask("Enter car 1 details...");
		cars.add(car1);
		System.out.println();
		
		Car car2 = new Car();
		car2.ask("Enter car 2 details...");
		cars.add(car2);
		System.out.println();
		
		Car car3 = new Car();
		car3.ask("Enter car 3 details...");
		cars.add(car3);
		System.out.println();
		
		Car car4 = new Car();
		car4.ask("Enter car 4 details...");
		cars.add(car4);
		System.out.println();
		
		Car car5 = new Car();
		car5.ask("Enter car 5 details...");
		cars.add(car5);
		System.out.println();
		
		
		cars.print("/nCars entered are...");
		
		System.out.println("\nNumber of cars = " + cars.getSize());
		
		System.out.println("\nRemoving car...");
		cars.dellCar(car4);
		System.out.println("\nWith one car removed number of cars is now " + cars.getSize());
		

	}

}

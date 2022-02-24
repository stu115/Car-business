package Car;

public class TestCar 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Car car1 = new Car();
		car1.print();
		
		car1.set("TJ22 WED",  "Lancia",  "Delta Integrale",  64300);
		car1.print();
		
		Car car2 = new Car("EF34 UHB", "Vauxhall", "Insignia", 25500);
		car2.print();
		System.out.println("The mileage of car 2 is " + car2.getmileage());
		System.out.println("The model is " + car2.getmodel());
		
		System.out.println();
		
		Car car3 = new Car("DC65 TJN", "Honda", "HR-V", 65800);
		car3.print();
		
		String regNo = car3.getregNo();
        System.out.println("The reg no. of car 3 is " + regNo); 
        System.out.println("The car 3 model is " + car3.getmodel());
        
        System.out.println();
     
        Car car4 = new Car("YU78 DNB", "Renault", "Clio", 59300);  
        car4.print();
        
        int mileage= car4.getmileage();
        System.out.println("The mileage of car 4 is " + mileage);
        System.out.println("The model for car 4 is " + car4.getmodel());
        
        System.out.println();
        
        Car car5= new Car();
        car5.ask("Enter new car data...");
        car5.print("\nData user entered is...");
        
        System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println(car4);
		System.out.println(car5);
	}

}

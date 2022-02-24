package Car;

public class Fleet {

	public static void main(String[]args)
	{
	
	Cars cars = new Cars();
	Car car;
    boolean finished = false;  
	char option; 
		
	while(! finished)
	{
	
	option = Console.askOption("Choose E)nter P)rint Q)uit");
	switch(option)
	
 {
	case 'E':
	 
	car = new Car();
	car.ask("Enter details ");
	cars.add(car);
	
	break;
	
	case 'P':
	
	cars.print("Details are:");
	break;
	
	case 'Q':
	
	finished = true;
	System.out.println("Application finished");
	
	
	break;
	
	default:
	
	   System.out.println("ERROR: Invalid Choice");
      
      }  
     }
   	}
}

	

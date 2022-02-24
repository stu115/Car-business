package Car;

public class Car 
{

	//declare properties
	String regNo;
	String make;
	String model;
	int mileage;
	
	
	// constructor with parameters
	public Car(String regNo, String make, String model, int mileage)
	{
	   set(regNo, make, model, mileage);
	}
	
	// default constructor
	public Car()
	{
		set("0","not given","not given",0);
	}
	
	// print
		public void print()
		{
			System.out.println("Reg No: " +regNo);
			System.out.println("Make: " +make);
			System.out.println("Model: " +model);
			System.out.println("Mileage: " +mileage);
            System.out.println();
		}
	
	public void set(String regNo,String make, String model, int mileage)	
	{
		setRegNo(regNo);
		setMake(make);
		setModel(model);
		setMileage(mileage);
	}
	
	// set methods
	public void setRegNo(String regNo)
	{
		this.regNo = regNo;
	}
	
	public void setMake(String Make)
	{	
		this.make = Make;
	}
	
	public void setModel(String Model)
	{
		this.model = Model;
	}
	
	public void setMileage(int Mileage)
	{

		this.mileage = Mileage;
	}
	
	// get methods
	public String getregNo()
	{
		return regNo;
	}
	public String getmake()
	{
		return make;
	}
	public String getmodel()
	{
		return model;
	}
	public int getmileage()
	{
		return mileage;
	}
	
	
	public void ask(String Prompt)//ask the user to input details
	{
		System.out.println(Prompt);
		regNo = Console.askString("Reg No: ");
		make = Console.askString("Make: ");
		model = Console.askString("Model: ");
		mileage = Console.askInt("Mileage: ");
		set(regNo, make, model, mileage);
	}
	
	// overload the print method(using the same method but with parameters)
	public void print(String Heading)
	{
		System.out.println(Heading);
		print();
	}

	// toString method
	public String toString()
	{
		return regNo + " " + make + " " + model + " " + mileage;
	}
	
	
}

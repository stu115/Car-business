package Car;

import java.util.ArrayList;

public class Cars
{

	// declare ArrayList
	ArrayList<Car>cars;
	ArrayList<String>regNos;
	
	// construct ArrayList
	public Cars()
	{
		cars = new ArrayList<Car>();
		regNos = new ArrayList<String>();
	}
	// add cars
	public void add(Car car)
	{
		cars.add(car);
		regNos.add(car.getregNo());
	}
	// print cars
	public void print(String Heading)
	{
		System.out.println(Heading);
		
		for(int i=0; i<cars.size(); i++)
		{
			System.out.println(cars.get(i));
		}
	}
	
	// size of Fleet
	public int getSize()
	{
		return cars.size();
	}
	
	public void dellCar(Car car)
	{
	   cars.remove(car);
	}
	
	public Car find(String reg)
	{
	
	int index = regNos.indexOf(reg);
	
		if (index == -1)
		{
		   
			return null;
		}
		else
		{
	    	return cars.get(index);
		}
	}
	
	
	
	
	
	
	
}

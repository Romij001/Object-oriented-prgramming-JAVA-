package Classes;

import java.lang.*;
import Interfaces.Reservation;


public abstract class Ticket implements Reservation
{	
	protected String Name;
	protected String ID;
    protected String SeatNumber ;
	protected String Time;
	protected double price;
	
	
	public Ticket()
	{
		System.out.println("Ticket Details");
	}
	public Ticket(String Name, String ID, String SeatNumber, String Time, double price)
	{
		System.out.println("Ticket Details");
		this.Name = Name;
		this.ID = ID;
		this.SeatNumber = SeatNumber;
		this.Time = Time;
		this.price = price;
	}
		
	public void setName(String Name)
	{
		this.Name = Name;
	}
	public void setID(String ID)
	{
		this.ID = ID;	
	}
	public void setSeatNumber(String SeatNumber)
	{
		this.SeatNumber = SeatNumber; 
	}
	public void setTime(String Time)
	{
		this.Time = Time; 
	}
	public void setprice(double price)
	{
		this.price = price;
	}
	
	
	public String getName()
	{
		return Name; 
	}
	public String getID()
	{
		return ID; 
	}
	public String getSeatNumber()
	{ 
		return SeatNumber;
	}
	public String getTime()
	{ 
		return Time;
	}
	public double getprice()
	{
		return price;
	}

	
	public abstract void showDetails();
	/*{
		System.out.println("Name: "+ Name);
		System.out.println("ID: "+ ID);
		System.out.println("SeatNumber: "+ SeatNumber);
		System.out.println("Time: "+ Time);
		System.out.println("price: "+ price);
	}*/
	
	public boolean Confirmed(int number)
	{
		boolean flag = false;
		if(number>0)
		{
			price = price + number;
			flag = true;
		}
		return flag;
	}
	
	public boolean Cancelled(int number)
	{
		if(number>0 && number<= price)
		{
			price = price - number;
			return true;
		}
		else
		{
			return false;
		}
	}
}


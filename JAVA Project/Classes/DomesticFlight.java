package Classes;

import java.lang.*;

public class DomesticFlight extends Ticket
{
	/*protected String Name;
	protected String ID;
    protected String SeatNumber ;
	protected String Time;
	protected double price;*/
	private String  Date ;
	
	public DomesticFlight()
	{
		super();
		System.out.println("SA-E");
	}
	public DomesticFlight(String Name, String ID, String SeatNumber, String Time, double price, String  Date)
	{
		super(Name , ID , SeatNumber, Time, price);
		System.out.println("SA-P");
		/*protected String Name;
	      protected String ID;
          protected String SeatNumber ;
	      protected String Time;
		  this.price = price;*/
		  this.Date = Date;
	}
	
	/*public void setName(String Name){this.Name = Name;}
	  public void setID(String ID){this.ID = ID;}*/
	  public void setSeatNumber(String SeatNumber){this.SeatNumber = SeatNumber;}
	/*public void setTime(String Time){this.Time = Time;}*/
	  public void setprice(double price){this.price = price;}
	  public void setDate(String  Date){this.Date = Date;}
	
	/*public int getName(){return Name;}
	  public String getID(){return ID;}*/
	  public String getSeatNumber(){return SeatNumber;}
	/*public double getTime(){return Time;}*/
	  public double getprice(){return price;}
	  public String getDate(){return Date;}
	  
	
	public void showDetails()
	{
		System.out.println("Name: "+ Name);
		System.out.println("ID: "+ ID);
		System.out.println("SeatNumber: "+ SeatNumber);
		System.out.println("Time: "+ Time);
		System.out.println("price: "+ price);
		System.out.println("Date: "+ Date);
	}
}
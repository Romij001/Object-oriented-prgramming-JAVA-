package Classes;

import java.lang.*;

public class InternationalFlight extends Ticket
{
	private String transit;
	
	public InternationalFlight()
	{
		super();
		System.out.println("FA-E");
	}
	public InternationalFlight(String Name, String ID, String SeatNumber, String Time , double price, String transit)
	{
		super(Name , ID , SeatNumber, Time, price );
		System.out.println("FA-P");
		this.transit = transit;
	}
	
	public void settransit(String transit){this.transit = transit;}
	public void setSeatNumber(String SeatNumber){this.SeatNumber = SeatNumber;}
	public void setprice(double price){this.price = price;}
	
	public String getSeatNumber(){return SeatNumber;}
	public String gettransit(){return transit;}
	public double getprice(){return price;}
	
	public void showDetails()
	{
		/*System.out.println("Name: "+ Name);
		System.out.println("ID: "+ ID);
		System.out.println("SeatNumber: "+ SeatNumber);
		System.out.println("Time: "+ Time);*/
		System.out.println("transit: "+ transit);
	}
}
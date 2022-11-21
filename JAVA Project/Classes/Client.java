package Classes;

import java.lang.*;
import Interfaces.TicketOperations;

public class Client implements TicketOperations
{
	private int nid;
	private String name;
	private String phnNumber;
	private int age;
	private Ticket tickets[] = new Ticket[10];

	public Client()
	{
		System.out.println("Client Information");
		/*savingsAccounts = new SavingsAccount[10];
		fixedAccounts = new FixedAccount[10];*/
	}
	public Client(int nid, String name, String phnNumber, int age)
	{
		//this();
		System.out.println("Client Information");
		this.nid = nid;
		this.name = name;
		this.phnNumber = phnNumber;
		this.age = age;
	}
	
	public void setNid(int nid){this.nid = nid;}
	public void setName(String name){this.name = name;}
	public void setPhnNumber(String phnNumber){this.phnNumber = phnNumber;}
	public void setAge(int age){this.age = age;}

	public int getNid(){return nid;}
	public String getName(){return name;}
	public String getPhnNumber(){return phnNumber;}
	public int getAge(){return age;}
	
	public void showDetails()
	{
		System.out.println("Client NID: " + nid);
		System.out.println("Client Name: " + name);
		System.out.println("Client Phone Number: " + phnNumber);
		System.out.println("Client Age: " + age);
	}
	
	public boolean confirmTicket(Ticket t)
	{
		boolean flag = false;
		for(int i=0; i<tickets.length; i++)
		{
			if(tickets[i] == null)
			{
				tickets[i] = t;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean cancelTicket(Ticket t)
	{
		boolean flag = false;
		for(int i=0; i<tickets.length; i++)
		{
			if(tickets[i] == t)
			{
				tickets[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public void showAllTickets()
	{
		System.out.println("////////////////////////");
		for(int i=0; i<tickets.length; i++)
		{
			if(tickets[i] != null)
			{
				tickets[i].showDetails();
				System.out.println();
			}
		}
	}
	
	public Ticket searchTicket(String SeatNumber)
	{
		Ticket t = null;
		for(int i =0; i<tickets.length; i++)
		{
			if(tickets[i] != null)
			{
				if(tickets[i].getSeatNumber() == SeatNumber)
				{
					t = tickets[i];
					break;
				}
			}
		}
		return t;
	}
}
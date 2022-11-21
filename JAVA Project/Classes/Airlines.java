package Classes;
import java.lang.*;
import Interfaces.*;

public class Airlines implements ClientOperations, StuffOperations
{
	private Client clients[] = new Client [500];
	private Stuff  stuffs[] = new Stuff [100];
	
	public boolean insertClient(Client c)
	{
		boolean flag = false;
		for(int i=0; i<clients.length; i++)
		{
			if(clients[i] == null)
			{
				clients[i] = c;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeClient(Client c)
	{
		boolean flag = false;
		for(int i=0; i<clients.length; i++)
		{
			if(clients[i] == c)
			{
				clients[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public Client searchClient(int nid)
	{
		Client c = null;
		
		for(int i=0; i<clients.length; i++)
		{
			if(clients[i] != null)
			{
				if(clients[i].getNid() == nid)
				{
					c = clients[i];
					break;
				}
			}
		}
		return c;
	}
	public void showAllClients()
	{	
		for(int i=0; i<clients.length; i++)
		{
			if(clients[i] !=null)
			{
				System.out.println("**************************");
				clients[i].showDetails();
				clients[i].showAllTickets();
				System.out.println();				
			}
		}
	}
		
	public boolean insertStuff(Stuff s)
	{
		boolean flag = false;
		for(int i=0; i<stuffs.length; i++)
		{
			if(stuffs[i] == null)
			{
				stuffs[i] = s;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeStuff(Stuff s)
	{
		boolean flag = false;
		for(int i=0; i<stuffs.length; i++)
		{
			if(stuffs[i] == s)
			{
				stuffs[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public Stuff searchStuff(String StuffId)
	{
		Stuff s = null;
		
		for(int i=0; i<stuffs.length; i++)
		{
			if(stuffs[i] != null)
			{
				if(stuffs[i].getStuffId().equals(StuffId))
				{
					s = stuffs[i];
					break;
				}
			}
		}
		return s;
	}
	
	public void showAllStuffs()
	{
		System.out.println("--------------------------");
		for(int i=0; i<stuffs.length; i++)
		{
			if(stuffs[i] != null)
			{
				System.out.println("Stuff Id: " + stuffs[i].getStuffId());
				System.out.println("Stuff Name: " + stuffs[i].getName());
				System.out.println("Stuff Salary: " + stuffs[i].getSalary());
				System.out.println();
			}
		}
	}
}
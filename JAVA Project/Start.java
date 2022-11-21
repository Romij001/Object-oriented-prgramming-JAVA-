import java.lang.*;
import Classes.*;
import Fileio.*;
import java.util.Scanner;

public class Start
{
	public static void main(String args[])
	{
		Airlines a = new Airlines();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------------------------------");
		System.out.println("Wellvome to Bangladesh Airlines");
		System.out.println("-------------------------------------------");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. Stuff Management");
			System.out.println("\t2. Client Management");
			System.out.println("\t3. Client-Ticket Management");
			System.out.println("\t4. Reservation ");
			System.out.println("\t5. Exit");
			
			System.out.print("Your Choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				
					System.out.println("-------------------------------------------");
					System.out.println("You have choose Stuff Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Stuff");
					System.out.println("\t2. Remove Existing Stuff");
					System.out.println("\t3. Search a Stuff");
					System.out.println("\t4. Show All Stuffs");
					System.out.println("\t5. Go Back");
				
					System.out.print("Your Option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert New Stuff");
							System.out.println("-------------------------------------------");
						
							System.out.print("Enter Stuff Id: ");
							String stuffId1 = sc.next();
							System.out.print("Enter Stuff Name: ");
							String name1 = sc.next();
							System.out.print("Enter Stuff Salary: ");
							double salary1 = sc.nextDouble();
							
							Stuff s1 = new Stuff();
							s1.setStuffId(stuffId1);
							s1.setName(name1);
							s1.setSalary(salary1);
							
							
							if(a.insertStuff(s1))
							{
								System.out.println("Stuff Inserted.... StuffId: " + s1.getStuffId());
							}
							else
							{
								System.out.println("Stuff NOT Inserted.... StuffId: " + s1.getStuffId());
							}
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove an Stuff");
							System.out.println("-------------------------------------------");
						
							System.out.print("Enter Stuff Id: ");
							String StuffId2 = sc.next();
							
							Stuff s2 = a.searchStuff(StuffId2);
							
							if(s2 != null)
							{
								if(a.removeStuff(s2))
								{
									System.out.println("Stuff Removed.... StuffId: " + StuffId2);
								}
							}
							else
							{
								System.out.println("Stuff NOT Removed.... StuffId: " + StuffId2);
							}
							break;
							
						case 3:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search an Stuff");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Stuff Id: ");
							String StuffId3 = sc.next();
							
							Stuff s3 = a.searchStuff(StuffId3);
							
							if(s3 != null)
							{
								System.out.println("Stuff Found......");
								System.out.println("Stuff Id: " + s3.getStuffId());
								System.out.println("Stuff Name: " + s3.getName());
								System.out.println("Stuff Salary: " + s3.getSalary());
							}
							else
							{
								System.out.println("Stuff NOT Found......");	
							}
							System.out.println();
							break;
							
						case 4:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Stuff");
							System.out.println("-------------------------------------------");
							
							a.showAllStuffs();
							
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							
							break;
							
						default:
						
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
							break;
					}
					break;
					
				case 2:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Client Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Client");
					System.out.println("\t2. Remove Existing Client");
					System.out.println("\t3. Search a Client");
					System.out.println("\t4. Show All Clients");
					System.out.println("\t5. Go Back");
					
					
					System.out.print("Your Option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert New Client");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter NID: ");
							int nid1 = sc.nextInt();
							System.out.print("Enter Name: ");
							String name1 = sc.next();
							System.out.print("Enter Phone Number: ");
							String phnNumber1 = sc.next();
							System.out.print("Enter Age: ");
							int age1 = sc.nextInt();
							
							
							Client c1 = new Client(nid1, name1, phnNumber1, age1);
							
							if(a.insertClient(c1))
							{
								System.out.println("Client Inserted.... NID: " + c1.getNid());
							}
							else
							{
								System.out.println("Client NOT Inserted.... NID: " + c1.getNid());
							}
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove a Client");
							System.out.println("-------------------------------------------");
						
						
						
							break;
							
						case 3:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search a Client");
							System.out.println("-------------------------------------------");
							
							
							break;
							
						case 4:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Clients");
							System.out.println("-------------------------------------------");
							
							a.showAllClients();
							
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							
							break;
							
						default:
						
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
							break;
					}
					
					
					break;
					
				case 3:
				
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Client-Ticket Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. confirm a Ticket for a Client");
					System.out.println("\t2. cancel a Ticket for a Client");
					System.out.println("\t3. Search a Ticket for a Client");
					System.out.println("\t4. Show All Tickets of a Client");
					System.out.println("\t5. Go Back");
					
					
					System.out.print("Your Option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to confirm New Ticket");
							System.out.println("-------------------------------------------");
						
							System.out.print("Client NID: ");
							int nid1 = sc.nextInt();
							
							Client c1 = a.searchClient(nid1);
							 
							if(c1 != null)
							{
								System.out.println("There are two Types of Tickets:");
								System.out.println("\t 1. DomesticFlight");
								System.out.println("\t 2. InternationalFlight");
								System.out.println("\t 3. Go Back");
								
								System.out.print("Your Type: ");
								int type = sc.nextInt();
								
								Ticket t = null;
								
								if(type == 1)
								{
									System.out.println("-------------------");
									System.out.println("Creating DomesticFlight Ticket");
									System.out.println("-------------------");
									
									System.out.print("Enter Seat Number: ");
									String sn = sc.next();
									System.out.print("Enter Ticket price: ");
									double tr = sc.nextDouble();
									System.out.print("Enter  Date: ");
									String dt = sc.next();
									System.out.print("Enter  ID: ");
									String  I= sc.next();
								    System.out.print("Enter  Name: ");
									String n = sc.next();
									System.out.print("Enter  Time: ");
									String T = sc.next();
									
									DomesticFlight df = new DomesticFlight(n ,I,sn,T,tr,dt );
									t = df;
								}
								else if(type == 2)
								{
									System.out.println("-------------------");
									System.out.println("Creating InternationalFlight Ticket");
									System.out.println("-------------------");
									
									System.out.print("Enter Seat Number: ");
									String sn = sc.next();
									System.out.print("Enter Ticket price: ");
									double tr = sc.nextDouble();
									System.out.print("Enter transit place: ");
									String tp = sc.next();
									System.out.print("Enter  ID: ");
									String  I= sc.next();
								    System.out.print("Enter  Name: ");
									String n = sc.next();
									System.out.print("Enter  Time: ");
									String T = sc.next();
									
									
									InternationalFlight If = new InternationalFlight(n ,I,sn,T,tr,tp );
									t = If;
								}
								else if(type == 3)
								{
									System.out.println("-------------------------------------------");
									System.out.println("You have chose to Go Back");
									System.out.println("-------------------------------------------");
								}
								else
								{
									System.out.println("-------------------------------------------");
									System.out.println("Invalid Option");
									System.out.println("-------------------------------------------");
								}
								
								if(t != null)
								{
									if(c1.confirmTicket(t))
									{
										System.out.println("Seat Inserted... Seat Number: "+ t.getSeatNumber());
									}
									else
									{
										System.out.println("Seat Not Inserted....... Seat Number: "+ t.getSeatNumber());
									}
								}
								else
								{
									System.out.println("Invalid Ticket Not Inserted.......");
								}
							}
							else
							{
								System.out.println("Invalid Client.......");
							}
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to cancel a Ticket");
							System.out.println("-------------------------------------------");
						
							
						
							break;
							
						case 3:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search a Ticket");
							System.out.println("-------------------------------------------");
							
							
							
							
							break;
							
						case 4:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Tickets");
							System.out.println("-------------------------------------------");
							
							System.out.print("Client NID: ");
							int nid4 = sc.nextInt();
							
							Client c4 = a.searchClient(nid4);
							
							if(c4 != null)
							{
								c4.showAllTickets();
							}
							else
							{
								System.out.println("Invalid Client....");
							}
							System.out.println();
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							
							break;
							
						default:
						
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
							break;
					}
					
					
					break;
					
				case 4:
				
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Reservation");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Confirmed Ticket");
					System.out.println("\t2. Cancelled Ticket");
					System.out.println("\t3. Show Reservation History");
					System.out.println("\t4. Go Back");
					
					System.out.print("Your Option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Confirmed Ticket");
							System.out.println("-------------------------------------------");
						
							System.out.print("Client NID: ");
							int nid1 = sc.nextInt();
							
							Client c1 = a.searchClient(nid1);
							
							if(c1 != null)
							{
								System.out.print("Seat Number: ");
								String sn = sc.next();
								
								Ticket t = c1.searchTicket(sn);
								
								if(t != null)
								{
									System.out.println("Previous price: " + t.getprice());
									System.out.print("confirm Ticket: ");
									int am = sc.nextInt();
									if(t.Confirmed(am))
									{
										System.out.println("confirmation Done.....");
										String msg = "confirm... "+ am + " in Seat Number "+ t.getSeatNumber();
										frwd.writeInFile(msg);
									}
									else
									{
										System.out.println("Invalid Number.....");
									}
									System.out.println("Current price: " + t.getprice());
								}
								else
								{
									System.out.println("Invalid Ticket....");
								}
							}
							else
							{
								System.out.println("Invalid Client....");
							}
							
						
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to cancel Ticket");
							System.out.println("-------------------------------------------");
						
							System.out.print("Client NID: ");
							int nid2 = sc.nextInt();
							
							Client c2 = a.searchClient(nid2);
							
							if(c2 != null)
							{
								System.out.print("Seat Number: ");
								String sn = sc.next();
								
								Ticket t = c2.searchTicket(sn);
								
								if(t != null)
								{
									System.out.println("Previous price: " + t.getprice());
									System.out.print("cancel Ticket: ");
									int am = sc.nextInt();
									if(t.Cancelled(am))
									{
										System.out.println("cancellation Done.....");
										String msg = "cancel... "+ am + " in Seat Number "+ t.getSeatNumber();
										frwd.writeInFile(msg);
									}
									else
									{
										System.out.println("Invalid Number.....");
									}
									System.out.println("Current price: " + t.getprice());
								}
								else
								{
									System.out.println("Invalid Number....");
								}
							}
							else
							{
								System.out.println("Invalid Client....");
							}
								
							break;
							
						case 3:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Reservation");
							System.out.println("-------------------------------------------");
							
							frwd.readFromFile();
							
							break;
							
						case 4:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							
							break;
							
						default:
						
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
							break;
					}
					
					break;
					
				case 5:
					System.out.println("-------------------------------------------");
					System.out.println("You have chose to Exit");
					System.out.println("-------------------------------------------");
					
					repeat = false;
					
					break;
					
				default:
					System.out.println("-------------------------------------------");
					System.out.println("Invalid Choice...............");
					System.out.println("-------------------------------------------");
					break;
			}
		}
	}
}




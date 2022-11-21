package Classes;
import java.lang.*;

public class Stuff
{
	private String StuffId;
	private String name;
	private double salary;
	
	public void setStuffId(String StuffId){this.StuffId = StuffId;}
	public void setName(String name){this.name = name;}
	public void setSalary(double salary){this.salary = salary;}
	
	public String getStuffId(){return StuffId;} 
	public String getName(){return name;}
	public double getSalary(){return salary;} 
}
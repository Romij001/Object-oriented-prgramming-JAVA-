package Interfaces;
import java.lang.*;
import Classes.Stuff;

public interface StuffOperations
{
	boolean insertStuff(Stuff s);
	boolean removeStuff(Stuff s);
	Stuff searchStuff(String StuffId);
	void showAllStuffs();
}
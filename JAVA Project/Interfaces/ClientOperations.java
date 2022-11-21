package Interfaces;

import java.lang.*;
import Classes.Client;

public interface ClientOperations
{
	boolean insertClient(Client c);
	boolean removeClient(Client c);
	Client searchClient(int nid);
	void showAllClients();
}
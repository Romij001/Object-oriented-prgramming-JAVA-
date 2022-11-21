package Interfaces;
import java.lang.*;
import Classes.Ticket;


public interface TicketOperations
{
	boolean confirmTicket(Ticket t);
	boolean cancelTicket(Ticket t);
	Ticket searchTicket(String SeatNumber);
	void showAllTickets();
}
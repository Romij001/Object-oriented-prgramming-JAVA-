package Interfaces;

import java.lang.*;
import Classes.Ticket;

public interface Reservation
{
	boolean Cancelled(int number);
	boolean Confirmed(int number);
}
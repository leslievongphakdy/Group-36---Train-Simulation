package edu.wit.comp2000.group36.train;

import java.nio.IntBuffer;

/**
 * @author Leslie Vongphakdy
 * COMP 2000 - 03
 * Lab 3: Queues, Train Simulator
 * Group 36
 * Due: October 30, 2017
 **/

public class Passenger {
	
	private static Station start;
	private static Station end;
	private static int nextID = 1;
	private static int ID;
	private static boolean initialized = false;
	
	/**
	 * Gives every passenger a number id (aka their name).
	 * Parameters start and destination set where the passenger 
	 * is coming from and where they are going.
	 * @param ID
	 * @param i
	 * @param end 
	 * @param end 
	 **/
	@SuppressWarnings("static-access")
	public Passenger(int i, Station start, Station end) {
		setID(nextID);
		nextID++;
		this.start = start;
		this.end = end;
		initialized = true;
		Logger.logging("Train is coming from " + i);
		Logger.logging("Train is going to " + end);
		
	}
	
	private static void checkInitialization() {
		if ( !initialized )
		{
			throw new SecurityException( "Train is not inbound." ) ;
		} //end if
	} // end checkInitialization
	
	/**
	 * Calls and then returns id for passenger.
	 * @param ID 
	 * @return
	 **/
	public static int getID(int ID) {
		checkInitialization();
		return ID;
	}
	
	/**
	 * Calls and returns Station start Location (id) 
	 * from Station class.
	 * @return
	 **/
	public Station getStart() {
		checkInitialization();
		return start;
	}
	
	/**
	 * Calls and returns Station destination Location (id)
	 * from Station class.
	 * @return
	 **/
	public Station getEnd() {
		checkInitialization();
		return end;
	}
	
	/**
	 *  sets up output for Passenger's itinerary
	 * @param i 
	 **/
	public static String toString(int ID) {
		String result = " ";
		result += "Passenger " + ID;
		return result;
	}
	
	public static void main(String[]args) {
		System.out.println("Testing Passenger Class");
		Passenger p = null;
		testGetters(p);
	}

	private static void testGetters(Passenger p) {
		// TODO Auto-generated method stub
		p = new Passenger(2, new Station(2), new Station(5));
		System.out.print(toString(getID(2)) + " " + p);
	}

	public static int getID() {
		return ID;
	}

	public static void setID(int iD) {
		ID = iD;
	}
}

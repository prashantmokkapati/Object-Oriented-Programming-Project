/*
 * CSE 205: <Class #17566> / <Monday, Wednesday from 4:35-5:50>
 * Assignment: <assignment #6>
 * Author(s): <Prashant Mokkapati> & <1212977855>
 * Description: <Allows the user to set up, remove, and edit appointments>
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class AppointmentCollection implements Iterable<Appointment>{
	
	//Creates an array list to store appointments
	private List<Appointment> appointments = new ArrayList<Appointment>();
	  
	  //adds an appointment to the list
	  public void add(Appointment appointment) {
	    appointments.add(appointment);
	  }
	  //removes an appointment from the list
	  public void remove(Appointment appointment) {
		appointments.remove(appointment);
	  }

	  //removes an appointment from the list based on the name
	  public void removeByName(String name) {
	    for (Appointment appointment : appointments) {
	      if (appointment.getName().equals(name)) {
	        appointments.remove(appointment);
	        return;
	      }
	    }
	  }

	  //Gets the appointment based on the index
	  public Appointment getByIndex(int index) {
	    return appointments.get(index);
	  }
	  
	  //Gets the appointment based on the name
	  public Appointment getByName(String name) {
	    for (Appointment appointment : appointments) {
	      if (appointment.getName().equals(name))
	        return appointment;
	    }
	    throw new NoSuchElementException();
	  }
	  
	  //Iterator
	  @Override
	  public Iterator<Appointment> iterator() {
	    return appointments.iterator();
	  }
	
}

	//Creates a new exception
	



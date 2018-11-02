/*
 * CSE 205: <Class #17566> / <Monday, Wednesday from 4:35-5:50>
 * Assignment: <assignment #6>
 * Author(s): <Prashant Mokkapati> & <1212977855>
 * Description: <Allows the user to set up, remove, and edit appointments>
 */
public class CSE205_Assignment06 {
		  
	//the main method, and it throws an exceptionn
	public static void main(String[] args) throws Exception {
		//creates a new AppointmentCollection object
		 AppointmentCollection appointments = new AppointmentCollection();
		 //Creates a new AppointmentUI object
		 AppointmentUI appointmentUI = new AppointmentUI();
		 //Calls the run method with the new AppointmentUI object
		 appointmentUI.run(appointments);
	}
		  

		

}

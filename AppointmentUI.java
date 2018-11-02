/*
 * CSE 205: <Class #17566> / <Monday, Wednesday from 4:35-5:50>
 * Assignment: <assignment #6>
 * Author(s): <Prashant Mokkapati> & <1212977855>
 * Description: <Allows the user to set up, remove, and edit appointments>
 */
import java.util.Scanner;

public class AppointmentUI {

	//Creates a scanner object
	private static Scanner in = new Scanner(System.in);
	  
	  //Method to run through the menu items
	  public void run(AppointmentCollection appointments) throws InvalidDateException, ClassNotFoundException {
	  	int menuChoice;
	  	//Do while loop to go through the switch statement
	  	do {
	  		displayMenu();
	  		menuChoice = getMenuChoice();
	  		
	  		//Switch statement accesses the correct method based on the user input
	  		switch (menuChoice) {
	  			case 1: addAppointment(appointments); 
	  					break;
	  			case 2: removeAppointment(appointments);
	  					break;
	  			case 3: editAppointment(appointments);
	  					break;
	  			case 4: listAppointments(appointments);
	  					break;
	  			case 9: exitProgram();
	  					break;
	  			default: handleInvalidMenuChoice();
	  		}
	  		
	  	} while (menuChoice != 9);
	  }
	  
	  //Discplays the menu
	  public void displayMenu() {
	  	System.out.println("Main Menu:  ----------------------");
	  	System.out.println("1) Set an Appointment");
	  	System.out.println("2) Remove an Appointment");
	  	System.out.println("3) Edit an Appointment");
	  	System.out.println("4) List Appointments");
	  	System.out.println("9) Exit Program");
	  	System.out.println();
	  }
	  
	  //Takes in the user input of the choice on the menu
	  private int getMenuChoice() {
	  	System.out.print("Enter menu choice :");
	  	return in.nextInt();
	  }
	  
	  //Asks the user to input a valid menu choise
	  private void handleInvalidMenuChoice() {
	  	System.out.println("Please choose a valid menu choice");
	  }
	  
	  //Message that prints when the program is exited
	  private void exitProgram() {
		  System.out.println("Bye...");
	  }
	  
	  //Allows the user to add an appointment
	  public void addAppointment(AppointmentCollection appointments) throws InvalidDateException {
	  	System.out.println("Add Appointment:    ----------------------");
	  	Appointment newAppointment = getNewAppointment();
	  	appointments.add(newAppointment);
	  }
	  
	  //Allows the user to remove an appointment
	  public void removeAppointment(AppointmentCollection appointments) {
	  	System.out.println("Remove Appointment: ----------------------");
	  	listAppointments(appointments);
	  	int indexOfAppointmentToRemove = getIndexofAppointment();
	  	Appointment appointmentToRemove = appointments.getByIndex(indexOfAppointmentToRemove);
	  	appointments.remove(appointmentToRemove);
	  }
	  
	  //Allows the user to edit an appointment
	  private void editAppointment(AppointmentCollection appointments) throws InvalidDateException {
	  	System.out.println("Edit Appointment:   -----------------------");
	  	listAppointments(appointments);
	  	
	  	int indexToEdit = getIndexofAppointment();
	  	Appointment appointmentToEdit = appointments.getByIndex(indexToEdit);
	  	
	  	appointmentToEdit.setName(getName());
	  	appointmentToEdit.setMonth(getMonth());
	  	appointmentToEdit.setDay(getDay());
	  	appointmentToEdit.setYear(getYear());
	  	appointmentToEdit.setTime(getTime());
	  	appointmentToEdit.setAMorPM(getAMorPM());
	  	}
	  
	  //Allows the user to view appointments they have added
	  public void listAppointments(AppointmentCollection appointments) {
	  	System.out.println("List Appointments:  -----------------------");
	  	int index = 0;
	  	for (Appointment appointment : appointments) {
	  		System.out.printf("%d) %s\n", index, appointment.toString());
	  		index++;
	  	}
	  }
	  
	  //Displays the appointment information
	  public void displayAppointmentInfo(Appointment anAppointment) {
	  	System.out.println(anAppointment);
	  }
	  
	  //Getter method for the index of the appointment
	  private int getIndexofAppointment() {
	  	System.out.print("Enter index of appointment :");
	  	return in.nextInt();}
	  
	  //Allows the user to create a new appointment, throws an exception if an invalid number is given
	  public Appointment getNewAppointment() throws InvalidDateException {
	  	Appointment appointment = new Appointment();
	  	
	  	appointment.setName(getName());
	  	appointment.setMonth(getMonth());
	  	appointment.setDay(getDay());
	  	appointment.setYear(getYear());
	  	appointment.setTime(getTime());
	  	appointment.setAMorPM(getAMorPM());
	  	
	  	return appointment;
	  }
	  
	  //Stores the name
	  public String getName() {
	  	System.out.print("Enter name : ");
	  	return in.next();}
	  
	  //Stores the month
	  public int getMonth() {
	  	System.out.print("Enter month of appointment : ");
	  	return in.nextInt();
	  }
	  
	  //Stores the day
	  public int getDay() {
		 System.out.print("Enter day of appointment  : ");
		 return in.nextInt();
	  }
	  
	  //Stores the year
	  public int getYear() {
		 System.out.print("Enter year of appointment : ");
		 return in.nextInt();
	  }
	  
	  //Stores the time
	  public int getTime() {
			 System.out.print("Enter time of appointment (enter the hour; EX: 1 for 1:00): ");
			 return in.nextInt();
	  }
	  
	  //Stores whether time was given in AM or PM
	  public String getAMorPM() {
			 System.out.print("Enter whether the appintment is in the morning or afternoon (enter AM/PM): ");
			 return in.next();
	  }
	}
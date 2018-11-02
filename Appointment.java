/*
 * CSE 205: <Class #17566> / <Monday, Wednesday from 4:35-5:50>
 * Assignment: <assignment #6>
 * Author(s): <Prashant Mokkapati> & <1212977855>
 * Description: <Allows the user to set up, remove, and edit appointments>
 */
public class Appointment {
	  //Decalers all private instance variables
	  private String name = "";
	  private int month = 0;
	  private int day = 0;
	  private int year = 0;
	  private int time = 0;
	  private String AMorPM = "";
	  
	  //Constructor
	  public Appointment() {
	    // does nothing
	  }
	  
	  //Another constructor
	  public Appointment(String aName, int aMonth, int aDay, int aYear, int aTime, String ampm) throws Exception {
	    this.setName(aName);
	    this.setMonth(aMonth);
	    this.setDay(aDay);
	    this.setYear(aYear);
	    this.setTime(aTime);
	    this.setAMorPM(ampm);
	  }
	  
	  //Returns the name
	  public String getName() {
	    return this.name;
	  }
	  //Sets the parameter passed by the user to the private instance variable
	  public void setName(String newName) {
	    this.name = newName;
	  }

	  //Returns the month
	  public int getMonth() {
	    return this.month;
	  }
	  //Sets the parameter passed by the user to the private instance variable
	  public void setMonth(int newMonth) throws InvalidDateException {
	    if (month < 0)
	        throw new InvalidDateException();
	      
	    this.month = newMonth;
	  }
	  
	  //Returns the day
	  public int getDay() {
		  return this.day;
	  }
	  //Sets the parameter passed by the user to the private instance variable
	  public void setDay(int newDay) throws InvalidDateException {
		  if (day < 0)
			  throw new InvalidDateException();
		      
		  this.day = newDay;
	  }

	  //Returns the year
	  public int getYear() {
		  return this.year;
	  }
	  //Sets the parameter passed by the user to the private instance variable
	  public void setYear(int newYear) throws InvalidDateException {
		  if (year < 0)
			  throw new InvalidDateException();
		      
		  this.year = newYear;
	  }

	  //Returns the time
	  public int getTime() {
		  return this.time;
	  }
	  //Sets the parameter passed by the user to the private instance variable
	  public void setTime(int newAMPM){
		  this.time = newAMPM;
	  }
	  
	  //Returns whether the appointment time is in the AM or PM
	  public String getAMorPM() {
		  return this.AMorPM;
	  }
	//Sets the parameter passed by the user to the private instance variable
	  public void setAMorPM(String newAMPM){
		  this.AMorPM = newAMPM;
	  }
	  
	  //@Override
	  public String toString() {
	    return "Name: " + getName() + "; Date of Appointment: " + getMonth() + "/" + getDay() + "/" + getYear() + "; Time of Appointment: " + getTime() + ":00" + " " + getAMorPM();
	  }
	}

	//Creates an exception
	class InvalidDateException extends Exception {
	  
	}
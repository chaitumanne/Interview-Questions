package edu.chai.person;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PersonModel {
   protected String personName;
   protected Date personDOB;

   // ==============================================================
   // Set/get name of a person 
   // ==============================================================

   public void setName( String name ) {
      this.personName = name;
   }

   public String getName() {
      return personName;
   }

   // ==============================================================
   // Compute age of a person ...
   // ==============================================================

   public int getAge() {

      // Calendar objects for "today" and "date of birth"...

      Calendar today    = Calendar.getInstance(); 
      Calendar birthday = new GregorianCalendar();
      birthday.setTime( personDOB );

      // Compute basic difference in years ....

      int yearDiff = today.get( Calendar.YEAR ) - birthday.get( Calendar.YEAR );

      // Birthday still needs to occur this year...

     if (today.get(Calendar.MONTH) <= birthday.get(Calendar.MONTH) &&
               today.get(Calendar.DATE)   < birthday.get(Calendar.DATE) ) {
	  yearDiff = yearDiff - 1;
      }

      return yearDiff;
   }

   /*public void setBirthDate(Date aBirthDate) {
      this.personDOB = aBirthDate;
   }*/

   public void setBirthDate(int iYear, int iMonth, int iDay ) {
	      Calendar cal = Calendar.getInstance();
	      cal.set( iYear, iMonth, iDay );
	      this.personDOB = cal.getTime();
	   }

   public Date getBirthDate() {
      return personDOB;
   }

   // ==========================================================
   // Create a String description of a persons cridentials 
   // ==========================================================

   public String toString() {
      String s = "Name: " + getName() + "\n"; 
            s += " Age: " + getAge() + "\n"; 
      return s;
   }

   // ==========================================================
   // Exercise methods in Person class ....
   // ==========================================================

   public static void main ( String [] args ) throws ParseException {

      // Create and print a person object ...

      PersonModel homer = new PersonModel();
      homer.setName("Nandu");
      homer.setBirthDate ( 1989, Calendar.NOVEMBER, 12 );
      System.out.println ( homer );

   }
}

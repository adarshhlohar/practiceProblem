package Calender;


//Java program for the above approach
import java.util.Date;
import java.time.Month;
import java.time.DayOfWeek;
import java.time.LocalDate;

class CalenderExample {

 // Function to get day, month, and
 // year from date
 public static void
 getDayMonthYear(String date)
 {

     // Get an instance of LocalTime
     // from date
     LocalDate currentDate
         = LocalDate.parse(date);

     // Get day from date
     int day = currentDate.getDayOfMonth();

     // Get month from date
     Month month = currentDate.getMonth();

     // Get year from date
     int year = currentDate.getYear();
     
     DayOfWeek days = currentDate.getDayOfWeek();

     // Print the day, month, and year
     System.out.println("Day: " + day);
     System.out.println("Month: " + month);
     System.out.println("Year: " + year);
     System.out.println("Day: " + days);
 }

 // Driver Code
 public static void main(String args[])
 {
     // Given Date
     String date = "2020-09-10";

     // Function Call
     getDayMonthYear(date);
 }
}

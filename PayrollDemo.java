
/**
   This program demonstrates a solution to the
   Payroll Class programming challenge.
*/

public class PayrollDemo
{

   public static void main(String[] args)
   {
      String str = "a1";

      //exceptions for name
      Payroll worker;
      try {
        worker = new Payroll("", 123);
      }
      catch (Exception e) {
        System.out.println("Error 1: " + e.getMessage());
      }
      System.out.println("Done with Name.");

      //exceptions for id
      try{
        worker = new Payroll("Bob", -99);
      }
      catch (Exception e) {
        System.out.println("Error 2: " + e.getMessage());
      }
      try{
        int number = Integer.parseInt(str);
      }
      catch (Exception e) {
        System.out.println("Error 2.1: Not a valid number " + e.getMessage());
      }
      System.out.println("Done with ID.");

      //exceptions for hours worked
      try{
        worker = new Payroll("Bob", 123);
        worker.setHoursWorked(86);
      }
      catch (Exception e) {
        System.out.println("Error 3: " + e.getMessage());
      }
      try{
        double number = Double.parseDouble(str);
      }
      catch (Exception e) {
        System.out.println("Error 3.1: Not a valid number " + e.getMessage());
      }
      System.out.println("Done with hours worked.");

      //exceptions for pay rate
      try{
        worker = new Payroll("Bob", 123);
        worker.setPayRate(26);
      }
      catch (Exception e) {
        System.out.println("Error 4: " + e.getMessage());
      }
      try{
      double number = Double.parseDouble(str);
      }
      catch (Exception e) {
        System.out.println("Error 4.1: Not a valid number " + e.getMessage());
      }
      System.out.println("Done with pay rate.");
   }
}

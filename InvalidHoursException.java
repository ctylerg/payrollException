public class InvalidHoursException extends Exception{

  public InvalidHoursException(){
    super("That is not a valid number of hours worked in a week.");
  }

    public InvalidHoursException(double h){
      super("The number of hours worked: \"" +  h + "\" is not valid.");
  }
}

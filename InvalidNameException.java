public class InvalidNameException extends Exception{

  public InvalidNameException(){
    super("That name is not valid. You must enter something for a valid name.");
  }
}

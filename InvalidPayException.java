public class InvalidPayException extends Exception{

  public InvalidPayException(){
    super("That is not a valid hourly wage");
  }

  public InvalidPayException(double p){
    super("The pay rate of: \"" +  p + "\" is not valid.");
  }
}

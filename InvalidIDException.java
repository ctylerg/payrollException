public class InvalidIDException extends Exception{

  public InvalidIDException(){
    super("That is not a valid ID number.");
  }

    public InvalidIDException(int i){
      super("The id number: \"" +  i + "\"  is not valid.");
  }
}

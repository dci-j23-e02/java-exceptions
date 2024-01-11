package create_exceptions;

public class InvalidAgeException extends  RuntimeException{

  public InvalidAgeException(String message) {
    super(message);
  }
}

package create_exceptions.complete_example.CustomUnCheckedExceptionExample;

public class WeakPasswordException extends RuntimeException {
  public WeakPasswordException(String message) {
    super(message);
  }
}

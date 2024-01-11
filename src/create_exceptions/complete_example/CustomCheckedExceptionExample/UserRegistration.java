package create_exceptions.complete_example.CustomCheckedExceptionExample;

public class UserRegistration {
  private static final int MINIMUM_AGE = 18;

  public void registerUser(String username, int age) throws UnderageUserException {
    if (age < MINIMUM_AGE) {
      throw new UnderageUserException(age);
    }
    // Proceed with registration
    System.out.println("User " + username + " registered successfully.");
  }
}

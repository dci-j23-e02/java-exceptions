package create_exceptions.complete_example.CustomCheckedExceptionExample;

public class RegistrationDemo {
  public static void main(String[] args) {
    UserRegistration registration = new UserRegistration();

    try {
      registration.registerUser("Alice", 16);
    } catch (UnderageUserException e) {
      System.out.println("Registration failed: " + e.getMessage());
      // Additional error handling code
    }
  }
}

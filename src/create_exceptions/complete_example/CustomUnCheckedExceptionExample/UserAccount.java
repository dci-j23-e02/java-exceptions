package create_exceptions.complete_example.CustomUnCheckedExceptionExample;

public class UserAccount {
  public void setPassword(String password) {
    if (password.length() < 8) {
      throw new WeakPasswordException("Password is too weak: " + password);
    }
    // Set the password
    System.out.println("Password set successfully.");
  }
}

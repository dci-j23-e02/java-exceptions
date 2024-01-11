package create_exceptions.complete_example.CustomUnCheckedExceptionExample;

public class AccountDemo {
  public static void main(String[] args) {
    UserAccount account = new UserAccount();

    try {
      account.setPassword("12345");
    } catch (WeakPasswordException e) {
      System.out.println("Error: " + e.getMessage());
      // Additional error handling code
    }
  }
}

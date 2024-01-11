package create_exceptions.complete_example.CustomCheckedExceptionExample;

public class UnderageUserException extends Exception {
  private int userAge;

  public UnderageUserException(int age) {
    super("User is underage: " + age);
    this.userAge = age;
  }

  public int getUserAge() {
    return userAge;
  }
}

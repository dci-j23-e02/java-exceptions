package create_exceptions;

public class BankAccount {
private double balance;

// Constructor
  public BankAccount(double initBalance) {
    this.balance = initBalance;
  }

// Getters and Setters
  public double getBalance() {
    return balance;
  }

  public void addBalance(double balance) {
    this.balance = balance;
  }

  // Other methods
/**
 * To withdraw amount out of the balance in then Bank Account
 *
 * @param amount the amount to be withdrawn
 *
 * @throws  InsufficientFundsException if the amount is more than the current balance
 *
 * */
// InsufficientFundsException is a checked exception and must be handled
// We handle the exception by using  'throws' in the signature of the method
public void withdraw(double amount) throws InsufficientFundsException {
    if (amount <= balance){
      balance -= amount; // balance = balance - amount;
    }else {
      // Not enough balance to withdraw the requested amount
      // IllegalArgumentException: the root cause of the InsufficientFundsException
      throw new InsufficientFundsException(amount, new Throwable("The amount is too much ..."));
    }
}


public  void transferFunds(int amount) {
  // Other code ...

  // Handling the InsufficientFundsException with 'try/catch' block
  try {
    withdraw(amount);
  } catch (InsufficientFundsException e) {
    // a handle 'the exception' is possible inside this method
    // sending a request to add more amount
    e.printStackTrace();
  }
}

}

package create_exceptions;

public class InsufficientFundsException  extends Exception {
  private double amount;

  /**
   * Constructs a new InsufficientFundsException exception, with amount and a custom message
   * @param amount The amount that caused the exception
   * */
  public InsufficientFundsException(double amount){
    // the constructor of the parent class Exception : 'public Exception(String message) {super(message);}'
    super("Insufficient funds for transaction: "+ amount);
    this.amount = amount;
  }

  /**
   * Constructs a new InsufficientFundsException exception,
   * with amount and a custom message and the option to use the cause of the exception
   *
   *  @param amount The amount that caused the exception
   * @param cause The cause of the exception
   * */
 public  InsufficientFundsException(double amount, Throwable cause){
    super("Insufficient funds for transaction: "+ amount, cause);
    this.amount = amount;
 }

  /**
   * Getter to get the amount that caused this exception
   *
   * @return  amount caused the exception
   * */
  public double getAmount(){
    return amount;
  }


}

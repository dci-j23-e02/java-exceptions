package create_exceptions;

public class Main {

  public static void main(String[] args) {
    BankAccount safwan = new BankAccount(100);

    Person a = new Person(15);

    a.setAge(150);


/*
    try {
      safwan.withdraw(200);
    } catch (InsufficientFundsException e) {
      System.out.println("Not enough balance: "+ + safwan.getBalance()+" to withdraw the requested amount  " +200 );
      System.out.println("Do you want to withdraw less amount , or add more to your balance ");

      e.printStackTrace();
    }*/
  }
}

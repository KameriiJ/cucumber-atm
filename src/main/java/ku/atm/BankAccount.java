package ku.atm;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount {
   private double balance;
   private String accountType;

   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount() {
      balance = 0;
      this.accountType = "normal";
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance) {
      balance = initialBalance;
      this.accountType = "normal";
   }

   /**
    Constructs a bank account with a given balance and account type.
    @param initialBalance the initial balance
    @param accountType the kind of account(normal/OD)
    */
   public BankAccount(double initialBalance, String accountType) {
      balance = initialBalance;
      if(!accountType.equals("OD") && !accountType.equals("normal")){
         accountType = "normal";
      }
      this.accountType = accountType;
   }
 
   /** 
      Deposits money into the account.
      @param amount the amount of money to withdraw
   */
   public void deposit(double amount) {
      balance = balance + amount;
   }

   /** 
      Withdraws money from the account.
      @param amount the amount of money to deposit
   */
   public void withdraw(double amount) throws NotEnoughBalanceException {
       if (amount > balance) {
          if (this.accountType.equals("normal")) {
             throw new NotEnoughBalanceException("cannot withdraw more than balance");
          }
       }
      balance = balance - amount;
   }

   /** 
      Gets the account balance.
      @return the account balance
   */
   public double getBalance() {
      return balance; 
   }

   /**
    Gets the account type.
    @return the account type
    */
   public String getAccountType(){
      return this.accountType;
   }
}


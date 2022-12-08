public class BankAccount {
   private String owner;
   private  double balance;

   public BankAccount(String owner, double balance) {
       this.owner = owner;
       this.balance = Math.max(balance, 0);
   }

   public String getOwner() {
       return owner;
   }

   public double getBalance() {
       return balance;
   }

   public double withdraw(double withdrawalAmount) {
       if (withdrawalAmount <= this.balance) {
           this.balance = this.balance - withdrawalAmount;
           return this.balance;
       } else {
           return 0;
       }

   }

   public double deposit(double depositAmount) {
       if (depositAmount > 0) {
           this.balance = this.balance + depositAmount;
           return this.balance;
       } else {
           return 0;
       }

   }
}

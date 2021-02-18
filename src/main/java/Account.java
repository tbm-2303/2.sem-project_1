import java.util.ArrayList;
import java.util.Random;

public class Account {


   public int account_nr;
   public int account_balance;
   public String password;
   public String username;
   public Customer customer;
   Bank thebankos;



   public Account(Customer customer, String password, String username) {
      this.account_nr = account_nr_generator();
      this.account_balance = 0;
      this.password = password;
      this.username = username;
      this.customer = customer;
      this.thebankos = new Bank();
   }



   public void deposit(int deposit){
      account_balance=+deposit;
      Transactions trans_depo = new Transactions(deposit, "Deposit");

   }
   public void withdraw(){

   }

   public void transfer(){

   }

   public int account_nr_generator(){
         Random rd = new Random();
         int rn = rd.nextInt(10000)+1;
         return rn;
   }

   public int getBalance() {

      return account_balance;
   }
   public void setAccount_balance(int account_balance) {
      this.account_balance = account_balance;
   }

   public String getPassword() {
      return password;
   }

   public String getUsername() {
      return username;
   }

   public int getAccount_nr() {
      return account_nr;
   }

}



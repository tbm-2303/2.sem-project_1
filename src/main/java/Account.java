import java.util.ArrayList;
import java.util.Random;

public class Account {


   private int account_nr;
   private int account_balance;
   private String password;
   private String username;

   Bank thebankos = new Bank();



   public Account(Customer customer, String password, String username) {
      this.account_nr = account_nr_generator();
      this.account_balance = 0;
   }



   public void deposit(){

   }
   public void withdraw(){

   }

   public void transfer(){

   }

   private int account_nr_generator(){
         Random rd = new Random();
         Integer rn = rd.nextInt(10000)+1;
         if(!thebankos.list_acc_nr.contains(rn)){
         thebankos.addtolist(rn); }
         return rn;
   }

   public int getBalance() {

      return account_balance;
   }
   public void setAccount_balance(int account_balance) {
      this.account_balance = account_balance;
   }
}

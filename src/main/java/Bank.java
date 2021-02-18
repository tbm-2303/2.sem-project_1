import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Bank {
    // har brug for en liste med alle konti. så har banken alt data om kundens konti. så har bank access til
    // alle
    ArrayList<Account>list_accounts = new ArrayList<Account>();


    //ikke korrekt løsning. skal sørge for at generere unikke konto nr. og customer id, som ikke kræver at jeg
    // har dem alle i araylister.
    ArrayList<Integer>list_acc_nr = new ArrayList<Integer>();//account nr
    ArrayList<Integer>list = new ArrayList<Integer>();//customer ID

    Scanner input = new Scanner(System.in);

    public void addtolist(int account_nr){
        list_acc_nr.add(account_nr);

    }

    public void welcomescreen(){
        System.out.println("Welcome to CPH Bank\n" +"Press (1) to login, if u are an existing customer\n"+
                "Press (2) to create an account");
    }
    public void loginwelcome(){
        System.out.println("Welcome to your account profile:");
    }
    public void mainprogram(){
        welcomescreen();

        try{
            int num = input.nextInt();
        switch (num) {


                case 1://login for customer
                    //need to make a method that checks if the username and password are correct.
                    //
                    System.out.println("Enter username:");
                    String u_name = input.nextLine();
                    String theGreaterSwallower = input.nextLine();
                    System.out.println("Enter password:");
                    String pass = input.nextLine();
                    loginwelcome();// hvis alting er i orden så vis konto menu.
                    break;


                case 2://create an account for customer
                    System.out.println("Enter first name:");
                    String name = input.nextLine();
                    theGreaterSwallower = input.nextLine();
                    System.out.println("enter last name:");
                    String l_name = input.nextLine();
                    Customer customer = new Customer(name, l_name, customer_ID());
                    System.out.println("enter a username for your account:");
                    String a_user = input.nextLine();
                    System.out.println("enter a password for your account:");
                    String a_pass = input.nextLine();

                    Account account = new Account(customer, a_pass, a_user);
                    list_accounts.add(account);
                    mainprogram();


                case 3://hidden login for employee
            }
        }
            catch (InputMismatchException exception){
                System.out.println("input mismatch error!");
                input.nextLine();
                mainprogram();
            }

    }

    public int customer_ID(){
        Random rd = new Random();
        Integer rn = rd.nextInt(10000)+1;
        if(!list.contains(rn)) {
            list.add(rn);
        }
        return rn;
    }
}

package OOPS;

public class account {
    int account_no;
    String name;
    float amount;
     void insertRecord(int ac,String n , float amt){
         this.account_no=ac;
         this.name=n;
         this.amount=amt;
     }
     //for deposit amount
    void deposits(float amt){
         amount=amount+amt;
    }
    //for withdraw
    void withdraw(float amt) {
        if (amount < amt) {
            System.out.println("Insufficient balance");
        } else {
            amount = amount - amt;
            System.out.println("you have withdrawn :" + amt);
        }
    }
    //to check balance
    void checkBalance(){
         System.out.println("YOur current balance :"+amount);
    }
    void displayRecord(){
         System.out.println("account no :"+account_no+ "Name :"+name+ "Balance :"+amount);
    }
}

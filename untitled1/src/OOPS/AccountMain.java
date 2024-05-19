package OOPS;

public class AccountMain {
    public static void main(String[] args){
        account obj=new account();
        obj.insertRecord(10000,"Lhakpa", 100000);
        obj.displayRecord();
        obj.checkBalance();
        obj.deposits(50000);
        obj.checkBalance();
        obj.withdraw(6000);
        obj.checkBalance();
    }

}

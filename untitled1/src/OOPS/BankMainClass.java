package OOPS;

public class BankMainClass {
    public static  void main (String[] args){
        Sanima sanima=new Sanima();
        Nabil nabil=new Nabil();
        NNBBank nnbBank=new NNBBank();
        NICAsia nicAsia=new NICAsia();
        System.out.println("Sanima bank interest rate:"+sanima.getInterestRate());
        System.out.println("Nabil bank interest rate:"+nabil.getInterestRate());
        System.out.println("NNBBank bank interest rate:"+nnbBank.getInterestRate());
        System.out.println("NICAsia bank interest rate:"+nicAsia.getInterestRate());


    }
}

package OOPS;

public class AdderMainClass {
    public static void main(String[] args){
        Adder obj=new Adder();
        System.out.println("sum of two parameter:"+obj.add(10,11));
        System.out.println("sum of any three parameter:"+obj.add(10,111,13));
        System.out.println("sum of any four parameter:"+obj.add(10,11,13,14));
    }
}

package OOPS;

public class Child extends HumanBody implements male, female {
    public void show(){
        System.out.println("Implementation of show() method defined in interface Male and female");
    }
    public void displayChild(){
        System.out.println("Method defined inside Child class");
    }
    public  static void main(String[] args){
        Child obj = new Child();
        System.out.println("Implementation of Hybrid inheritance in Java");
        obj.show();
        obj.displayChild();
        obj.displayHuman();
    }
}

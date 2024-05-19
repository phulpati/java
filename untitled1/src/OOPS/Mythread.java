package OOPS;

public class Mythread implements Runnable {
    public void run() {
        System.out.println("Thread is running....");

    }

    public static void main(String args[]) {
        Runnable r1 = new Mythread();
        Thread th1 = new Thread(r1, "My new thread");
        th1.start();
        String str = th1.getName();
        System.out.println("This is a Sting id : " +str);
        int a = (int) th1.getId();
        System.out.println("this is a thread id : " +a);

    }
}
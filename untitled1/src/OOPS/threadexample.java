package OOPS;
import java.util.Scanner;
public class threadexample {
    public static void main(String[] args) {
        final PC pc = new PC();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
        public static class PC {
            public void produce() throws InterruptedException {
                synchronized (this) {
                    System.out.println("producer thread running");
                    wait();
                    System.out.println("Resumed");
                }
            }

            public void consume() throws InterruptedException {
                Thread.sleep(1000);
                Scanner s = new Scanner(System.in);
            }
        }
    }


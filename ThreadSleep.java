//Shreayns j. pranami(21CE110)
public class ThreadSleep extends Thread {
        public static int counter = 0;

        public void run() {
            System.out.println( Thread.currentThread().getName() + " is running");
        }

        static void increment() {
            counter++;
        }
    }
    class prac_6_3{
        public static void main(String[] args) {
            ThreadSleep t1 = new ThreadSleep();
            t1.start();
            System.out.println("Before increment is called the value of counter is : " + t1.counter);
            System.out.println("\nThread t1 sleep method called");
            try {
                t1.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            t1.increment();
            System.out.println("After increment is called the value of counter is : " + t1.counter);
            System.out.println("shreyans 21CE110");
        }
    }




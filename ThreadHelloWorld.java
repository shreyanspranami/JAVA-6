//Shreayns j. pranami(21CE110)
public class ThreadHelloWorld {
        Object hello = new Object();
        Object world = new Object();


        public static void main(String[] args) throws InterruptedException {
                Runnable helloworldTask = new Runnable(){
                    @Override
                    public void run(){
                        new ThreadHelloWorld().printHelloWorld();
                    }
                };
                Thread t1 = new Thread(helloworldTask);
                t1.start();
                t1.join();
        }

        public void printHelloWorld(){
            synchronized (hello) {
                System.out.println("Hello World");
            }
            System.out.println("shreyans 21CE110");
        }
}

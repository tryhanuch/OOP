package threaD;

/**
 * Created by tish on 22.03.2014.
 */
public class FirstThread implements Runnable {
    @Override
    public void run() {
        boolean b = true;
        int a = 0;
        while (b){
            System.out.println("Hello World");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a++;
            if (a == 5){
                b = false;
            }
        }
    }
}                                               // Два одинаковых способа!

class SecondThread extends Thread{
    @Override
    public void run() {
        boolean b = true;
        int a = 0;
        while (b){
            System.out.println("Hello World");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a++;
            if (a == 5){
                b = false;
            }
        }
    }
}

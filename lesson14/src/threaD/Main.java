package threaD;

/**
 * Created by tish on 22.03.2014.
 */
public class Main {
    public static void main(String[] args) {
        Thread t0 = new Thread(new FirstThread());
        SecondThread t1 = new SecondThread();
        Thread t2 = new Thread(new ThirdTread());

        t0.start();
        t1.start();
        t2.start();

        new Thread(new Runnable() {                 // Инерные анонимные классы!
            @Override
            public void run() {
                boolean b = true;
                int a = 0;
                while (b){
                    System.out.println("It's working!");

                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    a++;
                    if (a == 5){
                        b = false;
                    }
                }
            }
        }).start();



        new Thread(() -> {                      //Lambda Expressions (замыкания, closer)
            int a = 0;
            boolean b = true;
            while (b){
                System.out.println("ololo");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                a++;
                if (a == 15){
                    b = false;
                }
            }
        }).start();
    }
}

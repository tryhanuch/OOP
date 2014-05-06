package threaD;

/**
 * Created by tish on 22.03.2014.
 */
public class ThirdTread implements Runnable {
    @Override
    public void run() {
        boolean b = true;
        int a = 0;
        while (b){
            System.out.println("Good Night");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a++;
            if (a == 10){
                b = false;
            }
        }
    }
}

package human;

/**
 * Created by tish on 29.01.14.
 */
public class User {

    String name;
    int salary;
    String alcoState = "Trezv";

    //-----------------------------

    public boolean makeDrink(int gram){
        boolean result = false;
        if (gram < 50){
            result = false;
        } else if (50 <= gram && gram < 150){
            alcoState = "Soft";
            result = true;
        } else {
            alcoState = "Hard";
            result = true;
        }
        return result;
    }
}

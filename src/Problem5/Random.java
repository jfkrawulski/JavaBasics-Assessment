package Problem5;

/**
 * Created by johnkrawulski on 5/5/17.
 */
public class Random {

    int number;
    //Random number generator between 1-100
    public int randomNumber() {
        number = (int) ((Math.random() * 100) + 1);
        return number;
    }


}

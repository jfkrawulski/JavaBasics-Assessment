package Problem12;

/**
 * Created by johnkrawulski on 5/5/17.
 */
public class Division {

    int result;

    public int divide(int a, int b){
        try{
        result = a/b;
        return result;
        //Catching arithmetic exception - divide by zero
        }catch(ArithmeticException ae){
            System.out.println("Cannot divide by 0.");
        }
        return -1;
    }
}

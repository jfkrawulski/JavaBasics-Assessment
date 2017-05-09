package Problem13;

/**
 * Created by johnkrawulski on 5/5/17.
 */
public class ClassA {
    public static void main(String[] args) {

        ClassB errorCall = new ClassB();

        //Exception caught at the calling method
        try {
            errorCall.identifyClass();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

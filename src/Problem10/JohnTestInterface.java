package Problem10;

/**
 * Created by johnkrawulski on 5/5/17.
 */
public interface JohnTestInterface {

    //Default method
    default void myDefMethod(){
        System.out.println("This is JK's default method.");
        myStatMethod();
    }

    //Static method
    static void myStatMethod(){
        System.out.println("This is JK's static method.");
    }

    //Abstract method
    //Methods in an interface that are not declared as default or static are implicitly abstract
    void display();

}

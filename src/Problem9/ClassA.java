package Problem9;

/**
 * Created by johnkrawulski on 5/5/17.
 */
public class ClassA {
    //encapsulation
    private double var1;
    private double var2;

    //defaulting values
    ClassA(){
        var1=0;
        var2=0;
    }

    public double getVar1() {
        return var1;
    }

    public void setVar1(double var1)
    {
        this.var1 = var1;
    }

    public double getVar2() {
        return var2;
    }

    public void setVar2(double var2) {
        this.var2 = var2;
    }
}

package Problem4;

/**
 * Created by johnkrawulski on 5/5/17.
 */
public class Integers {

    int ival=0;

    public void largestNumeric(int[] array){
        //Iterate thru the array
        for (int count=0; count<array.length;count++){
            if (array[count]>= ival){
                //save off largest value in the array
                ival = array[count];
            }

        }
        System.out.println("The largest value is "+ival);
    }

}

package Problem7;

/**
 * Created by johnkrawulski on 5/5/17.
 */
public class DoubleArray {

    public static void main(String[] args) {

        //Initialize double array
        int[][] dArray = {{10000,2,3,4,555,6},{12,23,34,45,56,67},
                {18,87,76,654,54,32},{11,17,912322,88,33,77},
                {10,90,80,30,40,50}, {19,990,28,82,57,75}};
        int largestNum = 0;
        //traversing double array and storing largest value when comparing values
        for (int row = 0; row < dArray.length; row++) {
            for (int col = 0; col < dArray.length; col++) {
                if (dArray[row][col] >= largestNum)
                    largestNum=dArray[row][col];
            }
        }
        //Printing out largest value
        System.out.println("This is the largest number "+largestNum);

    }
}

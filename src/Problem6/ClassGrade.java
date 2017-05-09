package Problem6;

/**
 * Created by johnkrawulski on 5/5/17.
 */
public class ClassGrade {

    public void numToLetter(int grd){
        if (grd<0 || grd >100){
            //Invalid grade
            System.out.println("Your score of "+grd+" is invalid");
        }
        else if (grd<70){
            //Failing grade
            System.out.println("Your score was "+grd+" and your grade is an F.");
        }
        else if (grd<76){
            //Very poor grade
            System.out.println("Your score was "+grd+" and your grade is a D.");
        }
        else if (grd<80){
            //Average grade
            System.out.println("Your score was "+grd+" and your grade is a C.");
        }
        else if (grd<90){
            //Good grade
            System.out.println("Your score was "+grd+" and your grade is a B.");
        }
        else {
            //Outstanding grade
            System.out.println("Your score was "+grd+" and your grade is an A.");
        }

    }

}

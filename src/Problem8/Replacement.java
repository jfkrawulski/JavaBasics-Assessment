package Problem8;

/**
 * Created by johnkrawulski on 5/5/17.
 */
public class Replacement {

    int counter=0;

    public void replaceVowel(String stmt, char rplcmt){
        //String into character array
        char[] stmtArray = stmt.toCharArray();
        //Traversing array for match on vowel
        for(int c=0; c < stmtArray.length; c++){
           //compare looking for upper and lower case vowels
            if(stmtArray[c] == 'a' ||
                    stmtArray[c] == 'e' ||
                    stmtArray[c] == 'i' ||
                    stmtArray[c] == 'o' ||
                    stmtArray[c] == 'u' ||
                    stmtArray[c] == 'A' ||
                    stmtArray[c] == 'E' ||
                    stmtArray[c] == 'I' ||
                    stmtArray[c] == 'O' ||
                    stmtArray[c] == 'U'){
                //Replacing vowel with replacement character
                stmtArray[c] = rplcmt;
                //Counting number of characters being replaced
                counter=counter+1;
            }
            //Printing of new statement
            System.out.print(stmtArray[c]);
        }
        //Printing number of vowels being replaced
        System.out.println("\n"+counter+" vowels were replaced.");

    }

}

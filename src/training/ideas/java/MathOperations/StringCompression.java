package training.ideas.java.MathOperations;

import java.util.Arrays;

/**
 * Created by idnnik on 8/9/2014.
 */
public class StringCompression {


    public static String getCompressionString(String pattern) {

        char[] patternToArray = pattern.toCharArray();
        char[] compressedString = new char[patternToArray.length];
        compressedString[0]= patternToArray[0];
        int occurance = 1;
        int compressedStringCounter = 0;

        for (int i = 0; i < pattern.length(); i++) {
            pattern.charAt(i);
        }

        for(int counter=1;counter<patternToArray.length;counter++){

            char hold  = patternToArray[counter];
            if(hold == compressedString[compressedStringCounter]){
                occurance ++;
            }
            else if(occurance >1){
                compressedString[compressedStringCounter+1]= Character.forDigit(occurance, 10);
                occurance =1;
                compressedStringCounter++;
                compressedString[compressedStringCounter+1] = hold;
                compressedStringCounter++;
            }
            else{
                compressedString[compressedStringCounter+1] = hold;
                compressedStringCounter++;
            }



        }
        if(occurance >1){
            compressedString[compressedStringCounter+1]= Character.forDigit(occurance, 10);
        }
        return String.copyValueOf(compressedString);
    }
}

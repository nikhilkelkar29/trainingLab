package training.ideas.java.CharacterArrayOperations;

/**
 * Created by idnnik on 8/17/2014.
 */
public class CharacterIndex {

    public static int getIndex(char[] inputArray, char inputChar) {


    for(int i=0;i<inputArray.length;i++)
    {
        if(inputChar==inputArray[i])
        {
            return   i;
        }
    }


    return -1;
}


}

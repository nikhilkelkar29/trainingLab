package training.ideas.java.CharacterArrayOperations;

/**
 * Created by idnnik on 8/17/2014.
 */
public class FirstOccurance {
    public static int getFirstOccurrenceAfterGivenIndex(char[] array, int givenIndex) {

        for(int counter=givenIndex+1;counter<array.length;counter++)
        {
            if(array[givenIndex]==array[counter])
            {
                return counter;
            }


        }


        return -1;
    }


}

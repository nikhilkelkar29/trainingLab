package training.ideas.java.CharacterArrayOperations;

/**
 * Created by idnnik on 8/18/2014.
 */
public class OccuranceChar {

    public static int getOccurrence(char[] array, char ch) {

        int count=0;
        for(int counter=0;counter<array.length;counter++)
        {
            if(array[counter]==ch)
            {
                count++;
            }


        }


        return count;
    }

}

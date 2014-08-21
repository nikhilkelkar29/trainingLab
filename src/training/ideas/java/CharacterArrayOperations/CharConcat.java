package training.ideas.java.CharacterArrayOperations;

/**
 * Created by idnnik on 8/17/2014.
 */
public class CharConcat {

    public static char[] concateCharacter(char[] array1, char[] array2) {


        int hold=array1.length;

        char[] newString=new char[array1.length+array2.length];

        int counter1;
        int counter2;

        if(array1.length==0)
        {
            newString=array2;
        }
        else if (array2.length==0)
        {
            newString= array1;
        }
        else
        {
            for( counter1=0;counter1<array1.length;counter1++)
            {
                newString[counter1]=array1[counter1];


            }
            for( counter2 =0; counter2 <array2.length; counter2++)
            {


                newString[hold]=array2[counter2];
                hold++;
            }
        }


        return newString;
    }


}

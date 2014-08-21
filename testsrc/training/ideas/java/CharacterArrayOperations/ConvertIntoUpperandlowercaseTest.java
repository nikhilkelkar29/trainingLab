package training.ideas.java.CharacterArrayOperations;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


/**
 * Created by idnnik on 8/17/2014.
 */
public class ConvertIntoUpperandlowercaseTest {

    @Test

    public void testUpperCaseConvertedArrayWithSingleCharinArray()
    {
        char[] array={'p'};
        char[] convertedArray={'P'};

        assertArrayEquals(convertedArray, CaseConverter.convertCharacterCase(array, CaseConverter.Upper));
    }
    @Test

    public void testUpperCaseConvertedArrayWithEmptyArray()
    {
        char[] array={};
        char[] convertedArray={};

        assertArrayEquals(convertedArray,  CaseConverter.convertCharacterCase(array, CaseConverter.Upper));
    }


    @Test

    public void testUpperCaseConvertedArray()
    {
        char[] array={'c','r','F','v','b','l'};
        char[] convertedArray={'C','R','F','V','B','L'};

        assertArrayEquals(convertedArray,CaseConverter.convertCharacterCase(array, CaseConverter.Upper));
    }

    @Test

    public void testUpperCaseConvertedArrayWithNumbers()
    {
        char[] array={'b','m','l','2'};
        char[] convertedArray={'B','M','L','2'};

        assertArrayEquals(convertedArray, CaseConverter.convertCharacterCase(array, CaseConverter.Upper));
    }




}

package training.ideas.java.CharacterArrayOperations;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


/**
 * Created by idnnik on 8/17/2014.
 */
public class CharConcatTest {

    @Test
    public void stringConcatenationTest()
    {char[] array1={'A','B','C'};
        char[] array2={'D','E','F'};
        char[] concatenatedArray={'A','B','C','D','E','F'};

        assertArrayEquals(concatenatedArray,CharConcat.concateCharacter(array1,array2));
    }
    @Test
    public void stringConcatenationTestWithNumbersAndUpperAndLowerCase()
    {char[] array1={'1','2','c'};
        char[] array2={'D','E','F'};
        char[] concatenatedArray={'1','2','c','D','E','F'};

        assertArrayEquals(concatenatedArray,CharConcat.concateCharacter(array1,array2));
    }
    @Test
    public void stringConcatenationTestWithSpecialChars()
    {char[] array1={' ','*','c'};
        char[] array2={'D','E','F'};
        char[] concatenatedArray={' ','*','c','D','E','F'};

        assertArrayEquals(concatenatedArray,CharConcat.concateCharacter(array1,array2));
    }


    @Test
    public void stringConcatenationTest1()
    {char[] array1={};
        char[] array2={'B'};
        char[] concatenatedArray={'B'};

        assertArrayEquals(concatenatedArray,CharConcat.concateCharacter(array1,array2));
    }

    @Test
    public void stringConcatenationTestWithFirstArrayAsEmpty()
    {char[] array1={};
        char[] array2={'B'};
        char[] concatenatedArray={'B'};

        assertArrayEquals(concatenatedArray,CharConcat.concateCharacter(array1,array2));
    }

}

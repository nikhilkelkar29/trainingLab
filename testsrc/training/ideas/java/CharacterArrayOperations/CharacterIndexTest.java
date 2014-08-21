package training.ideas.java.CharacterArrayOperations;
import junit.framework.Assert;
import org.junit.Test;


/**
 * Created by idnnik on 8/17/2014.
 */
public class CharacterIndexTest {
    @Test
    public void testIndex()
    {
        char[] array={'D','G','a','C','a','M','g'};
        char inputChar='a';

        Assert.assertEquals(2,CharacterIndex.getIndex(array,inputChar));

    }


    @Test
    public void testIndexWhenCharacterIsNotPresent()
    {
        char[] array={'D','G','a','C','a','M','g'};
        char inputChar='x';

        Assert.assertEquals(-1,CharacterIndex.getIndex(array,inputChar));

    }

}

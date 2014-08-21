package training.ideas.java.CharacterArrayOperations;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnnik on 8/18/2014.
 */
public class OccuranceCharTest {

    @Test
    public void testFirstOccurrenceAfterIndex()
    {
        char[] array={'P','A','G','A','B','L','D','A'};


        Assert.assertEquals(3, OccuranceChar.getOccurrence(array, 'A'));

    }
}

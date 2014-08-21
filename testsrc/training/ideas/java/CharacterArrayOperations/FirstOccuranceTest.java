package training.ideas.java.CharacterArrayOperations;
import junit.framework.Assert;
import org.junit.Test;


/**
 * Created by idnnik on 8/17/2014.
 */
public class FirstOccuranceTest {

    @Test
    public void testFirstOccurrenceAfterIndex()
    {
        char[] array={'P','A','G','A','B','L','D','A'};
        int givenIndex=1;

        Assert.assertEquals(3,FirstOccurance.getFirstOccurrenceAfterGivenIndex(array, givenIndex));

    }

}

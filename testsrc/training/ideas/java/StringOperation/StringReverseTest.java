package training.ideas.java.StringOperation;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.MathOperations.StringCompression;
import training.ideas.java.decisions.CalculaterMINLos;

/**
 * Created by idnnik on 8/13/2014.
 */
public class StringReverseTest {

    @Test
    public void given_String(){

        String pattern="ABC";
        String expectedPattern="BCACAB";
        Assert.assertEquals(expectedPattern, StringReverse.stringCombination(pattern));

    }
}

package training.ideas.java.MathOperations;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.decisions.CalculaterMINLos;

/**
 * Created by idnnik on 8/9/2014.
 */
public class StringCompressionTest {

    @Test
    public void given_Compression_String(){

        String pattern="AACDDE";
        String expectedPattern="A2CD2E";
        Assert.assertEquals(expectedPattern, StringCompression.getCompressionString(pattern));

    }
}

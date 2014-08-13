package training.ideas.java.MathOperations;

        import org.junit.Assert;
        import org.junit.Test;

/**
 * Created by idnnik on 8/11/2014.
 */
public class CeilingNumberTest {

    @Test
    public  void  testCeiling(){
        double inputNumbers = 12.31;
        double expectedNumbers = 12.35;

        Assert.assertEquals(expectedNumbers, CeilingNumber.ceilingCalc(inputNumbers),0.0);
    }

    @Test
    public  void  testCeilingForRound(){
        double inputNumbers = 12.35;
        double expectedNumbers = 12.35;

        Assert.assertEquals(expectedNumbers, CeilingNumber.ceilingCalc(inputNumbers),0.0);
    }


}

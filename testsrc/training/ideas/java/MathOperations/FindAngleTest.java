package training.ideas.java.MathOperations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnnik on 8/9/2014.
 */
public class FindAngleTest {

    @Test
    public  void  findAngleBetweenHourAndMinute()
    {


        int expected = 90;

        Assert.assertEquals(expected,FindAngle.getAngleBetweenHourMin(3,0), 0.0);

    }


    @Test
    public  void  findAngleBetweenHourAndMinutePass()
    {


        double expected = 126.5;

        Assert.assertEquals(expected,FindAngle.getAngleBetweenHourMin(12,23),0.0);

    }



}

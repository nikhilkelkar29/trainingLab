package training.ideas.java.calculator;


import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnnik on 7/21/2014.
 */
public class AdditionTest {

    @Test
    public void addTwoIntegers()
    {

        Assert.assertEquals(2+3,Addition.add(2,3));

    }

    @Test
    public void addTwoDouble()
    {

        Assert.assertEquals(5.3+7.1,Addition.add(5.3,7.1));

    }

    @Test
    public void addIntDouble()
    {

        Assert.assertEquals(12.3,Addition.add(5.3,7));

    }


    @Test

    public  void AddDoubleArray()
    {
        double[] num={1.1,2.2,3.3};
        Assert.assertEquals(6.6,Addition.add(num));

    }

    @Test

    public  void AddIntDoubleArray()
    {
        double[] num={1.1,2,3};

        Assert.assertEquals(1.1+2+3,Addition.add(num));

    }



    @Test

    public  void AddIntDoubleArrayWhile()
    {
        double[] num={1.1,2,3};

        Assert.assertEquals(1.1+2+3,Addition.add(num));

    }


    @Test
    public void addVariableDouble()
    {

        Assert.assertEquals(2+3+5+3+5+6,Addition.add(2,3,5,3,5,6),0.0);

    }


}

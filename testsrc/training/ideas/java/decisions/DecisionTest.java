package training.ideas.java.decisions;

import  org.junit.Assert;

import org.junit.Test;

/**
 * Created by idnnik on 7/25/2014.
 */
public class DecisionTest {
    @Test

    public  void calFPLOS()
    {
        double[] LRV={100,0,150,125,120,100,100};
        double rate=100;

        Assert.assertEquals("YYYYYYY", FpLosCal.fpLossPattern(rate,LRV));

    }
    @Test
    public void given_FPLOS_is_YYYYYYY_then_MINLOS_should_be_1(){

        String fplos[]={"Y","Y","N","Y","Y","Y","Y"};

        Assert.assertEquals(1,CalculaterMINLos.MINLOSValue(fplos));

    }

    @Test
    public void given_FPLOS_is_NNYYYYY_then_MINLOS_should_be_3(){

        String fplos[]={"N","N","Y","Y","Y","Y","Y"};
        Assert.assertEquals(3,CalculaterMINLos.MINLOSValue(fplos));

    }
    @Test

    public void FPLosMoreThanTwoRate1(){
        double []  rate={90,100};
        double[] LRV={100,0,150,125,120,100,100};
        String[] PatternArray={"NYYNNNN","YYYYYYY"};
        Assert.assertArrayEquals("Pattern does not match 3", PatternArray, FpLosCal.fpLossPattern(rate, LRV));

    }




}

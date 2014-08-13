package training.ideas.java.MathOperations;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.sorting.Sorting;

/**
 * Created by idnnik on 8/5/2014.
 */
public class FibonacciSeriesTest {
    @Test
    public  void  testFibonacciSeries_fourElement(){
        int inputNumbers = 10;
        int[] expectedNumbers = {0,1,1,2,3,5,8,13,21,34};

        Assert.assertArrayEquals(expectedNumbers, FibonacciSeries.getFibonacciSeries(inputNumbers));
    }

    @Test
    public  void  testFibonacciSeries_zeroElement(){
        int inputNumbers = 0;
        int[] expectedNumbers = {};

        Assert.assertArrayEquals(expectedNumbers, FibonacciSeries.getFibonacciSeries(inputNumbers));
    }

    @Test
    public  void  testFibonacciSeries_oneElement(){
        int inputNumbers = 1;
        int[] expectedNumbers = {0};

        Assert.assertArrayEquals(expectedNumbers, FibonacciSeries.getFibonacciSeries(inputNumbers));
    }

}

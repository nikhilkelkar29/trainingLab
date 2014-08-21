package training.ideas.java.MathOperations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnnik on 8/11/2014.
 */
public class FizzBuzzTest {
    @Test
    public  void  testFizzBuzz(){

            int givenNumber=18;
            String OutPut="12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz";
            Assert.assertEquals(OutPut, FizzBuzz.findFizBuzz(givenNumber));


        }
    @Test
    public  void  testFizzBuzzZero(){

        int givenNumber=0;
        String OutPut="0";
        Assert.assertEquals(OutPut, FizzBuzz.findFizBuzz(givenNumber));


    }

}



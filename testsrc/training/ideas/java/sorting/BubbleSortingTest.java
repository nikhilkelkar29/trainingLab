package training.ideas.java.sorting;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnnik on 7/29/2014.
 */
public class BubbleSortingTest {

   @Test
    public  void  testBubbleSort(){
       int[] inputNumbers = {12,2,1};
       int[] expectedNumbers = {1,2,12};

       //Assert.assertArrayEquals("Sorting not matched ", expectedNumbers, Sorting.testBubbleSortAsc(inputNumbers));
   }

    @Test
    public  void  testBubbleSortWithNegativeNumber(){
        int[] inputNumbers = {3,-1,-12,1,-5};
        int[] expectedNumbers = {-12,-5,-1,1,3};

        Assert.assertArrayEquals("Sorting not matched ", expectedNumbers, Sorting.testBubbleSortAsc(inputNumbers,"asc"));
    }

    @Test
    public  void  testBubbleSortOnlyNegativeNumber(){
        int[] inputNumbers = {-4,-12,-1,-5};
        int[] expectedNumbers = {-12,-5,-4,-1};

      Assert.assertArrayEquals("Sorting not matched ", expectedNumbers, Sorting.testBubbleSortAsc(inputNumbers,"ASC"));
    }

    @Test
    public  void  testBubbleSortDesc(){
        int[] inputNumbers = {12,2,1};
        int[] expectedNumbers = {12,2,1};

        Assert.assertArrayEquals("Sorting not matched ", expectedNumbers, Sorting.testBubbleSortAsc(inputNumbers,"desc"));
    }

    @Test
    public  void  testBubbleSortDESC(){
        int[] inputNumbers = {12,2,1};
        int[] expectedNumbers = {12,2,1};

        Assert.assertArrayEquals("Sorting not matched ", expectedNumbers, Sorting.testBubbleSortAsc(inputNumbers,"DESC"));
    }


//    @Test
//    public  void  testInsertionSort(){
//        int[] inputNumbers = {12,2,1};
//        int[] expectedNumbers = {1,2,12};
//
//        Assert.assertArrayEquals("Sorting not matched ", expectedNumbers, Sorting.testInsertionSort(inputNumbers));
//    }


}

package training.ideas.java.sorting;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnnik on 8/4/2014.
 */
public class InsertionSortTest {

    @Test

    public  void  testSelectionSort(){

        int[] inputNumbers = {12,1,1};
        int[] expectedNumbers = {1,1,12};

        Assert.assertArrayEquals("Sorting not matched ", expectedNumbers, InsertionSort.testInsertionSort(inputNumbers));

    }
    @Test
    public  void  testBubbleSortWithNegativeNumber(){
        int[] inputNumbers = {3,-1,-12,1,-5};
        int[] expectedNumbers = {-12,-5,-1,1,3};

        Assert.assertArrayEquals("Sorting not matched ", expectedNumbers, InsertionSort.testInsertionSort(inputNumbers));
    }

    @Test
    public  void  testBubbleSortOnlyNegativeNumber(){
        int[] inputNumbers = {-4,-12,-1,-5};
        int[] expectedNumbers = {-12,-5,-4,-1};

        Assert.assertArrayEquals("Sorting not matched ", expectedNumbers, InsertionSort.testInsertionSort(inputNumbers));
    }
}

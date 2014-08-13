package training.ideas.java.sorting;

/**
 * Created by idnnik on 8/4/2014.
 */
public class InsertionSort {

    public static int[] testInsertionSort(final int numbers[])
    {
        for (int counter1 = 0; counter1 < numbers.length - 1; counter1++) {
            int temp;
            for (int counter2 = counter1; counter2 >= 0; counter2--)

                if (numbers[counter2 + 1] < numbers[counter2])
                {
                    temp = numbers[counter2];
                    numbers[counter2] = numbers[counter2 + 1];
                    numbers[counter2 + 1] = temp;
                } else
                {
                    break;
                }


        }
        return numbers;
    }

}

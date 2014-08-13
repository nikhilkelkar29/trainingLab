package training.ideas.java.sorting;

/**
 * Created by idnnik on 7/29/2014.
 */
    public class Sorting {
        public static int[] testBubbleSortAsc(final int numbers[],String order)
        {
            int temp;
            for(int counter1 = 0; counter1 < numbers.length; counter1++)
            {
                for(int counter2 = 1; counter2 < (numbers.length -counter1); counter2++)
                {

                    if(order.equalsIgnoreCase("asc")?numbers[counter2-1] > numbers[counter2]:numbers[counter2-1] < numbers[counter2])
                    //if(numbers[counter2-1] > numbers[counter2])
                    {
                        temp = numbers[counter2-1];
                        numbers[counter2-1]=numbers[counter2];
                        numbers[counter2]=temp;
                    }
                }
            }


            return numbers ;
        }

   /* public static int[] testBubbleSortDesc(final int numbers[])
    {
        *//*int temp;

        for(int counter1 = 0; counter1 < numbers.length; counter1++)
        {
            for(int counter2 = 1; counter2 < (numbers.length -counter1); counter2++)
            {

                if(numbers[counter2-1] < numbers[counter2])
                {
                    temp = numbers[counter2-1];
                    numbers[counter2-1]=numbers[counter2];
                    numbers[counter2]=temp;
                }
            }
        }*//*

        return numbers ;
    }*/








}

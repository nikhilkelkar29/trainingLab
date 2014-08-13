package training.ideas.java.MathOperations;

/**
 * Created by idnnik on 8/5/2014.
 */
public class FibonacciSeries {
    public static int[] getFibonacciSeries(int inputLength) {

        int fibonacciSeries[] = new int[inputLength];

            for (int counter = 0; counter < fibonacciSeries.length; counter++) {
                fibonacciSeries[counter] = FibonacciSeriesByRecurssion(counter);
            }
            return fibonacciSeries;

    }

    private static int FibonacciSeriesByRecurssion(int counter) {
        if (counter == 0) {
            return 0;
        } else if (counter == 1) {
            return 1;
        } else {

            return FibonacciSeriesByRecurssion(counter - 1) + FibonacciSeriesByRecurssion(counter - 2);
        }


    }
}






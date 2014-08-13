package training.ideas.java.MathOperations;

/**
 * Created by idnnik on 8/11/2014.
 */
public class FizzBuzz {


    public static String findFizBuzz(int inputNumbers) {

        String output = "";
        if(inputNumbers==0)
        {
            return output +=0;

        }

        for (int counter = 1; counter <= inputNumbers; counter++) {

            if ((counter ) % 3 == 0 || (counter) % 5 == 0) {
                if ((counter) % 3 == 0) {
                    output += "Fizz";
                }
                if ((counter) % 5 == 0) {
                    output += "Buzz";
                }


            } else {
                output += counter  + "";
            }


        }

        return output;
    }

}

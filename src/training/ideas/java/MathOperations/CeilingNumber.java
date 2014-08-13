package training.ideas.java.MathOperations;

/**
 * Created by idnnik on 8/11/2014.
 */
public class CeilingNumber {

    public static double ceilingCalc(double inputNumbers) {


        if(inputNumbers*100%5==0)
        {
            return   inputNumbers;
        }

        return   ((inputNumbers*100)+5-(inputNumbers*100)%5)/100;


    }
}

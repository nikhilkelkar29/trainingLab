package training.ideas.java.calculator;

/**
 * Created by idnnik on 7/21/2014.
 */
public class Addition {


    public static double add(double... numbers){
        double result = 0;

        for(double counter: numbers){
            result= result+counter;
        }

        return result;
    }




}

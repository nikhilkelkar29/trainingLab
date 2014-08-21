package training.ideas.java.StringOperation;

import com.sun.org.apache.xpath.internal.operations.*;

import java.lang.String;

/**
 * Created by idnnik on 8/13/2014.
 */
public class StringReverse {
   public static String stringCombination(String inputString)
   {
       String  outputString="";
       for(int i=1;i<inputString.length();i++)
       {
           String hold=inputString.substring(0,1);
           String x1=inputString.substring(1,inputString.length());
           inputString=x1+hold;

           outputString+=inputString;

       }
       return outputString;
   }


}

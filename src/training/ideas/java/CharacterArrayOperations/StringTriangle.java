package training.ideas.java.CharacterArrayOperations;

/**
 * Created by idnnik on 8/19/2014.
 */
public class StringTriangle {
    public static void createNamePyramid() {
        String inputString = "abc";
        String namrarr = "";
        String output = "";
        String space = "";
        for (int i = 0; i < inputString.length(); i++) {
            space = "";
            namrarr = inputString.substring(i, i + 1);
            output = namrarr + output + namrarr;
            for (int j = inputString.length(); j > i; j--) {
                space += " ";
            }
            System.out.println(space + output + space);
        }



    }
    public static void main(String args[]) {
        createNamePyramid();
}

}

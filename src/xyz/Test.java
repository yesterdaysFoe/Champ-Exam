package xyz;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {

    public static void main(String[] args) {
        try {
            String[] letters = {"X", "Y", "Z"};
            int oddNumber = 9;

            LetterGenerator letterGenerator = new VerticalLetterGenerator(letters, oddNumber);
            letterGenerator.print();

            System.out.println("");

            letterGenerator = new HorizontalLetterGenerator(letters, oddNumber);
            letterGenerator.print();
        } catch (InstantiationException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, "Not an odd number", ex);
        }
    }

}

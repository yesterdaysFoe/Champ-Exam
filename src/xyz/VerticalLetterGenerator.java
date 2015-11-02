package xyz;

public class VerticalLetterGenerator extends LetterGenerator {

    public VerticalLetterGenerator(String[] letters, int oddNumber) throws InstantiationException {
        super(letters, oddNumber);
    }

    @Override
    public void print() {
        for (String letterStr : letters) {
            Letter letter = null;
            switch (letterStr) {
                case "X":
                    letter = new XLetter(oddNumber);
                    break;
                case "Y":
                    letter = new YLetter(oddNumber);
                    break;
                case "Z":
                    letter = new ZLetter(oddNumber);
                    break;
            }
            for (int j = 0; j < oddNumber; j++) {
                if (letter != null) {
                    System.out.println(letter.getTextAtLine(j));
                }
            }
            System.out.println("");
        }
    }

}

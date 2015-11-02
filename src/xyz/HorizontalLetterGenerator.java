package xyz;

public class HorizontalLetterGenerator extends LetterGenerator {

    public HorizontalLetterGenerator(String[] letters, int oddNumber) throws InstantiationException {
        super(letters, oddNumber);
    }

    @Override
    public void print() {
        for (int i = 0; i < oddNumber; i++) {
            String lineText = "";
            for (String letterStr : letters) {
                Letter letter;
                switch (letterStr) {
                    case "X":
                        letter = new XLetter(oddNumber);
                        lineText += letter.getTextAtLine(i);
                        break;
                    case "Y":
                        letter = new YLetter(oddNumber);
                        lineText += letter.getTextAtLine(i);
                        break;
                    case "Z":
                        letter = new ZLetter(oddNumber);
                        lineText += letter.getTextAtLine(i);
                        break;
                }
                lineText += " ";
            }
            System.out.println(lineText);
        }
    }

}

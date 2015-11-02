package xyz;

public class YLetter extends Letter {

    public YLetter(int oddNumber) {
        super(oddNumber);
    }

    @Override
    public String getTextAtLine(int line) {
        char[] lineColumn = new char[columnCount];
        int distance = Math.abs(center - line);
        if (line < center) {
            lineColumn[center - distance] = symbol;
            lineColumn[center + distance] = symbol;
        } else {
            lineColumn[center] = symbol;
        }

        String lineText = "";
        for (char m : lineColumn) {
            if (m == symbol) {
                lineText += m;
            } else {
                lineText += ' ';
            }
        }
        return lineText;
    }

}

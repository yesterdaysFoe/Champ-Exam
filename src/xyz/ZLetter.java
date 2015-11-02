package xyz;

public class ZLetter extends Letter {

    public ZLetter(int oddNumber) {
        super(oddNumber);
    }

    @Override
    public String getTextAtLine(int line) {
        String lineText = "";
        char[] lineColumn = new char[columnCount];
        int distance = Math.abs(center - line);
        if (line > 0 && line < (columnCount - 1)) {
            if (line > center) {
                lineColumn[center - distance] = symbol;
            } else if (line < center) {
                lineColumn[center + distance] = symbol;
            } else {
                lineColumn[center] = symbol;
            }
            for (char m : lineColumn) {
                if (m == symbol) {
                    lineText += m;
                } else {
                    lineText += ' ';
                }
            }
        } else {
            for (int i = 0; i < columnCount; i++) {
                lineText += symbol;
            }
        }

        return lineText;
    }

}

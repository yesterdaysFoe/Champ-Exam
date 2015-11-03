package xyz;

public abstract class Letter {

    protected final int columnCount;
    public final char symbol = '*';
    protected final int center;

    public Letter(int columnCount) {
        this.columnCount = columnCount;
        this.center = columnCount / 2;
    }

    public abstract String getTextAtLine(int line);

}

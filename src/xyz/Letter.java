package xyz;

public abstract class Letter {

    protected int columnCount;
    public final char symbol = '*';
    public final int center;

    public Letter(int columnCount) {
        this.columnCount = columnCount;
        this.center = columnCount / 2;
    }
    
    public abstract String getTextAtLine(int line);

}

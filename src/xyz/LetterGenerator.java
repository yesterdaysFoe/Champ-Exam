package xyz;

public abstract class LetterGenerator {

    protected final String[] letters;
    protected final int oddNumber;

    public LetterGenerator(String[] letters, int oddNumber) throws InstantiationException{
        if (oddNumber %2 == 0) {
            throw new InstantiationException(String.format("Invalid oddNumber value --> %s", oddNumber));
        }
        this.letters = letters;
        this.oddNumber = oddNumber;
    }
    
    public abstract void print();
    
}

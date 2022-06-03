package be.technifutur.sudoku.model;

public class InvalidValueSudokuException extends SudokuException {


    private  char value;

    public InvalidValueSudokuException(char value, String le_message) {
        super(le_message);
        this.value = value;
    }
    public InvalidValueSudokuException(){}

    public char getvalue() {
        return value;
    }
}

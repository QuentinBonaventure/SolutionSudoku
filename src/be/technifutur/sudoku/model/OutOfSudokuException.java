package be.technifutur.sudoku.model;

public class OutOfSudokuException extends SudokuException{

    private  int column;
    private int line;

    public OutOfSudokuException(int line, int column, String message){
        super(message);
        this.line = line;
        this.column = column;
    }

    public OutOfSudokuException() {

    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }
}

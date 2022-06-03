package be.technifutur.sudoku.model;

import be.technifutur.sudoku.controler.SudokuModel;

import java.util.Set;

public abstract class AbstractSudoku implements SudokuModel {
    char [][]monTableau;

    {
        monTableau = new char[getLineSize()][getColumnSize()];
    }
    @Override
    public final char getValue(int line, int column) {
        return monTableau[line][column];
    }
    @Override
    public final  void setValue(int line, int column, char value) throws OutOfSudokuException, InvalidValueSudokuException{
        if (!isPositionValid (line, column)) {
            throw new OutOfSudokuException(line,column,"Votre position est hors du sudoku");

        } else if (!isValueValid(value)){
            throw new InvalidValueSudokuException(value,"La valeur choisie n'est pas valide dans ce sudoku , elle doit être comprise entre 1 et  "+ line);
        }
        monTableau[line][column] = value;
    }
     protected abstract boolean isPositionValid(int line, int column);
    protected  abstract boolean isValueValid(char n);

    public final  boolean isEmpty(int line, int column) {
      return   monTableau[line][column] == EMPTY_VALUE ;

    }
    public abstract int getLineSize();
    public abstract int getColumnSize();


    }


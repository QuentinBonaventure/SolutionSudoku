package be.technifutur.sudoku.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SudokuModel4x4 extends AbstractSudoku {


    public static final short EMPTY_VALUE = 0;





    @Override
    protected boolean isPositionValid(int line, int column) {

        return line >=0
                && line <4
                && column >=0
                && column < 4;
    }

    public int getLineSize() {
        return 4;
    }

    public int getColumnSize() {
        return 4;
    }


    protected  boolean isValueValid(char n){
        return n > '0' && n <= (4 + '0' );
    };


}

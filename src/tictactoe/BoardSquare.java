package tictactoe;

import javafx.scene.shape.Rectangle;

/**
 * A single square on the game board.
 *
 * @author Supaluk Jaroensuk
 */
public class BoardSquare extends Rectangle {
	/** square knows its own row */
	private int row;
	/** square knows its own column */
	private int column;

	/**
	 * Initialize row and column of square.
	 * @param row is row number.
	 * @param col is column number.
	 * @param size is tile size.
	 */
	public BoardSquare(int row, int col, int size){
		super(100, 100);
        this.row = row;
        this.column = col;
	}

	/**
	 * Get number of row.
	 * @return number of row
	 */
	public int getRow() {
		return this.row;
	}

	/**
	 * Get number of column.
	 * @return number of column
	 */
	public int getColumn() {
		return this.column;
	}
	
}

package tictactoe;

/**
 * Types of pieces in the game.
 *
 * @author Supaluk Jaroensuk
 */
public enum Player {
	/**
	 * Type X
	 */
	X("X", 1),

	/**
	 * Type O
	 */
	O("O", -1),

	/**
	 * Type NONE
	 */
	NONE("", 0);

	/**
	 * Text of type
	 */
	public final String text;

	/**
	 * Value of type
	 */
	public final int value;

	/**
	 * Initialize text and value of type.
	 * @param text represent type.
	 * @param value is value of type.
	 */
	private Player(String text, int value) {
		this.text = text;
		this.value = value;
	}
}

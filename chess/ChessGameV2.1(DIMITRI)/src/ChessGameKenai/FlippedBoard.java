package ChessGameKenai;
/**
 * @see ChessGameKenai.Board#FLIPPED_BOARD
 */
public class FlippedBoard extends CurrentBoard {
	public int getCurrentBoard() {
		return Board.FLIPPED_BOARD;
	}

	public void flipBoard(Board board) {
		for (int i = board.getSquares().size() - 1; i > -1; i--) {
			board.getSquares()
					.get(i)
					.setBounds(
					(int) (455 - board.getSquares().get(i).getBounds()
									.getX()),
					(int) (455 - board.getSquares().get(i).getBounds()
									.getY()), 65, 65);
			board.getSquares().get(i).repaint();
			board.add(board.getSquares().get(i));
		}
	}
}

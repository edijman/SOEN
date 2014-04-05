package ChessGameKenai;
/**
 * @see ChessGameKenai.Board#NORMAL_BOARD
 */
public class NormalBoard extends CurrentBoard {
	public int getCurrentBoard() {
		return Board.NORMAL_BOARD;
	}

public void flipBoard(Board board) {
		for (int i = 0; i < board.getSquares().size(); i++) {
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


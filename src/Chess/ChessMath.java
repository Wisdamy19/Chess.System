package Chess;

import BoardGame.Board;

public class ChessMath {
    private Board board;

    public ChessMath(){
        board = new Board(8, 8);
    }
    public ChessPiece[][] getPieces(){
        ChessPiece [][] mat = new ChessPiece[board.getRow()][board.getColumn()];
        for (int i = 0; i <board.getRow(); i++){
            for (int j = 0; j < board.getColumn(); j++){
                mat [i][j] =(ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }


}

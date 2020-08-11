class Board {
  private Piece[][] chessboard;

  Board(){
    this.chessboard = new Piece[8][8];
    for(int 1 = 0; i < 8; i++){
      Piece p = new Pawn();
      chessboard[1][i] = p;
      p.setPosition(String.format(""))
    }
  }
}
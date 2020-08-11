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

abstract public class Piece {
  private String position;
  private String symbol;
  private int[] movePattern;
  
  public void setPosition(String pos){
    String curPos = getPosition();
    String[] moves = generateMoves(curPos);
    for(String move : moves){
      if(pos == move){
        position = pos;
      }
    }
  }
  public String getPosition(){
    return position;
  }

  abstract public String getSymbol();
  
  public abstract String[] generateMoves();
}

class Pawn extends Piece{
  private boolean starting;

  public Pawn(){
    this.position = null;
    this.symbol = "P";
    this.startPattern = ["1U", "2U"];
    this.movePattern = ["1U"];
    this.starting = true;
  }
  
   public void setPosition(String pos){
    if(!curPos){
      this.position = pos;
    }
    String curPos = getPosition();
    String[] moves = generateMoves(curPos);
    for(String move : moves){
      if(pos == move){
        this.position = pos;
      }
    }

    public String[] generateMoves(String pos){
      //need to check for 
    }
  }
}

class Rook extends Piece {

}

class Knight extends Piece {

}

class Bishop extends Piece {

}

class Queen extends Piece {

}

class King extends Piece {

}
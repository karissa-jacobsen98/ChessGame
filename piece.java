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
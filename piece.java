abstract public class Piece {
  private String symbol;
  private int[] position;
  private boolean captured; 
  private String[] movePattern;

  Piece(){
    captured = false;
  }

  public void setSymbol(String sym){
    symbol = sym;
  }
  public String getSymbol(){
    return symbol;
  }
  
  public void setPosition(int[] pos){
    position = pos;
   
  }
  public int[] getPosition(){
    return position;
  }

  public void setCaptured(boolean captive){
    captured = captive;
  }
  public boolean getCaptured(){
    return captured;
  }

  public void setMovePattern(String[] pattern){
    movePattern = pattern;
  }
  public String[] getMovePattern(){
    return movePattern;
  }

  public abstract boolean checkMove(int[] oldPos, int[] newPos);
}
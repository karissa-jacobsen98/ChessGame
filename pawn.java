class Pawn extends Piece{
  private boolean starting;
  private String[] startPattern;

  public Pawn(){
    position = null;
    symbol = "P";
    startPattern = new String[]{"1U", "2U"};
    movePattern = new String[]{"1U"};
    starting = true;
  }
  
  public void setPosition(String pos){
    if(!curPos){
      position = pos;
    }
    String curPos = getPosition();
    String[] moves = generateMoves(curPos);
    for(String move : moves){
      if(pos == move){
        position = pos;
      }
    }
  }

  public String[] generateMoves(String pos){
      //need to check for 
  }
}
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
public class LikeUnlikeCommand implements Command {
  LikeButton lb;
  
  public LikeUnlikeCommand(LikeButton lb) {
    this.lb = lb;
  }
  
  public void execute() {
    lb.unlike();
  }
  
  public void undo() {
	  lb.like();
  }
}
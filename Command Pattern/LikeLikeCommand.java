public class LikeLikeCommand implements Command {
  LikeButton lb;
  
  public LikeLikeCommand(LikeButton lb) {
    this.lb = lb;
  }
  
  public void execute() {
    lb.like();
  }
  
  public void undo() {
	  lb.unlike();
  }
}
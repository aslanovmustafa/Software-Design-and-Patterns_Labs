public class CommentUncommentCommand implements Command {
  CommentButton cb;
  
  public CommentUncommentCommand(CommentButton cb) {
    this.cb = cb;
  }
  
  public void execute() {
    cb.uncomment();
  }
  
  @Override
  public void undo() {
	  cb.comment();
  }
  
  
}
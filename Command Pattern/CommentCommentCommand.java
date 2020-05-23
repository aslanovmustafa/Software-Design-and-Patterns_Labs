public class CommentCommentCommand implements Command {
  CommentButton cb;
  
  public CommentCommentCommand(CommentButton cb) {
    this.cb = cb;
  }
  
  public void execute() {
    cb.comment();
  }
  
  @Override
  public void undo() {
	  cb.uncomment();
  }
  
  
}
public class TagTagCommand implements Command {
  TagButton tb;
  
  public TagTagCommand(TagButton tb) {
    this.tb = tb;
  }
  
  public void execute() {
	  tb.tag();
  }

@Override
public void undo() {
	tb.untag();
	
}
}
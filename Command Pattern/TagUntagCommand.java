public class TagUntagCommand implements Command {
  TagButton tb;
  
  public TagUntagCommand(TagButton tb) {
    this.tb = tb;
  }
  
  public void execute() {
	  tb.untag();
  }

@Override
public void undo() {
	tb.tag();
	
}
}
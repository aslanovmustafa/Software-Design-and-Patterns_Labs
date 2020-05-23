public class ReportUnreportCommand implements Command {
  ReportButton rb;

	public ReportUnreportCommand(ReportButton rb) {
		this.rb = rb;
	}

	public void execute() {
		rb.unreport();
	}

	@Override
	public void undo() {
		rb.report();
		
	}
}
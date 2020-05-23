public class ReportReportCommand implements Command {
  ReportButton rb;

	public ReportReportCommand(ReportButton rb) {
		this.rb = rb;
	}

	public void execute() {
		rb.report();
	}

	@Override
	public void undo() {
		rb.unreport();
		
	}
}
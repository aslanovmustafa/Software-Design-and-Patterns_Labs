public class ShareUnshareCommand implements Command {
	ShareButton sb;

	public ShareUnshareCommand(ShareButton sb) {
		this.sb = sb;
	}

	public void execute() {
		sb.unshare();
	}

	@Override
	public void undo() {
		sb.share();

	}

}
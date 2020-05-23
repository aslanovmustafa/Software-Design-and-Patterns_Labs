public class ShareShareCommand implements Command {
	ShareButton sb;

	public ShareShareCommand(ShareButton sb) {
		this.sb = sb;
	}

	public void execute() {
		sb.share();
	}

	@Override
	public void undo() {
		sb.unshare();

	}

}
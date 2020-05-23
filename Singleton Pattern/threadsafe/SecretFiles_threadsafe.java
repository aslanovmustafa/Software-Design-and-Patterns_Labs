//threadsafe singleton
//this one is simply to make sure threads are working in parallel with the rest of system, hence the synchronization
public class SecretFiles_threadsafe {
  
  private static SecretFiles_threadsafe secretFile;
  
  private SecretFiles_threadsafe() {}
  
  public static synchronized SecretFiles_threadsafe getAccess() {
    if (secretFile == null) {
      secretFile = new SecretFiles_threadsafe();
    }
    return secretFile;
  }

  public void getFiles() {
		System.out.println("No threats here! or threads???");
	}
  
  public static void main(String[] args) {
		SecretFiles_threadsafe sf;

		// refers to the only object of SecretFiles_classic
		sf = SecretFiles_threadsafe.getAccess();

		sf.getFiles();
	
	}
}

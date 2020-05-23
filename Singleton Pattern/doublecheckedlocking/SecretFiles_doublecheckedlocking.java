//Just another slightly different version of classic singleton that has double check locking. For extra safety

public class SecretFiles_doublecheckedlocking {
  
  private volatile static SecretFiles_doublecheckedlocking secretFile;
  
  private SecretFiles_doublecheckedlocking() {}
  
  public static SecretFiles_doublecheckedlocking getAccess() {
    if (secretFile == null) {
      synchronized (SecretFiles_doublecheckedlocking.class) {
        if (secretFile == null) {
          secretFile = new SecretFiles_doublecheckedlocking();
        }
      }
    }
    	return secretFile;
  }
  
  public void getFiles() {
		System.out.println("You now have access to secret files. Care to hide them from Donald Trump!");
	}
  
  public static void main(String[] args) {
	  SecretFiles_doublecheckedlocking sf;

		// refers to the only object of SecretFiles_classic
		sf = SecretFiles_doublecheckedlocking.getAccess();

		sf.getFiles();
	
	}
}


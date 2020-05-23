//here we make few singletons getting access only once
//in my opinion this one is good in the case if you want to for example chat with multiple people and each person gets only one instantiation 
public class SecretFiles_subclass {
  
  protected static SecretFiles_subclass secretFile;
  
  protected SecretFiles_subclass () {}
  
  public static synchronized SecretFiles_subclass getAccess() {
    if (secretFile == null) {
      secretFile = new SecretFiles_subclass();
    }
    return secretFile;
  }
  public void getFiles() {
		System.out.println("Let's hope coronavirus won't kill any of our agents (wink wink)!");
	}
}
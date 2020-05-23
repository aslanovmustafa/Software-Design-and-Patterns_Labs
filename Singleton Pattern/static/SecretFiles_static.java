//Singleton with a client request
//i think this one is the best for when you want to give access of instantiation to specific class
public class SecretFiles_static {
  
  private static SecretFiles_static secretFile = new SecretFiles_static();
  
  private SecretFiles_static() {}
  
  public static SecretFiles_static getAccess() {
    return secretFile;
  }
  
  public void getFiles() {
		System.out.println("You now have access to secret files. You must wash your hands before touching to them!");
	}

}


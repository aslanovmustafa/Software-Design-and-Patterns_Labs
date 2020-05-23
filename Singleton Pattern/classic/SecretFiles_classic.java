/*the idea here you can only get access to files once and by only 1 agent. Sounds ridiculous but couldn't come up with something better
as I was researching on singletons, wherever I looked everyone advised not to use it ever. 
*/


//the very classic version of singleton
public class SecretFiles_classic {

	private static SecretFiles_classic secretFile;

	private SecretFiles_classic() {
	}

	public static SecretFiles_classic getAccess() {
		if (secretFile == null) {
			secretFile = new SecretFiles_classic();
		}
		return secretFile;
	}

	public void getFiles() {
		System.out.println("You now have access to secret files. Care to hide them from Hillary Clinton!");
	}



	public static void main(String[] args) {
		SecretFiles_classic sf;

		// refers to the only object of SecretFiles_classic
		sf = SecretFiles_classic.getAccess();

		sf.getFiles();
	
	}
}
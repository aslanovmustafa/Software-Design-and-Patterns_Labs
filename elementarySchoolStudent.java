package as1;

public class elementarySchoolStudent extends Student {
	public elementarySchoolStudent() {
		takesTransport = new Bus();
		sportClass = new NoSports();}
		
		public void display() {
			System.out.println("Hello! I am in elementary. I look like a kid!");
		}
	}


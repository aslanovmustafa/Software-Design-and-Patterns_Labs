package as1;

public class HighSchoolStudent extends Student {
	public HighSchoolStudent() {
		takesTransport = new Taxi();
		sportClass = new NoMoreThanFour();}
		
		public void display() {
			System.out.println("Hi. I am in High School. Don't talk to me.");
		}
}

package as1;

public class MiddleSchoolStudent extends Student{
	public MiddleSchoolStudent() {
		takesTransport = new Train();
		sportClass = new NoMoreThanTwo();}
		
		public void display() {
			System.out.println("Hi. I am in Middle School. Ugh, I have pimples!");
		}
	}


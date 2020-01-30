package as1;

public abstract class Student {
	
	TakesTransport takesTransport;
	SportClass sportClass;
	
	public Student() {}
	public abstract void display();
	
	public void Transport() {
		takesTransport.transport();
	}
	
	public void Class() {
		sportClass.sport();
	}
	
	public void setTransport (TakesTransport t) {
		takesTransport = t;
	}
	
	public void setClass (SportClass s) {
		sportClass = s;
	}
	
}

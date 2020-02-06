package as1;

public class StudentSimulator {
	public static void main(String[] args) {
		Student student = new elementarySchoolStudent();
		student.display();
		student.Transport();
		student.Class();
		student.setTransport(new Train());
		student.Transport();
		student.setClass(new NoMoreThanTwo());
		student.Class();
		
	}

}

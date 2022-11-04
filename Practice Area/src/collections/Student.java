package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
	public int sid;
	public String sname;
	public double sperc;
	
	
	public Student(int sid, String sname, double sperc) {
		this.sid = sid;
		this.sname = sname;
		this.sperc = sperc;
	}

	

	public static void main(String[] args) {
		Student s1 = new Student(1, "suthan",77.1);
		Student s2 = new Student(2, "maha",85.4);
		Student s3 = new Student(1, "kannan",72.1);
		List<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for (Student s : al) {
			System.out.println(s);
		}
		
		
		
	}

}

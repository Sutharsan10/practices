package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<Student> ts = new TreeSet<>();
		
//		ts.add(new Student(1, "suthan",77.1));
//		ts.add(new Student(2, "maha",85.4));
//		ts.add(new Student(1, "kannan",72.1));
//		
//		System.out.println(ts);
		
		List<Student> al = new ArrayList<>();
		
		//al.add(s1);
		al.add(new Student(2, "maha",85.4));
		al.add(new Student(1, "kannan",72.1));
		
		System.out.println(al);
	}

}

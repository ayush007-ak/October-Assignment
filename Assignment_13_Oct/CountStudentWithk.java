package Assignment_13_Oct;

import java.util.List;

public class CountStudentWithk 
{
	public static void main(String[] args) {
		List<Student> students = Student.getStudents();
		long count = students
		.stream()
		.filter(name->name.getFirstName().startsWith("K"))
		.count();
		
		System.out.println("Students count whose name starts with 'K' : "+count);
	}
}
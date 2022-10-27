package esprit.tn.soa.repository;

import java.util.ArrayList;
import java.util.List;

import esprit.tn.soa.entity.Student;

public class StudentRepository {

	private final List<Student> students;

	public StudentRepository() {
		students = new ArrayList<Student>();

		students.add(new Student("0123456780", "Test Ben TEST", "test"));
		students.add(new Student("22551100", "mohamed Ben salah", "med.salsah@esprit.tn"));

	}

	public List<Student> getAllStudents() {
		return students;
	}

	public void saveStudent(Student student) {
		students.add(student);
	}
}

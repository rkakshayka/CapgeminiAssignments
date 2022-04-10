package school.management.system;

import java.util.List;

/**
 * @author AKSHAY KAUSHIK
 * School have many teachers, many students.
 * Implements teachers and student using an ArrayList 
 */
public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	/**
	 * new school object is created.
	 * @param teachers list of teachers in the school
	 * @param students list of students in the school.
	 */
	public School(List<Teacher> teachers, List<Student> students) {
		//super();
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;		
	}
	
	/**
	 * @return the teachers in the school
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}

	/**
	 * Add a teacher to the school
	 * @param teacher the teacher to be added.
	 */
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	/**
	 * @return the list of all students in the school
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * Adds a student to the school
	 * @param student: the student to be added.
	 */
	public void addStudent(Student student) {
		students.add(student);
	}

	/**
	 * @return the total money earned by the school.
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	/**
	 * Adds the total money earned by the school.
	 * @param MoneyEarned: money that is supposed to be added.
	 */
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}

	/**
	 * @return the total money spent by the school.
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	/**
	 * updates the money that is spent by the school. which is salary given
	 * by the school to the teachers
	 * @param MoneySpent: the money spent by school.
	 */
	public static void updateTotalMoneySpent(int MoneySpent) {
		totalMoneyEarned -= MoneySpent;
	}
	

}

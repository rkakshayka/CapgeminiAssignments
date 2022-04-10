package school.management.system;
/**
 * @author AKSHAY KAUSHIK
 * This class is responsible for keeping track of teacher's id, name,
 * and the salary.  
 */
public class Teacher {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	/**
	 * creates a new teacher object.
	 * @param id: id for the student.
	 * @param name: name of the teacher.
	 * @param salary: salary of the teacher.
	 */
	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
	}
	
	/** 
	 * @return the id of the teacher
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @return the name of the teacher
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the salary of the teacher
	 */
	public int getSalary() {
		return salary;
	}
	
	/**
	 * set the salary for the teacher.
	 * @param salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * Adds to the salaryEarned
	 * Removes Ammount from the total money earned by school
	 * @param salary
	 */
	public void receiveSalary(int salary) {
		salaryEarned += salary;
		School.updateTotalMoneySpent(salary);
	}

	@Override
	public String toString() {
		return "Name of the Teacher: "+name+
				"Total Salary earned so far $"+salaryEarned;
	}
	
	
}

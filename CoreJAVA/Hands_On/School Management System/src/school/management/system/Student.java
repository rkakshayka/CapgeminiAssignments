package school.management.system;

public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/**
	 * To create a new student by initializing.
	 * Fees for each student is 30000
	 * Fees paid initially is 0.
	 * @param id: id is unique for the student
	 * @param name: name of the student
	 * @param grade: grade of the student.
	 */
	public Student(int id, String name, int grade) {
		this.feesPaid = 0;
		this.feesTotal = 30000;
		
		this.id = id;
		this.name = name;
		this.grade = grade;	
	}
	//Not going to alter student's name, student's id.
	/**
	 * Used to update the student'sw grade.
	 * @param grade: new grade of student. 
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	/**
	 * Keep adding the fees to fessPaid field.
	 * Add the fees to the fees paid.
	 * The school is going to receive the funds.
	 * 
	 * @param fees: the fees that student pays.
	 */
	public void payFees(int fees) {
		feesPaid+= fees;
		School.updateTotalMoneyEarned(feesPaid);
	}
	
	
	/**
	 * @return the id of the student
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @return the name of the student
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the grade of the student
	 */
	public int getGrade() {
		return grade;
	}
	
	/**
	 * @return the fees paid by the student
	 */
	public int getFeesPaid() {
		return feesPaid;
	}
	
	/**
	 * @return the total fees for each student 
	 */
	public int getFeesTotal() {
		return feesTotal;
	}
	
	/**
	 * @return the remaining fees.
	 */
	public int getRemainingFees() {
		return feesTotal - feesPaid;
	}
	@Override
	public String toString() {
		return "Student's name : "+name+
				"Total fees paid so far $"+feesPaid;
	}
	
	
	
}

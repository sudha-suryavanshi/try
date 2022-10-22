
public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;

	public Student(int id, String name, int grade) {
		super();
		this.feesPaid = 0;
		this.feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}

	public void setgrade(int grade) {
		this.grade = grade;
	}

	public void feesPaid(int fees) {
		// feesPaid=feesPaid+fees; //we can replace this code like this
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}
	
	public int getRemainingfees() {
	 
		return feesTotal-feesPaid;
	
	}

	@Override
	public String toString() {
		return "Student's name:  " + name + ", grade=" + grade + ", feesPaid=" + feesPaid + ", feesTotal="
				+ feesTotal;
	}
	

}

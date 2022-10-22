import java.util.List;

public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpend;

	public School(List<Teacher> teacher, List<Student> student) {
		super();
		this.teachers = teacher;
		this.students = student;
		totalMoneyEarned = 0;
		totalMoneySpend = 0;
	}

	public List<Teacher> getTeacher() {
		return teachers;
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public List<Student> getStudent() {
		return students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned+= MoneyEarned;
	}

	public int getTotalMoneySpend() {
		return totalMoneySpend;
	}

	public static void updateTotalMoneySpend(int MoneySpend) {
		totalMoneyEarned -= MoneySpend;
	}

}

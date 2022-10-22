import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teacher renu=new Teacher(1,"Renu",520);
		Teacher teqdees=new Teacher(2,"Taqdees",800);
		Teacher riddhi=new Teacher(3,"Riddhi",900);
		Teacher vrushali=new Teacher(4,"Vrushali",700);
		
		List<Teacher>teacherlist=new ArrayList<>();
		teacherlist.add(renu);
		teacherlist.add(teqdees);
		teacherlist.add(riddhi);
		teacherlist.add(vrushali);
		
		Student Milonee=new Student(1,"Millonee",9);
		Student Vibhuti=new Student(2,"Vibhuti",8);
		Student Priyal=new Student(3,"Priyal",7);
		Student kunika=new Student(4,"Kunika",12);
		
		List<Student>st=new ArrayList<>();
		st.add(Milonee);
		st.add(Vibhuti);
		st.add(Priyal);
		st.add(kunika);
		
		School sc=new School(teacherlist,st);
		
		Teacher kusum=new Teacher(5,"Kusum",900);
		sc.addTeacher(kusum);
		
		Milonee.feesPaid(5000);
		Vibhuti.feesPaid(7000);
		System.out.println("NES has earned $  "+sc.getTotalMoneyEarned());
		
		
		System.out.println("---------Making school pay salary-----------");
		renu.receiveSalary(renu.getSalary());
		System.out.println("NES has spent for salary to " +renu.getName()+"and now has $ "+sc.getTotalMoneyEarned());
		
		teqdees.receiveSalary(teqdees.getSalary());
		System.out.println("NES has spent for salary to" +teqdees.getName()+"and now has $ "+sc.getTotalMoneyEarned());
		
		System.out.println(Milonee);
		
		System.out.println(renu);

	}

}

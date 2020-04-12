
public class Student {

	int RollNo =1;
	double Points = 12.7;	
	char c='$';
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		StudentInfo student2 = new StudentInfo(); //I removed names from here. So need to create empty cons.
		StudentCollege student3= new StudentCollege();
		
		
		//from main public
		System.out.print(student1.RollNo);
		System.out.println();
		System.out.print(student1.Points);
		System.out.println();
		
		//Private access
		student2.setName("Chris Turner");
		System.out.print("Student Name is:" + student2.getName());
		
		System.out.println();
		student2.setClasses("Tenth");
		System.out.print("Student Class is:" + student2.getClasses());
		
		System.out.println();
		
		//again public access
		student2.School("SHCHS");
		System.out.print(student2.school);
		System.out.println();
		
		//Student college
		student3.Stream("science");
		System.out.print(student3.stream);
			

	}

}

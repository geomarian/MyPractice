
public class StudentInfo {
	private String name;
	private String classes;
	
	//again public access
	String school;
	
	public StudentInfo(String name, String classes) {
		this.name=name;
		this.classes=classes;
	}
	public StudentInfo() {
		// If I remove name from object (student2) from Student class file then it shows
		//error. To resolve this I need to create this Empty constructor.
		// Why it can't take default constructor
	}
	
	//from here Private Access
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getClasses() {
		return classes;
	
	}
	public void setClasses(String classes) {
		this.classes=classes;
	}
	
	// Public access
	public void School(String school) {
		this.school=school;
	}
	
	

}
 class Emp {
int eid;
int salary;
static String Manager;

public void show() {
	System.out.println("eid is " + eid + "salary is :" + salary + " Manager is : " + Manager );
}
	}
	public class StaticExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp chris = new Emp();
		Emp turner = new Emp();
		
		chris.eid=54;
		chris.salary=8978;
		chris.Manager="Larry";
		
		turner.eid=65;
		turner.salary=7895;
		turner.Manager="Peter";
		
		chris.show();
		turner.show();
		

	}

}

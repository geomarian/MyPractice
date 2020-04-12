
public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 10;
		if (age >= 18) {
			if (age >= 21) {
				System.out.println("You are allowed to vote");
			}
			System.out.println("You are above 20");
		} else if(age==10){
			System.out.println("you are NOT allowed to vote");
		}
		else {
			System.out.println("Out");
		}
	}

}

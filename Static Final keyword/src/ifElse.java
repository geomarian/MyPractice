
public class ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 4;
		if(i==0)
		{
			System.out.println("input is 0 which is neither even nor odd");
		}
		else if(i%2==0) {
			System.out.println("It is Even" + i);
		}
		else {
			System.out.println("It is Odd" + i);
		}
	}

}

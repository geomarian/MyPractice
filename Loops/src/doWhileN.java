
public class doWhileN {

	public static void main(String args[]) {
	
/*		 int arr[]={2,11,45,9};
  
         int i=0;
         do{
              System.out.println(arr[i]);
              i++;
         }
         while(i<4);
    }
}  */

//While loop
		int arr[] = { 1, 12, 2, 7 };
		int j = 0;

		while (j < 4) {						//If I give 5 - it will give array index  of bounds error
			System.out.println(arr[j]);
			j++;
		}

	}
}
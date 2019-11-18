package InterviewPrograms;

/* 
 * About    --> This program is to reverse a number	
 * Solution --> Use while loop and mathematical formula using * % /
 *
 */
public class ReverseInteger {

	public static void main(String[] args) {

		//******************************using while loop******************************
		int num=12345;
		int rev=0;
		while(num!=0)
		{
			rev= rev*10 + num%10;
			num= num/10;
		}
		System.out.println(rev);
	}

}

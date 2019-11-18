package InterviewPrograms;

/* 
 * About    --> This program is to find if number is prime or not
 * Solution --> Use boundary check if condition to omit numbers less than 2
 * 			    and for loop to iterate and check from 2 using remainder
 *
 * Note- A prime number is a number which can only be divided by itself and 1 and
 * 		 2 is the smallest prime number
 */
public class PrimeNumberTest {

	
	public static boolean isPrimeNumber(int num)
	{
		if(num<=1)         //check added as 2 is the smallest prime number
		{
			return false;
		}
		for(int i=2;i<num;i++) //starts from 2 as 2 is the smallest prime number and not given <=as if we are passing 2 as parameter then the method will return false
		{
			if(num % i ==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {

		System.out.println("Check if given number is a prime number : "+isPrimeNumber(5));
	}

}

package InterviewPrograms;

/* 
 * About    --> This program is to find if number is palindrome
 * Solution --> Store number in a temp variable, reverse the number and check if both are equal(temp==rev)
 *
 * Note- Examples of palindrome - 141, 1771, 2442 etc
 */
public class PalindromeTest {

	public static boolean isPalindrome(int num)
	{
		int rev=0;
		int temp=num;
		System.out.println("The number is : "+num);

		//reversing the number
		while(num!=0)
		{
			rev=rev*10 + num %10;
			num=num/10;
		}
		System.out.println("The reversed number is : "+rev);
		
		if(temp==rev)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check if given number is a palindrome : "+isPalindrome(2));
	}

}

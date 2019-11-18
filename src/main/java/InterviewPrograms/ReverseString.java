package InterviewPrograms;

/*
 * About    --> This program is to reverse a string
 * Solution --> Here we use 2 methods - Using for loop and reverse function of StringBuffer
 * 
 * Note - str.reverse method cannot be used with String as String is 'Immutable'
 *        str.reverse method can be used only with StringBuffer as StringBuffer is 'Mutable'
 */

public class ReverseString {

	public static void main(String[] args) {

		//******************************using for loop******************************
		String s1="Selenium";
		String rev="";
		int length=s1.length();
		for(int i=length-1;i>=0;i--)   //here we start from the back and iterate to the beginning
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
		
		
		//******************************using StringBuffer******************************
		StringBuffer str=new StringBuffer(rev);
		System.out.println(str.reverse());
		
	}

}

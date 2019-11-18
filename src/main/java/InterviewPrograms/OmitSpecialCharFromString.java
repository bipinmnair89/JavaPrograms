package InterviewPrograms;

/* 
 * About    --> This program is to Remove the Special Characters from a String
 * Solution --> Use Regular expression along with string method replaceAll
 *
 */

public class OmitSpecialCharFromString {
	
	public static void main(String[] args) {
		
		//*************************using replaceAll() and RegExp******************************
		String s1="&@&&#*@Selenium@#!!@#@WebDriver";
		s1=s1.replaceAll("[^a-zA-Z0-9]"," ");
		System.out.println(s1);
	}

}

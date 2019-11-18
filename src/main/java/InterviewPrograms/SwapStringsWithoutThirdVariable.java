package InterviewPrograms;

/* 
 * About    --> This program illustrates how to swap 2 strings without third string	
 * Solution --> Use concat and then substring(param1,param2) and substring(param1)
 *
 */
public class SwapStringsWithoutThirdVariable {

	public static void main(String[] args) {

		String str1="WebDriver";
		String str2="Selenium";
		
		System.out.println("Before swapping");
		System.out.println("str1 - "+str1);
		System.out.println("str2 - "+str2);
		
		//now we will swap using concat and substring methods
		str1=str1.concat(str2); //str1 - WebDriverSelenium  //str2 - Selenium
		str2=str1.substring(0, str1.length()-str2.length()); //str1 - WebDriverSelenium  //str2 - WebDriver
		
		System.out.println("During swapping");
		System.out.println("str1 - "+str1);
		System.out.println("str2 - "+str2);
		
		str1=str1.substring(str2.length());
		
		System.out.println("After swapping");
		System.out.println("str1 - "+str1);
		System.out.println("str2 - "+str2);
		
		

	}

}

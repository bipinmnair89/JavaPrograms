package InterviewPrograms;

import java.util.ArrayList;

/* 
 * About    --> This program is to learn about different String manipulation techniques
 * 
 *
 */
public class StringManipulations {

	public static void main(String[] args) {

		String str="Selenium WebDriver";
		
		//get the length of the string
		System.out.println(str.length());
		
		//fetching a particular character in a string
		System.out.println(str.charAt(9));
		
		//fetching the position of a particular character in the String
		System.out.println(str.indexOf('e'));   //gives the first occurrence of e
		
		//fetching the position of a particular character in the String starting from a particular index
		System.out.println(str.indexOf('e', str.indexOf('e')+1)); //gives the second occurrence of e
		
		//getting the index of a string
		System.out.println(str.indexOf("Driver"));
		
		//we will get the index as -1 if the given string is not present in the str String
		System.out.println(str.indexOf("Java"));
		
		String str1="Selenium";
		String str2="selenium";
		
		//comparing strings
		System.out.println("Comparison result - "+str1.equalsIgnoreCase(str2));
		System.out.println("Comparison result -"+str1.compareTo(str2));  //based on unicode value
		
		//getting substring
		str1=str1.substring(0, 3);
		System.out.println("After getting substring - "+str1);
		
		//trim method will trim the before and after space
		String str3="        Hello W   ";
		System.out.println(str3);
		str3=str3.trim();
		System.out.println(str3);
		
		//replace method can be used to remove the space in between a String
		str3=str3.replace(" ", "");
		System.out.println(str3);
		
		//split method - very important in Selenium Framework
		String str4= "ChromeDriver-FirefoxDriver-HTMLUnitDriver";
		System.out.println(str4);
		String arrayString[]=str4.split("-");
		for(int i=0;i<arrayString.length;i++)
		{
			System.out.println(arrayString[i]);
		}
		
		//Concatenating string
		String str5="Selenium";
		String str6="WebDriver";
		str5=str5.concat(str6);
		System.out.println(str5);
		
		//important string concept
		String str7="Keyword";
		String str8="Framework";
		int sum1=20;
		int sum2=30;
		System.out.println(str7+str8+sum1+sum2);
		System.out.println(sum1+sum2+str7+str8);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package InterviewPrograms;

import java.util.Random;

/* 
 * About    --> This program is to generate a random number
 * 
 */


public class GenerateRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random=new Random();
		
		int num1=random.nextInt(10000);
		int num2=random.nextInt(10000);
		System.out.println(num1);
		System.out.println(num2);
		
		double num3=random.nextDouble();
		double num4=random.nextDouble();
		System.out.println(num3);
		System.out.println(num4);
		
		System.out.println("Generating random doubles using Math.random()");
		System.out.println(Math.random());
		System.out.println(Math.random());

	}

}

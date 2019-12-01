package InterviewPrograms;

/* 
 * About    --> This program is to print the fibonocci series
 * Note- Fibonocci Series -0 1 1 2 3 5 8 13..... 
 */




public class FibonocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=1;
		int num3;
		
		System.out.print(num1+" "+num2);
		
		for(int i=0;i<10;i++)
		{
			num3=num1+num2;
			System.out.print(" "+num3);
			
			num1=num2;
			num2=num3;
		}
		

}
}
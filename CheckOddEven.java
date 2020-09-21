import java.util.Scanner;
public class data{
	/*
	Written by Victor Alagwu
	 write a program called CheckOddEven which prints "Odd Number"if the int variable
	  "number" is odd,or "Even number otherwise
	 */
	
	public static void main( String[] args){
		Scanner input=new Scanner(System.in);
		int num;
		System.out.print("Enter the number: ");
		num=input.nextInt();
		if ( num % 2 == 0){
			System.out.println("Even Number");
		}else 
			System.out.println("Odd Number");
	}
}

package wtf;
import java.util.Scanner;

public class minicalculator {
    /*
     * Written by Victor Alagwu
     * Mini-Calculator Using Switch Case Statement
     */
	public static void main(String[] args) {
		Scanner vput = new Scanner(System.in); //collect all systems input 
		int fnum,snum,adn;// assigning first number,second number, and the mathematical operator an integer variable
	
		double ans; //making answer a double variable so as to get correct values when using division
		System.out.println("Hello,This simple calculator is created by Victor Alagwu Using the Switch Function");
		System.out.print("Enter the first digit: ");
		fnum =vput.nextInt(); //Collect the first value to be inputed in the system
		
		System.out.println("Choose any of the following operators ");
		System.out.println("Addition = 1"); 
		System.out.println("Subtraction = 2");
		System.out.println("Multplication = 3");
		System.out.println("Division = 4");/*
		Each number above are used to represent the mathematical operators +,-,*, and /
		*/
		System.out.print("Enter the sign you want: ");
		
		adn =vput.nextInt();
		System.out.println(" ");
		System.out.print("Enter the second number: ");
		snum =vput.nextInt();
		
		switch(adn){
		case 1: //For addition
			ans = fnum + snum;
			System.out.println("The addition is : " + ans);
		break;
		case 2: //For Subtraction
			ans = fnum - snum;
			System.out.println("The subtraction is : " + ans);
		break;
		case 3: //For Multiplication
			ans = fnum * snum;
			System.out.println("The mutliplication is : " + ans);
		break;
		case 4: //For Division
			ans = fnum / snum;
			System.out.println("The division : " + ans);
		break;
		
		default:
			System.out.println("Sorry your values are incorrect");
		}
	}

}

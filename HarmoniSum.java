
public class harmonicsum {
 /*
  Write a program called HarmonicSum to compute the
   sum of a harmonic series, as shown below, 
   where n=50000. The program shall compute the sum from left-to-right 
   as well as from the right-to-left. 
  Obtain the difference between these two sums and explain the difference.
  */
	public static void main(String [] args){
		int maxNumber=50000;
		double suml2r=0;
		double sumr2l=0;
		suml2r = suml2r(maxNumber, suml2r);
		
		sumr2l = sumr2l(maxNumber, sumr2l);
		
		double ans =suml2r-sumr2l;
		System.out.println("The diff btw "+ suml2r +" " +sumr2l+" " +"is " + ans);
	}
 //Method for summing the harmonic mean from left to right
	private static double suml2r(int maxNumber, double suml2r) {
		for(int i=1; i<=maxNumber; i++){
			
			suml2r +=  1d/i;
			
		}
		System.out.println("The total sum from left to right "+suml2r);
		return suml2r; //returning the value to the suml2r variable
	}
	//Method for summing the harmonic mean from left to right
private static double sumr2l(int maxNumber, double sumr2l) {
	for(int newNum=5000; newNum>=1; newNum--){
		 sumr2l += 1d/newNum;
	}
	
	System.out.println("The total sum from right to left "+sumr2l);
	return sumr2l;  //returning the value to the sumr2l variable
}
	
	
}

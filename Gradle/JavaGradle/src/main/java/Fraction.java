import java.io.*;
/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Ant build file.
 *
 * Ser321 Foundations of Distributed Applications
 * see http://pooh.poly.asu.edu/Ser321
 * @author Tim Lindquist Tim.Lindquist@asu.edu
 *         Software Engineering, CIDSE, IAFSE, ASU Poly
 * @version January 2020
 */
public class Fraction {

   private int numerator, denominator;

   public Fraction(){
      numerator = 1;
      denominator = 1;
   }

   //Assignment 1 -- Modifying to acccept two argments
   public Fraction(int num, int denom){
	   if (denom == 0){
		   throw new IllegalArgumentException("Denominator cannot be zero.");
		  }
	   numerator = num;
	   denominator = denom;
   }

   public void print() {
    System.out.print(numerator + "/" + denominator );
   }

   public void setNumerator (int n ){
      numerator = n;
   }

   public void setDenominator (int d) {
	   if (d == 0){
		   throw new IllegalArgumentException("Denominator cannot be zero.");
	   }
      denominator = d;
   }

   public int getDenominator() {
      return denominator;
   }

   public int getNumerator() {
      return numerator;
   }

   public static void main (String args[]) {
      try {
         // create a new instance
         // Fraction *frac = [[Fraction alloc] init];
         Fraction frac;

	 //ASSIGNMENT 1
	 if (args.length == 2){
		 int num = Integer.parseInt(args[0]);
		 int denom = Integer.parseInt(args[1]);
		 frac = new Fraction(num, denom);
	// }else if (args.length == 1){
	//	 int num = Integer.parseInt(args[0]);
	//	 frac = new Fraction(num, 1); //set default denom to 1 
	}else {
		frac = new Fraction();
	}
         // set the values
         // frac.setNumerator(1);
         // frac.setDenominator(3);

         // print it
         System.out.print("The fraction is: ");
         frac.print();
         System.out.println("");

      }catch(Exception e) {
         e.printStackTrace();
      }
   }
}


import trig.Trig;
import java.util.*;
public class Solver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trig triangle=new Trig();
		Scanner in=new Scanner(System.in);
		   System.out.println("Hello, welcome to the Trigonometry calculator");
	       System.out.println("You must enter a minimum of three measurements. \nThere must be a minimum of one side length and one Angle .");
	  
	       System.out.println(" Please enter side length a:");
	       double a= in.nextDouble();
	       System.out.println("Please enter side length b:");
	       double b= in.nextDouble();
	       System.out.println(" Please enter side length c:");
	       double c= in.nextDouble();
	       System.out.println(" Please enter angle A:");
	       double A= in.nextDouble();
	       System.out.println(" Please enter angle B:");
	       double B= in.nextDouble();
	       System.out.println(" Please enter angle C:");
	       double C= in.nextDouble();
	       //year=Integer.parseInt(words[0]);
	       double[] values={a,b,c,A,B,C};
	       //Working on commands blueprint first, before coding
           //Three inputs
	        if(A==0 && B==0 && C==0){
	    	   A=triangle.cosLawAngle(a, b, c);
	    	   B=triangle.sinLawngle(a, A, b);
	    	   C=triangle.sinLawngle(b, B, c);
	       }
	       if(a==0 && b==0 &&A==0){
	    	   
	       }
	       if(a==0 && c==0 && A==0){
	    	   
	       }
	       if(a==0 && b==0 && B==0){
	    	   
	       }
	       if(b==0 && c==0 && A==0){
	    	   A= threeAngles(B, C);
	    	   b= triangle.sinLawSide(a, A, B);
	    	   c= triangle.sinLawSide(b, B, C);
	       }
	       if(b==0 && c==0 && B==0){
	    	   
	       }
	       if(a==0 && c==0 && C==0){
	    	   
	       }
	       if(b==0 && c==0 && C==0){
	    	   
	       }
	       if (B==0 && a==0 && c==0){
	    	   B=threeAngles(A, C);
	    	   a=triangle.sinLawSide(b, B, A);
	    	   c=triangle.sinLawSide(a, A, C);
	       }
	       //Four inputs
	       if (B==0 && C==0){
	    	   B=triangle.sinLawngle(a, A, b);
	    	   C=triangle.sinLawngle(b, B, c);
	       }
	       if(A==0 && c==0){
	    	   A=threeAngles(B, C);
	    	   c=triangle.sinLawSide(a, A, C);
	       }
	       if(a==0 && b==0){
	    	   a=triangle.sinLawSide(c, C, A);
	    	   b=triangle.sinLawSide(a, A, B);
	       }
	       if(A==0 && C==0){
	    	 A=triangle.sinLawngle(b, B, a);
	    	 C=threeAngles(A, B);
	       }
	       if(A==0 && b==0){
	    	   
	       }
	       if(A==0 && a==0){
	    	   
	       }
	       if(a==0 && b==0){
	    	   
	       }
	       if(a==0 && c==0){
	    	   
	       }
	       //Five inputs
	       if(a==0){
	    	   a=triangle.cosLawSide(A, B, C);
	       }
	       if(b==0){
	    	   b=triangle.sinLawSide(a, A, B);
	       }
	       if(c==0){
	    	   c=triangle.sinLawSide(a, A, C);
	       }
	       if(A==0){
	    	  A=threeAngles(B, C);
	       }
	       if(B==0){
	    	  B=threeAngles(C, A); 
	       }
	       if(C==0){
	    	  C=threeAngles(A, B);
	       }
	      System.out.println("Therefore, a= "+a+" b= "+b+" c= "+c+" A= "+A+" B= "+B+" C= "+C );
		}
		public static double threeAngles (double A, double B){
			double C= 180-(A + B);
			return C;
	}

}

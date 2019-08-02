package Problem8;

import java.util.Scanner;

public class EN_04 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first numbers");
		String n1=sc.nextLine();
		Double num1=Double.parseDouble(n1);
		
		System.out.println("Input operator");
		String o=sc.nextLine();
		
		System.out.println("Input secod numbers");
		String n2=sc.nextLine();
		Double num2=Double.parseDouble(n2);
		double result1=0;
		
		System.out.println("Enter =");
		String e=sc.nextLine();
		if(e.equals("=")) {
		
		if(o.equals("+")) {
			result1=num1+num2;
			System.out.println("Result1=" +result1);
		}
		else if(o.equals("-")) {
			result1=num1-num2;
			System.out.println("Result1=" +result1);
		}
		else if(o.equals("*")) {
			result1=num1*num2;
			System.out.println("Result1=" +result1);
		}
		else if(o.equals("/")) {
			result1=num1/num2;
			System.out.println("Result1=" +result1);
		}
		else {
			System.out.println("Invalid operator");
		}
		}
		else {
			System.out.println("Invalid input");
		}
		
		System.out.println("Enter operator to be applied on the current result");
		String op=sc.nextLine();
		
		System.out.println("Input next number for calculation with Result1");
		String n3=sc.nextLine();
		Double num3=Double.parseDouble(n3);
		
		System.out.println("Enter =");
		String eq=sc.nextLine();
		if(eq.equals("=")) {
		
		if(op.equals("+")) {
			double result2=result1+num3;
			System.out.println("Result2=" +result2);
		}
		else if(op.equals("-")) {
			double result2=result1-num3;
			System.out.println("Result2=" +result2);
		}
		else if(op.equals("*")) {
			double result2=result1*num3;
			System.out.println("Result2=" +result2);
		}
		else if(op.equals("/")) {
			double result2=result1/num3;
			System.out.println("Result2=" +result2);
		}
		else {
			System.out.println("Invalid operator");
		}
		
		}
		
	}
	

}

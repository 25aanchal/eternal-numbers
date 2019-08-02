package Problem8;

import java.util.Scanner;

public class EN_01 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Phi to display its value");
		String p=sc.nextLine();
		String phi=p.toLowerCase();
		if(phi.equals("phi")) {
			System.out.println("Phi = 1.618");
		}
		else {
			System.out.println("Invalid Input");
		}
		
		System.out.println("Enter Phi again to print its value upto 10 decimal places");
		String p2=sc.nextLine();
		String phi2=p2.toLowerCase();
		
		if(phi2.equals("phi")) {
			System.out.println("Phi = 1.6180339887");
		}
		else {
			System.out.println("Invalid Input");
		}
		
		System.out.println("Enter Phi again to print its value upto 15 decimal places");
		String p3=sc.nextLine();
		String phi3=p3.toLowerCase();
		
		if(phi3.equals("phi")) {
			System.out.println("Phi = 1.618033988749894");
		}
		else {
			System.out.println("Invalid Input");
		}
		
		System.out.println("Enter Phi again to print its value upto 3 decimal places");
		String p4=sc.nextLine();
		String phi4=p4.toLowerCase();
		
		if(phi4.equals("phi")) {
			System.out.println("Phi = 1.618"); // user can use the value of phi for fibonacci series.
		}
		else {
			System.out.println("Invalid Input");
		}
	}

}

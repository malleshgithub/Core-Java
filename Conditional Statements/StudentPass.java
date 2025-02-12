package ConditionalStatements;

import java.util.Scanner;

public class StudentPass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		if(marks>=35) {
			System.out.println("Congrats you passed");
		}else {
			System.out.println("Sorry you failed");
		}
	}

}

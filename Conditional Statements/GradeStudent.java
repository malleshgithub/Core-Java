package ConditionalStatements;

import java.util.Scanner;

public class GradeStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int avg=sc.nextInt();
		if(avg>=90) {
			System.out.println("Congrats you got A grade");
		}else if(avg>=80 && avg<=89) {
			System.out.println("Congrats you got B grade");
		}else if(avg>=70 && avg<=79) {
			System.out.println("Congrats you got C grade");
		}else if(avg>=60 && avg<=69) {
			System.out.println("Congrats you got D grade");
		}else {
			System.out.println("Sorry you failed");
		}
	}

}

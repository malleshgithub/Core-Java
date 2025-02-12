package ConditionalStatements;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("It's an Even number "+num);
		}
	}

}

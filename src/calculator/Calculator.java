package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 입력값:");
		int first = scanner.nextInt();
		System.out.println(first);		
	
		System.out.println("두번째 입력값:");
		int second = scanner.nextInt();
		System.out.println(second);
		
		System.out.println(first+"*"+second+"="+(first*second));
		System.out.println(first+"/"+second+"="+(first/second));
		System.out.println(first+"+"+second+"="+(first+second));
		System.out.println(first+"-"+second+"="+(first-second));
		
		
		

	}

}

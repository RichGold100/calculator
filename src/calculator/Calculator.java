package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 입력값:");
		int first = scanner.nextInt();
		System.out.println(first);		
	
		System.out.println("연산기호 입력(*/+-):");
		String symbol = scanner.next();
		System.out.println(symbol);
		
		
		System.out.println("두번째 입력값:");
		int second = scanner.nextInt();
		System.out.println(second);
		

		
		if("+".equals(symbol)){
			System.out.println(first+"+"+second+"="+(first+second));
		} else if ("-".equals(symbol)){
			System.out.println(first+"-"+second+"="+(first-second));
		} else if (symbol.equals("*")){
			System.out.println(first+"*"+second+"="+(first*second));
		} else if (symbol.equals("/")) {
			System.out.println(first+"/"+second+"="+(first/second));
		} else {
			System.out.println("사칙연산해당되는 부호를 입력하지 않았습니다.");
		}
		
		
		
		
		
		
		

	}

}

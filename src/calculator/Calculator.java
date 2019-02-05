package calculator;

import java.util.Scanner;

public class Calculator {

    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("계산할 값 입력:");
		
		String value = scanner.nextLine();
		System.out.println("입력받은 값: "+ value);
		
		String[] values = value.split(" ");
		
		int first = Integer.parseInt(values[0]);
		System.out.println("입력받은 1번째값: "+ values[0]);
		int result = first ;
		int k = 1;

		  // 3 --> 2  5---> 3  7--> 4 
		for(int j=1; j<values.length-k; j++ ){
			
		String symbol = values[2*j-1];
		System.out.println("입력받은 연산자: "+ values[2*j-1]);	
		int second = Integer.parseInt(values[2*j]);
		System.out.println("입력받은 값: "+ values[2*j]);
		
		result = Calculate.calculate(result, symbol, second);
		k = k + 1 ;
		}
		
		
		Output.print(result);
//		String symbol2 = values[3];
//		System.out.println("입력받은 2번째 연산자: "+ values[3]);	
//		
//		int third = Integer.parseInt(values[4]);
//		System.out.println("입력받은 2번째값: "+ values[4]);
//		

		

	}
}

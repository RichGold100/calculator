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


        for (int i = 1 ; i<values.length ;i = i + 2 )
		{
			
		String symbol = values[i];
		System.out.println("입력받은 연산자: "+ values[i]);	
		int second = Integer.parseInt(values[i+1]);
		System.out.println("입력받은 값: "+ values[i+1]);
		
		result = Calculate.calculate(result, symbol, second);

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

package calculator;

import java.util.Scanner;

public class Calculator {

    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� �� �Է�:");
		
		String value = scanner.nextLine();
		System.out.println("�Է¹��� ��: "+ value);
		
		String[] values = value.split(" ");
		
		int first = Integer.parseInt(values[0]);
		System.out.println("�Է¹��� 1��°��: "+ values[0]);
		int result = first ;
		int k = 1;

		  // 3 --> 2  5---> 3  7--> 4 
		for(int j=1; j<values.length-k; j++ ){
			
		String symbol = values[2*j-1];
		System.out.println("�Է¹��� ������: "+ values[2*j-1]);	
		int second = Integer.parseInt(values[2*j]);
		System.out.println("�Է¹��� ��: "+ values[2*j]);
		
		result = Calculate.calculate(result, symbol, second);
		k = k + 1 ;
		}
		
		
		Output.print(result);
//		String symbol2 = values[3];
//		System.out.println("�Է¹��� 2��° ������: "+ values[3]);	
//		
//		int third = Integer.parseInt(values[4]);
//		System.out.println("�Է¹��� 2��°��: "+ values[4]);
//		

		

	}
}

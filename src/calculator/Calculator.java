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


        for (int i = 1 ; i<values.length ;i = i + 2 )
		{
			
		String symbol = values[i];
		System.out.println("�Է¹��� ������: "+ values[i]);	
		int second = Integer.parseInt(values[i+1]);
		System.out.println("�Է¹��� ��: "+ values[i+1]);
		
		result = Calculate.calculate(result, symbol, second);

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

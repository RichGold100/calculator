package calculator;

import java.util.Scanner;

public class Calculator {

    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		
		String value = Input.getStringVal(scanner);
		
		
		String[] values = value.split(" ");
		
		int first = Integer.parseInt(values[0]);
		
		int result = first;
	
		int i = 2;
		
		//while (true) {
			String symbol = values[1];
			


//			  if ("quit".equals(symbol)) {
//			      // TODO ���� ���� ��� �� ���
//				  Output.print(result);				  
//			      break;
//			  }

			  // TODO �� ��° �� �Է�
			   int second = Integer.parseInt(values[2]);	    

				i=i+1;  // i��° �Է�

			  // TODO ��Ģ���� ����
				result = Calculate.calculate(result, symbol, second);			

			// }
		
		 scanner.close();
		
	   }

}

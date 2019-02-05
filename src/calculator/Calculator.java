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
//			      // TODO 최종 실행 결과 값 출력
//				  Output.print(result);				  
//			      break;
//			  }

			  // TODO 두 번째 값 입력
			   int second = Integer.parseInt(values[2]);	    

				i=i+1;  // i번째 입력

			  // TODO 사칙연산 실행
				result = Calculate.calculate(result, symbol, second);			

			// }
		
		 scanner.close();
		
	   }

}

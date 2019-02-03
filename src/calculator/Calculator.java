package calculator;

import java.util.Scanner;

public class Calculator {
	
	public static int getFirstValue(Scanner scanner){
		System.out.println("1번째 입력값:");
		int first = scanner.nextInt();
		System.out.println(first);
		return first;
	}
	
	public static String getSymbol(Scanner scanner){
		  System.out.println("연산기호 입력(*/+-):");
		  String symbol = scanner.next();
		  System.out.println(symbol);
		  return symbol;
	}
	
	public static void print(int result){
		  System.out.println("최종결과값: "+result);
	}
	
	public static int getSecondValue(Scanner scanner, int i){
		System.out.println(i+"번째 입력값:");
		int second = scanner.nextInt();
		System.out.println(second);	
		return second;
	}
	public static int calculate(int result, String symbol, int second){
		if("+".equals(symbol)){
			result = result + second;
			System.out.println("덧셈:"+result);
		} else if ("-".equals(symbol)){
			result = result - second;
			System.out.println("뺄셈:"+result);
		} else if (symbol.equals("*")){
			result = result * second;
			System.out.println("곱셈:"+result);
		} else if (symbol.equals("/")) {
			result = result / second;
			System.out.println("나눗셈:"+result);
		} else {
			System.out.println("사칙연산해당되는 부호를 입력하지 않았습니다.");
		}
		return result;
	}
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int result = getFirstValue(scanner);
	
		int i = 2;
		
		while (true) {
			String symbol = getSymbol(scanner);
			


			  if ("quit".equals(symbol)) {
			      // TODO 최종 실행 결과 값 출력
				  print(result);				  
			      break;
			  }

			  // TODO 두 번째 값 입력
			   int second = getSecondValue(scanner, i);			    

				i=i+1;  // i번째 입력

			  // TODO 사칙연산 실행
				result = calculate(result, symbol, second);			

			 }
		
		 scanner.close();
		
	   }

}

package calculator;

import java.util.Scanner;

public class Calculator {
	
	public static int getFirstValue(Scanner scanner){
		System.out.println("1��° �Է°�:");
		int first = scanner.nextInt();
		System.out.println(first);
		return first;
	}
	
	public static String getSymbol(Scanner scanner){
		  System.out.println("�����ȣ �Է�(*/+-):");
		  String symbol = scanner.next();
		  System.out.println(symbol);
		  return symbol;
	}
	
	public static void print(int result){
		  System.out.println("���������: "+result);
	}
	
	public static int getSecondValue(Scanner scanner, int i){
		System.out.println(i+"��° �Է°�:");
		int second = scanner.nextInt();
		System.out.println(second);	
		return second;
	}
	public static int calculate(int result, String symbol, int second){
		if("+".equals(symbol)){
			result = result + second;
			System.out.println("����:"+result);
		} else if ("-".equals(symbol)){
			result = result - second;
			System.out.println("����:"+result);
		} else if (symbol.equals("*")){
			result = result * second;
			System.out.println("����:"+result);
		} else if (symbol.equals("/")) {
			result = result / second;
			System.out.println("������:"+result);
		} else {
			System.out.println("��Ģ�����ش�Ǵ� ��ȣ�� �Է����� �ʾҽ��ϴ�.");
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
			      // TODO ���� ���� ��� �� ���
				  print(result);				  
			      break;
			  }

			  // TODO �� ��° �� �Է�
			   int second = getSecondValue(scanner, i);			    

				i=i+1;  // i��° �Է�

			  // TODO ��Ģ���� ����
				result = calculate(result, symbol, second);			

			 }
		
		 scanner.close();
		
	   }

}

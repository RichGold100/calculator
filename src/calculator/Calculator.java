package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù��° �Է°�:");
		int first = scanner.nextInt();
		System.out.println(first);		
	
		System.out.println("�����ȣ �Է�(*/+-):");
		String symbol = scanner.next();
		System.out.println(symbol);
		
		
		System.out.println("�ι�° �Է°�:");
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
			System.out.println("��Ģ�����ش�Ǵ� ��ȣ�� �Է����� �ʾҽ��ϴ�.");
		}
		
		
		
		
		
		
		

	}

}

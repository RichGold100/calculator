package calculator;

import java.util.Scanner;

public class Calculator {
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1��° �Է°�:");
		int first = scanner.nextInt();
		System.out.println(first);	
		int result = first;
		int i = 2;
		
		while (true) {
			  System.out.println("�����ȣ �Է�(*/+-):");
			  String symbol = scanner.next();
			  System.out.println(symbol);

			  if ("quit".equals(symbol)) {
			      // TODO ���� ���� ��� �� ���
				  System.out.println("���������: "+result);
				  
			      break;
			  }

			  // TODO �� ��° �� �Է�
				System.out.println(i+"��° �Է°�:");
				int second = scanner.nextInt();
				System.out.println(second);	
				i=i+1;

			  // TODO ��Ģ���� ����
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
			 }
		
	   }

}

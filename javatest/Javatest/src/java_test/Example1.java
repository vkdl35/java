package java_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * [���빮��]
		 * ����ڰ� �������� ���ڸ� �Է��ϴ� �ζ� ���α׷��Դϴ�.
		 * ���μ��� ���۽� "���ڸ� �Է����ּ���." �� �������� ���ڸ� �Է¹ް� �˴ϴ�.
		 * �׸��� lotto.txt ����� ���� ������ �ε��Ͽ� ����ڰ� �Է��� ����
		 * ����� ���Ͽ� ��� ������� �����ϴ� ���α׷� �ڵ带 �ۼ��ϼ���.
		 * [��� ����]
		 * �ζ� ��� : �� ������ ��ȣ�� ���߼̽��ϴ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		FileReader fr = new FileReader("C:\\javatest\\Javatest\\src\\java_test\\lotto.txt");
		BufferedReader br = new BufferedReader(fr);
		ArrayList<Integer> ar = new ArrayList<>();
		ArrayList<Integer> ar2 = new ArrayList<>();
		

		int total = 0;
		int w = 0;
		while (w < 6) {
			String u = br.readLine();
			int a = Integer.parseInt(u);
			ar.add(a);

			System.out.println("���ڸ� �Է����ּ���.");
			int user = sc.nextInt();
			ar2.add(user);
			
//			if (user == ar.get(w)) {
//				total++;
//			}
			
			w++;
		}
		sc.close();
		
		
		for(int f=0;f<6;f++) {
			for(int e=0;e<6;e++) {
				if(ar2.get(f)==ar.get(e)) {
					total++;
				}
			}
		}
		System.out.printf("�� %d���� ��ȣ�� ���߼̽��ϴ�.", total);
	}

}

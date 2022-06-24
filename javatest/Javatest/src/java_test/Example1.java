package java_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * [응용문제]
		 * 사용자가 여섯개의 숫자를 입력하는 로또 프로그램입니다.
		 * 프로세서 시작시 "숫자를 입력해주세요." 총 여섯번의 숫자를 입력받게 됩니다.
		 * 그리고 lotto.txt 결과를 가진 파일을 로드하여 사용자가 입력한 값과
		 * 결과를 비교하여 몇개를 맞췄는지 컴토하는 프로그램 코드를 작성하세요.
		 * [결과 예시]
		 * 로또 결과 : 총 세개의 번호를 맞추셨습니다.
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

			System.out.println("숫자를 입력해주세요.");
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
		System.out.printf("총 %d개의 번호를 맞추셨습니다.", total);
	}

}

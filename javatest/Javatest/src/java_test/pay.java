package java_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class pay {

	public static void main(String[] args) {
		
		payroll py = new payroll();
		py.start();
		int result[] = py.check();
		System.out.println("총 이체한 금액은 "+result[0]+"이며, 총 잔고금액은 "+result[1]+"입니다.");

	}

}

class payroll extends pay_abstract {
	String filename = null;
	int all_money = this.money;
	int total = 0;
	//사용자 입금 파트
	public void input_sc() {
		Scanner sc = new Scanner(System.in);
		int c = 0;
		int m_in = 0;
		
		while(c < this.em_name.size()) {			
			System.out.println("이체를 시작합니다. ["+this.em_name.get(c)+"]님에게 이체하실 금액을 입력해주세요. : ");
			m_in = sc.nextInt();
			this.all_money -= m_in;
			this.total += m_in;
			c++;
		}
		sc.close();
	}
	@Override
	public void start() {
		try {			
			this.filename = "C:\\javatest\\Javatest\\src\\java_test\\employee.txt";
			this.db();
			this.input_sc();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	@Override
	void db() throws IOException {
		this.em_name = new ArrayList<>();	//빈배열
		this.fr = new FileReader(this.filename,Charset.forName("UTF8"));
		BufferedReader br = new BufferedReader(fr);
		String data = br.readLine();
		String user[] = data.split(",");
		int w = 0;
		while(w < user.length) {
			this.em_name.add(user[w]);
			w++;
		}
		br.close();
		
	}
	@Override
	public int[] check() {
		
		return new int[] {this.total,this.all_money};
	}
}
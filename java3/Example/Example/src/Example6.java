import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제]
		 * 상품 가격은 42000원입니다.
		 * 사용자가 해당 상품을 갯수를 입력하게 됩니다.
		 * 해당 상품 가격에 맞는 갯수만큼 곱하여 최종 결제 금액을 출력시키는
		 * extends를 제작하시면 됩니다.
		 * 단, 42000은 절대 숫자가 바뀌면 안됩니다.
		 * 사용자가 최대 구매할 수 있는 갯수는 5개까지 입니다.
		 * 최종 결과값은 main 메소드에서 출력합니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("상품 가격은 42000원 입니다. 구매하실 갯수를 입력해주세요. (5개까지만 구매 가능)");
		int u = sc.nextInt();
		Bdata_1 bd1 = new Bdata_1();
		bd1.name1(u);
		int r = bd1.name2();
		String k = bd1.name3();
		if(u < 6) {
			System.out.printf("총 금액은 %d원 입니다.",r);
		}
		else {
			System.out.println(k);
		}
		sc.close();
		
	}
	

}

class Adata_1 {
	private int money = 42000;	
	protected int total;
	protected String msg;
	
	public void name1(int user) {
		if(user < 6) {
			this.total = this.money * user;
		}
		else if(user >= 6) {
			msg = "다섯개 까지만 선택 가능합니다.";
		}
		else {
			msg = "입력 오류";
		}
	}
	
}
class Bdata_1 extends Adata_1 {
	public int name2() {
		return this.total;
	}
	public String name3() {
		return this.msg;
	}
}

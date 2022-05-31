import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제]
		 * 다음중 장바구니에 여러개의 상품이 담겨져 있습니다.
		 * 그 중 택배비가 별도로 측정되는 금액만 추출하시오.
		 * 택배비는 30000원 이상(포함)입니다.
		 * 15000 48000 67000 8000 118200 49800 6000 18700
		 * 
		 * 결과 [48000, 67000, 118200, 49800]
		 */
		
		int money[] = {15000,48000,67000,8000,118200,49800,6000,18700};
		int total[] = new int[4];
		
		int ea_m = money.length;
//		System.out.println(ea_m);
		int ea_t = total.length;
//		System.out.println(ea_t);
		int a = 0;
		int ct = 0;
		
		while(a < ea_m) {	//money배열에 있는 수까지만 돌아가야 함. total배열에 있는 수까지만 돌면 4번 밖에 안돌아감
			if(money[a] >= 30000) {
				total[ct] = money[a];
				ct++;
			}
			a++;
		}
		//System.out.println(Arrays.toString(total));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

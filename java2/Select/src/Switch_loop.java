
public class Switch_loop {

	public static void main(String[] args) {
		
		String sign = "*";
		int total;
		/* case안에 각각의 반복문을 사용할 수 있습니다.
		 * 또한 동일한 변수명을 사용해도 가능하며, case는 각각 다르게 작동하기 때문에 문제되지 않습니다.
		 * 단, case는 하나의 조건이 맞을 경우 나머지 case는 절대 작동하지 않음 
		 * switch안에 조건문 반복문 사용 가능*/
		
		switch(sign) {
		case "+" -> {
			int f;
			total = 0;
			for(f=1;f<=5;f++) {
				total+=f;
			}
			System.out.printf("총 1~5까지 계산된 값은 %d입니다.",total);
			//switch문 밖에 쓰면 오류, 굳이 밖에다 쓰려면 처음 total값을 0으로 설정(권장하지 않음)
			//
		}
		case "-" -> {
			total = 0;
			System.out.println("음수값은 출력되지 않습니다.");
		}
		case "*" -> {
			int f = 1; 	//위에서 쓴 변수명을 또 사용해도 상관없음. case안에선 단독으로 실행
			total = 1;
			do {
				total*=f;
				f++;
			}while(f <= 5);
			System.out.printf("총 1~5까지 계산된 값은 %d입니다.",total);
		}
		case "/" -> {
			total = 0;
		}
		
		}
		
		
		
		
		
		
	}

}

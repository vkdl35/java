import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		
		//{3.4, 1.6, 4.2, 5.3, 4.7} 소수점은 처음부터 double로 만들어야 에러가 안남
		
//		//새로운 반복문
//		int data[] = {5, 10, 15, 20, 25, 30, 35};
//		for(int f : data) {	//int f가 순차적으로 data 배열값을 받아서 저장시킴
//			//배열값을 불러와서 f값에 넘겨줌. 여기서 int f는 먼저 밖에 생성하면 안됨. 기호대신 :을 사용해야함.
//			/* foreach문을 사용할 때는 인덱스 번호가 필요없이 사용할 경우
//			 * for~do~whils문 사용할 때는 인덱스 번호가 필요할 때
//			 * 
//			 * 인덱스 번호 : [0][1][2]*/
//			if(f % 2 == 0) {				
//				//System.out.println(f);
//			}
//		}

		
//		String pay[] = {"무통장 입금","신용카드","휴대폰 결제","상품권","쿠폰"};
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("결제하고자 하는 형태를 선택해주세요.");
//		String pm = sc.nextLine();
//		
//		for(String z : pay) {	//배열 데이터가 문자면 받는 변수 형태 또한 문자형을 사용해야함
//			//배열이 문자면 받는 함수도 int가 아닌 string를 사용해야 인식함 (중요!)
//			if(pm.equals(z)) {				
//				System.out.println(pm+"로 결제 진행됩니다.");
//			}
//		}
		
		//foreach를 사용했을 때, 조건문 안에 또 조건문이 들어간 경우
		
		
		String pay[] = {"무통장 입금","신용카드","휴대폰결제","상품권","쿠폰"};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("결제하고자 하는 형태를 선택해주세요.");
		String pm = sc.next();
		
		for(String z : pay) {	//배열 데이터가 문자면 받는 변수 형태 또한 문자형을 사용해야함
			//배열이 문자면 받는 함수도 int가 아닌 string를 사용해야 인식함 (중요!)
			if(pm.equals(z)) {	
				if(z.equals("휴대폰결제")) {
					System.out.println("현재 시스템 점검으로 해당 결제는 사용하실 수 없습니다.");
				}
				else {
					System.out.println(pm+"로 결제 진행됩니다.");
				}
				//System.out.println(pm+"로 결제 진행됩니다.");
			}
		}
		
		
		sc.close();
		
		/*
		 * [응용문제]
		 * {"햄버거" , "피자" , "치킨" , "커피"}
		 * "주문하고자 하는 음식을 선택해주세요." <<이 주문이 foreach문 안에 들어가야함
		 * 해당 질문은 총 4번을 물어보게 됩니다.
		 * 단, "주문종료" 라고 사용자가 입력하는 즉시 주문은 종료 되며, 주문 내역을 출력하시면 됩니다.
		 */
		
		String food[] = {"햄버거","피자","치킨","커피"};
		Scanner aa = new Scanner(System.in);
		
		String total;
		//String data_food = food.length;
		
		for(String p : food) {
			System.out.println("주문하고자 하는 음식을 선택해주세요.");
			String user = aa.next();
//			if(user.equals(food)) {
//				
//			}
//			
		}
		aa.close();
//		System.out.println("주문 내역 : ");
		
		
		
		
		
		
	}

}

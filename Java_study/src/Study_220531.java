import java.util.Arrays;
import java.util.Scanner;

public class Study_220531 {

	public static void main(String[] args) {
		
		//배열이란? 나열된 데이터의 형태
		
		int a[] = new int[4];	//숫자로 된 4개의 데이터를 생성
		a[0]=5;					//4개의 데이터에 각각의 값을 넣어줌
		a[1]=15;
		a[2]=25;
		a[3]=35;
		int ea = a.length;		//배열의 개수를 파악할 때 사용
		//System.out.println(ea);	//정상 출력이 되는지 먼저 확인
		int f;
		for(f=0;f<ea;f++) {		
			//f가 ea까지. 즉, 0에서 4까지니까 총 {0,1,2,3} 4개
			//때문에 작거나 같다라고 쓰면 인식 오류
			System.out.println(a[f]);	//배열 함수[확인하려는 값]
		}
		
		// 변수 비우기
		
		//String aaa[] = {"a","b","c","d","e"};
		//String aaa[] = null;	//숫자형은 0
		
		//문자형 배열
		
		String user[] = new String[3];
		user[0]="홍길동";
		user[1]="이순신";
		user[2]="강감찬";		//0부터 시작해서 세개면 0,1,2
		int k = user.length;	//배열 개수가 몇개인지 확인
		int w = 0;
		while (w < k) {		//0이 3보다 작을 때, 2인 강감찬이 3보다 작으니까 출력 가능
			System.out.println(user[w]);
			w++;
		}
		
		/* 위의 방식은 거의 쓰이지 않는 배열 */
		
		//다른 방식의 배열
		
		//int[] z : 배열값을 선언하고 해당 데이터를 직접적으로 자동 구분하여 적용 
		//int z[] : 배열값을 선언하면서 직접 0부터 시작하여 값을 구분함
		int [] z = new int[] {10,20,30,33,42,11};
		int zea = z.length;		//zea는 z에 있는 배열 개수를 갖고 있다
		int ww = 0;
		do {
			System.out.print(z[ww]+" ");
			ww++;
		}while(ww<zea);
		
		//다른 방식의 배열(2) _ 버전 업그레이드
		
		int aa[] = {10,11,22,33,55};
		int aea = aa.length;
		//System.out.println(aea);	//항상 개수가 잘 들어왔나 확인 먼저
		int aw = 0;
		while(aw < aea) {
			System.out.print(aa[aw]+" ");
			aw++;
		}
		
		//문자형 배열의 length
		
		String id[] = {"hong", "kim", "park", "lee", "jang", "jung"};
		int idea = id.length;
		//length는 배열값의 개수를 나타내는 것이기 때문에 문자형이어도 int를 쓴다.
		//int idea_2 = id[1].length();	
		//length() 소괄호가 붙으면 length는 철자의 개수를 파악할 때 씀
		//id[] 안에 들어가는 숫자는 배열값의 인덱스 번호
		System.out.println(idea);
		
		//for each문 - 배열에서만 쓰이는 반복문
		int data[] = {5, 10, 15, 20, 25, 30, 35};
		for(int f2 : data) {	//int f가 순차적으로 data값을 받아서 저장시킴
		/*  배열값을 불러와서 f에 넘겨준다. 이때, int f는 먼저 밖에 생성할 수 없다.
			대괄호 기호 대신 :(콜론)을 사용
			for each문은 인덱스 번호가 필요 없을 경우
			for~do~while 반복문은 인덱스 번호가 필요할 때 사용한다.  */
			if(f2 % 2 == 0) {
				System.out.println(f2);
			}	
		}
		
		//for each문 사용 예제
		
		String pay[] = {"무통장 입금","신용카드","휴대폰 결제","상품권","쿠폰"};
		Scanner sc = new Scanner(System.in);
		System.out.println("결제하고자 하는 방식을 선택해주세요.");
		String pm = sc.nextLine();
		//여기까지 세팅 준비
		for(String z2 : pay) {	//배열 데이터가 문자면 받는 변수 형태도 문자형이어야 함
			if(pm.equals(z2)) {
			//사용자 입력.equals(foreach문으로 받은 배열값)
				System.out.println(pm+"로 결제 진행됩니다.");
			}
		}
		sc.close();
		
		//for each문에 더블 조건문을 사용한 경우
		
		String pay2[] = {"무통장 입금","신용카드","휴대폰결제","상품권","쿠폰"};
		Scanner ssc = new Scanner(System.in);
		
		System.out.println("결제하고자 하는 형태를 선택해주세요.");
		String pam = ssc.next();
		
		for(String z2 : pay2) {	
			if(pam.equals(z2)) {	
				if(z2.equals("휴대폰결제")) {
					System.out.println("현재 시스템 점검으로 해당 결제는 사용하실 수 없습니다.");
				}
				else {
					System.out.println(pam+"로 결제 진행됩니다.");
				}
			}
		}	
		ssc.close();
		
		//빈공간에 배열값 담기
		
		String[] names = new String[3];	//3개가 들어갈 수 있는 빈 공간을 생성
		String m[] = {"홍길동","강감찬","이순신"};
		//System.out.println(names[0]); 	//null 값이 비었다는 뜻
		int ct = 0;
		for(String a4 : m) {	//a라는 변수에 m 배열값을 가져온다
			names[ct] = a4;	//빈공간에 a에 담긴 값 넣기
			ct++;			//인덱스번호 0에서 증가
		}
		System.out.println(names[0]);	//인덱스 번호에 있는 배열값 호출
		
		//빈 공간에 배열값 골라 넣기
		
		String[] names2 = new String[3];
		String m2[] = {"홍길동","강감찬","이순신"};
		int ct2 = 0;
		for(String a2 : m2) {
			if(a2.equals("홍길동")||a2.equals("이순신")) {	//홍길동 또는 이순신만이라는 조건
				names2[ct2] = a2;
				ct2++;
			}
		}
		int name_ea = names2.length;
		System.out.println(name_ea);
		System.out.println(Arrays.toString(names2));
		
		//빈배열 변수에 데이터가 있는 배열로 커스텀
		
		int a3[] = new int[3];
		int b[] = {1,2,3,4,5,6,7};
		//int ea_a3 = a3.length;
		int ea_b = b.length;
		int w3 = 0;
		int ct3 = 0;
		while(w3 < ea_b) {
			if(b[w3] % 2 == 0) {
				a3[ct3] = b[w3];
				ct3++;
			}
			w3++;
		}
		System.out.println(Arrays.toString(a3));
		
		
		/*
		 * [응용문제1]
		 * 해당 사용자 리스트 배열이 있습니다.
		 * 해당 배열값 중 사용자 아이디 세단어 이상만 출력하세요.
		 */
		
		String id2[] = {"hong","kim","park","lee","jang","jung"};
		int member = id2.length;
		//System.out.println(member);	//배열값의 개수 확인
		int w2 = 0;
		int word;	//각각의 배열값의 철자 개수 파악
		while(w2 < member) {
			word = id2[w2].length();
			if(word > 3) {
				System.out.println(id2[w2]);
			}
			w2++;
		}
		
		/*
		 * [응용문제2]
		 * 배열 데이터는 다음과 같습니다.
		 * 15, 60, 11, 14, 27
		 * 다음 데이터 값을 모두 더해서 최종 결과값을 출력하세요.
		 */
		
		int mun[] = {15,60,11,14,27};
		int m_ea = mun.length;
		System.out.println(m_ea);
		int w4 = 0;
		int total = 0;
		while(w4 < m_ea) {
			total += mun[w4];
			w4++;
		}
		System.out.println(total);
		
		/*
		 * [응용문제3]
		 * 다음중 장바구니에 여러개의 상품이 담겨져 있습니다.
		 * 그 중 택배비가 별도로 측정되는 금액만 추출하세요.
		 * 택배비는 30000원 이상(포함)입니다.
		 * 15000 48000 67000 8000 118200 49800 6000 18700
		 * 결과 [48000, 67000, 118200, 49800]
		 */
		
		int money[] = {15000,48000,67000,8000,118200,49800,6000,18700};
		int box[] = new int[4];
		int ea_m = money.length;
		int w5 = 0;
		int ct4 = 0;
		while(w5 < ea_m) {
			if(money[w5] >= 30000) {
				box[ct4] = money[w5];
				ct4++;
			}
			w5++;
		}
		System.out.println(Arrays.toString(box));
		
		/*
		 * [응용문제4]
		 * 해당 사용자 정보 데이터 및 각 레벨별 데이터도 함께 제공됩니다.
		 * 그 중 레벨 데이터 값에 3미만(미포함)의 값만 확인하여 
		 * 배열 데이터를 재가공합니다.
		 * 홍길동, 이순신, 강감찬, 세종대왕, 유관순, 김유신
		 * 4,3,1,1,2,2
		 * ["강감찬" , "세종대왕" , "유관순" , "김유신"]
		 */
		
		String member2[] = {"홍길동","이순신","강감찬","세종대왕","유관순","김유신"};
		int num[] = {4,3,1,1,2,2};
		String box2[] = new String[4];
		int ea_m2 = member2.length;
		int w6 = 0;
		int ct5 = 0;
		while(w6 < ea_m2) {
			if(num[w6] < 3) {
				box2[ct5] = member2[w6];
				ct5++;
			}
			w6++;
		}
		System.out.println(Arrays.toString(box2));
		
		/*
		 * [응용문제5]
		 * {"햄버거" , "피자" , "치킨" , "커피"}
		 * "주문하고자 하는 음식을 선택해주세요."
		 * 해당 질문은 총 4번을 물어보게 됩니다.
		 * 단, "주문종료" 라고 사용자가 입력하는 즉시 주문은 종료 되며, 
		 * 주문 내역을 출력하시면 됩니다.
		 */
		
		String food[] = {"햄버거" , "피자" , "치킨" , "커피"};
		Scanner sdc = new Scanner(System.in);
		String user_food[] = new String[4];	
		//최종 결과값이 담길 수 있도록 빈공간을 만들어줌
		int ct6 = 0;	//인덱스 값이 올라갈 수 있도록 증가하는 카운터값
		for(String fd : food) {
			System.out.println("주문하고자 하는 음식을 선택해주세요.");
			String user2 = sdc.next();
			//총 네번 질문하기 때문에 반복문 안에 질문과 사용자 입력 함수가 있어야 함
			if(user2.equals("주문종료")) {
				break;	//만약 주문종료를 입력시 그 자리에서 멈춰라
			}
			else {	//그게 아니라면 
				for(String fd2 : food) {	
					//fd2 변수에 다시 food값을 넘겨주는 반복문 새로 생성
					if(user2.equals(fd2)) {	//만약 그 변수값 안에 사용자가 입력한 값이 있다면
						user_food[ct6] = fd2;	//만들어둔 빈 공간에 그걸 넣어줘라
						//ct는 인덱스 값 0에서 시작
						ct6++;	//순차적으로 인덱스값 증가(만약 없을시 계속 인덱스값 0에만 값이 들어감)
					}
				}
			}
		}
		sdc.close();	//스캐너 종료 후
		System.out.println("주문하신 메뉴는 다음과 같습니다." + Arrays.toString(user_food));
		//모든 조건문과 반복문 밖에 출력 + arrays.tostring로 빈공간 안에 담긴 모든 배열을 보여달라
		
		/*
		 * [응용문제6]
		 * 사용자가 장바구니에 내용을 결제하게 됩니다.
		 * 단, 해당 금액리스트를 출력하지 말고, 최종 전체 결제 금액만 출력되도록 합니다.
		 * 1500, 2000, 13000, 14500, 113800, 4500
		 */		
		
		/*
		 * [응용문제7]
		 * 다음 배열값이 있습니다. 해당 배열 값을 비교하여 사용자 정보를 출력하세요.
		 * Adata = hong kim park jang lee song
		 * Bdata = 80 100 46 38 65 88
		 * 결과 배열에 따른 조건은 60점 이상(포함) 중 합격자만 출력합니다.
		 * 결과 배열 : [hong kim lee song]
		 */
		
		String Adata[] = {"hong","kim","park","jang","lee","song"};
		int Bdata[] = {80,100,46,38,65,88};
		int ea_A = Adata.length;
		String user4[] = new String[4];
		int x2 = 0;
		int ct9 = 0;
		while(x2 < ea_A) {
			if(Bdata[x2] >= 60) {
				user[ct9] = Adata[x2];
				ct9++;
			}
			x2++;
		}
		System.out.println(Arrays.toString(user4));
	}

}

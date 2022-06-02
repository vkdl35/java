import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*
		 [응용문제9]
		 
		  A학생에 대한 성적을 입력 받고 평균점수가 나오는 프로그램을 제작합니다.
		  "점수를 입력하세요." 라는 문구는 총 5번이 나오게 되며,
		  모든 점수는 합산하여 출력합니다.
		  
		  모든 점수는 합산 한 후 5개의 점수에 대한 평균값을 출력하셔야 합니다.
		  출력 메세지는 " 해당 점수의 평점은 " " 출력
		  단, 평점 점수가 40점 이하 일 경우, "재시험입니다." 라고 메시지를 출력 후 프로세서는 종료합니다.
		  40점 이상일경우 " 합격 " 이라고 출력하십시오.
		  
		  [추가기획]
		  "입력하실 과목 수를 넣어주세요 : " 라고 제일 먼저 출력 후 해당 과목 수 만큼 반복문이 적용이 되며, 과목 수 만큼 평균값이 적용되어야 합니다.
		  
		  **do~while으로 작성하세요.
		 */
		
//		Scanner aa = new Scanner(System.in);
//		System.out.println("과목 수를 적어주세요 : ");
//		int usersub = aa.nextInt();//사용자 입력 과목 갯수
//		String bb = "점수를 입력하세요."; 
//		
//		int cc=1;//반복문
//		int dd=0;//합산 출력
////		int sub = 5; // 과목갯수
//		
//		
//		do {
//			System.out.println(bb);// 점수입력하세요 출력
//			int ee = aa.nextInt(); // 사용자 입력
//			dd+=ee; //합산출력
//			cc++;
//		} while(cc<=usersub);
////		System.out.printf("총 점수는 %d점입니다.", dd); //합산 만
//		System.out.printf("총 점수는 %d점입니다.\n%d개의 과목에 대한 평균점수는 %d점 입니다.",dd, usersub, dd/usersub); //과목갯수/합산/평균
//		
//		if (dd/5<40) {
//			System.out.println("\n재시험입니다.");
//		}
//		else {
//			System.out.println("\n합격");
//		}
//		
//
//		aa.close();
		
		/*
		Scanner sc = new Scanner(System.in);
		int w = 1;
		int user;
		int total=0;
		while(w<=5) {
			System.out.println("점수를 입력해주세요.");
			user = sc.nextInt();
			total += user;
			w++;
		}
		
		System.out.println("최종 합계 점수는 "+total);
		*/
		
		
		/*
		Scanner sc = new Scanner(System.in);
		int w = 1;
		int user;
		int total=0;
		while(w<=5) {
			System.out.println("점수를 입력해주세요.");
			user = sc.nextInt();
			total += user;
			w++;
		}
		double avg = total / 5;
		String msg;
		if(avg < 40) {
			msg = "재시험입니다.";
		}
		else {
			msg = "합격입니다.";
		}
		
		System.out.println("최종 평균 점수는 "+avg+"점이며, "+msg);
		*/
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하실 과목 수를 적어주세요.");
		int subject = sc.nextInt();
		int w = 1;
		int user;
		int total=0;
		while(w<=subject) {
			System.out.println("점수를 입력해주세요.");
			user = sc.nextInt();
			total += user;
			w++;
		}
		double avg = (double)(total) / subject;
		//소수점까지 표시하려면 total 값 앞에 double을 붙여주면 됨.
		String msg;
		if(avg < 40) {
			msg = "재시험입니다.";
		}
		else {
			msg = "합격입니다.";
		}
		System.out.println("최종 평균 점수는 "+avg+"점이며, "+msg);
		sc.close();
		
		
		
		
	}

}

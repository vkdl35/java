
public class Dowhile_plus {

	public static void main(String[] args) {
		
		/* do~while : 30~35까지 합계를 출력하시오 */
		
//		int a=30;
//		int t=0;
//		do {
//			t+=a;
//			a++;
//		}while(a<36);
//		System.out.println(t);
		
		/* 응용문제 : 합계숫자 189가 있습니다. 
		   단, 1~10까지 합계치와 
		   현재 189를 뺀 총 합계를 구하시오*/
		
//		int a = 189;
//		int b = 1;
//		int c = 0;
//		do {
//			c+=b;
//			b++;
//		}while(b<11);
//		System.out.println(a-c);
		
		int aa=1;
		int ss=189;
		do {
			ss-=aa;
			aa++;
		}while(aa<=10);
		System.out.println(ss);

		
		
		
	}

}

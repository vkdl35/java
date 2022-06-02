
public class Example6 {

	public static void main(String[] args) {
		/*
		 [응용문제6]
		 
		  1~10까지 순차적으로 적용하는 반복문이 있습니다.
		  단, 1~5까지는 모든값을 곱하고, 6~10까지는 모든값을 더합니다.
		  해당 두개의 값을 비교하여 더한값이 큰지, 곱한값이 큰지를
		  결과로 출력하시오.
		 */
		
		//[내가 짠 코드]
		
//		int a=1;
//		int b=1;
//		int c=0;
//		while(a<=10) {
//			if(a<6) {				
//				b*=a;
//			}
//			else if (a > 5 && a <= 10) {
//				c+=a;
//			}
//			a++;
//		}
//		if(b>c) {
//			System.out.println("1~5까지 곱한값이 더 큽니다");
//		}
//		else {
//			System.out.println("6~10까지 더한값이 더 큽니다");
//		}
		
		//[선생님이 짠 코드]
		
		int w=1;
		int total=0; //더할값
		int total2=1; //곱할값
		
		while(w<=10) {
			if(w<=5) {
				total2*=w;
			}
			else {
				total+=w;
			}
			w++;
		}
		if(total2<total) {
			System.out.println("더한값이 큽니다.");
		}
		else if(total2>total) {
			System.out.println("곱한값이 큽니다.");
		}
		else {
			System.out.println("두 비교값이 같습니다.");
		}
		
		
		
		
		
		

	}

}

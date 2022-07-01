import java.util.Arrays;

public class Thread2 {
	//Thread는 순체적으로 결과값이 나오지 않음
	public static void main(String[] args) {
		
		/*응용문제 Thread를 이용하여 각각의 배열값을 내림차순으로 모두 더하여
		 *결과를 출력하는 응용프로그램을 제작하세요.*/
		
		int data[] = {6,9,10,15,3,17};
		
		/*힌트 : 6이라는 배열값이 인수값으로 Thread로 전달
		 * 6+5+4+3+2+1 최종결과값만 print => 21*/
		
//		number num = null;
//		num = new number(data);
//		num.start();
		
		int ea = data.length;
		plusbox pb = null;
		for(int a=0;a<ea;a++) {
			pb = new plusbox(data[a]);
			pb.start();
		}

	}

}
//class number extends Thread{
//	int[] data = null;
//	int[] rdata = null;
//	public number(int[] data) {
//		this.data = data;
//	};
//	@Override
//	public void run() {
//		int w = 0;
//		int total = 0;
//		while(w < data.length) {
//			while(this.data[w] > 0) {
//				this.rdata = new int[6];
//				this.rdata[w] += this.data[w];
//				//total++;
//				//total+=this.data[w];
//				this.data[w]--;
//			}
//			w++;
//		}
//		
//		System.out.println(Arrays.toString(this.rdata));
//	}
//}

class plusbox extends Thread{
	int number = 0;
	public plusbox(int no) {	//Thread에서 값을 사용하기 위한 기본 메소드를 사용함
		this.number = no;
	}
	@Override
	public void run() {	//run메소드는 절대 인수값을 못받음
		//반복문
		int sum = 0;
		for (int z=this.number;z>0;z--) {
			sum+= z;
		}
		System.out.println(sum);
	}
}
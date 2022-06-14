import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		//abstract 응용문제
		/*
		 * 1차 배열값이 있습니다.
		 * 해당 배열값을 모두 더한 값을 출력합니다.
		 * 단, abstract 기본 void 이름은 sender 입니다.
		 * 최종값 출력은 sender에서 출력되도록 합니다. 
		 * 배열은 abstract에서 사용합니다. *메인에선 호출만
		 * 배열 데이터 : 6,13,22,9,12,64,32,47,39
		 */
		
		/*	//내가 푼 문제
		od1 o = new od1();
		o.sender();
		*/
		
		arr1 ar = new arr1();
		
	}

}
/*	//내가 푼 문제
abstract class ak3 {
	protected int e[] = {6,13,22,9,12,64,32,47,39};
	public abstract void sender();
}

class od1 extends ak3{
	@Override
	public void sender() {
		int w = 0;
		int total = 0;
		while(w < this.e.length) {
			total+=e[w];
			w++;
		}
		System.out.println(total);
	}
}
*/
abstract class vdata {
	public abstract void sender();
}
class arr1 extends vdata {
	private int alldata[];
	public arr1() {
		this.alldata = new int[] { 6, 13, 22, 9, 12, 64, 32, 47, 39 };
		this.sender();
	}
	@Override
	public void sender() {
		int w = 0;
		int total = 0;
		while (w < this.alldata.length) {
			total += this.alldata[w];
			w++;
		}
		System.out.println("총 합계 : "+total);
	}
}
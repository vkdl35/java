import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제]
		 * 배열 + 기본(클래스) 메소드 문제
		 * product : 수박, 참외, 사과, 배, 딸기, 키위, 바나나, 망고 중
		 * 참외, 배, 키위를 삭제 했습니다.
		 * 해당 삭제 후 배열을 다시 재 리스트 하는 코드를 작성하세요.
		 * 단, 해당 처리사항은 모두 별도의 메소드에서 처리가 되어야하며 반복문은 자유입니다.
		 * 결과 : 수박, 사과, 딸기, 바나나, 망고
		 */
		
		/*
		String f[] = {"수박","참외","사과","배","딸기","키위","바나나","망고"};
		Example2 ex = new Example2();
		ex.data(f);
		ex=null;
		*/
		
		String product[] = {"수박","참외","사과","배","딸기","키위","바나나","망고"};
		besket(product);
		

	}
	/*
	public void data(String a[]) {
		String box[] = new String[5];
		int ct = 0;
		for(String a2 : a) {
			if(!a2.equals("참외")&&!a2.equals("배")&&!a2.equals("키위")) {
				box[ct] = a2;
				ct++;	
			}
		}
		System.out.println(Arrays.toString(box));	
		
	}
	*/
	
	public static void besket(String pd[]) {
		int ea = pd.length;
		int no = 5;
		String newproduct[] = new String[no];
		int idx = 0;
		for(String p : pd) {
			if(!p.equals("참외")&&!p.equals("배")&&!p.equals("키위")) {		
				newproduct[idx] = p; 
				idx++;
			}
		}
		System.out.println(Arrays.toString(newproduct));
	}
	
	
	
	
	
}

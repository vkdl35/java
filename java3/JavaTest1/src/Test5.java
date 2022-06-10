
public class Test5 {

	public static void main(String[] args) {
		
		int w = 1;
		int total = 0;
		while(w <= 100) {
			total+=w;
			
			if(total >= 4000) {
				break;
			}
			w++;
		}
		System.out.println(total);

	}

}


public class Test3 {

	public static void main(String[] args) {
		
		int w = 1;
		int total = 0;
		while(w < 6) {
			int f = 1;
			while(f < 10) {
				total+=w+f;
				f++;
			}
			w++;
		}
		System.out.println(total);
	}
	
	
}

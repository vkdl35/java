import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		
		/*
		 * [���빮��]
		 * ������ ��ٱ��Ͽ� �������� ��ǰ�� ����� �ֽ��ϴ�.
		 * �� �� �ù�� ������ �����Ǵ� �ݾ׸� �����Ͻÿ�.
		 * �ù��� 30000�� �̻�(����)�Դϴ�.
		 * 15000 48000 67000 8000 118200 49800 6000 18700
		 * 
		 * ��� [48000, 67000, 118200, 49800]
		 */
		
		int money[] = {15000,48000,67000,8000,118200,49800,6000,18700};
		int total[] = new int[4];
		
		int ea_m = money.length;
//		System.out.println(ea_m);
		int ea_t = total.length;
//		System.out.println(ea_t);
		int a = 0;
		int ct = 0;
		
		while(a < ea_m) {	//money�迭�� �ִ� �������� ���ư��� ��. total�迭�� �ִ� �������� ���� 4�� �ۿ� �ȵ��ư�
			if(money[a] >= 30000) {
				total[ct] = money[a];
				ct++;
			}
			a++;
		}
		//System.out.println(Arrays.toString(total));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		
		/*
		 * [���빮��]
		 * �迭 + �⺻(Ŭ����) �޼ҵ� ����
		 * product : ����, ����, ���, ��, ����, Ű��, �ٳ���, ���� ��
		 * ����, ��, Ű���� ���� �߽��ϴ�.
		 * �ش� ���� �� �迭�� �ٽ� �� ����Ʈ �ϴ� �ڵ带 �ۼ��ϼ���.
		 * ��, �ش� ó�������� ��� ������ �޼ҵ忡�� ó���� �Ǿ���ϸ� �ݺ����� �����Դϴ�.
		 * ��� : ����, ���, ����, �ٳ���, ����
		 */
		
		/*
		String f[] = {"����","����","���","��","����","Ű��","�ٳ���","����"};
		Example2 ex = new Example2();
		ex.data(f);
		ex=null;
		*/
		
		String product[] = {"����","����","���","��","����","Ű��","�ٳ���","����"};
		besket(product);
		

	}
	/*
	public void data(String a[]) {
		String box[] = new String[5];
		int ct = 0;
		for(String a2 : a) {
			if(!a2.equals("����")&&!a2.equals("��")&&!a2.equals("Ű��")) {
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
			if(!p.equals("����")&&!p.equals("��")&&!p.equals("Ű��")) {		
				newproduct[idx] = p; 
				idx++;
			}
		}
		System.out.println(Arrays.toString(newproduct));
	}
	
	
	
	
	
}

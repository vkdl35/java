
public class Example5 {

	public static void main(String[] args) {	//main class�� public �� ��� �Ұ���, �ٸ� class�� ��� ����
		
		/*
		 * [���빮��] 2�� �迭 + �⺻(Ŭ����) �޼ҵ� ����
		 * ��ϵ� ���� VIP ���� ����Ʈ�� ����ϼ���.
		 * user_list : ȫ�浿 �̼��� ������ ������ ������� ������ ����屺
		 * user_level : gold vip guest gold vip vip guest
		 * ������ : �̼���, �������, ������
		 */
		
		String user_list[][] = {
				{"ȫ�浿","�̼���","������","������","�������","������","����屺"},
				{"gold","vip","guest","gold","vip","vip","guest"}
		};
		Example5 ex = new Example5();
		ex.data(user_list);
		ex=null;

	}
	
//	public void data(String user[][]) {
//		String vip = "";
//		//int ea_u = user.length;
//		int ea_l = user[0].length;
//
//		int w = 0;
//		while(w < ea_l) {
//			if(user[1][w].equals("vip")) {
//				vip += user[0][w]+" ";
//			}
//			w++;
//		}
//		System.out.println(vip);
//		
//	}
	/*���� �ݺ������� �� ���*/
	public void data(String user[][]) {
		//String vip = "";
		int ea_u = user.length;	//2
		int ea_l = user[0].length;	//7

		int w = 0;
		
		while(w < ea_u) {
			int ww = 0;
			while(ww < ea_l) {
				if(user[w][ww].equals("vip")) {
					System.out.print(user[0][ww]+" ");
				}
				ww++;
			}
			w++;
		}
		/* �ݺ��� �ѹ����� ���� ���*/
		/*
		while(w < ea_l) {
			if(user[1][w].equals("vip")) {
				vip += user[0][w]+" ";
			}
			w++;
		}
		*/
		//System.out.println(vip);
		
	}

}

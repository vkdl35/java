
public class Array2 {

	public static void main(String[] args) {
		

		//hong, kim, park, lee, jang, jung
		/*
		String id[] = {"hong","kim","park","lee","jang","jung"};	//�迭 ������ �� �ƴ������� Ȯ��
		//System.out.println(id[4]);
		int word = id[4].length();	//�ܾ� ������ �ľ��� ���� length�� ��, ���ڿ� ������ ������ �ٸ�
		System.out.println(word);
		*/
		
		/*
		 * [���빮��]
		 * �ش� ����� ����Ʈ �迭�� �ֽ��ϴ�.
		 * �ش� �迭�� �� ����� ���̵� ���ܾ� �̻� ����ϼ���.
		 */
		
		String id[] = {"hong","kim","park","lee","jang","jung"};
		
		int member = id.length;	//��ü ȸ������ �ľ��ϱ� ����
		int w = 0;
		int word;	//������ �迭 �������� ���� ���� �ľ�
		while(w < member) {	//�� member�ο��� �� �����Ѵٴ� ��
			word = id[w].length();	//���� ���� �ľ�
			if(word > 3) {	//���ܾ� �̻�(����or������)�� �����͸� ���
				//System.out.println(id[w]);
			}
			w++;
		}
		
		/*
		 * [���빮��]
		 * �迭 �����ʹ� ������ �����ϴ�.
		 * 15, 60, 11, 14, 27
		 * ���� ������ ���� ��� ���ؼ� ���� ������� ����ϼ���.
		 */
		
//		int num[] = {15,60,11,14,27};
//		//System.out.println(date[0]);	//
//		int totalnum = num.length;
//		int a = 0;
//		int b = 0;
//		while(a < totalnum) {
//			b+=num[a];
//			a++;
//		}
//		System.out.println(b);
		
		int data[] = {15,60,11,14,27};
		//System.out.println(date[0]);
		int total = 0;
		int data_ea = data.length;	//data ���� ������ �� �ҷ������ �Լ�
		int dw = 0;
		do {
			total += data[dw];	//data[dw] : �ջ��ؾߵ� ���, 0���� �����ؾ��ϴϱ� ���ڰ��� dw�� �Ǿ����
			dw++;
		}while(dw < data_ea);
		System.out.println("���հ� "+total);
		
		
		
		
		
	}

}

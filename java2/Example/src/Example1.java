
public class Example1 {

	public static void main(String[] args) {
		
		/*
		 * [���빮��] - �迭 + �޼ҵ� ����
		 * 1�� �迭�� ������ ���� ���� �ֽ��ϴ�.
		 * �迭����Ʈ 22 33 44 55 66 77 88 99 �̸�
		 * �ش� ��ü���� ��� ���� ���հ� ���� ������ �޼ҵ��
		 * ó�� �ǵ��� �մϴ�. ��, �ݺ����� ������ do~while������ �ۼ��մϴ�.
		 */
		
		int num[] = {22,33,44,55,66,77,88,99};
		Example1 ad = new Example1();
		ad.datas(num);
		ad=null;
				
	}
	
	public void datas(int a[]) {
		//void = ��ü���� + �ν��Ͻ�(�޸�) ���
		int total = 0;
		int data_ea = a.length;
		int dw = 0;
		do {
			total+=a[dw];
			dw++;
		}while(dw < data_ea);
		System.out.println(total);
	}
	

}

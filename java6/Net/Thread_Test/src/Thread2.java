import java.util.Arrays;

public class Thread2 {
	//Thread�� ��ü������ ������� ������ ����
	public static void main(String[] args) {
		
		/*���빮�� Thread�� �̿��Ͽ� ������ �迭���� ������������ ��� ���Ͽ�
		 *����� ����ϴ� �������α׷��� �����ϼ���.*/
		
		int data[] = {6,9,10,15,3,17};
		
		/*��Ʈ : 6�̶�� �迭���� �μ������� Thread�� ����
		 * 6+5+4+3+2+1 ����������� print => 21*/
		
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
	public plusbox(int no) {	//Thread���� ���� ����ϱ� ���� �⺻ �޼ҵ带 �����
		this.number = no;
	}
	@Override
	public void run() {	//run�޼ҵ�� ���� �μ����� ������
		//�ݺ���
		int sum = 0;
		for (int z=this.number;z>0;z--) {
			sum+= z;
		}
		System.out.println(sum);
	}
}
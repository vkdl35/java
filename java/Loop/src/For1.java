
public class For1 {

	public static void main(String[] args) {
		//�ݺ��� : �����͸� �ϰ������� �Է�, ����� �� �� �ֵ��� �ϴ� ����
		
		//short z = 1;
		//z++;	//+1 ���� : ��� �� +1 ����
		//z--;	//-1 ���� : ��� �� -1 ����
		//++z;	//+1 ���� : + ���� �� ���
		//--z;	//-1 ���� : - ���� �� ���
		//System.out.println(z);
		
		for(int a=0; a<10; a++) {		//for(�ʱⰪ; ������; ���� �Ǵ� ����)
			//System.out.println(a);
		}
		
		/*
		for(int a=0; a<10; a++) { 		//�������� ; �Ⱦ�
			System.out.println(a);		//a++ == a+1
		}
		*/
		
		byte b;
		for(b=5;b<=10;b++) {			
			//System.out.println(b);
		}
		
		byte c;
		for(c=10;c>3;c--) {				//���ǻ��� c<3 0~�������� ���� ���������� ��Ȳ�� �߻���
			//System.out.println(c);
		}
				
		//���빮�� 20���� 27���� ����ϼ���
		
		byte d;
		for(d=20;d<28;d++) {
			//System.out.print(d+" ");
		}
		
		//���빮�� 39~21���� ����ϼ���
		
		byte e;
		for(e=39;e>20;e--) {
			//System.out.print(e+" ");
		}
		
		
		//1~10���� ���� ���
		byte aa;
		byte bb=10;
		for(aa=1;aa<=bb;aa++) {
			//System.out.print(aa+" ");
		}
		
		
		/*
		 ���� �ΰ��� �̿��Ͽ� ���� �����͸� ����Ͻÿ�
		 55~4���� ����մϴ�.
		*/
		
		byte a1;
		byte b1=4;
		for(a1=55;a1>=b1;a1--) {
			System.out.print(a1+" ");
		}
		
		
		
		
		
		
		
		
	}

}

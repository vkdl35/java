package Ab2;

public class Example1 {

	public static void main(String[] args) {
		
		home h[] = {new computer(),new monitor()};
		home2 h2[] = {new phone()};	//extends�� home�� �ε�
		
		//phone ph = new phone();	
		//ph.broken(21);
		
		h[0].broken(50);
		h[1].broken(0);
		h2[0].broken(21);	
		//main���� ����Ϸ��� �Ʒ����� return�� �ؾ��ϴµ� home���� ������ ����
		//phone ph = new phone(); 
		//ph.broken(21); �� ����ؼ� ��¼��... ���ؾȵ�
		
		
	}

}

class computer implements home{
	@Override
	public void poweron() {
		System.out.println("��ǻ�� ���� ������");
	}
	@Override
	public void poweroff() {
		System.out.println("��ǻ�� ���� �ߴ�");
	}
	@Override
	public void broken(int n) {
		if(this.bk <= n) {
			System.out.println("��ǻ�� ����");
		}
		else if(this.bk > n && n > 0) {
			this.poweron();
		}
		else {
			this.poweroff();
		}
	}
	
}
class monitor implements home {
	@Override
	public void poweron() {
		System.out.println("����� ���� ������");
	}
	@Override
	public void poweroff() {
		System.out.println("����� ���� �ߴ�");
	}
	@Override
	public void broken(int n) {
		if(this.bk <= n) {
			System.out.println("����� ����");
		}
		else if(this.bk > n && n > 0) {
			this.poweron();
		}
		else {
			this.poweroff();
		}
	}
}
/* 
 * [���빮��]
 * �޴����� �߰� ������ �ʿ��մϴ�.
 * �޴��� ����� �ּ������� (20) -> �����۵��� (40~79) 80�̻� �Ǹ� ����
 * 1. ������ ���޵����� ȭ���� ���峯 ��� (�������ε� �۵��� �ȵǴ� ���) - 20���� 39����
 * 2. ������ ���޽�Ű���� ������ �ȵ� ��� (������ �ƿ� �ȵǴ� ���) - 20���� ������ ���
 */
class phone implements home,home2{
	@Override
	public void poweron() {
		System.out.println("�ڵ��� ���� ������");
	}
	@Override
	public void poweroff() {
		System.out.println("�ڵ��� ���� �ߴ�");
	}
	@Override
	public void broken(int n) {
		if(this.bk <= n) {
			System.out.println("�ڵ��� ����");
		}
		else if(this.bk > n && n > 0) {	//20~79
			if(n < 20) {	//40~79
				this.powerchk2();
			}
			else if(n >= 20 && n <= 39){	//21~39
				this.powerchk1();
			}
		}
		else {
			poweron();
		}
	}
	
	@Override
	public void powerchk1() {
		System.out.println("ȭ�� ����");	
	}
	public void powerchk2() {
		System.out.println("���� ���޵ǳ� ���� �ȵ�");
	}
	
	

}
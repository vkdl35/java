import java.util.ArrayList;
import java.util.Arrays;

public class Study_220616 {

	public static void main(String[] args) {
		
		/* ���� Ŭ����  �� */
		
		/* �θ� �ν��Ͻ��� ������ ���� ������ �ڽ� class�� ���� ȣ������ ����
		   �ڽ� Ŭ���� �ȿ� �� �ڽ� Ŭ������ ���� ���� �ְ�, �޼ҵ� �ȿ� Ŭ������ ���� ���� ���� */
		parents p = new parents();
		p.p_box();
		parents.child pc = p.new child(); //�θ�class.�ڽ�class �̸����� = �θ�class��.new �ڽ�class();
		//Ŭ������ ȣ������ ������ �ٷ� ������ �� ����(�θ� class�� ���� �����ؼ� ȣ���ؾ߸� �ڽ� class�� ȣ���� �� ����
		//�߸��� ����) parents.child pc = parents.new child(); 
		pc.c_box();
		
		/* �߻� Ŭ���� + ���� Ŭ����  �� */
		
		apink m1 = new apink();
		m1.f_method("�̺���");
		apink.cafe LA = m1.new cafe();
		LA.call();
		
		
		/*
		 * [���빮��1]  �� 
		 * ���� Ŭ������ �̿��Ͽ� �ڽ� Ŭ������ ������� ����ϴ� ���μ����� �����ϼ���. 
		 * Ŭ������ �ΰ����� �ֽ��ϴ�. �θ� Ŭ������ : mother / �ڽ� Ŭ������ : child 
		 * ���� Ŭ�������� mother Ŭ������ 30, 50�� ���� �����մϴ�. 
		 * child���� �θ� Ŭ������ �ִ� ���� �޾�, �ΰ��� ���ڸ� ���� ������� ����ϼ���.
		 */
		
		mother m = new mother(30,50);
		mother.child2 mc = m.new child2();
		mc.cd();
		
		/*
		 * [���빮��2]  �� 
		 * �迭 ������ : "ȫ�浿","�̼���","������" 
		 * ���� Ŭ�������� ���ڸ� �ϳ� �����մϴ�. 
		 * ��, ���ڰ� null ���� ���� ������, �迭 �����Ϳ� ���� ���� "������"�̶�� ���� ���� �ֽ��ϴ�. 
		 * �ܺ� Ŭ������ : data_list / �߻� Ŭ������ : v_constuct  / ���� Ŭ������ : check
		 * [�������] 
		 * ���� class���� �������� ������ ��� ���� Ŭ�������� "�ش� ����ڴ� �����ڰ� �ƴմϴ�." ��� ��� 
		 * ���� class���� �̼����� ������ ��� ���� Ŭ�������� "����ڰ� Ȯ�� �Ǿ����ϴ�." ��� ��� 
		 * ��, ArrayList�� �迭�� �ε��ϼ���.
		 */
		
		String data1 = "������";
		data_list dl = new data_list();
		dl.set(data1);
	
		
	}

}

class parents {	//�θ� Ŭ����  �� 8
	String a = "ȫ�浿";	//�θ� �ʵ忡 �ִ� ��������
	String b;
	class child {	//�ڽ� Ŭ����
		int a = 20;
		public void c_box() {	//�ڽ� �޼ҵ�
			double c = 10.5;
			System.out.println(c);	//�ڽ� �޼ҵ� ���� ��������
			System.out.println(this.a);	//�ڽ� Ŭ���� ���� ��������
			System.out.println(parents.this.a);	//�θ� Ŭ���� ���� ��������
			/*�ڽ�class �ʵ峪 �޼ҵ忡 a������ ������ a�� ������� �� �θ�class�� �ִ� ȫ�浿�� ȣ�� �����ϱ��ϳ�,
			 *������ ���� �����Ǹ� �򰥸� �� �ֱ� ������ �θ�class ���������� ȣ���� �� ����� �����ִ°� ����.*/
			System.out.println(parents.this.b);	
			/*�θ�class�� �ִ� �޼ҵ� �ȿ� �ִ� ���������� �ҷ��� �� ����. �θ�class �ʵ忡 ���������� ������ �� ����� �� ����.*/
			
			/*class�ȿ� �ִ� class�� ��Ӱ����� ���� ������ �θ�class �ʵ忡 �ִ� ���������� �ҷ����� ���� ��
			  �θ�class��.this.������ �� ����߸� ����� ������*/	
		}
	}
	public void p_box() {	//�θ� �޼ҵ�
		String a = "�̼���";	//�ش� �޼ҵ� �ȿ����� ��� ������ ��������
		this.b = a;
		System.out.println(a);	//this�� ������ ������ �ش� �޼ҵ� �ȿ� �ִ� ������ �ҷ���
		System.out.println(this.a);	//this�� �ʵ忡 �ִ� ���������� �ҷ��´ٴ� ��
	}	
}

abstract class father {	//�߻�Ŭ���� (abstract�� ����ϸ� �߻�)  �� 19
	public String u_name;	//�������� ���� (abstract�� �����Ƿ� �߻��� �ƴ�)
	public abstract void f_method(String name);	//�߻� �޼ҵ�
}

class apink extends father {
	@Override
	public void f_method(String name) {	//�߻� �޼ҵ带 ���� �޼ҵ�� ��ȯ ()
		this.u_name = name;	//�߻� �޼ҵ忡 �ִ� ���������� ���� �̰���
	}
	class cafe {
		String msg = apink.this.u_name;	//�θ� Ŭ������ �ִ� ���������� �ڽ� Ŭ���� ���������� �̰�
		//**father class�� �߻�Ŭ������ ������ ��ӹ��� apink class�� �����
		public void call() {
			String msg2 = this.msg + "�� �ȳ��ϼ���.";
			System.out.println(msg2);
		}
	}
}

class mother {	//  �� 28
	int a;
	int b;
	public mother(int a1, int b1) {
		this.a = a1;
		this.b = b1;
	}
	class child2 {
		public void cd() {
			System.out.println(mother.this.a*mother.this.b);	//�ٸ� �޼ҵ� ������ ����ؼ� �ڽ� class �ʵ忡 �����ص� ��
			
		}
	}
}

abstract class v_constuct {	//  ��40 
	public String user;
	public abstract void set(String data);
}

class data_list extends v_constuct {
	@Override
	public void set(String data) {
		if(data == null) {
			System.out.println("����� �̸��� �Է��ϼ���.");
		}
		else {
			this.user = data;
			check ck = new check();
		}
	}
	
	class check {
		String user_name = data_list.this.user;
		String arr[];
		ArrayList<String> ar;
		public check() {
			this.arr = new String[] {"�̼���","ȫ�浿","������"};		
			this.ar = new ArrayList<>(Arrays.asList(arr));
			compare();
		}
		public void compare() {
			int ea = this.ar.size();
			int w = 0;
			boolean bl = false;
			while(w < ea) {
				if(this.user_name.equals(ar.get(w))) {
					bl = true;
				}
				w++;
			}
			if(bl == true) {
				System.out.println("����ڰ� Ȯ�� �Ǿ����ϴ�.");
			}
			else {
				System.out.println("����ڸ� Ȯ������ ���Ͽ����ϴ�.");
			}
		}
	}
}

public class If {

	public static void main(String[] args) {
		
		byte a=100;
		byte b=100;
		
		//���ǹ� (if~else)
		
		if(a > b) { //if�� 
			System.out.println("a���� �� Ů�ϴ�.");
		}
		else if(a < b) { //else if��
			System.out.println("b���� �� Ů�ϴ�.");
		}
		else { //else��
			System.out.println("�� ���� �����ϴ�.");
		} 
		
		//else�� if�� else if�� �� ������
		
		
		/* else���� ���� ���*/
		
		if(a > b) {
			System.out.println("a���� �� Ů�ϴ�.");
		}
		else if(a < b) { 
			System.out.println("b���� �� Ů�ϴ�.");
		}
		else if (a == b) {
			System.out.println("�� ���� �����ϴ�.");
		}
		
		/* �ε�ȣ��ȣ : < , > , <= , >= , == */
		// <= : ũ�ų� ����, >= : �۰ų� ����, =�� �׻� �ڿ�
		//if�� else�� �ϳ��� ���ǹ��� �ѹ��ۿ� �� ��
		
		
		
		
		
	}

}

package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example1_t {
/*�������� § �ڵ�*/
	public static void main(String[] args) {

		/*
		 * �ܺ�class�� ����Ͽ� ���� ���μ����� �ۼ��ϼ���.
		 * ���� 2���� �迭 �����Ͱ� �ֽ��ϴ�.
		 * ��, 2���� �迭�� �ϳ��� �迭�� ��ġ���� �մϴ�.
		 * �״�� �ߺ��� ���� �ϳ��� ó���� �ϼž� �մϴ�.
		 * 1�� DB : 11,22,33,44,55
		 * 2�� DB : 8,10,11,19,44
		 * ��� ��� : 8,10,11,19,22,33,44,55
		 */
		
		/* 
		 * [�ڵ� �ۼ� ����]
		 * 1. 1�� DB, 2�� DB �ߺ����� ���Ͽ� 2�� DB �ȿ� �ִ� �ߺ��� ����
		 * 2. 2�� DB�� 1�� DB�� �߰�
		 * 3. 1�� DB sort�� ����
		 */
		
		outclass ot = new outclass();
		ot.filter();

	}

}

class outclass {

	ArrayList<Integer> a1 = null;
	ArrayList<Integer> b1 = null;

	public void filter() {

		Integer[] a = { 11, 22, 33, 44, 55 };
		Integer[] b = { 8, 10, 11, 19, 44 };
		/* ArrayList�� ����Ϸ��� �迭 �ڷ����� Integer�̾�� �� */
		this.a1 = new ArrayList<>(Arrays.asList(a));
		this.b1 = new ArrayList<>(Arrays.asList(b));

		int w = 0;
		do { // ū �ݺ���

			int ww = 0;
			int z = this.b1.size();

			while (ww < z) { // ���� �ݺ���

				if (this.a1.get(w) == this.b1.get(ww)) {
					// System.out.println(this.b1.get(ww)); //�ߺ��� ���� �������� Ȯ��
					this.b1.remove(ww);
					this.b1.add(ww, 0);
					/*
					 * �迭 �ȿ� �ִ� ���ڸ� ������ �� baeak�� ���������� �Ŀ� �迭�� ���� �߰� ���� �� ������ �������. �ߺ��� ���� �����ϰ� ���� �ִ�
					 * �ڸ��� 0�� ä����
					 */
				}

				ww++;

			} // ������� ���� �ݺ���

			w++;

		} while (w < this.a1.size()); // ������� ū �ݺ���

		/* ���� �ִ� �ݺ����� �������ͼ� ���ο� �ݺ����� ���� */
		int t = 0;

		while (t < this.b1.size()) {
			/* ���� b1 �迭 �����Ͱ� �� �ߺ��� ���� �����ǰ� 0���� ä���� ���� */
			if (this.b1.get(t) != 0) { // �迭 ������ �ȿ� �ִ� 0�� �����ϰ�

				this.a1.add(this.b1.get(t)); // a1 �迭 �ȿ� b1 �����͸� �߰��Ѵ�(0�� ���� �����ϰ�)
			}

			t++;
		}

		Collections.sort(this.a1); // �迭 �ȿ� �ִ� ���� ����
		System.out.println(this.a1); // ���

	}

}
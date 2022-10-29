package test;

import java.util.Scanner;
import java.util.Stack;

public class Test1874 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		Stack<Integer> stack = new Stack<>();

		int n = sc.nextInt(); // ���� ���� �Է� --> n

		int start = 0; // ������ �Է¹޾Ҵ���

		while(n-- > 0) { // (������ ���̸�ŭ) n�� �ݺ�
			int value = sc.nextInt();
			// ���� �Էº��� ū ���� �Է¹����� �� ������ stack�� ����
			if( value > start ) {
				for(int i = start + 1; i <= value; i++) {
					stack.push(i);
					sb.append('+').append('\n');
				}
				// start ����
				start = value;
			}
			// ���� �Էº��� �۰ų� ���� �� �Է� ��
			// stack�� top�� �ִ� ���Ұ� �Է¹��� ���� �ٸ� ���
			else if(stack.peek() != value) {
				// �������� push�� pop�� ���� ������ ���� �� ����. --> "����"
				System.out.println("NO");
				return;
			}
			stack.pop();
			sb.append('-').append('\n');

		}
		System.out.println(sb);

	}

}

package test;

import java.util.Scanner;
import java.util.Stack;

public class Test9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // ������ ���� �Է�
		
		for(int i = 0; i < T; i++) {
			System.out.println(isVps(sc.next()));
		}
	}
	// vps check
	public static String isVps(String data) {
		
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < data.length(); i++) {
			char paren = data.charAt(i);
		
			
			if(paren == '(') {	// ���� ��ȣ�� ���ÿ� ����
				stack.push(paren);
			}
			else if(stack.empty()) { // ���ÿ� �� �̻� ���� ��ȣ�� ���ٸ� 
				return "NO";		// --> not vps
			}
			else if(paren == ')') { // �ݴ� ��ȣ��� 
				stack.pop();	// ������ ���� ��ȣ �ϳ� pop
			}
			else {	// �Է� �����Ϳ� ��ȣ �� ���ڰ� ������ ���
				return "NO";
			}
		}
		// �˻� ���� �� ������ ��������� vps
		return stack.empty() ? "YES" : "NO";
	}

}

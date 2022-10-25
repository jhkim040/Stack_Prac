package test;

import java.util.Scanner;
import java.util.Stack;

public class Test9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 데이터 개수 입력
		
		for(int i = 0; i < T; i++) {
			System.out.println(isVps(sc.next()));
		}
	}
	// vps check
	public static String isVps(String data) {
		
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < data.length(); i++) {
			char paren = data.charAt(i);
		
			
			if(paren == '(') {	// 여는 괄호면 스택에 저장
				stack.push(paren);
			}
			else if(stack.empty()) { // 스택에 더 이상 여는 괄호가 없다면 
				return "NO";		// --> not vps
			}
			else if(paren == ')') { // 닫는 괄호라면 
				stack.pop();	// 스택의 여는 괄호 하나 pop
			}
			else {	// 입력 데이터에 괄호 외 문자가 존재할 경우
				return "NO";
			}
		}
		// 검사 종료 후 스택이 비어있으면 vps
		return stack.empty() ? "YES" : "NO";
	}

}

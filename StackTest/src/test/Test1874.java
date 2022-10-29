package test;

import java.util.Scanner;
import java.util.Stack;

public class Test1874 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		Stack<Integer> stack = new Stack<>();

		int n = sc.nextInt(); // 수열 길이 입력 --> n

		int start = 0; // 어디까지 입력받았는지

		while(n-- > 0) { // (수열의 길이만큼) n번 반복
			int value = sc.nextInt();
			// 이전 입력보다 큰 값을 입력받으면 그 값까지 stack에 저장
			if( value > start ) {
				for(int i = start + 1; i <= value; i++) {
					stack.push(i);
					sb.append('+').append('\n');
				}
				// start 갱신
				start = value;
			}
			// 이전 입력보다 작거나 같은 값 입력 시
			// stack의 top에 있는 원소가 입력받은 값과 다를 경우
			else if(stack.peek() != value) {
				// 오름차순 push와 pop을 통해 수열을 만들 수 없다. --> "종료"
				System.out.println("NO");
				return;
			}
			stack.pop();
			sb.append('-').append('\n');

		}
		System.out.println(sb);

	}

}

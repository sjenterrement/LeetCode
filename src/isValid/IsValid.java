package isValid;

import java.util.Stack;

public class IsValid {
	public static void main(String[] args) {
		int sign=0;
		String s="(){}[";
		Stack<Character> stack=new Stack<Character>();
		for (char c : s.toCharArray()) {
//			System.out.println(c);
			if (c=='(') {
				System.out.println("jj");
				stack.push(')');
			}
			else if (c=='[') {
				stack.push(']');
			}
			else if (c=='{') {
				stack.push('}');
			}
			else if (s.isEmpty()||stack.pop()!=c) {
				int sign1=1;
				System.out.println(sign1);
			}
		}
		
//		System.out.println(sign);
		
		System.out.println(sign==0);
	}
}

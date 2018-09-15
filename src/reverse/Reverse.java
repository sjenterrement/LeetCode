package reverse;

import java.util.Scanner;

public class Reverse {

	public static long reverse(int x) {
		int flag = x > 0 ? 1 : -1, res = 0;
		x = x > 0 ? x : -x;
		while (x > 0) {
			if (res * 10.0 + x % 10 > 2147483647)
				return 0;
			res = res * 10 + x % 10;
			x /= 10;
		}
		return res * flag;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		System.out.println(reverse(x));

	}
}

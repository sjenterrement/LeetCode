package romanToInt;

import java.util.Scanner;

public class RomanToInt {

	public static void romanToInt(String s) {
		int I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000, sum = 0;
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			switch (a[i]) {
			case 'I':
				sum += 1;
				break;
			case 'V':
				sum += 5;
				break;
			case 'X':
				sum+=10;
				break;
			case 'L':
				sum+=50;
				break;
			case 'C':
			 	sum+=100;
			    break;
			case 'D':
				sum+=500;
				break;
			case 'M':
				sum+=1000;
				break;

			}
		}
		
		if(s.contains("IV")||s.contains("IX"))
			sum-=2;
		if(s.contains("XL")||s.contains("XC"))
			sum-=20;
		if(s.contains("CD")||s.contains("CM"))
			sum-=200;
		
		System.out.println(sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s = input.next();
		romanToInt(s);

	}

}

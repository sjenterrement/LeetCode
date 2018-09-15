package longestCommomPrefix;

public class LongestCommomPrefix_2 {

	public static void main(String[] args) {

		String[] s = { "leets", "leetcode", "leet", "lee" };
		if (s.length == 0 || s == null)
			System.out.println("string is empty");

		// System.out.println(m);

		for (int i = 0; i < s[0].length(); i++) {
			char c = s[0].charAt(i);
			for (int j = 1; j < s.length; j++) {
				if (i == s[j].length() || s[j].charAt(i) != c) {
					System.out.println(s[0].substring(0, i));
					break;
				}
			}
			if (i>=min(s)) {
				break;
			}
		}
	}

	public static int min(String[] s) {
		int m = s[0].length();

		for (int i = 1; i < s.length; i++) {
			if (m > s[i].length()) {
				m = s[i].length();
			}
		}
		return m;

	}

}

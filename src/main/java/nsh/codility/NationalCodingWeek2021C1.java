package nsh.codility;

public class NationalCodingWeek2021C1 implements NationalCodingWeek2021Interface {

	public String solution(String S) {
		StringBuilder A = new StringBuilder(S);
		int i = 0;
		while (i + 3 <= A.length()) {
			if (A.substring(i, i + 3).equals("abb")) {
				A.replace(i, i + 3, "baa");
				i = Math.max(i - 2, 0);
			} else
				i++;
		}
		return A.toString();
	}
}

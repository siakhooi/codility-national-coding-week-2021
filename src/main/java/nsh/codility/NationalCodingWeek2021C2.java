package nsh.codility;

public class NationalCodingWeek2021C2 implements NationalCodingWeek2021Interface {

	public String solution(String S) {
		char[] A = S.toCharArray();
		int i = 0;

		while (i + 3 <= A.length) {
			if (A[i] == 'a' && A[i + 1] == 'b' && A[i + 2] == 'b') {
				A[i] = 'b';
				A[i + 1] = 'a';
				A[i + 2] = 'a';
				i = Math.max(i - 2, 0);
			} else
				i++;
		}
		return new String(A);
	}
}

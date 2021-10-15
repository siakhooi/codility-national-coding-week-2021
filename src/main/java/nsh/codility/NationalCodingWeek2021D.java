package nsh.codility;

import java.math.BigInteger;

public class NationalCodingWeek2021D implements NationalCodingWeek2021Interface {

	public String solution(String S) {

		StringBuilder r = new StringBuilder();
		char[] A = S.toCharArray();
		BigInteger[] F = new BigInteger[A.length];
		BigInteger sum = BigInteger.ZERO;

		int j = A.length - 1;
		for (int i = 0; i < A.length; i++) {
			if (i == 0)
				F[j] = BigInteger.ONE;
			else if (i == 1)
				F[j] = BigInteger.TWO; // F[j] = new BigInteger("2");
			else
				F[j] = F[j + 1].add(F[j + 2]);

			if (A[j] == 'b')
				sum = sum.add(F[j]);
			j--;
		}
		for (int i = 0; i < A.length; i++) {
			if (sum.compareTo(F[i]) >= 0) {
				sum = sum.subtract(F[i]);
				r.append('b');
			} else
				r.append('a');
		}

		return r.toString();
	}

}

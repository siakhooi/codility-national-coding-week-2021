package nsh.codility;

public class NationalCodingWeek2021A implements NationalCodingWeek2021Interface {

	public String solution(String S) {
		StringBuilder r = new StringBuilder();
		int abCount = 0;
		boolean hasA = false;

		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (c == 'a') {
				if (hasA) {
					for (int j = 0; j < abCount; j++)
						r.append("ab");
					r.append("a");
					abCount = 0;
				} else
					hasA = true;
			} else {
				if (hasA) {
					hasA = false;
					abCount++;
				} else {
					if (abCount > 0) {
						r.append("ba");
						for (int j = 0; j < abCount - 1; j++)
							r.append("aa");
						abCount = 0;
						hasA = true;
					} else
						r.append('b');
				}
			}
		}
		for (int j = 0; j < abCount; j++)
			r.append("ab");
		if (hasA)
			r.append('a');
		return r.toString();
	}

}

package nsh.codility;

public class NationalCodingWeek2021B implements NationalCodingWeek2021Interface {

	public String solution(String S) {
		while (S.indexOf("abb") != -1)
			S = S.replaceAll("abb", "baa");

		return S;
	}

}

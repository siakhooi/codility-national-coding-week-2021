package nsh.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public abstract class AbstractNationalCodingWeek2021Test {
	abstract NationalCodingWeek2021Interface getTestObject();

	@Test
	@DisplayName("Sample 1")
	void test01() {
		String S = "ababb";
		String R = "baaaa";
		assertEquals(R, getTestObject().solution(S));
	}

	@Test
	@DisplayName("Sample 2")
	void test02() {
		String S = "abbbabb";
		String R = "babaaaa";
		assertEquals(R, getTestObject().solution(S));
	}

	@Test
	@DisplayName("Sample 3")
	void test03() {
		String S = "aaabab";
		String R = "aaabab";
		assertEquals(R, getTestObject().solution(S));
	}

	@Test
	@DisplayName("N<=2")
	void test04a() {
		String S = "ab";
		String R = "ab";
		assertEquals(R, getTestObject().solution(S));
	}

	@Test
	@DisplayName("N<=2")
	void test04b() {
		String S = "aa";
		String R = "aa";
		assertEquals(R, getTestObject().solution(S));
	}

	@Test
	@DisplayName("N<=2")
	void test04c() {
		String S = "ba";
		String R = "ba";
		assertEquals(R, getTestObject().solution(S));
	}

	@Test
	@DisplayName("N<=2")
	void test04d() {
		String S = "bb";
		String R = "bb";
		assertEquals(R, getTestObject().solution(S));
	}

	@Test
	@DisplayName("N<=2")
	void test04e() {
		String S = "a";
		String R = "a";
		assertEquals(R, getTestObject().solution(S));
	}

	@Test
	@DisplayName("N<=2")
	void test04f() {
		String S = "b";
		String R = "b";
		assertEquals(R, getTestObject().solution(S));
	}

	@Test
	@DisplayName("Overlapping Substitution")
	void test05() {
		String S = "ababababababababababb";
		String R = "baaaaaaaaaaaaaaaaaaaa";
		assertEquals(R, getTestObject().solution(S));
	}

	@Test
	@DisplayName("10 a and 10 b")
	void test06() {
		String S = "aaaaaaaaaabbbbbbbbbb";
		String R = "aaaaaaaaabababababaa";
		assertEquals(R, getTestObject().solution(S));
	}

	@Test
	@DisplayName("3 a and 3 b")
	void test07() {
		String S = "aaabbb";
		String R = "aabaab";
		assertEquals(R, getTestObject().solution(S));
	}

	@Test
	@DisplayName("Long AB")
	void test10() {
		String S = "";
		for (int i = 0; i < 48000; i++)
			S += "ab";
		S += "b";
		String R = "ba";
		for (int i = 1; i < 48000; i++)
			R += "aa";
		R += "a";
		assertEquals(R, getTestObject().solution(S));
	}
}

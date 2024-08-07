package day02;

public class Game3 {

	public static void main(String[] args) {
		// 문제2: 369 게임하기
		// 1부터 10까지의 정수 출력 중 3,4,9 일때 박수 소리를 출력하는 프로그램 작성하기
		// --------------------------------
		// 실행결과
		// ----------------------------
		
		for (int i = 1; i <= 10; i++) { // for 문에 의해 1부터 10까지의 반복
			if (i == 3 || i == 6 || i == 9) { // 내부 조건식에 의해 (i가 3,6,9인 경우)
				System.out.printf(" 짝");// 박수소리 출력 후 다음 반복으로 넘어감
				continue;
			}
			System.out.print(" "+ i); // 정수를 출력하기

		}
	}
}
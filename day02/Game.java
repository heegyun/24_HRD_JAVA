package day02;
import java.util.Scanner;
import java.util.Random;
public class Game {

	public static void main(String[] args) {
		// 가위 바위 보 게임 만들기
		// 1~3까지의 난수를 생성하여 1: 가위, 2: 바위, 3: 보
		// 컴퓨터와 유저간 게임을 하여 승 패를 출력하시오.
		// 변수, 자료형, 조건문, 반복문, Scanner, Random 클래스 사용하기
		
			Scanner scanner = new Scanner(System.in);
			Random random = new Random();// 난수 생성 클래스 (0.0<= m <1.0)
			while (true) {
			  	System.out.println("-----Game Menu------");
		        System.out.println("1. 가위 2. 바위 3. 보  0. 종료");
		        System.out.println("=============================");
		        System.out.println("입력하세요>>>");
	            int no = scanner.nextInt(); // user
	            int com = random.nextInt(3) + 1;//  123
	            if(no == 0) break;
	            System.out.println("유저측: " + no);
	            System.out.println("컴퓨터측: " + com);
	            //1. 비길 경우 : no == com
	            //2. 유저가 이길 경우
	            //3. 이외는 유저가 패

	            if (no == 0) System.exit(0);//프로그램 정상 종료 or break;
	            if (no == com) {
	                System.out.println("비겼군요~~~");
	            } else if ((no == 1) && (com == 3) ||
	                    (no == 2) && (com == 1) ||
	                    (no == 3) && (com == 2)) { // 유저가 이길경우...
	                System.out.println("유저 승!!!");
	            } else {
	                System.out.println("유저 패!!!");
	            }
	        }
		  	

	    }

	}

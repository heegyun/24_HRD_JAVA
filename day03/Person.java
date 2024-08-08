package day03;

public class Person {
	
	// 객체 모델링 (클래스 멤버)
	
	// 속성 : has -a 
	int age;
	String name;

		
	// 기본 생성자
	public Person() {
		
	}
		
		
	// 메소드
	void 웃다() {
		System.out.println("웃는다.");
	}
	void 먹다() {
		System.out.println("먹는다.");
	}
	
	char sex;//'M', 'F'
	String tel;

	public String showProfile(){
		String info="---"+name+" 프로필-----";
			info+="\n나이 : "+age;
			info+="\n성별 : "+sex;
			info+="\n전화 : "+tel;
		return info; //문자열 반환
	}//showProfile()-------
	public void wantJob(String job, int pay)	{
		System.out.println("---"+name+"님 ----");
		System.out.println(" 희망직종: "+job);
		System.out.println(" 희망 연봉: "+pay);
	}//wantJob()------------

	
	
}

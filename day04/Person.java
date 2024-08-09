package day04;

public class Person {
	
	// 객체 모델링 (클래스 멤버)
	
	// 속성 : has -a 
	int age;
	String name;
	char gender; // 'F', 'M'
	String tel;
	

		
	// 기본 생성자
	public Person() {
		
	}
		
	// 메소드 getInfo()
	void getInfo() {
		
		System.out.println("-----"+this.name +"님 정보------");
		System.out.println("나이: " + this.age );
		System.out.println("성별: " + this.gender);
		System.out.println("전화번호: " + this.tel);
		System.out.println("-----------------------");
		
	}
	
	
	
	
	
	
		
	// 메소드
	void 웃다() {
		System.out.println("웃는다.");
	}
	void 먹다() {
		System.out.println("먹는다.");
	}
	
	

	public String showProfile(){
		String info="---"+name+" 프로필-----";
			info+="\n나이 : "+age;
			info+="\n성별 : "+gender;
			info+="\n전화 : "+tel;
		return info; //문자열 반환
	}//showProfile()-------
	
	
	public void wantJob(String job, int pay)	{
		System.out.println("---"+name+"님 ----");
		System.out.println(" 희망직종: "+job);
		System.out.println(" 희망 연봉: "+pay);
	}//wantJob()------------

	
	
}

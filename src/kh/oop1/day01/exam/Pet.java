package kh.oop1.day01.exam;

public class Pet {
	private String petType;// 펫의 종류 (클래스 변수)
	private String petName;// 펫의 이름
	private int petAge;// 펫의 나이
	//접근자를 public로 두게되면 다른 class에서 접근이 가능하다.
	
	
	// 생성자
	public Pet() {

	}
	
	
	// 매개변수가 있는 생성자
	public Pet(String petType, String petName, int petAge) {
		this.petType = petType;	
		this.petName = petName;
		this.petAge = petAge;
	}
	//메소드를 통해 private에 접근하게 할 수 있다.
	// getter
	public String getPetType() {
		return petType;
	} // 펫의 종류에 대한 값을 가져오는 메소드 
	
	public String getPetName() {
		return petName;
	}
	public int getPetAge() {
		return petAge;
	}
	
	
	// setter
	public void setPetType(String petType) {
		this.petType = petType;
		System.out.println(petType);
	}// 펫의 종류를 변경할 수 있는 메소드

	public void setPetName(String petName) {
		this.petName = petName;
		System.out.println(petName);

	}
	public void setPetAge(int petAge) {
		this.petAge = petAge;
		System.out.println(petAge);

	}
}

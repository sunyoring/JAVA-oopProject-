package kh.oop1.day01.exam;

public class Pet {
	private String petType;// ���� ���� (Ŭ���� ����)
	private String petName;// ���� �̸�
	private int petAge;// ���� ����
	//�����ڸ� public�� �ΰԵǸ� �ٸ� class���� ������ �����ϴ�.
	
	
	// ������
	public Pet() {

	}
	
	
	// �Ű������� �ִ� ������
	public Pet(String petType, String petName, int petAge) {
		this.petType = petType;	
		this.petName = petName;
		this.petAge = petAge;
	}
	//�޼ҵ带 ���� private�� �����ϰ� �� �� �ִ�.
	// getter
	public String getPetType() {
		return petType;
	} // ���� ������ ���� ���� �������� �޼ҵ� 
	
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
	}// ���� ������ ������ �� �ִ� �޼ҵ�

	public void setPetName(String petName) {
		this.petName = petName;
		System.out.println(petName);

	}
	public void setPetAge(int petAge) {
		this.petAge = petAge;
		System.out.println(petAge);

	}
}

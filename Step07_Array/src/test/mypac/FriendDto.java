package test.mypac;

public class FriendDto {
	private int num;
	private String name;
	private String phone;
	private String sex;
	
	public FriendDto() {}
	// source using field,  getter and setter
	public FriendDto(int num, String name, String phone, String sex) {
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.sex = sex;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	
	
	
	
}

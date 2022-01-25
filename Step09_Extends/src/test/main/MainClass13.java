package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass13 {
	public static void main(String[] args) {
	
		new Phone() {};
		new HandPhone();
		//phone-handphone 생성자함수 생김. 자동으로 phone이 생김
		new SmartPhone();
		//phone-handphone=smartphone 생성자호출, run눌러서 확인 
		
		SmartPhone s1=new SmartPhone();
		s1.mobileCall();
		//s1. 찍어서 보면 핸드폰메소드 스마트폰메소드  다 가능가능 
	}
}

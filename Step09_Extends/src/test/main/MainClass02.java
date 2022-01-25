package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 *  [ 다형성 ]
		 *  
		 *  - 객체는 여러가지 type 을 가질수 있다.
		 *  - 상속 관계에 따라서 여러가지 type 이 된다.
		 *  - 아래의 HandPhone 객체는 3 가지 type 을 가진다. 
		 */
		//HandPhone 객체를 생성해서 참조값을 HandPhone type 변수에 담기
		HandPhone p1=new HandPhone();
		//HandPhone 객체를 생성해서 참조값을 Phone type 변수에 담기 
		Phone p2=new HandPhone();
		//HandPhone 객체를 생성해서 참조값을 Object type 변수에 담기 
		Object p3=new HandPhone();
		
		HandPhone p4=(HandPhone)p3;
		//p4. 하면 오브젝트 다 가능가능 
		// 이렇게 하는 이유는 소고기김밥-김가네김밥-김밥-먹을거 처럼
		// 확장을 위해서 오브젝트안에 오브젝트를 넣고 참조,제한을 하는것
	}
}











package test.main;

import test.mypac.MyObject;
import test.mypac.Phone;

public class MainClass04 {
	public static void main(String[] args) {
		//MyObject 클래스에 있는 usePhone() 메소드를 호출해 보세요.
		MyObject m1=new MyObject();
		m1.usePhone(new Phone());
		
		new MyObject().usePhone(new Phone());
		
		
		Phone p1=new Phone();
		m1.usePhone(p1);
		
		System.out.println("- 위와 동일한 작업을 2 줄의 코딩으로 한다면 ");
		MyObject m2=new MyObject();
		m2.usePhone(new Phone());
		
		System.out.println("- 위와 동일한 작업을 1 줄의 코딩으로 한다면?");
		
		new MyObject().usePhone(new Phone());
		// 이 경우는 객체를 1회만 사용할떄 씀. a,h,m1,등등은 자주 다양하게 쓸걸 생각해서 만드는것이라서
	}
}







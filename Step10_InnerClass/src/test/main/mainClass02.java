package test.main;

import test.mypac.MyUtil;
import test.mypac.MyUtil.User;

public class mainClass02 {
public static void main(String[] args) {
	User u=new MyUtil().new User();
	// 마이유틸 객체가 먼!저! 생성이 되어야! 
	// 그 안에 이너클래스인 유저도 객체생성이 가능해짐 
	//즉 user u 를 만들려면 MYUtil() 생성이 우선되어야함.
	u.doSomething();
}
}

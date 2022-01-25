package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Cat;
import test.mypac.Zoo.Monkey;//Zoo 클래스의 내부클래스 Monkey import

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 *  Zoo 클래스에 있는 getMonkey() 메소드를 호출해서
		 *  리턴되는 참조값을 m1 이라는 지역 변수에 담아 보세요.
		 */
		Zoo z=new Zoo();
		//Zoo.Monkey m=z.getmonkey(); 이것도 가능 
		//임폴트를 안하면 저런식으로 새롭게 명시를 해줘야함  3개가 임폴트되어있음 확인확인!! 
		Monkey m1=z.getMonkey();
		m1.say();
		
		//고양이
		Cat c=new Zoo().getCat();
		c.say();
	}
}







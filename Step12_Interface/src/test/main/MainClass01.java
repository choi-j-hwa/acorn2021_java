package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {
		//단독 객체 생성 불가
		Remocon r1=new MyRemocon(); //추상이랑 같은원리. 
		// Remocon r2= new Remocon 불가능  생성자가 없기때문. 마이리모컨을 통해 구현해야함
		
		// Remocon 인터페이스에 정의된 메소드 호출하기 
		r1.up();
		r1.down();
		// Remocon 인터페이스에 정의된 static final 상수 참조하기 
		System.out.println(Remocon.COMPANY);
		System.out.println(r1.COMPANY);
		//Remocon.COMPANY="삼성"; // 해도 final 필드임으로 수정불가 
	}
}







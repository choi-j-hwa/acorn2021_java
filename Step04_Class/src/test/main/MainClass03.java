package test.main;

import test.mypac.MyUtil;

public class MainClass03 {
	public static void main(String[] args) {
		//MyUtil 클래스에 정의된 static 메소드 호출하기
		MyUtil.playMusic();
		//MyUtil 클래스에 정의된 static 필드 참조해서 값 대입하기
		// static은 고정된. owner 변경 불가능  car1,car2 해도되는데
		// 마이유틸은 1,2, 추가도 불가, 변경도 불가. 
		MyUtil.owner="김구라";
		
		System.out.println("hello!");
	}
}












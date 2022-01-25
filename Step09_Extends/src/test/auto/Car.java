package test.auto;

public class Car {
	//protected 접근 지정자를 가진 필드
	// 패키지가 아예 다른 class를 가져오려면 꼭! protected 접근지정자 필요 
	// public 쓰면 바로 에러뜸
	protected Engine engine;
	
	//Engine type 을 인자로 전달 받는 생성자
	public Car(Engine engine) {
		this.engine=engine;
	}
	//메소드 
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine 이 없어서 달릴수가 없어요!");
			return; //메소드 끝내기 
		}
		System.out.println("달려요!");
	}
}

/*
 * 접근지정자
 * public private = 같은패키지 안에서 움직일 떄 공개와 비공개 차이. 
 * protected는 외부 패키지를 가져올 떄 
 * default 는 같은 패키지 안에서만, 안써도 됨 */





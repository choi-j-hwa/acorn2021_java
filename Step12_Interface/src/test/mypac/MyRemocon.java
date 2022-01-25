package test.mypac;

public class MyRemocon implements Remocon{
	//인터페이스는 클래스가 아니기때문에 익스텐드(상속)가 아니라 임플리먼트(구현)
	// 방식은 추상과 동일 
	@Override
	public void up() {
		System.out.println("볼륨을 올려요");
	}
	@Override
	public void down() {
		System.out.println("볼륨을 내려요");
	}	
}

package test.main;

import test.mypac.Weapon;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  Weapon 추상클래스를 상속 받은 익명의 local inner 클래스를 이용해서
		 *  Weapon type 의 참조값을 얻어내서 w1 이라는 Weapon type 의
		 *  지역변수에 담기 
		 */
		
		
		Weapon w1=new Weapon() {
			@Override
			public void attack() {
				System.out.println("공격공격");			
			}
			
		}; //중괄호 닫고 세미콜론을 하고 오버라이드를 하면 추상클래스인데도
			// 스스로를 new 할 수 있다 클래스 안에 메소드.. 
			// 원래라면 Weapon w1= new MyWeapon(); 이런식으로 하고 
			// w1.attack(); 이런식으로 하거나 오버라이드 해야함 
			// 익명의 로컬이너클래스 annonymous local innerclass
		
		useWeapon(w1);
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}






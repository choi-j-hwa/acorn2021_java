package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	public static void main(String[] args) {
		//익명클래스를 이용해서 1회용 Weapon type 의 참조값 얻어내서 메소드 호출하기 
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("고양이를 공격해요!");
			}
		}); //w1 만들필요 없을때, 1회용일때 useweapon()속에 new weapon을 넣은것.
		// 추상클래스라서 그냥 뉴웨폰만 하면 에러, 오버라이드가 필수! ...어렵 ㅡㅡ
	}
	/*
	 * Weapon w= ~ 를 전달한것. 헷갈릴떈 ctrl+space 를 늘 적극활용!  
	 */
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}

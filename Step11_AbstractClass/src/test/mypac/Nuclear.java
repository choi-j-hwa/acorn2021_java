package test.mypac;

public class Nuclear extends Weapon {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.prepare();
		System.out.println("핵을 준비합니다");
	}

	@Override
	public void attack() {
		System.out.println("핵폭탄을 쏩니다");
		
	}

	
}

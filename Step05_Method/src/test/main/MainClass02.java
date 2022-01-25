package test.main;

import test.mypac.House;

public class MainClass02 {
	public static void main(String[] args) {
		//House 클래스를 이용해서 여러분들이 집에서 편한하게 3번 쉬어 보세요.
		
		House h=new House();
		h.relax("nana");
		h.relax("rara");
		h.relax("toto");
		
		for(int i=0;i<100;i++) {
			h.relax("cjh");
		}
	
	}
}

	





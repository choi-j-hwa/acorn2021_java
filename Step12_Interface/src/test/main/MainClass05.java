package test.main;

import test.mypac.Drill;

public class MainClass05 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			@Override
			public void hole() {}
		}); // 같은것 useDrill(()->{}); 메소드가 1개일때만 가능
		
		useDrill(()->{
			System.out.println("천장에 구멍을 2개 뚤어요");
		});
		
		Drill d1=()->{
			System.out.println("아무데나 구멍을 뚤어요");
		};
		useDrill(d1);
	}
	
		
	
	
	public static void useDrill(Drill d) {
		d.hole();
	}
}





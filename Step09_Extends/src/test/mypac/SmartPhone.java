package test.mypac;

// SmartPhone 클래스를 종단 클래스로 만드는 final 예약어 
public final class SmartPhone extends HandPhone{
	//디폴트 생성자
	public SmartPhone() {
		//다형성 확인 
		//SmartPhone m1=new SmartPhone();
		//HandPhone m2=new SmartPhone();
		//Phone m3=new SmartPhone();
		//Object m4=new SmartPhone();
		//SmartPhone p5= p4; 불가능
		// p4는 먹을것!의 개념  p1,p5는 소고기김밥의 개념임
		//큰 개념을 작은곳에 담을 수 없징 but반대는 가능 먹을것 = 참치김밥은 ㅇㅋ  참치김밥=먹을거슨 뒤가 더 커서 x
		//형 변환 (type casting)
		//SmartPhone p5= (SmartPhone) m4;
		//m1.doInternet();
		//m2.takePicture();
		//m3.call();
		//m4.toString();
		//smart폰이 가장 하위라섯 p1은 모든 메소드 사용가능
		//p4는 오브젝트 메소드만 사용가능 
		System.out.println("SmartPhone() 생성자 호출됨");
		
		usePhone(new SmartPhone());
	}
	public void usePhone(Phone p) {
		p.call();
	}
	
	
		//인터냇 하는 메소드
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	
	//이 메소드는 재정의한 메소드라고 표시해주는 어노테이션(@)
	//특별한 기능을 하는것은 아니고 단지 재정의한 메소드라로 표시해주는 기능만 있다. 
	@Override
	public void takePicture() {
		// super 는 부모 객체를 가리키는 예약어이다.
		// 피 오버라이드된 부모 메소드도 만일 호출하려면
		// 아래와 같이 호출하면된다.
		// super.takePicture();
		// 부모메소드를 호출해야 하는지 아닌지는 그때 그때 클래스에 따라 다르므로
		// 클래스 사용법을 학습을 해서 선택을 해야 한다. 
		// source에서 제너레이트, 오버라이드 
		System.out.println("1000만 화소의 사진을 찍어요!");
		
	}

	@Override
	public void mobileCall() {
		// TODO Auto-generated method stub
		super.mobileCall();
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		super.call();
	}

	
	
	
	
	
	
	
	
}






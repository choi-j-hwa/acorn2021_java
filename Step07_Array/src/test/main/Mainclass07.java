package test.main;

import test.mypac.FriendDto;

/*
 *  친구 한명의 정보를 객체를 생성해서 담아보자
 *  번호,이름,전화번호,성별 dto작성규약에 맞게 클래스 작성
 *  test.mypac 패키지에 클래스를 만들라
 */
public class Mainclass07 {
public static void main(String[] args) {
	/*
	 * 친구 세명의 정보를 담을 수 있는 배열 객체를 생성하고 세명의 정보 담아보라
	 */
	
	FriendDto f1=new FriendDto();
	f1.setNum(1);
	f1.setName("rara");
	f1.setPhone("090");
	f1.setSex("여자");
	
	FriendDto f2=new FriendDto(2,"nana","070","남자");
	FriendDto f3=new FriendDto(3,"toto","010","여자");
	
	//FriendDto[] friends= {f1, f2, f3};
	
	FriendDto[] friends=new FriendDto[3];
		friends[0]=f1;
		friends[1]=f2;
		friends[2]=f3;
		
		for (int i=0; i<friends.length; i++){
			FriendDto tmp=friends[i];
			System.out.println(tmp.getName()+"번호는"+tmp.getPhone());
		}
	}
}

package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass04 {
	public static void main(String[] args) {
		//정수를 저장할 ArrayList 객체를 생성해서 참조값을 nums 라는 지역변수에 담아 보셈
		List<Integer> nums=new ArrayList<>();
		//Arraylist<Interger> 생략가능. 대신 get 할때 꼭 써줘아함 받을때.
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.get(0); //get 뒤의 숫자는 배열방의 위치. [0,1,2]
		//실수를 저장할 ArrayList 객체를 생성해서 참조값을 nums2 라는 지역변수에 담아 보셈
		//기본 데이터타입은 쓸 수 없으므로 첫글자 대문자로. 참조데이터화해서 들어가야함. 
		List<Double> nums2=new ArrayList<>();
		nums2.add(10.1);
		nums2.add(10.2);
		nums2.add(10.3);
	}
}







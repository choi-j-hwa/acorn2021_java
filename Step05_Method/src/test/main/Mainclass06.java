package test.main;

import java.util.Random;

public class Mainclass06 {
	public static void main(String[] args) {
		Random ran=new Random();
		for(int i=0; i<100; i++){
		//1~45 사이의 랜덤정수를 얻어서 출력해봐
		int ranNum=ran.nextInt(45)+1;
		System.out.println(ranNum);
		}
	}
}

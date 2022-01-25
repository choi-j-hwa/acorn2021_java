package test.String;

public class MainClass01 {
public static void main(String[] args) {
		String name1="rara";
		String name2="rara";
		String name3 = new String ("rara");
		String name4 = new String ("rara");
		
		System.out.println(name1);
		System.out.println(name3);
		//String type의 참조값 비교
		boolean result1= name1 == name2; //t
		boolean result2= name1 == name3; //f
		boolean result3= name3 == name4; //f
		//String type의 문자열 비교
		boolean result4= name1.equals(name2); //t why? equals는 문자열이 같냐는 거니까 
		boolean result5= name1.contentEquals(name3); //t heap영역의 아이디값이 같냐는 질문이 아님
		boolean result6= name3.equals(name4); //t
		boolean result7= "rara".equals(name1); //t
		boolean result8= name3.equals("rara"); //t
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result8);
}
}

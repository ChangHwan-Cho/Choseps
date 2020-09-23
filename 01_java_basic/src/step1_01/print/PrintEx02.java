package step1_01.print;

public class PrintEx02 {
	public static void main(String[] args) { 
		
		//	1. 자료형(data type)에 맞는 출력
		//			-1) 정수 : 소수점이 없는 수
		//			-2) 실수 : 소수점이 있는 수
		//			-3) 문자 : 단일문자 ( 홀따옴표, 싱글퀘테이션, 싱글쿼터)
		//			-4) 문자열 : 글자 ( 쌍따옴표, 더블쿼테이션, 더블쿼터)
		
		System.out.println(33);
		System.out.println(3.14);
		System.out.println('a');
		System.out.println("space");
		
		System.out.println();
		
		// 2. 복수의 데이터 출력 ( , 가 아닌 +를 사용해야 된다)
		
		
		System.out.println(1+3+5);
		System.out.println("1,3,5");
		System.out.println(1+""+3+""+5);
		System.out.println(1+","+3+","+5);
		
		
		System.out.println("프로그래밍언어 : " + "자바");
		//			-1) 문자열 + 문자열 = 문자열
		System.out.println("3"+"7");
		//			-2) 숫자 + 숫자 = 숫자
		System.out.println(3+7);
		//			-3) 문자열 + 숫자 = 문자열
		System.out.println("3"+7);
		//			-4)숫자 + 문자열 = 문자열
		System.out.println(3+"7");
		
		System.out.println("더하기 = "+3+7);
		System.out.println("더하기 = "+(3+7));
	}
}

package step1_03.operator;

public class OpEx02_정답 {

	public static void main(String[] args) {
		
		//예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력 
		System.out.println(1000 - 200);
		System.out.println("잔돈 = " + (1000 - 200) + "원");
		
		//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		
			System.out.println(100*12);
			System.out.println("연봉 = "+(100*12-(100/10))+"원");
		
		//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
			System.out.println();
			System.out.println("시험점수의 평균은 : "+((30+50+4)/3)+"이다");
		
		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
			System.out.println("삼각형의 넓이는"+(3*6/2)+"이다");
		//문제4) 100초를 1분 40초로 출력
			System.out.println("100초는"+(100/60)+"분"+(100%60)+"초");
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수 출력
			System.out.println("500원짜리"+(800/500)+"개");
			System.out.println("100원짜리"+(800%500/100)+"개");
		
		//정답5) 500원(1개), 100원(3개)

	}

}

package step1_03.operator;

public class OpEx04_문제 {

	public static void main(String[] args) {
		
		//예) 점수가 60점 이상이면 true 출력
        int score = 30;
        System.out.println(score >= 60);
        
        //문제1)  15가 3의 배수이면 true 출력
        //힌트) 숫자를 3으로 나눈 나머지가 0이면 3의 배수
        int num = 15;
        System.out.println(num % 3 == 0);
        
        //문제2) 100이 짝수이면 true 출력
        //힌트) 숫자를 2로 나눈 나머지가 0이면 짝수
        //      숫자를 2로 나눈 나머지가 1이면 홀수

        num = 100;
        System.out.println(num % 2 == 0);
        
        //문제3)아래돈중 1000원짜리 이상화폐를 제외한 1000원짜리가 3장 이상이면 true 출력
        int money = 178600;
        System.out.println((money % 5000 / 1000) >= 3);


	}

}
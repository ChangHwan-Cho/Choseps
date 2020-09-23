package step1_04.inputFunction;

import java.util.Scanner;

public class InPutEx02_문제 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		//문제1) 숫자 2개를 입력 받아서 합을 출력
		System.out.print("첫번째 숫자를 입력 : ");
		int f = scan.nextInt();
		System.out.print("두번째 숫자를 입력 : ");
		int s = scan.nextInt();
		System.out.println("두개의 값 : "+(f+s));
		
		
		//문제2) 숫자 1개를 입력 받아서 , 홀수이면 true 출력
		System.out.print("숫자를 입력 하세요 : ");
		int num = scan.nextInt();
		System.out.println(num%2==1);
		
		
		//문제3) 성적을 입력받아서 , 60점 이상이고 100점 이하면 true 출력
		System.out.print("성적을 입력하세요 : ");
		int avg = scan.nextInt();
		System.out.println(avg>=60 && avg<=100);
	}
}

package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
	==== 가위 바위 보 (하나빼기) ====
	
	1) 가위바위보 2개씩 저장
	meleft 에 가위바위보 입력
	meright 에 가위바위보 입력
	
	comleft 에 가위바위보 입력 (랜덤)
	comright 에 가위바위보 입력 (랜덤)
	
	2) 둘중 하나만 저장 
	me 에 meleft 또는 meright 저장(집접)
	com 에 comleft 또는 comright 저장(랜덤)
	
	3) 최종판정
*/
public class ifEx25_테스트문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int meleft = 0;
		int meright = 0;
		
		int comleft = 0;
		int comright = 0;
		System.out.println("meleft 가위(1), 바위(2), 보(3) : ");
		meleft = scan.nextInt();
		System.out.println("meright 가위(1), 바위(2), 보(3) : ");
		meright = scan.nextInt();
		
		comleft = ran.nextInt(3)+1;
		comright = ran.nextInt(3)+1;
		
		int sum = 0;
		System.out.println("meleft는 : "+meleft+"  "+"meright는 : "+meright+" "+"둘중 하나 저장 : ");
		sum = scan.nextInt();
		
		int com = 0;
		com = ran.nextInt(2)+1;
		
		
		if(com == 1) {
			if(comright == sum) {
				System.out.println("비김");
			}else if(comright == 1 && sum == 2) {
				System.out.println("나의 승리");
			}else if(comright == 2 && sum == 3) {
				System.out.println("나의 승리");
			}else if(comright == 3 && sum == 1) {
				System.out.println("나의 승리");
			}else {
				System.out.println("컴 승리");
			}
			System.out.println("가위(1), 바위(2), 보(3)");
			System.out.println("comright"+comright);
			System.out.println("me"+sum);
			}
		if(com == 2) {
			if(comleft == sum) {
				System.out.println("비김");
			}else if(comleft == 1 && sum == 2) {
				System.out.println("나의 승리");
			}else if(comleft == 2 && sum == 3) {
				System.out.println("나의 승리");
			}else if(comleft == 3 && sum == 1) {
				System.out.println("나의 승리");
			}else {
				System.out.println("컴 승리");
			}
			System.out.println("가위(1), 바위(2), 보(3)");
			System.out.print("comleft"+comleft+" ");
			System.out.println("me"+sum);
		}
		
	}
}

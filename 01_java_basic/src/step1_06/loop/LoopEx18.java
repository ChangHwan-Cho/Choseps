package step1_06.loop;

import java.util.Scanner;

/*
 * 
 * 	#do while문
 * 
 * 	[형식]
 * 
 * 	do {
 * 		반복할 명령어;
 * } while (조건식);
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class LoopEx18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		while (num > 0 && num < 4) {
			System.out.println("숫자입력(1,2,3) : ");
			num = scan.nextInt();
		}
		
		do {
			System.out.println("숫자입력(1,2,3) : ");
			num = scan.nextInt();
			
		} while (num > 0 && num < 4);
		
		
		
		scan.close();
	}

}

package com.biz.scan;

import java.util.Random;
import java.util.Scanner;

public class Scanner_06 {

	public static void main(String[] args) {

		/*
		 * 1부터 10까지 임의 난수를 하나 만들고
		 * 키보드로부터 1부터 10까지 숫자를 입력받아서
		 * 난수를 맞추는 게임 작성하시오
		 * 
		 * 단,
		 * 임의로 종료를 선택할때까지
		 * 계속해서 새로운 난수를 만들고 게임을 계속할 수 있도록
		 * 하시오
		 */
		
		Random rnd =new Random();
		int intRnd= rnd.nextInt(10)+1;
		
		Scanner scan=new Scanner(System.in);
		
		int i=0;
		while(true) {
			System.out.print("숫자(1~10)입력, 종료(--END) >> ");
			String strKey=scan.nextLine();
			if(strKey.contentEquals("--END")) break;
			int intKey = Integer.valueOf(strKey.trim());
			
			i++;
			
			if(intKey>intRnd) {
				System.out.println("큰수를 입력했군요");
			}else if(intKey<intRnd) {
				System.out.println("작은 수를 입력했군요");
			}
			if(intKey==intRnd) {
				System.out.println("참 잘했어요");
				System.out.println(i+"번만에 맞추었네요");
				intRnd=rnd.nextInt(10)+1;
				i=0;
			}


		}
		
		System.out.println("GAME Over!!");
		
	}

}

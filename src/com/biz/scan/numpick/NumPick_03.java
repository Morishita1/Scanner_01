package com.biz.scan.numpick;

import java.util.Random;
import java.util.Scanner;

public class NumPick_03 {

	private int intNum; // 자동으로 0으로 초기화
	private Random rnd; // 초기화코드(=new Random();)를 생성자로...
	private Scanner scan;
	
	// 생성자 메서드
	public NumPick_03() {
		intNum=10;
		rnd =new Random();
		scan=new Scanner(System.in);
	}
	public void pickup() {
		
		int intRnd= rnd.nextInt(10)+1;
		int i=0;
		while(true) {
			System.out.print("숫자(1~10)입력, 종료(--END) >> ");
			String strKey=scan.nextLine();
			if(strKey.contentEquals("--END")) break;
			int intKey = Integer.valueOf(strKey.trim());
			
			i++;
			// 2번 코드
			// 일반적인 Pattern에서는
			// 중요한 코드(정답을 검사하는 코드)가
			// 가급적 윗쪽에 있도록 작성한다.
			
			// 이코드는 정답을 맞추었을경우
			// 오답인 경우를 건너 뛰어서
			// Scanner_06 보다는 다소 효율이 높다.
			if(intKey==intRnd) {
				System.out.println("참 잘했어요");
				System.out.println(i+"번만에 맞추었네요");
				intRnd=rnd.nextInt(10)+1;
				i=0;
			} else {
				if(intKey>intRnd) {
					System.out.println("큰수를 입력했군요");
				}else if(intKey<intRnd) {
					System.out.println("작은 수를 입력했군요");
				}
			}


		}
		
		System.out.println("GAME Over!!");
		
	

	}
	
	
}

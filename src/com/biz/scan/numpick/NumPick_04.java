package com.biz.scan.numpick;

import java.util.Random;
import java.util.Scanner;

public class NumPick_04 {

	private int intNum; // 자동으로 0으로 초기화
	private Random rnd; // 초기화코드(=new Random();)를 생성자로...
	private Scanner scan;
		
	private int intRnd;
	private int i;
	private int intKey;
	
	public void resetCount() {
		i=0;
	}
	
	public int geti() {
		return i;
	}
	
	// 생성자 메서드
	public NumPick_04() {
		intNum=10;
		rnd =new Random();
		scan=new Scanner(System.in);
	}
	
	public void makeRandom() {
		intRnd= rnd.nextInt(10)+1;
		
	}
	public boolean keyInput() {
		System.out.print("숫자(1~10)입력, 종료(--END) >> ");
		String strKey=scan.nextLine();
		i++;
		if(strKey.contentEquals("--END")) {
			return true;
		}
		intKey= Integer.valueOf(strKey);
		return false;
	}
	public int pickup() {
		
		int ret=intKey -intRnd;
		if(ret==0) {
			intRnd=rnd.nextInt(10)+1;
			//i=0;
		}
		
		
		return ret;
		
		/*	
			
			if(intKey==intRnd) {
				System.out.println("참 잘했어요");
				System.out.println(i+"번만에 맞추었네요");
				
			} else {
				if(intKey>intRnd) {
					System.out.println("큰수를 입력했군요");
				}else if(intKey<intRnd) {
					System.out.println("작은 수를 입력했군요");
				}
			}
			*/
		}
		
}

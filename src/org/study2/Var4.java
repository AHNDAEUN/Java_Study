package org.study2;
import java.util.Scanner;

public class Var4 {

	public static void main(String [] args )  {

	
	System.out.println("Strat");
	
	Scanner sc = new Scanner(System.in);
	String id = "";
	String name = "";
	String pw = "";
	String se = "";
	int gg = 0;
	
	System.out.println(" 아이디를 입력해 주세요 ");
	id = sc. next();
	System.out.println("아이디");
	System.out.println( id + " @ naver.com ");

	System.out.println(" 비밀번호를 입력해 주세요 ");
	pw = sc. next();
	System.out.println("비밀번호");
	System.out.println(pw);

	
	System.out.println(" 이름을 입력해 주세요 ");
	name = sc. next();
	System.out.println(" 이름 ");
	System.out.println(name);
	
	System.out.println(" 생년월일을 입력해 주세요 ");
	gg = sc. nextInt();
	System.out.println(" 생년월일 ");
	System.out.println(gg);
	
	System.out.println(" 성별을 입력해 주세요 ");
	se = sc. next();
	System.out.println(" 성별 ");
	System.out.println(se);
	
	System.out.println("Finish");
	}
}
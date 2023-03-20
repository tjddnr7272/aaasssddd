package ezen.exception;

/**
 * 자바에서 예외란?
 * @author 김성욱
 * @Date   2023. 1. 9.
 */
public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println("프로그램 시작됨...");
		Foo foo = new Foo();
		int result = foo.doTask3(10, 5);
		System.out.println("결과: " + result);
		
		result = foo.doTask3(10, 0);
		System.out.println("결과: " + result);
		
        System.out.println("프로그램 종료됨...");

	}

}

package ezen.exception;

/**
 * JVM에 의해 실행되는 예외 처리 매커니즘 이해
 * @author 김성욱
 * @Date   2023. 1. 9.
 */
public class Foo {

	public int doTask1(int x, int y) {
		// return x / y ;
		// *오류* JVM은 new AtrithmaticException("/by zero");
		
		String name = null;
		System.out.println(name.length());
//		int[] array = {1,2} ;
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[2]);
		
 		return 0;
	}
	
	
	public int doTask2(int x, int y) {
	    int result = 0;
		// 예외 처리 구문
		try {
			// 예외가 발생 가능성이 있는 실행문(주로 파일 입출력,네트워크)
//	     	result = x / y ; 
//			String name = null;
//    			name.length();         //밑에 catch
			int[] array = {1,2} ;
			System.out.println(array[0]);
			System.out.println(array[2]);
			
	    }catch(ArithmeticException e) {      // 보통 제일 많이 쓰임> 한국말로 친절히 직접 세팅가능!
	    	// 개발자가 처리하는 예외 처리 코드
	    	System.out.println("숫자는 0으로 나눌 수 없습니다..");
	    	System.out.println(e.getMessage());  //순수한 e 객체안의 메세지(개발자에게 알려줌)
	    	// 디버깅용 메소드
	    	e.printStackTrace(); // 이유를 상세하게 알려줌(최상위 클래스에서 제공하는 메소드)
	    	
	    }catch (NullPointerException e) {
	        System.out.println("객체가 생성 안됐는데 메소드 호출 에러...");	
	        System.out.println(e.getMessage());
	        e.printStackTrace();
	    }catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("배열 인덱스를 초과하였습니다..");
	        System.out.println(e.getMessage());
	        e.printStackTrace();
	    }
		
		return result;
	
	}
	
	public int doTask3(int x, int y) {
	    int result = 0;
		// 예외 처리 구문
		try {
			// 예외가 발생 가능성이 있는 실행문(주로 파일 입출력,네트워크)
	     	result = x / y ; 
//			String name = null;
//    			name.length();         //밑에 catch
//			int[] array = {1,2} ;
//			System.out.println(array[0]);
//			System.out.println(array[2]);
	     	
	     	System.out.println("김기정입니다..."); // 핵심코드이지만 Exception 실행후 인식을 못함ㅠㅠ 
	     	
			
	    }catch(Exception e) {       //Exception 하나로 전부 해결 가능
	    	// 개발자가 처리하는 예외 처리 코드
	    	System.out.println("프로그램 실행중 예상치 못한 오류가 발생하였습니다.");
//	    	System.out.println(e.getMessage());  //순수한 e 객체안의 메세지(개발자에게 알려줌)
	    	// 디버깅용 메소드
//	    	e.printStackTrace(); // 이유를 상세하게 알려줌(최상위 클래스에서 제공하는 메소드)
	    	
	    
	    }finally {
			// try 블럭에서 예외가 발생하든, 하지 않든 항상 실행되어야 하는 코드영역
	    	// 입출력, 네트워크 처리에서 리소스(자원) 해제 코드들...
	    	System.out.println("김기정입니다...");
	    	
		}
		
		return result;
	
	}


	public void doTask5() {
		// TODO Auto-generated method stub
		
	}
	
	
}

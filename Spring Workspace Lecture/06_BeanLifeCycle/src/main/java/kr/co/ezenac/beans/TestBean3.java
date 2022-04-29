package kr.co.ezenac.beans;

public class TestBean3 {
	
	public TestBean3() {
		System.out.println("TestBean3의 생성자");
	}
	
	public void default_init() {
		System.out.println("TestBean3의 default_init");
	}
	
	public void default_destroy() {
		System.out.println("TestBean3의 default_destroy");
	}
	
	public void bean3_init() {
		System.out.println("TestBean3의 init메서드");
	}
	
	public void bean3_destroy() {
		System.out.println("TestBean3의 destroy메서드");
	}
	
	/* 다 있을 때는 default보다 default 없는 메서드가 더 우선이다..? */
}

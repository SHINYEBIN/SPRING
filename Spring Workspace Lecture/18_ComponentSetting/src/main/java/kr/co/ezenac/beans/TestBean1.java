package kr.co.ezenac.beans;

import org.springframework.stereotype.Component;

@Component	// component는 메서드에 붙을 수 없다.
public class TestBean1 {
	
	
	public TestBean1() {
		System.out.println("TestBean1의 생성자");
	}
}

package kr.co.ezenac.beans;

import org.springframework.stereotype.Component;

@Component("t3") // component 이름 지정	mainclass에서 이름아닌 타입으로 해도 상관없긴 한데... 헷갈리니까 맞춰쓰는 거 ㅊㅊ!
public class TestBean2 {
	
	public TestBean2() {
		System.out.println("TestBean2의 생성자");
	}
}

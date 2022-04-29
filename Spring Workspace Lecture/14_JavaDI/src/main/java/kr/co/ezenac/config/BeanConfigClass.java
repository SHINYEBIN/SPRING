package kr.co.ezenac.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.ezenac.beans.DataBean1;
import kr.co.ezenac.beans.DataBean2;
import kr.co.ezenac.beans.DataBean3;
import kr.co.ezenac.beans.TestBean1;
import kr.co.ezenac.beans.TestBean2;
import kr.co.ezenac.beans.TestBean3;

@Configuration

public class BeanConfigClass {
	
	@Bean
	public TestBean1 java1() {
		
		return new TestBean1(200,"문자열2",new DataBean1());
	}
	@Bean
	public TestBean1  java2() {
		TestBean1 t1=new TestBean1();
		t1.setData1(400);
		t1.setData2("문자열4");
		t1.setData3(new DataBean1());
		return t1;
	}
		
	/*@Bean
	public DataBean1 data_bean1() {
		
		return new DataBean1();
	}*/
	
	@Bean
	public DataBean2 data1() {	// 이름을 beans.xml이랑 똑같이 해줘야한다.
		
		return new DataBean2();
	}
	
	@Bean
	public DataBean2 data2() {	// 이름을 beans.xml이랑 똑같이 해줘야한다.
		
		return new DataBean2();
	}
	
	@Bean(autowire=Autowire.BY_NAME)	/*Spring 4.버전으로 쓰면 ㄱㅊ한데 Spring 5.1버전부터는 저걸 안쓴다.(다른 방법을 써라)*/
	public TestBean2 java3() {
		
		return new TestBean2();
	}
	
	@Bean
	public DataBean3 data3() {
		
		return new DataBean3();
	}
	
	@Bean(autowire=Autowire.BY_TYPE)
	public TestBean3 java4() {
		
		return new TestBean3();
	}
	
	
	
	
	
	
}

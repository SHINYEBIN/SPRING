package kr.co.ezenac.main;

import org.springframework.beans.factory.xml.XmlBeanFactory; //기존에는 많이 썼지만 지금은 안쓴다!
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import kr.co.ezenac.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		//test1();
		//test2();
		//test3();
		test4();
	}
	
	// BeanFactory- 패키지내부(beans.xml)
	public static void test1() {
		ClassPathResource res=new ClassPathResource("kr/co/ezenac/config/beans.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res); //
		TestBean t1=factory.getBean("t1",TestBean.class);
		
		System.out.printf("t1 : %s\n", t1);
		
		TestBean t2=factory.getBean("t1",TestBean.class);
		System.out.printf("t2 : %s\n",t2);
		// 이미 만들어진 객체는 다시 만들지 않는다. //주소값 같으면 안 만들어진 것.
	}
	// BeanFactory-패키지 외부(beans.xml)
	public static void test2() {
		FileSystemResource res=new FileSystemResource("beans.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		// 이 상태의 경우에 객체를 만들지 않는다.
		
		//외부..?
		TestBean t1=factory.getBean("t2",TestBean.class);
		System.out.printf("t1 : %s\n",t1);
		// 이 경우 객체 만든다~!
		
		//동일객체 동일클라스(내부에 있을때..?)
		TestBean t2=factory.getBean("t2",TestBean.class);
		System.out.printf("t2 : %s\n",t2);
		// 얘는 외부에 있건, 내부에 있건 만들지 않는다.
	}
	
	// ApplicationContext - 패키지 내부
	public static void test3() {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/ezenac/config/beans/xml");
		System.out.printf("ctx: %s\n", ctx);
		
		TestBean t1=ctx.getBean("t1",TestBean.class);
		System.out.printf("t1 : %s\n",t1);
		
		// 동일 객체
		TestBean t2=ctx.getBean("t2",TestBean.class);
		System.out.printf("t2 : %s\n",t2);
	}
	
	//ApplicationContext- 패키지 외부
	public static void test4() {
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("beans.xml");
	
		TestBean t1=ctx.getBean("t2",TestBean.class);
		System.out.printf("t1 : %s\n" , t1);
		
		TestBean t2=ctx.getBean("t2",TestBean.class);
		System.out.printf("t2 : %s\n" , t2);
	}
	
	
	
	// 동일한 객체는 만들지 않는다!!!!!!
	
}

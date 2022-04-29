package kr.co.ezenac.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.ezenac.beans.TestBean1;
import kr.co.ezenac.beans.TestBean2;
import kr.co.ezenac.beans.TestBean3;
import kr.co.ezenac.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 t1=ctx.getBean(TestBean1.class);
		
		System.out.printf("t1.data1: %s\n", t1.getData1());
		System.out.printf("t1.data2: %s\n", t1.getData2());
		System.out.printf("t1.data3: %s\n", t1.getData3());
		System.out.printf("t1.data4: %s\n", t1.getData4());
		System.out.printf("t1.data5: %s\n", t1.getData5());
	
		System.out.println("=====================================================================================");
		
		TestBean2 t2=ctx.getBean(TestBean2.class);		// 생성자를 통한 주입
		
		System.out.printf("t2.data1: %d\n", t2.getData1());
		System.out.printf("t2.data2: %s\n", t2.getData2());
		System.out.printf("t2.data3: %s\n", t2.getData3());
		System.out.printf("t2.data4: %s\n", t2.getData4());
		System.out.println("-------------------------------------------------");
		TestBean3 java2=ctx.getBean("java2",TestBean3.class);	// 일반적으로 component를 많이 씀.
		System.out.printf("java2.data1: %d\n", java2.getData1());	// 타입을 보고 객체를 만들어내는 싱글톤이기 때문에 객체가 하나밖에 생성이 안됨.
		System.out.printf("java2.data2: %s\n", java2.getData2());	// 똑같은 타입의 다른 객체를 만들고 싶은 경우 다른 메서드 이름 만들어 빈에 등록시면 같은 타입으로 다른 객체를 만들어 낼 수 있다.
		System.out.printf("java2.data3: %s\n", java2.getData3());
		System.out.printf("java2.data4: %s\n", java2.getData4());
		
		
		
		ctx.close();
	}

}

package kr.co.ezenac.main;

import kr.co.ezenac.beans.HelloWorld;
import kr.co.ezenac.beans.HelloWorldEn;
import kr.co.ezenac.beans.HelloWorldKo;

public class MainClass {
	Object call1;
	public static void main(String[] args) {
		HelloWorld hello1=new HelloWorldKo();
		callMethod(hello1);// callMethod()호출
		
		HelloWorld hello2=new HelloWorldKo();
		callMethod(hello2);
		
		HelloWorld hello3=new HelloWorldKo();
		callMethod(hello3);// callMethod()호출
		
		HelloWorld hello4=new HelloWorldKo();
		callMethod(hello4);
		
	}
	
	//public static void callMethod(HelloWorldEn hello) { // 이 메서드가 하는 일은 En클래스의 say Hello 출력시키는 일~!
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();//good Morning~
		
		
	}
}

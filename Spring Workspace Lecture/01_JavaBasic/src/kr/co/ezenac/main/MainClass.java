package kr.co.ezenac.main;

import kr.co.ezenac.beans.HelloWorldEn;
import kr.co.ezenac.beans.HelloWorldKo;

public class MainClass {
	Object call1;
	public static void main(String[] args) {
		//HelloWorldEn hello1=new HelloWorldEn();
		HelloWorldKo hello1=new HelloWorldKo();
		//callMethod(hello1);// callMethod()호출
		callMethod(hello1);
		//HelloWorldEn hello2=new HelloWorldEn();
		HelloWorldKo hello2=new HelloWorldKo();
		//callMethod(hello2);
		callMethod(hello2);
		
	}
	
	//public static void callMethod(HelloWorldEn hello) { // 이 메서드가 하는 일은 En클래스의 say Hello 출력시키는 일~!
	public static void callMethod(HelloWorldKo hello) {
		
		//hello.sayHello();//good Morning~
		hello.sayHello();
		
	}
}

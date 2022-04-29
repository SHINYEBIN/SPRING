package kr.co.ezenac.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class TestBean1 {
	//@Autowired는 등록이니까 set에만 영향을 준다!!
	private int data1;
	private DataBean1 data2;
	
	@Autowired
	private DataBean1 data3;

	@Autowired
	@Qualifier("obj4")
	private DataBean2 data4;
	
	@Autowired
	@Qualifier("obj5")
	private DataBean2 data5;
	
	@Autowired(required=false)
	@Qualifier("obj6")
	private DataBean2 data6;
	
	
	
	public int getData1() {
		return data1;
	}
	@Required	//필수 주입 프로퍼티(스프링 5.1부터 자바 파일로 등록했을 경우 무시된다.)
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public DataBean1 getData2() {
		return data2;
	}
	
	@Autowired // 타입 일치하면 자동으로 주입된다.
	public void setData2(DataBean1 data2) {
		this.data2 = data2;
	}
	public DataBean1 getData3() {
		return data3;
	}

	/*
	 * public void setData3(DataBean1 data3) {
	 *  this.data3 = data3;
	 *  }
	 */
	public DataBean2 getData4() {
		return data4;
	}

	/*
	 * public void setData4(DataBean2 data4) {
	 * 	 this.data4 = data4;
	 * }
	 */
	public DataBean2 getData5() {
		return data5;
	}

	/*
	 * public void setData5(DataBean2 data5) {
		this.data5 = data5;
	 }
	 */
	public DataBean2 getData6() {
		return data6;
	}
	/*
	 * public void setData6(DataBean2 data6) { 
	 * this.data6 = data6; 
	 * }
	 */
	
	
	
}

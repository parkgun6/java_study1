package org.bmi.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BMIServiceTests {//전체테스트할때 동작하는곳

	
	static BMIService service; //스태틱이 붙으니 에러가사라짐
	
	@BeforeAll//모든테스트를 시작하기전에 먼저 동작하는것
	static void setup() {//스태틱이 붙으니 에러가 사라졌다.
		System.out.println("setup....");
		service = new BMIService();
	}
	
	
	@Test//메서드위에 골뱅이 : 어노테이션
	void test() {
		System.out.println(service);
		assertNotNull(service);;//assert단언한다,확실하다
	}


	@Test
	void test2() {
	double bmi =service.calculate(1.8, 60);
	System.out.println(bmi);
	assertEquals(bmi, 18.5);
	}
	
}

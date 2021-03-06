package org.bmi.service;

public class BMIService {

	
	public double calculate(double height, double weight){//파라미터변수명은는 구체적으로
		double result=0;//컴파일에러 방지를 위해 먼저 선언
		
		result = weight / Math.pow(height,2);
		
		result = Math.floor(result*10)/10;//값을 첫번째자리에서 반올림했다. 2번째자리는 곱하기 100
		if(height > 2.5) {
			result = weight*10000 / Math.pow(height,2);
			result = Math.floor(result*10)/10;
		}

		return result;
	}
	
	
}

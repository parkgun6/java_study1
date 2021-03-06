package org.bmi.ui;

import java.util.Scanner;

import org.bmi.service.BMIService;

public class BMIUserInterface {

	Scanner scanner;
	BMIService service;// 인스턴스 valuable

	double height = 0;
	double weight = 0;

	public BMIUserInterface(BMIService service) {
		this.scanner = new Scanner(System.in);
		this.service = service;

	}

	private String inputStr(String msg) {
		String result = null;
		System.out.println(msg);
		result = scanner.nextLine();

		return result;
	}

	public void input() {

		String name = this.inputStr("본인의 이름");

		double height = Double.parseDouble(this.inputStr("본인의 키"));

		double weight = Double.parseDouble(this.inputStr("본인의 몸무게"));

		System.out.println(name + "님의 키는 : " + height + " 몸무게는 : " + weight);
		double bmi = service.calculate(height, weight);
		System.out.println(bmi);
		String bmiStr = "";
		if (bmi < 18.5) {
			bmiStr = "저체중";
		} else if (bmi <= 23) {
			bmiStr = "정상";
		} else if (bmi <= 25) {
			bmiStr = "경도비만";
		} else if (bmi <= 30) {
			bmiStr = "고도비만";
		} else if (30 < bmi) {
			bmiStr = "초고도비만";
		}System.out.println("당신은"+bmiStr+"입니다.");
	}


}

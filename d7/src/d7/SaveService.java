package d7;

import java.util.Scanner;

public class SaveService {

	int balance;
	//생성자
	
	//입금
	
	public void deposit(int money) {
		balance += money;
	}
	
	public int withdraw() {
		int result = 0;
		
		result = balance;
		
		balance = 0;
		
		return balance;
	}
	Scanner scanner;
	
	SaveService service;
	
	public void SaveUi() {
		scanner = new Scanner(System.in);
		service = new SaveService();
	}
	
	public void init() {
		//while
		System.out.println("1.입금 2.출금");
	}
	
}

package d5;

import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를입력하세요");
		String str = scanner.nextLine();
		System.out.println(str);
		int value = Integer.parseInt(str);
		System.out.println(str);
		
	}
}

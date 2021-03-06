package d5;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto2 {
	public static boolean overlap(int[] targetArr, int target) {

		boolean result = false;
		for (int i = 0; i < targetArr.length; i++) {
			if (targetArr[i] == target) {
				target = -1;
				System.out.println(targetArr[i] + "=" + target);
				result = true;
				break;
			}
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 로또뽑기

		// 6개의 배열생성하기

		int[] ball = new int[6];

		// 45개의 무작위 숫자 생성하기
		for (int i = 0; i < ball.length; i++) {
			int input = (int) ((Math.random() * 45) + 1);
			boolean overlap = Lotto2.overlap(ball, input);
			System.out.println(overlap);
			if (overlap) {
				i--;
				continue;
			}
			ball[i] = input;
		} // end for
		System.out.println("로또번호는" + Arrays.toString(ball) + "입니다");

		for (int j = 0; j < ball.length; j++) {
			String user = scanner.nextLine();
			System.out.println(j + 1 + "번숫자는" + ball[j]);
		}
		System.out.println("로또번호는" + Arrays.toString(ball) + "입니다");

	}
}

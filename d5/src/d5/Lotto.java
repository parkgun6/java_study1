package d5;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		
		
		int[] result = new int[6];
		
		//p1 1부터 45의 숫자를 6번뽑는다
		for (int i = 0; i < 6; i++) {
		int value = (int)(( Math.random() * 45 ) +1);
		System.out.println(value);
		result[i]=value;
		boolean checkresult = Ex1.contains(result,value);
		System.out.println(Arrays.toString(result));
		}
		//결과배열에 해당 value가 있는지 체크
		
		//없으면 결과 배열에 담는다.
		
		//있다면 다시 뽑는다.
		
	}
	
}

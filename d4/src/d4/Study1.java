package d4;

public class Study1 {
	public static void main(String[] args) {

		// 2018년 8월의날씨
		double[] date = { 40, 38, 38, 35, 34, 35, 36, 45, 33, 37 };
		double sum = 0;
		double mid = 0;
		double max = date[0];// 가장높은온도 기준
		double index = 0;
		// 루프를 돌아서 내용물을 출력
		for (int i = 0; i < date.length; i++) {
			// 전체의 합
			sum = sum + date[i];
			// 전체의 평균
			mid = sum / date.length;
			// 제일 높은 수를 구하기
			double temp = date[i];
			if (temp > max) {
				max = temp;
			}
			System.out.println(temp);
			if (date[i] > temp) {
				temp = date[i];
				index = i;
			}
		}

		System.out.println(index);
		System.out.println(sum);
		System.out.println(mid);
		// 제일 높은 수와 인덱스 번호 구하기

	}
}
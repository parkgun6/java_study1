package d5;

public class KNNEx {

	public static double calcDistance(int[] arr1, int[] arr2) {
		double distance=0;
		
		//((x2-x1)+(y2-y1))
		distance = Math.sqrt(Math.pow(arr2[0]-arr1[1],2) + Math.pow(arr2[1]-arr1[1],2));
		return distance;
	}
	public static void main(String[] args) {
		int[][] arr = {
				{6,4,1},
				{7,2,1},
				{5,2,1},
				{4,5,2},
				{3,4,2},
				{3,2,2}	
				};
		int[] targetArr = {4,2};
		
		for (int i = 0; i < arr.length; i++) {
			int[] temp = arr[i];
			double distance=KNNEx.calcDistance(temp,targetArr);
			System.out.println(distance);
			
		}
	}//main
}

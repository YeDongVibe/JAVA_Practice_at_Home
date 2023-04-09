package Practice04;

public class Test38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][5]; // 5*5 배열 선언
		int num = 1; //  초깃값 = 1
		for (int i = 0; i < arr.length; i++) { // arr의 length보다 작을 때 까지 실행.
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++; // 각 배열위치에 해당되는 곳에 num 값 저장 후 증감하여 다시 반복.
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}

	}
}
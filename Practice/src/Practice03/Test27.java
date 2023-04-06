package Practice03;

public class Test27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for 문 : 반복횟수 정해짐 : 조건을 검토한 후 실행
		for (int i = 10; i < 10; i++) {
			System.out.println("for OK");
		}

		// while 문 : 반복 횟수 정해져있지 않음? : 조건을 검토한 후 실행
		int j = 10;
		while (j < 10) {
			System.out.println("while OK");
			j++;
		}

		// do~while 문 : 무조건 실행은 한 후 조건을 검토하여 이후 진행
		int k = 10;
		do {
			System.out.println("do-while OK");
			k++;
		} while (k < 10);

		// do{
//		실행문;
//		증감식;
//	} while(조건식)

	}

}

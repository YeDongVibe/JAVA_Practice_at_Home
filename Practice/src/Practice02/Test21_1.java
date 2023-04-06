package Practice02;

public class Test21_1 {

	public static void main(String[] args) {
		int a = 12;
		int b = 2;
		char op = '+';

		switch (op) { // switch(조건식)
		case '+':
			System.out.println(a + b);
			break; // 실행을 switch~case 문의 괄호 밖으로 이동. 
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
			break;
		}

	}
}
//if~else if문과 switch~case문은 서로 상호호환 가능. 
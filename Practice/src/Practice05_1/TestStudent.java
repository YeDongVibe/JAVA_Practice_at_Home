package Practice05_1;

class Student {
	static int countStudents;// 객체수
	int sid;// 학번
	String name; // 학생 이름
	String city; // 주소 도시
	
	//생성자 호출
	public Student() {
		this(202300);
	}

	public Student(int sid) {
		this(sid, "");
	}

	public Student(int sid, String name) {
		this(sid, name, "");
	}

	public Student(int sid, String name, String city) {
		this.sid = sid;
		this.name = name;
		this.city = city;
		countStudents++; //객체수 증가
	}

	public String toString() {
		return sid + ":" + name + ":" + city;
	}

	void showStudent() {
		System.out.print("객체: ");
		System.out.println(this.toString());
	}

	static void showNumberObjects() {// 생성된 객체수를 출력한다.
		System.out.println(countStudents);
	}
}

public class TestStudent {

	public static void main(String[] args) {

		int[] a = new int[5];
		Student arry[] = new Student[5];
		Student.showNumberObjects();//현재 만들어진 객체수를 출력
		arry[0] = new Student();
		arry[1] = new Student(202301);
		arry[2] = new Student(202302, "Hong");
		arry[3] = new Student(202303, "Lee", "Busan");
		arry[4] = new Student(202304, "Na", "jeju");
		Student.showNumberObjects();//생성 후 객체수를 출력

		for (int i = 0; i < 5; i++) {
			arry[i].showStudent();// 생성된 객체 모두를 출력.
		}
	}

}

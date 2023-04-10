package Practice05;

import Practice05.student;

public class student {
	//객체 선언.
		static int countStudents;
		int sid;
		String name;
		String city;
		
		//생성자 호출
		public student() {
			this(202300);
		}

		public student(int sid) {
			this(sid, "");
		}

		public student(int sid, String name) {
			this(sid, name, "");
		}

		public student(int sid, String name, String city) {
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

		static void showNumberObjects() {
			System.out.println(countStudents);

		}

		public static void main(String[] args) {
			int[] a = new int[5]; //배열 생성.
			student arry[] = new student[5];
			showNumberObjects(); //현재 만들어진 객체수를 출력
			arry[0] = new student();
			arry[1] = new student(202301);
			arry[2] = new student(202302, "Hong");
			arry[3] = new student(202303, "Lee", "Busan");
			arry[4] = new student(202304, "Na", "jeju");
			showNumberObjects(); //생성 후 객체수를 출력
			
			for (int i = 0; i < 5; i++) { //5개의 성분 출력
				arry[i].showStudent();
			}

			}
		}
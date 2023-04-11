package Practice07;

class ProblemSub {
		private int total; //변수 선언
		private int oddsum;
		private int evnsum;
		
		public ProblemSub (int num) {
			for (int i = 1 ; i <= num ; i++) { //조건 제시
				if (i%2 == 0)	evnsum += i; //짝수일때의 값 i를 모두 더함
				else			oddsum += i; //홀수일때의(짝수 이외) 값 i를 모두 더함.
			}
			total = evnsum + oddsum; //전체 숫자 합산
		}
		public int getTotal()  { return total;	}
		public int getOddsum() { return oddsum; }
		public int getEvnsum() { return evnsum; }
	}

	public class Problem {

		public static void main(String[] args) {

			int arg = Integer.parseInt(args[0]);
			
			ProblemSub cs = new ProblemSub(arg); //생성자 선언

			System.out.println("총계 : " + cs.getTotal());
			System.out.println("짝계 : " + cs.getEvnsum());
			System.out.println("홀계 : " + cs.getOddsum());
		}

	}
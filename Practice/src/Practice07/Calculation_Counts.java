package Practice07;

public class Calculation_Counts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 152365;
		int result = 0;
		int remainder = 0; //나머지
		int counts = 0; //몫
		
		int[] arr = {50000, 10000, 5000, 1000};
		
		for(int i =0; i <arr.length; i++) {
			counts = price / arr[i]; //장수
			price %= arr[i]; //값변화
			remainder = (price - (counts*arr[i])); //남은돈
			System.out.println(counts);
			}
		
		
		
		//int omanwon = 0;
		//int illmanwon = 0;
		//int ocheonwon = 0;
		//int illchenonwon = 0;
		
		//int discount = 0;
		//int totalprice = 0;
		
//		int ohmannamnenedon = price % 50000;
//		int illmannamnendon = ohmannamnenedon % 10000;
//		int ocheonnamnendon = illmannamnendon % 5000;
//		int illchennamnenedon = ocheonnamnendon % 1000;
//		
//				
//		System.out.println(price/50000);
//		System.out.println(ohmannamnenedon/10000);
//		System.out.println(illmannamnendon/5000);
//		System.out.println(ocheonnamnendon/1000);
		
	}

}
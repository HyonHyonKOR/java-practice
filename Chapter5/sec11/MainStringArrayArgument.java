package ch05.sec11;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);
		}
		
		String str1 = args[0];
		String str2 = args[1];
		
		int x = Integer.parseInt(str1);
		int y = Integer.parseInt(str2);
		
		int result = x + y ;
		System.out.println(x + "+" +y + "=" + result);
	}
}
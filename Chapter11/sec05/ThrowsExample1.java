package ch11.sec05;

public class ThrowsExample1 {

	public static void main(String[] args)  {
	    try {
			findClass();
	    }catch(ClassNotFoundException e) {
	    	System.out.println("例外処理：" + e.toString());
	    }
		
	}//main method -> Caller JVM(X)
		
		public static void findClass() throws ClassNotFoundException{
			Class.forName("java.lang.String2");
		}//find method -> Caller main method

}//class

package ch12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) throws Exception {
		Method[] deClareMethods = Service.class.getDeclaredMethods();
		for(Method method : deClareMethods) {
			//get PrintAnnotation
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			
			printLine(printAnnotation);
			method.invoke(new Service());
			printLine(printAnnotation);
		}
	}
	
public static void printLine(PrintAnnotation printAnnotation) {
	if(printAnnotation != null) {
		//get number's value
		int number = printAnnotation.number();
		for(int i=0; i<number; i++) {
			//get value's value
			String value = printAnnotation.value();
			System.out.print(value);
		}
		System.out.println();
	}
}
	

}

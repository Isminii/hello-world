package gr.upatras.junit.myfirst;

public class MyMain {
	
	public static void main(String[] args) {
		
		MyClass s = new MyClass();
		String result = s.subtraction(5, 2);
		System.out.println("result is " + result);
	}
}

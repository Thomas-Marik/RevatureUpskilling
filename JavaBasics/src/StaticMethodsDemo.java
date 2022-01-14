
public class StaticMethodsDemo {

	public static void main(String[] args) {
		System.out.println("Inside Main");
		StaticMethodsDemo.method1();
		System.out.println("Back in MAin");

	}

	static void method1() {
		System.out.println("Inside method 1");
		StaticMethodsDemo.method2();
		System.out.println("Back in method 1");
	}
	static void method2() {
		System.out.println("Inside Method2");
	}
}

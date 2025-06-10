package day3;

class superclass {

	void method1() {

		System.out.println("subclass ");

	}

}

class subclass1 extends superclass {

	void method2() {

		System.out.println("subclass 1");

	}

}

class subclass2 extends superclass {

	void method3() {

		System.out.println("subclass 2");

	}

}

public class Multilevel {

	public static void main(String[] args) {

		subclass2 ref = new subclass2();

		ref.method3();

		ref.method1();

	}

}
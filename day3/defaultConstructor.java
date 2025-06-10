package day3;

public class defaultConstructor {

	String name;

	int year;

	defaultConstructor(String name, int year) {

		this.name = name;

		this.year = year;
	}

	defaultConstructor(defaultConstructor copy) {

		this.name = copy.name;

		this.year = copy.year;

	}

	void diplay() {

		System.out.println("DefaultConstructor:" + name + " " + year);

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println("original cont");

		defaultConstructor ref = new defaultConstructor("java", 1995);

		ref.diplay();

		System.out.println("copy cont");

		defaultConstructor ref2 = new defaultConstructor(ref);

		ref2.diplay();

	}

}
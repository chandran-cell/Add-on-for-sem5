package day4;//method overriding

class Laptop{
	void Os() {
		System.out.println("windows 10");
	}
}

class Update extends Laptop{
	void Os() {
		System.out.println("windows 11");
	}
}


public class main {

	public static void main(String[] args) {
		Update u=new Update();
		u.Os();
	}

}

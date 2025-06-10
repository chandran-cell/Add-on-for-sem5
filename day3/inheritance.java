package day3;
/*class Animal {
	void sound() {
		System.out.println("Animals Make sounds");
		
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog barks.");
	}
}


public class inheritance {
	public	static	void main(String[]args) {
		Dog d1=new Dog();
		d1.sound();
		d1.bark();
	}

}*/



class animal {
	void sound() {
		System.out.println("Animals Make sounds");
		
	}
}
class Dog extends animal{
	void bark() {
		System.out.println("Dog barks.");
	}
}
class Cat extends Dog{
	void meow() {
		System.out.println("Cat Meows.");
		
	}
}


public class inheritance {
	public	static	void main(String[]args) {
		
		Cat cat=new Cat();
		cat.sound();
		cat.bark();
		cat.meow();
		
		
	}

}
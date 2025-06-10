package day4java;
 abstract class student {
	abstract void m1();
 }
 
 class display extends student{
	void m1() {
		System.out.println("haii");
	} 
 }


class main{
	public static void main(String[] args) {
		
display d=new display();
d.m1();

	}
	}


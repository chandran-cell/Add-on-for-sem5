package day4;
interface studentone{
	abstract void m1();
}



interface studenttwo{
	abstract void m1();
}

class Execute implements  studentone,studenttwo{
	public void m1(){
		System.out.println(" hi...");
		
	}
	public void m2(){
		System.out.println(" hi2...");
		
	}
}


public class MultipleInheritance {

	public static void main(String[] args) {
		Execute in=new Execute();
		in.m1();
		in.m2();
		
	}

}

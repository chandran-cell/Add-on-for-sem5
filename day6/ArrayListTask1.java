package day6;
import java.util.*;

public class ArrayListprg {

	public static void main(String[] args) {
		ArrayList<Object> arr=new ArrayList<Object>();
		
		
		arr.add("ram");
		//add
		arr.add("A");
		arr.add("computerScience");
		arr.add("3 Year");
		//set
		arr.set(0,"Hari");
		//add index value
		arr.add(4,"new");
		//get
		arr.get(0);
		//remove
		arr.add("B");
		arr.remove(5);
		
		
		
		for(Object data:arr) {
			System.out.println(data);
		}
		
	}

}

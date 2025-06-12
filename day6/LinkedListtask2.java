package day6;
import java.util.*;

public class LinkedListtask2 {

	public static void main(String[] args) {
		LinkedList<Object> vn=new 	LinkedList();
		
		
		vn.add("ram");
		//add
		vn.add("A");
		vn.add("computerScience");
		vn.add("3 Year");
		//set
		vn.set(0,"Hari");
		//add index value
		vn.add(4,"new");
		//get
		vn.get(0);
		//remove
		vn.add("B");
		vn.remove(5);
		
		
		
		for(Object data:vn) {
			System.out.println(data);
		}
		
	}

}

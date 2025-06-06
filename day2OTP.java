package day2;

import java.util.Random;
import java.util.*;
class Main {
    static int OTP(){
        Random ran = new Random();
        return 1000 + ran.nextInt(5000);
        
        
    }
    public static void main(String[] args) {
    	long b=1234567890;
    	System.out.println("enter number:");
    	Scanner num=new Scanner(System.in);
    	long  a =num.nextLong();
    	if(a==b) {
        
        int otp=OTP();
        
        System.out.println("one time password is"+otp);
    	}else {
    		System.out.println("invalid number... enter this 1234567890");
    	}
    }
}

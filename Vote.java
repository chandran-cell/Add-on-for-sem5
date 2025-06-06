import java.util.*;
class vote
    {
    public static void main(String[] args) {

        System.out.println("enter you age");
        Scanner ref=new Scanner(System.in);
        int a=ref.nextInt();
         System.out.println("enter you weight");
        Scanner weight=new Scanner(System.in);
        int b=weight.nextInt();
        if(a>=18&&b>=50){
          System.out.println("you are eligible for blood donation");
         } 
         else{
            System.out.println("you are not eligible for blood donation");
         }
    }
}
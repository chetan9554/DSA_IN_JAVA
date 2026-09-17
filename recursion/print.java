import java.util.*;
public class print{
    public static void decreasing(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
         decreasing(n-1);
        System.out.println(n);
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        decreasing(n);
    }
}
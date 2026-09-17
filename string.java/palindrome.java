import java.util.*;
public class palindrome{
    public static boolean palin(String str){
        int n=str.length();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
            
                return true;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter new string:");
        String str=sc.nextLine();
        
        System.out.println(palin(str));
    }
}
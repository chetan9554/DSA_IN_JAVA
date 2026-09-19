import java.util.*;
public class oddnumber{
    public static String odd(String s){
        for(int i=s.length()-1;i>=0;i--){
            int digit=s.charAt(i)-'0';
            if(digit % 2!=0){
                return s.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string ");
        String s=sc.nextLine();
        System.out.println(odd(s));

    }
}

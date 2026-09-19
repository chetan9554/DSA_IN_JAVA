import java.util.*;
public class wordreverse{
    public static String reverse(String s){
        String word[]=s.trim().split("\\s+");
        StringBuilder ans=new StringBuilder();
        for(int i=word.length-1;i>=0;i--){
            ans.append(word[i]);
            if(i!=0){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        System.out.println(reverse(s));

    }
}
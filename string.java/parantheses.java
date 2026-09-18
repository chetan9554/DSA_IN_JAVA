import java.util.*;
public class parantheses{
    public static String paran(String s){
        StringBuilder ans=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                count++;
            
            if(count>1){
                ans.append(ch);
            }
        }
            else{
                count--;
            
            if(count>0){
                ans.append(ch);
            }
        }
    }
        return ans.toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String s=sc.nextLine();
        System.out.println(paran(s));
    }
}
import java.util.*;
public class reverse{
    public static void main(String args[]){
        String s="aditya";
    //     char arr[]=s.toCharArray();
        int i=0, j=s.length()-1;
    //     while(i<j){
    //         char temp=arr[i];
    //         arr[i]=arr[j];
    //         arr[j]=temp;
    //         i++;
    //         j--;
    //     }
    //     String a=new String(arr);
    //     System.out.println(a);
    // 
    StringBuilder sb=new StringBuilder(s);
    while(i<j){
    char temp1=sb.charAt(i);
    sb.setCharAt(i,sb.charAt(j));
    sb.setCharAt(j,temp1);
    i++;
    j--;
    }
    System.out.println(sb);
    }
}
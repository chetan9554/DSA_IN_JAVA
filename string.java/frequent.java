import java.util.*;
public class frequent{
    public static char freq(String s){
    int freq[]=new int[26];
    //frequency count
    for(int i=0;i<s.length();i++){
        freq[s.charAt(i)-'a']++;
    }
    //find maximum frequency
    int max=0;
    char ans=' ';
    for(int i=0;i<26;i++){
         if(freq[i]>max){
            max=freq[i];
            ans=(char)(i+'a');
         }
    }
    return ans;
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter string");
    String s=sc.nextLine();
    System.out.println(freq(s));
}
}
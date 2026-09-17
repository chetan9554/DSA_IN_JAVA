import java.util.*;
public class constructor{
    String name;
    int roll;
//     constructor(){
//         System.out.println("constructor is called");
//     }
//     constructor(String name,int roll){
//         this.name=name;
//         this.roll=roll;
//     }
//     // void display(){
//     //     System.out.println(name);
//     //     System.out.println(roll);
//     // }
//     public static void main(String args[]){
//         constructor c1=new constructor();
//         constructor c2=new constructor("chetan",59);
//         // System.out.println(c2.name);
//         // System.out.println(c2.roll);
//         // c2.display();
//     }
// }
constructor(String name,int roll){
    this.name=name;
    this.roll=roll;
}
constructor(constructor s1){
    this.name=s1.name;
    this.roll=s1.roll;
}
public static void main(String args[]){
    constructor s1=new constructor("chetan",59);
    constructor s2=new constructor(s1);
    System.out.println(s2.name);
    System.out.println(s2.roll);
}

}
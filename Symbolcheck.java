package com.myfirstjava.program;
import java.util.Scanner;

public class Symbolcheck {
    Scanner a=new Scanner(System.in);
     void read()
     { 
     System.out.println("Menu:"+'\n'+"1.Test given character"+'\n'+"2.Exit");
	 System.out.println("Enter choice:");
	 int ch=a.nextInt();
	 switch(ch)
	 {
	 case 1: System.out.println("\n enter a word:");
             char s = a.next().toCharArray()[0];
             check(s);
             break;
	 case 2:
		 System.exit(0) ;
     default : System.out.println("enter valid choice");
     }
     }
 void check(char c) {
     if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
         if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                 || c == 'U')
             System.out.println(c+" is vowels");
         else
             System.out.println(c+" is Consonant");
     } else if (c > 48 && c < 57)
         System.out.println(c+" is Number ");
     else
         System.out.println(c+" is Special symbol ");
 }

 public static void main( String[] args) {
      Symbolcheck m = new Symbolcheck();
      for(;;)
        m.read();
     
    }
}
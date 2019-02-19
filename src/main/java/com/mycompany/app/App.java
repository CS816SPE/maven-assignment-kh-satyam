package com.mycompany.app;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App
  {
    public static void main(String args[])
     {
        String s2 = args[1];
        char ch = s2.charAt(0);
        int i,j,total = 0;
        i = Integer.parseInt(args[0]);
        j = Integer.parseInt(args[2]);
        
        
        switch(ch)
        {
        case '+' :
            total = i + j;
            break;
        case '*' :
             total = i *j;
             System.out.println("Multiply");
             break;
                // other symbols to be included later...
        }
        
        System.out.println(args[0] + ch + args[2] + " " + total);     
    }
}

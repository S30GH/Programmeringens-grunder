/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author svph1820
 */
public class TestNull {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //   float f = 12.5F;
        //    int i = (int)f;
        //    System.out.println("f is " + f);
        //    System.out.println("i is " + i);

        /*    double d = 234.56;
        System.out.println(d);
        int e = (int) d;
        System.out.println(e);
         */
        String s1 = "Welcome to Java";
        String s2 = "Programming is fun";
        String s3 = "Welcome to Java";
        int i = s1.length();
        
//Övning 4.4.2        
        char c = s1.charAt(s1.length() - 1);
        System.out.println(c);        
        
//Övning 4.4.1
        System.out.println(s1.substring(5, 11));
        
//Övning 4.4.3
        System.out.println("1" + 1);
        System.out.println('1' + 1);
        System.out.println("1" + 1 + 1);
        System.out.println("1" + (1 + 1));
        System.out.println('1' + (1 + 1));
        
//Övning 4.4.4
        System.out.println(1 + "Welcome " + ('\u0001' + 1));
        System.out.println(1 + "Welcome " + 'a' + 1);

    }

}

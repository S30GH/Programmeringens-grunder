/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;

/**
 *
 * @author svph1820
 */
public class Test292 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Programmet beräknar resten som blir kvar " + 
                "när vi delar första värdet med andra värdet");
        System.out.println("Skriv in första värdet");
        int variabel1 = input.nextInt();
        System.out.println("Skriv in andra värdet");
        int variabel2 = input.nextInt();
        int remainder = variabel1 % variabel2;
        System.out.println("Resten är " + remainder);
        
    }
    
}

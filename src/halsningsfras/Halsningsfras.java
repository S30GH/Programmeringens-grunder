package halsningsfras;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author svph1820
 */
public class Halsningsfras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ber om ditt namn och skriver ut en hälsning och en kommentar
        System.out.println("Vad heter du? Skriv ditt namn och tryck på Enter");
        Scanner scanner = new Scanner(System.in);
        String namnet = scanner.nextLine();
        System.out.println("Hej " + namnet);
        System.out.println("Vilket fint namn!");
    }

}

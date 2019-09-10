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
public class TestListing27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinute = totalSeconds / 60;
        long currentMinute = totalMinute % 60;
                
        System.out.println(currentMinute);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps1p1;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Ps1p1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the number of days:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        int yrs=num/365;
        int weeks=(num%365)/7;
        int days=(num%365)%7;
        
        System.out.println("Years is:"+yrs);
        System.out.println("weeks is:"+weeks);
        System.out.println("days is:"+days);
        
    }
    
}

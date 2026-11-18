/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sales_reportproduct;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Sales_reportproduct {
   
    public static void main(String[] args) {
        // creating the scanner class
        Scanner scan = new Scanner(System.in);
        
        String name[] = {"Cozy Nights Monarch Mattress","Restonic Barbados Mattress","Sealy Phuket Mattress"};
        //[3][2]
        int [][] company = new int[3][2];
        //int[][] mattress = {25,18,20}; Cozy Nights Monarch Mattress
                              //{15,10,12};Cozy Nights Monarch Mattress
                              //{18,15,20};Cozy Nights Monarch Mattress
                              
//Asking the user for the values

System.out.println("Enter the number of sales for month 1  Cozy Nights Monarch Mattress ");
company[0][1] = scan.nextInt();
System.out.println("Enter the number of sales for month 2 Cozy Nights Monarch Mattress");
company[0][2] = scan.nextInt();
System.out.println("Enter the number of sales for month 3  Cozy Nights Monarch Mattress ");
company[0][3] = scan.nextInt();

System.out.println("Enter the number of sales for month 1 for Restonic Barbados Mattress");
company[1][0] = scan.nextInt();
System.out.println("Enter the number of  sales for month 2 for Restonic Barbados Mattress");
company[1][1] = scan.nextInt();
System.out.println("Enter the number of sales for month 3 for Restonic Barbados Mattress");
company[1][2] = scan.nextInt();

System.out.println("Enter the number of sales for month 1 for Sealy Phuket Mattress");
company[2][0] = scan.nextInt();
System.out.println("Enter the number of sales for month 2 for Sealy Phuket Mattress");
company[2][1] = scan.nextInt();
System.out.println("Enter the number of sales for month 3 for Sealy Phuket Mattress");
company[2][2] = scan.nextInt();

// Calculate totals per mattress

int[] mattressTotals = new int[3];
        for (int i = 0;i < 3; i++) {
            mattressTotals[i] = company[i][0] + company[i][1];
            
        }
        
        // Find the company with the most sold mattress
        
        int maxIndex = 0;
        for (int i = 0; i < 3; i++) {
            maxIndex =i;
        }
        
        System.out.println(); {
    }
    
    System.out.println();
    System.out.println(" MATTRESS REPORT");
    System.out.println("----------------------------------------------");
    System.out.printf("%-20s%-15S%-15s%n","","COZY NIGHT MONARCH","RESTONIC BARBADOS,SEALY PHUKET");
    System.out.println("----------------------------------------------");
    
    for (int i= 0; i < 3; i++) {
    System.out.printf("20%s-15d%n",company [i], company[i][0], company[i][1]);
}


    System.out.println("----------------------------------------------"); 
    System.out.printf(" MATTRESS WITH THE TOTAL PRODUCT SOLD FOR EACH company");
    System.out.println("----------------------------------------------");
    
for (int i = 0; i < 3; i++) {
            Object[][] mattress;
    System.out.printf("%-20s%d%n",company[i]);

}

 System.out.println("------------------------------------------------------------"); 
    System.out.printf("company with the most product based on the highest total sales: " + company [maxIndex]);
    System.out.println("----------------------------------------------------------");
    
scan.close();


    }
}

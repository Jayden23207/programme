/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.products;

/**
 *
 * @author Student
 */public abstract class Products implements iProducts {

    public static void main(String[] args) {
        // Calculate totals per mattress

int[] mattressTotals = new int[3];
        int[][] company = null;
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
    



    }
}

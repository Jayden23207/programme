/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Student
 */
public class Localcompany {

    private String CustomerName;
    private String ProductName;
    private int CommissionAmount;
    private int TotalSaleAmount;
    public Localcompany(String ProductName,int CommissionAmount, double TotalSaleAmount) {
        this.ProductName = ProductName;
        this.CommissionAmount = CommissionAmount;
        this.TotalSaleAmount = (int) TotalSaleAmount;
        
    }
    

public String getCustomerName() { 
    return CustomerName;
    
}

}

public int getCommissionAmount() {
    return CommissionAmount;
}

public double TotalSaleAmount() {
    return TotalSaleAmount;
    
    
}

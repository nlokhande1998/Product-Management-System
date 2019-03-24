/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

/**
 *
 * @author Hriday
 */
public class Order {
    private String ord_id, prod_name, cust_id, quant,tot_price,ord_stat,cust_add;
    
    public Order(String OrderID,String CustomerID,String ProductName,String Quantity,String TotalPrice,String OrderStatus,String CustomerAdd){
        this.ord_id=OrderID;
        this.cust_id=CustomerID;
        this.prod_name=ProductName;
        this.quant=Quantity;
        this.tot_price = TotalPrice;
        this.ord_stat = OrderStatus;
        this.cust_add = CustomerAdd;
                
    }
    public String getcust_id(){
        return cust_id;
    }
    public String getord_id(){
        return ord_id;
    }
    public String getprod_name(){
        return prod_name;
    }
    public String getcust_add(){
        return cust_add;
    }
    public String getquant(){
        return quant;
    }
    public String gettot_price(){
        return tot_price;
    }
    public String getorder_stat(){
        return ord_stat;
    }
}

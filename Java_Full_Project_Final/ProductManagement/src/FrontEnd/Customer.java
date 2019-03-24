/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

/**
 *
 * @author admin
 */
class Customer {
    private String cust_id, cust_name, cust_ph, cust_add;
    
    public Customer(String Customer_ID,String Customer_Name,String Customer_Phone,String Customer_Address ){
        this.cust_id=Customer_ID;
        this.cust_name=Customer_Name;
        this.cust_ph=Customer_Phone;
        this.cust_add=Customer_Address;
    }
    public String getcust_id(){
        return cust_id;
    }
    public String getcust_name(){
        return cust_name;
    }
    public String getcust_ph(){
        return cust_ph;
    }
    public String getcust_add(){
        return cust_add;
    }
}

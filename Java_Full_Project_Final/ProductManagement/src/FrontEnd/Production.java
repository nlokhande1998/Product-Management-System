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
class Production {
     private String prod_id, rawmat;
    private String quant, rawmatquan;
    private String costp;
    
    public Production(String Product_ID,String RawMat_Name,String Quantity,String RawMat_Quantity, String Cost_Price){
        this.prod_id=Product_ID;
        this.rawmat=RawMat_Name;
        this.quant=Quantity;
        this.rawmatquan=RawMat_Quantity;
        this.costp=Cost_Price;
      
    }
    public String getprod_id(){
        return prod_id;
    }
    public String getrawmat(){
        return rawmat;
    }
    public String getrawmatquan(){
        return rawmatquan;
    }
    public String getcostp(){
        return costp;
    }
    public String getquant(){
        return quant;
    }
   
    
}

    


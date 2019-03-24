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
class Product {
    private String prod_id, prod_name;
    private Integer quant, sp, cp;
    private Float percent;
    
    public Product(String Product_ID,String Product_Name,Integer Quantity_Available,Integer Selling_Price, Integer Cost_Price, Float Profit_Percent ){
        this.prod_id=Product_ID;
        this.prod_name=Product_Name;
        this.quant=Quantity_Available;
        this.sp=Selling_Price;
        this.cp=Cost_Price;
        this.percent=Profit_Percent;
    }
    public String getprod_id(){
        return prod_id;
    }
    public String getprod_name(){
        return prod_name;
    }
    public Integer getquant(){
        return quant;
    }
    public Integer getsp(){
        return sp;
    }
    public Integer getcp(){
        return cp;
    }
    public Float getpercent(){
        return percent;
    }
    
}

package MainPackage;


import FrontEnd.CustDetails;
import FrontEnd.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Main {
    public static String SqlLoginID;
    public static String SqlPassword;
    
    public static PM_FrontPage form_main = new PM_FrontPage();
    public static SQL_DataBaseLoginDialoge sql_log = new SQL_DataBaseLoginDialoge(null,true);
    public static CustDetails customerdet = new CustDetails(null,true);
    public static OrderDetails orddets = new OrderDetails(null,true);
    public static ProductionDetails productiondets = new ProductionDetails(null,true);
    public static Prod_Details productdets = new Prod_Details(null,true);
    public static Add_ManufactDetails addmandet = new Add_ManufactDetails(null,true);
    public static ProductDetails proddetsing = new ProductDetails(null,true);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        sql_log.setVisible(true);
    }
    
}

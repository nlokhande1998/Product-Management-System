/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FrontEnd;

import MainPackage.*;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hriday
 */
public class SQL_DataBaseLoginDialoge extends javax.swing.JDialog {

    /** Creates new form SQL_DataBaseLoginDialoge */
    public SQL_DataBaseLoginDialoge(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sql_idtxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        database_id1 = new javax.swing.JLabel();
        database_id = new javax.swing.JLabel();
        sql_passtxt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)), "Database Access", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 20), new java.awt.Color(255, 51, 0))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(496, 209));
        jPanel1.setMinimumSize(new java.awt.Dimension(496, 209));
        jPanel1.setName("SQL Login"); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 0));
        jButton1.setText("Access Database");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        database_id1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        database_id1.setForeground(new java.awt.Color(255, 255, 0));
        database_id1.setText("Password");

        database_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        database_id.setForeground(new java.awt.Color(255, 255, 0));
        database_id.setText("Database ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(database_id, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(database_id1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sql_idtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(sql_passtxt))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sql_idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(database_id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(database_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sql_passtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String sqlid = sql_idtxt.getText();
        String sqlpass = sql_passtxt.getText();
        
        if(sqlid == ""){
             JOptionPane.showMessageDialog(this, "Error Username cannot be blank", "Fatal Error", JOptionPane.ERROR_MESSAGE);
       
        }
        else{
        Main.SqlLoginID = sqlid;
        Main.SqlPassword = sqlpass;
        
        
        
        checkdatabase(sqlid,sqlpass,"pm_log","emp_login","emp_id varchar(20),emp_pass varchar(20),primary key(emp_id)");
        checkdatabase(sqlid,sqlpass,"pm_log","emp_details","emp_id varchar(20),emp_name varchar(30),emp_mobnum bigint(20),emp_email varchar(30),emp_address varchar(100),foreign key(emp_id) references emp_login(emp_id)");
        checkdatabase(sqlid,sqlpass,"pm_log","admin_login","admin_id varchar(20),admin_pass varchar(20),primary key(admin_id)");
        createAdmin(Main.SqlLoginID,Main.SqlPassword);
        checkdatabase(sqlid,sqlpass,"customer","cust_details","customer_id varchar(20),customer_name varchar(30),customer_phone bigint(20),customer_address varchar(50),primary key(customer_id)");
        checkdatabase(sqlid,sqlpass,"customer","order_details","order_id varchar(20), customer_id varchar (20), product_name varchar(20), quantity int, total_price int, order_status varchar(20), customer_address varchar(20), primary key(order_id),foreign key(customer_id) references cust_details(customer_id)");
        checkdatabase(sqlid,sqlpass,"product","product_details","product_id varchar(20),product_name varchar(30),quantity_availabe int,selling_price int,cost_price int,profit_percent float(5,2),primary key(product_id)");
        checkdatabase(sqlid,sqlpass,"product","manufact_details","product_id varchar(20),quantity int,rawmaterial_name varchar(30),rawmaterial_quantity int,cost_price float(8,2),foreign key(product_id) references product_details(product_id)");
        
        this.setVisible(false);
        Main.form_main.setVisible(true);
        
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void checkdatabase(String sqlid,String sqlpass,String database,String tablename,String variables){
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;
            DatabaseMetaData md = null;
           
            try{ 
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/",sqlid,sqlpass);
                st=con.createStatement();
                st.executeUpdate("create database if not exists "+database+";");
                st.executeQuery("use "+database);
                st.executeUpdate("create table if not exists "+tablename+"("+variables+")"+";");
                
                
            
             }catch(SQLException | HeadlessException ex){
                JOptionPane.showMessageDialog(null,ex);
            }
    
    }
    
    public void createAdmin(String sqlid,String sqlpass){
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;
            
            try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pm_log",sqlid,sqlpass);
            st=con.createStatement();
            rs = st.executeQuery("select * from admin_login where admin_id = 'admin'");
            if(!rs.next()){
            String createadm="insert into admin_login values('admin','admin');";
             st.executeUpdate(createadm);}
            else{
            
            }
            }catch(SQLException | HeadlessException ex){
            
            
            }
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SQL_DataBaseLoginDialoge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SQL_DataBaseLoginDialoge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SQL_DataBaseLoginDialoge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SQL_DataBaseLoginDialoge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SQL_DataBaseLoginDialoge dialog = new SQL_DataBaseLoginDialoge(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel database_id;
    private javax.swing.JLabel database_id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField sql_idtxt;
    private javax.swing.JPasswordField sql_passtxt;
    // End of variables declaration//GEN-END:variables

}

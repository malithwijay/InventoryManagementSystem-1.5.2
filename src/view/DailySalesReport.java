/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Database;
import java.awt.Color;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author malith
 */
public class DailySalesReport extends javax.swing.JFrame {

    /**
     * Creates new form DailySalesReport
     */
    public DailySalesReport() {
        initComponents();
        setBackground(new Color (0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder = new view.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DailySalesReportYearChooser = new com.toedter.calendar.JYearChooser();
        btnDailySalesReportSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDailySalesReport = new javax.swing.JTable();
        DailySalesReportClose = new javax.swing.JLabel();
        btnDailySalesReportPrint = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        DailySalesReportMonthChooser = new com.toedter.calendar.JMonthChooser();
        jLabel4 = new javax.swing.JLabel();
        DailySalesReportDayChooser = new com.toedter.calendar.JDayChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelBorder.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("   Daily Sales Report ");

        jLabel2.setText("Select Month");

        btnDailySalesReportSearch.setBackground(new java.awt.Color(51, 153, 255));
        btnDailySalesReportSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnDailySalesReportSearch.setText("Search");
        btnDailySalesReportSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDailySalesReportSearchActionPerformed(evt);
            }
        });

        tblDailySalesReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sale ID", "Date", "Client Type", "Client Name", "Total Sale", "Total Return", "Net Sale"
            }
        ));
        jScrollPane1.setViewportView(tblDailySalesReport);

        DailySalesReportClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closeLogin.png"))); // NOI18N
        DailySalesReportClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DailySalesReportCloseMouseClicked(evt);
            }
        });

        btnDailySalesReportPrint.setBackground(new java.awt.Color(51, 51, 255));
        btnDailySalesReportPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnDailySalesReportPrint.setText("Print");
        btnDailySalesReportPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDailySalesReportPrintActionPerformed(evt);
            }
        });

        jLabel3.setText("Select Year");

        jLabel4.setText("Select Day");

        DailySalesReportDayChooser.setMinimumSize(new java.awt.Dimension(300, 80));

        javax.swing.GroupLayout panelBorderLayout = new javax.swing.GroupLayout(panelBorder);
        panelBorder.setLayout(panelBorderLayout);
        panelBorderLayout.setHorizontalGroup(
            panelBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderLayout.createSequentialGroup()
                .addGroup(panelBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorderLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DailySalesReportClose))
                    .addGroup(panelBorderLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(panelBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorderLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 94, Short.MAX_VALUE))
                            .addGroup(panelBorderLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DailySalesReportYearChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DailySalesReportMonthChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DailySalesReportDayChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDailySalesReportSearch)
                                .addGap(103, 103, 103)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDailySalesReportPrint)
                .addGap(151, 151, 151))
        );
        panelBorderLayout.setVerticalGroup(
            panelBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DailySalesReportClose))
                .addGap(31, 31, 31)
                .addGroup(panelBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorderLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))
                            .addComponent(DailySalesReportMonthChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(DailySalesReportYearChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(btnDailySalesReportSearch)
                    .addComponent(DailySalesReportDayChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDailySalesReportPrint)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDailySalesReportSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDailySalesReportSearchActionPerformed
        // TODO add your handling code here:
        int year = DailySalesReportYearChooser.getYear();
        int month = DailySalesReportMonthChooser.getMonth();
        int day = DailySalesReportDayChooser.getDay();
        String startDate = year+"-"+(month+1)+"-"+day;
        String endDate = year+"-"+(month+1)+"-"+day;
        sDate = startDate;
        eDate = endDate;
        loadSaleReportTable("select * from tb_invoice where date between '"+startDate+"' and '"+endDate+"'");
        DefaultTableModel tmodel = (DefaultTableModel)tblDailySalesReport.getModel();
        if(tmodel.getRowCount()<=0)
        {
            JOptionPane.showMessageDialog(this, "No Data Found on Year : "+year+" Month : "+month+" Day : "+day,"No Data",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDailySalesReportSearchActionPerformed

    private void loadSaleReportTable(String sql)
    {        
        DefaultTableModel tmodel = (DefaultTableModel)tblDailySalesReport.getModel();
        tmodel.setRowCount(0);
        Database db = new Database();
        ResultSet rs = db.selectData(sql);
        try {
            while(rs.next())
            {
                String invNo = String.valueOf(rs.getInt("InvoiceNO"));
                String type = rs.getString("Type");                
                String netSale = String.valueOf(rs.getDouble("NetAmount"));
                String date = String.valueOf(rs.getDate("Date"));
                String clientName = "";
                double dealerReturnAmount = 0.0;
                double customerReturnAmount = 0.0;
                double totalReturns = 0.0;
                String totalSale = "";
                if(type.equals("Customer"))
                {
                    ResultSet rs1 = db.selectData("SELECT * FROM tb_customer WHERE CusNIC in (SELECT CusNIC FROM tb_invoice WHERE InvoiceNO="+invNo+")");
                    if(rs1!=null)
                    {
                        while(rs1.next())
                        {
                            clientName = rs1.getString("CusName");
                        }
                    }                    
                }
                else
                {
                    ResultSet rs1 = db.selectData("select * from tb_dealer where DID in (SELECT DID FROM tb_dealerorder WHERE InvNO="+invNo+")");
                    if(rs1!=null)
                    {
                        while(rs1.next())
                        {
                            clientName = rs1.getString("DName");
                        }
                    }  
                }
                ResultSet rs2 = db.selectData("SELECT sum(Amount) as dealerReturnAmount FROM tb_dealerreturn WHERE InvNO="+invNo+"");
                if(rs2!=null)
                {
                    while(rs2.next())
                    {
                        dealerReturnAmount = rs2.getDouble("dealerReturnAmount");
                    }                    
                }
                ResultSet rs3 = db.selectData("SELECT sum(Amount) as customerReturnAmount FROM tb_customerreturn WHERE InvNO="+invNo+"");
                if(rs3!=null)
                {
                    while(rs3.next())
                    {
                        customerReturnAmount = rs3.getDouble("customerReturnAmount");
                    }                    
                }
                totalReturns = dealerReturnAmount+customerReturnAmount;
                double netSaleAmount = Double.parseDouble(netSale);
                
                DecimalFormat df = new DecimalFormat("0.00");
                
                String tbData[] = {invNo,date,type,clientName,df.format(totalReturns+netSaleAmount),df.format(totalReturns),df.format(netSaleAmount)};
                tmodel.addRow(tbData);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage()+" Cannot Load Sales Details Try Again","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void DailySalesReportCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DailySalesReportCloseMouseClicked
        this.dispose();
        
        new StaticSalesReportMenu().setVisible(true);
    }//GEN-LAST:event_DailySalesReportCloseMouseClicked

    private String sDate = "";
    private String eDate = "";
    
    private void btnDailySalesReportPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDailySalesReportPrintActionPerformed
        if(tblDailySalesReport.getRowCount()<=0)
        {
            JOptionPane.showMessageDialog(this, "Report Data Seems Empty Printing not Available","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            this.setAlwaysOnTop(false);
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String aboutText="<tr style=\"border : solid 1pt #000000; border-collapse: collapse;\"> <td><p>Starts From : </p></td> <td><p>"+sDate+"</p></td> <td><p>Ends From : </p></td> <td><p>"+eDate+"</p></td> </tr>\n";
            printReport(aboutText);
        }
    }//GEN-LAST:event_btnDailySalesReportPrintActionPerformed

    private String username="";
    public void setUserName(String uName)
    {
        username = uName;
    }
    
    private void printReport(String about)
    {
        Date now = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String itemData = "";
        DecimalFormat decf = new DecimalFormat("0.00");
        double totSale = 0.0;
        double totReturn = 0.0;
        double netSale = 0.0;
        for(int c=0; c<tblDailySalesReport.getRowCount();c++)
        {
            totSale = totSale + Double.parseDouble(tblDailySalesReport.getValueAt(c, 4).toString());
            totReturn = totReturn + Double.parseDouble(tblDailySalesReport.getValueAt(c, 5).toString());
            netSale = netSale + Double.parseDouble(tblDailySalesReport.getValueAt(c, 6).toString());
            if(itemData.equals(""))
            {
                itemData = "<tr><td><p>"+tblDailySalesReport.getValueAt(c, 0).toString()+"</p></td><td><p>"+tblDailySalesReport.getValueAt(c, 1).toString()+"</p></td><td><p>"+tblDailySalesReport.getValueAt(c, 2).toString()+"</p></td><td><p>"+tblDailySalesReport.getValueAt(c, 3).toString()+"</p></td><td><p>"+tblDailySalesReport.getValueAt(c, 4).toString()+"</p></td><td><p>"+tblDailySalesReport.getValueAt(c, 5).toString()+"</p></td><td><p>"+tblDailySalesReport.getValueAt(c, 6).toString()+"</p></td></tr>\n";
            }  
            else
            {
                itemData = itemData + "<tr><td><p>"+tblDailySalesReport.getValueAt(c, 0).toString()+"</p></td><td><p>"+tblDailySalesReport.getValueAt(c, 1).toString()+"</p></td><td><p>"+tblDailySalesReport.getValueAt(c, 2).toString()+"</p></td><td><p>"+tblDailySalesReport.getValueAt(c, 3).toString()+"</p></td><td><p>"+tblDailySalesReport.getValueAt(c, 4).toString()+"</p></td><td><p>"+tblDailySalesReport.getValueAt(c, 5).toString()+"</p></td><td><p>"+tblDailySalesReport.getValueAt(c, 6).toString()+"</p></td></tr>\n";
            }
        }
        String reportText = "<html>\n" +
                            "    <head>\n" +
                            "        <style>\n" +
                            "            p{font-family: 'Times New Roman', Times, serif;font-size: 11pt; text-align: left;}\n" +
                            //"            td {border : solid 1pt #000000; border-collapse: collapse;}\n" +
                            "            table{border : solid 1pt #000000; border-collapse: collapse;}\n" +
                            "        </style>\n" +
                            "    </head>\n" +
                            "    <body>\n" +
                            "        <table style=\"width: 100%;\">\n" +
                            "            <tr><td><h1 style=\"font-family: 'Times New Roman', Times, serif; font-size: 18pt; text-align: center;\">Daily Sales Report</h1></td></tr>\n" +
                            "            <tr aria-rowspan=\"3\">\n" +
                            "                <td><p>Multi Engineering Services Lanka Private Limited<br>No.466/7A Thapowanaya Road, Aggona<br>Sri Lanka.<br>Tel : 0112 794 959, 0114 558 559</p></td>\n" +
                            "            </tr>\n" +
                            //"            <tr><td><p style=\"text-align: center;\">Daily Sales Report<!--report name--></p></td></tr>\n" +
                            "\n" +
                            "            <!--report header details starts here-->\n" +
                            "            <tr>\n" +
                            "                <td>\n" +
                            "                    <table style=\"width: 100%;\">\n" +
                            "                        <tr style=\"border : solid 1pt #000000; border-collapse: collapse;\"> <td><p>Generated By,</p></td> <td><p>"+username+"</p></td> <td><p>Date : </p></td> <td><p>"+df.format(now)+"</p></td> </tr>\n" +
                            "                        "+about+"" +
                            "                    </table>\n" +
                            "                </td>\n" +
                            "            </tr>\n" +
                            "            <tr><td style=\"height: 12pt;\"><p></p></td></tr>\n" +
                            "\n" +
                            "            <!--data table starts here-->\n" +
                            "            <tr>\n" +
                            "                <td>\n" +
                            "                    <table style=\"width: 100%;\">\n" +
                            "                        <tr style=\"border : solid 1pt #000000; border-collapse: collapse;\"><td ><p>Invoice No</p></td><td ><p>Date</p></td><td><p>Client Type</p></td><td><p>Client Name</p></td><td><p>Total Sale<br>(LKR)</p></td><td><p>Total Returns<br>(LKR)</p></td><td><p>Net Sale<br>(LKR)</p></td></tr>\n" +
                            "                        <!--item data comes here!-->\n" +
                            "                       "+itemData+" " +
                            "\n" +
                            "                        <!--finishes here-->\n" +
                            "                        <tr><td colspan=\"4\"><p style=\"text-align: right;\">Total : </p></td><td><p>"+decf.format(totSale)+"</p></td><td><p>"+decf.format(totReturn)+"</p></td><td><p>"+decf.format(netSale)+"</p></td></tr>\n" +
                            "                    </table>\n" +
                            "                </td>\n" +
                            "            </tr>\n" +
                            "\n" +
                            "            <tr><td><br><p style=\"text-align: right;\">Certified by,<br><br>-----------------------</p><br></tr></td>\n" +
                            "        </table>\n" +
                            "        \n" +
                            "    </body>\n" +
                            "\n" +
                            "</html>";
        
        JTextPane jtp = new JTextPane();
        jtp.setContentType("text/html");
        jtp.setText(reportText);
        try {
            this.setAlwaysOnTop(false);
            jtp.print();
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(this, "Unable to Print Report Try Again","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DailySalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DailySalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DailySalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DailySalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DailySalesReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DailySalesReportClose;
    private com.toedter.calendar.JDayChooser DailySalesReportDayChooser;
    private com.toedter.calendar.JMonthChooser DailySalesReportMonthChooser;
    private com.toedter.calendar.JYearChooser DailySalesReportYearChooser;
    private javax.swing.JButton btnDailySalesReportPrint;
    private javax.swing.JButton btnDailySalesReportSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private view.PanelBorder panelBorder;
    private javax.swing.JTable tblDailySalesReport;
    // End of variables declaration//GEN-END:variables
}

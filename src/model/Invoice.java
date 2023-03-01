/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author navod
 */
public class Invoice {
    public int newInvoice(String amount,String netAmount,String discount,String type,String date)
    {
        int c = 0;
        Database db = new Database();
        int i = db.insertUpdateDelete("insert into tb_invoice values (NULL,NULL,'"+amount+"','"+netAmount+"','"+discount+"','"+type+"','"+date+"')");
        if(i==0)
        {
            JOptionPane.showMessageDialog(null, "Data not saved successfully try again","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==1)
        {
            c=1;
        }
        if(i==2)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong in storage\n*Data won't be able to save","Storage Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==3)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and save again","Error",JOptionPane.ERROR_MESSAGE);
        }
        return c;
    }
    public int newInvoice(String cusNIC,String amount,String netAmount,String discount,String type,String date)
    {
        int c = 0;
        Database db = new Database();
        int i = db.insertUpdateDelete("insert into tb_invoice values (NULL,'"+cusNIC+"','"+amount+"','"+netAmount+"','"+discount+"','"+type+"','"+date+"')");
        if(i==0)
        {
            JOptionPane.showMessageDialog(null, "Data not saved successfully try again","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==1)
        {
            c=1;
        }
        if(i==2)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong in storage\n*Data won't be able to save","Storage Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==3)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and save again","Error",JOptionPane.ERROR_MESSAGE);
        }
        return c;
    }
    public int addItemsInInvoice(String ino,String invNo,String qtyPurchased,String amount,String discount,String netAmount)
    {
        int c=0;
        Database db = new Database();
        int i = db.insertUpdateDelete("insert into tb_itemininvoice values ('"+ino+"','"+invNo+"','"+qtyPurchased+"','"+amount+"','"+discount+"','"+netAmount+"')");
        if(i==0)
        {
            JOptionPane.showMessageDialog(null, "Data not saved successfully try again","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==1)
        {
            c=1;
        }
        if(i==2)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong in storage\n*Data won't be able to save","Storage Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==3)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and save again","Error",JOptionPane.ERROR_MESSAGE);
        }        
        return c;
    }
    public ResultSet viewInvoice(String invNumber)
    {
        Database db = new Database();
        ResultSet rs = db.selectData("SELECT * FROM tb_invoice,tb_itemininvoice,tb_item WHERE tb_invoice.InvoiceNO=tb_itemininvoice.InvNO AND tb_itemininvoice.INO=tb_item.INO AND InvoiceNo="+invNumber+" ");
        
        
        return rs;
    }
    public int updateInvoice(String amount,String discount,String netamount,String invNo)
    {
        int c=0;
        Database db = new Database();
        int i = db.insertUpdateDelete("UPDATE `tb_invoice` SET `Amount` = '"+amount+"', `NetAmount` = '"+netamount+"', `Discount` = '"+discount+"' WHERE `tb_invoice`.`InvoiceNO` = "+invNo+" ");
        if(i==0)
        {
            JOptionPane.showMessageDialog(null, "Data not saved successfully try again","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==1)
        {
            c=1;
        }
        if(i==2)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong in storage\n*Data won't be able to save","Storage Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==3)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and save again","Error",JOptionPane.ERROR_MESSAGE);
        }        
        return c;
    }
}

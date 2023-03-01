/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Database;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author navod
 */
public class DealerOrder {
    public int addDealerOrder(String sID,String dID,String date)
    {
        int c=0;
        Database db = new Database();
        int i= db.insertUpdateDelete("INSERT INTO `tb_dealerorder` VALUES (NULL, '"+sID+"', '"+dID+"',NULL, '"+date+"', 'Pending')");
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
            JOptionPane.showMessageDialog(null, "Something went wrong in storage","Storage Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==3)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and save again","Error",JOptionPane.ERROR_MESSAGE);
        }
        return c;
    }
    public int addItemInDealerOrder(String dOID,String ino,String qty)
    {
        int c=0;
        Database db = new Database();
        int i= db.insertUpdateDelete("INSERT INTO `tb_itemindealerorder` VALUES ('"+dOID+"', '"+ino+"', '"+qty+"')");
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
            JOptionPane.showMessageDialog(null, "Something went wrong in storage","Storage Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==3)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and save again","Error",JOptionPane.ERROR_MESSAGE);
        }
        return c;
    }
    public ResultSet viewDOrder()
    {
        Database db = new Database();
        ResultSet rs = db.selectData("SELECT * FROM tb_dealerorder,tb_dealer,tb_salesperson WHERE tb_dealerorder.DID=tb_dealer.DID AND tb_dealerorder.SID=tb_salesperson.SID");
        return rs;
    }
    public ResultSet viewDOrder(String filter,String searchString)
    {
        Database db = new Database();
        ResultSet rs = db.selectData("SELECT * FROM tb_dealerorder,tb_dealer,tb_salesperson WHERE tb_dealerorder.DID=tb_dealer.DID AND tb_dealerorder.SID=tb_salesperson.SID AND "+filter+" LIKE '%"+searchString+"%'");
        return rs;
    }
    public int updateOrderStatus(String DOID,String status)
    {
        int c=0;
        Database db = new Database();
        int i = db.insertUpdateDelete("UPDATE `tb_dealerorder` SET `Status` = '"+status+"' WHERE `tb_dealerorder`.`DOID` = "+DOID+"");
        if(i==0)
        {
            JOptionPane.showMessageDialog(null, "Dealer Order Not Canceled","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==1)
        {
            JOptionPane.showMessageDialog(null, "Dealer Order Canceled Successfully","Done",JOptionPane.INFORMATION_MESSAGE);
            c=1;
        }
        if(i==2)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong in storage\n*Data won't be able to cancel order try again","Storage Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==3)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and cancel again","Error",JOptionPane.ERROR_MESSAGE);
        }
        return c;
    }
    public int updateOrderStatus(String DOID,String status,String invNo)
    {
        int c=0;
        Database db = new Database();
        int i = db.insertUpdateDelete("UPDATE `tb_dealerorder` SET `Status` = '"+status+"',`InvNO` = '"+invNo+"' WHERE `tb_dealerorder`.`DOID` = "+DOID+"");
        if(i==0)
        {
            JOptionPane.showMessageDialog(null, "Dealer Order Not Placed","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==1)
        {
            //JOptionPane.showMessageDialog(null, "Dealer Order Placed Successfully","Done",JOptionPane.INFORMATION_MESSAGE);
            c=1;
        }
        if(i==2)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong in storage\n*Data won't be able to place order try again","Storage Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==3)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and place again","Error",JOptionPane.ERROR_MESSAGE);
        }
        return c;
    }
}

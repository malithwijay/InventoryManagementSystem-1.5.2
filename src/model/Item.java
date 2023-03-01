/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.cj.protocol.Resultset;
import controller.Database;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author navod
 */
public class Item {
    public int addItem(String ino,String iname,String price,String qtyInHand,String discountMargine)
    {
        int c=0;
        Database db = new Database();
        int i = db.insertUpdateDelete("INSERT INTO `tb_item` (`INO`, `IName`, `Qtyinhand`, `DiscountMargine`, `Price`) VALUES ('"+ino+"', '"+iname+"', '"+qtyInHand+"', '"+discountMargine+"', '"+price+"');");
        if(i==0)
        {
            JOptionPane.showMessageDialog(null, "Data not saved successfully try again","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==1)
        {
            JOptionPane.showMessageDialog(null, "Data saved successfully","Done",JOptionPane.INFORMATION_MESSAGE);
            GRNote grn = new GRNote();
            grn.addGRN(ino, qtyInHand, "New Item");
            c=1;
        }
        if(i==2)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong in storage\n*Data won't be able to save if Item Number already exsist","Storage Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==3)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and save again","Error",JOptionPane.ERROR_MESSAGE);
        }
        return c;
    }
    
    public ResultSet viewItem(String searchValue,String searchFilter)
    {        
        Database db = new Database();
        ResultSet rs =null;
        
        if(searchValue == null && searchFilter == null)
        {
            rs = db.selectData("select * from tb_item");            
        }
        else
        {
            rs = db.selectData("select * from tb_item where "+searchFilter+" LIKE '%"+searchValue+"%'");
        }
        
        return rs;
    }
    
    public int updateItem(String ino,String iname,String price,String qty,String discount)
    {
        int c=0;
        Database db = new Database();
        int i = db.insertUpdateDelete("UPDATE `tb_item` SET `IName` = '"+iname+"', `Qtyinhand` = '"+qty+"', `DiscountMargine` = '"+discount+"', `Price` = '"+price+"' WHERE `tb_item`.`INO` = '"+ino+"'");
        if(i==0)
        {
            JOptionPane.showMessageDialog(null, "Data not Updated successfully try again","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==1)
        {
            JOptionPane.showMessageDialog(null, "Data Updated successfully","Done",JOptionPane.INFORMATION_MESSAGE);
            GRNote grn = new GRNote();
            grn.addGRN(ino, qty, "Item Update");
            c=1;
        }
        if(i==2)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong in storage\n*Cannot Update Specific Item","Storage Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==3)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and Update again","Error",JOptionPane.ERROR_MESSAGE);
        }
        return c;
    }
    public int updateItem(String ino,String qty)
    {
        int c=0;
        Database db = new Database();
        int i = db.insertUpdateDelete("UPDATE `tb_item` SET `Qtyinhand` = '"+qty+"' WHERE `tb_item`.`INO` = '"+ino+"'");
        if(i==0)
        {
            JOptionPane.showMessageDialog(null, "Quantity Data not Updated successfully try again","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==1)
        {
            JOptionPane.showMessageDialog(null, "Quantity Data Updated successfully","Done",JOptionPane.INFORMATION_MESSAGE);
            GRNote grn = new GRNote();
            grn.addGRN(ino, qty, "Item Stock Addition");
            c=1;
        }
        if(i==2)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong in storage\n*Cannot Update Quantity Data Specific Item","Storage Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==3)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and Update Quantity Data again","Error",JOptionPane.ERROR_MESSAGE);
        }
        return c;
    }
    public int deleteItem(String ino)
    {
        int c=0;
        Database db = new Database();
        int i = db.insertUpdateDelete("delete from tb_item where ino ='"+ino+"'");
        if(i==0)
        {
            JOptionPane.showMessageDialog(null, "Data not Deleted successfully try again","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==1)
        {
            JOptionPane.showMessageDialog(null, "Data Deleted successfully","Done",JOptionPane.INFORMATION_MESSAGE);
            GRNote grn = new GRNote();
            grn.addGRN(ino, "0", "Item Removed");
            c=1;
        }
        if(i==2)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong in storage\n*Cannot Delete Data Specific Item","Storage Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==3)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and Delete Data again","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        return c;
    }
}

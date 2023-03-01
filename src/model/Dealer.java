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
public class Dealer {
    public int addDealer(String dName,String dEmail,String adNo,String l1,String l2,String city,String tp)
    {
        int c=0;
        Database db = new Database();
        int i = db.insertUpdateDelete("INSERT INTO `tb_dealer` VALUES (NULL, '"+dName+"', '"+dEmail+"', '"+adNo+"', '"+l1+"', '"+l2+"', '"+city+"', '"+tp+"', NULL)");
        if(i==0)
        {
            JOptionPane.showMessageDialog(null, "Data not saved successfully try again","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==1)
        {
            JOptionPane.showMessageDialog(null, "Data saved successfully","Done",JOptionPane.INFORMATION_MESSAGE);
            c=1;
        }
        if(i==2)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong in storage\n*Data won't be able to save if Delaer already exsist","Storage Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==3)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and save again","Error",JOptionPane.ERROR_MESSAGE);
        }
        return c;
    }
    public String loadDealerID()
    {
        String dID = null;
        Database db = new Database();
        ResultSet rs = db.selectData("select max(DID) as DID from tb_dealer");
        if(rs !=null)
        {
            try {
                while(rs.next())
                {
                    int dNum = rs.getInt("DID");
                    dID = ""+(dNum+1);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Dealer ID didn't load correclty Try again to load","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        return dID;
    }
    public ResultSet viewDealer(String searchValue,String filter)
    {
        Database db = new Database();
        ResultSet rs = null;
        if(searchValue==null && filter==null)
        {
            rs = db.selectData("select * from tb_dealer");
        }
        else
        {
            if(filter.equals("TotalSale"))
            {
                rs = db.selectData("select * from tb_dealer where TotalSale between 0 and '%"+searchValue+"%'");
            }
            else
            {
                rs = db.selectData("select * from tb_dealer where "+filter+" LIKE '%"+searchValue+"%'");
            }            
        }
        return rs;
    }
    public int updateDealer(String dID,String dName,String dEmail,String adNo,String l1,String l2,String city,String tp )
    {
        int c=0;
        Database db = new Database();
        int i = db.insertUpdateDelete("UPDATE `tb_dealer` SET `DName` = '"+dName+"', `Email` = '"+dEmail+"', `AddressNo` = '"+adNo+"', `AddressLine01` = '"+l1+"', `AddressLine02` = '"+l2+"', `City` = '"+city+"', `Telephone` = '"+tp+"' WHERE `tb_dealer`.`DID` = "+dID+"");
        if(i==0)
        {
            JOptionPane.showMessageDialog(null, "Data not saved successfully try again","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==1)
        {
            JOptionPane.showMessageDialog(null, "Data saved successfully","Done",JOptionPane.INFORMATION_MESSAGE);
            c=1;
        }
        if(i==2)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong in storage\n*Data won't be able to save if Delaer ID not exsist","Storage Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==3)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and save again","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        return c;
    }
    public int deleteDealer(String dID)
    {
        int c=0;
        Database db = new Database();
        int i = db.insertUpdateDelete("delete from tb_dealer where DID = '"+dID+"'");
        if(i==0)
        {
            JOptionPane.showMessageDialog(null, "Data not deleted successfully try again","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==1)
        {
            JOptionPane.showMessageDialog(null, "Data deleted successfully","Done",JOptionPane.INFORMATION_MESSAGE);
            c=1;
        }
        if(i==2)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong in storage\n*Data won't be able to delete if Delaer ID not exsist","Storage Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==3)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and delete again","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        return c;
    }
}

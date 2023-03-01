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
public class Customer {
    public int addCustomer(String cNIC,String cName,String cTelephone,String cEmail,String cAdNo,String cL1,String cL2,String cCity)
    {
        int c=0;
        Database db = new Database();
        int i = db.insertUpdateDelete("insert into tb_customer values ('"+cNIC+"','"+cName+"','"+cTelephone+"','"+cEmail+"','"+cAdNo+"','"+cL1+"','"+cL2+"','"+cCity+"',NULL)");
        
        if(i==0)
        {
            JOptionPane.showMessageDialog(null, "Data not saved successfully try again","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==1)
        {
            ////////Customer offfline account saving
            JOptionPane.showMessageDialog(null, "Customer Registered Successfully","Done",JOptionPane.INFORMATION_MESSAGE);
            c=1;
        }
        if(i==2)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong in storage\n*Data won't be able to save if Customer already exsist","Storage Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==3)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and save again","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        return c;
    }
    public int updateCustomer(String cNIC,String cName,String cTelephone,String cEmail,String cAdNo,String cL1,String cL2,String cCity)
    {
        int c=0;
        Database db = new Database();
        int i = db.insertUpdateDelete("UPDATE `tb_customer` SET `CusName` = '"+cName+"', `Email` = '"+cEmail+"', `AddressNO` = '"+cAdNo+"', `AddressLine01` = '"+cL1+"', `AddressLine02` = '"+cL2+"', `City` = '"+cCity+"', `Telephone` = '"+cTelephone+"' WHERE `tb_customer`.`CusNIC` = '"+cNIC+"'");
        
        if(i==0)
        {
            JOptionPane.showMessageDialog(null, "Data not updated successfully try again","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==1)
        {
            ////////Customer offfline account saving
            JOptionPane.showMessageDialog(null, "Customer Updated Successfully","Done",JOptionPane.INFORMATION_MESSAGE);
            c=1;
        }
        if(i==2)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong in storage\n*Data won't be able to update","Storage Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==3)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and update again","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        return c;
    }
    public ResultSet viewCustomer(String accountType,String searchValue,String filter)//View All Offline Customer
    {
        Database db = new Database();
        ResultSet rs = null;
        if(accountType.equals("Offline"))
        {            
            if(searchValue==null && filter==null)
            {
                rs = db.selectData("SELECT * FROM tb_customer");
            }
            else
            {
                rs = db.selectData("SELECT * FROM tb_customer Where "+filter+" LIKE '%"+searchValue+"%'");
            }
        }
        if(accountType.equals("Online"))
        {            
            if(searchValue==null && filter==null)
            {
                rs = db.selectData("SELECT * FROM tb_customer WHERE CusNIC in (SELECT CusNIC FROM tb_onlineaccount)");
            }
            else
            {
                rs = db.selectData("SELECT * FROM tb_customer WHERE CusNIC in (SELECT CusNIC FROM tb_onlineaccount) AND "+filter+" LIKE '%"+searchValue+"%'");
            }
        }
        
        return rs;
    }
    public ResultSet viewCustomerPhoto(String cusNIC)
    {
        Database db = new Database();
        ResultSet rs = db.selectData("SELECT *FROM tb_onlineaccount where CusNIC = '"+cusNIC+"'");
        if(rs==null)
        {
            JOptionPane.showMessageDialog(null, "Customer Image Not Found","Error",JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
    public int deleteCustomer(String cusNIC)
    {
        int c=0;
        Database db = new Database();
        int i = db.insertUpdateDelete("delete from tb_customer where cusNIC = '"+cusNIC+"'");
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
            JOptionPane.showMessageDialog(null, "Something went wrong in storage\n*Data won't be able to delete if Customer ID not exsist","Storage Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==3)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and delete again","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        return c;
    }
}

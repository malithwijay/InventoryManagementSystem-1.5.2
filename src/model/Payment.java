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
public class Payment {
    public int makePayment(String invNo,String amount,String date,String type)
    {
        int c = 0;
        Database db = new Database();
        int i = db.insertUpdateDelete("insert into tb_payment values (NULL,'"+invNo+"','"+amount+"','"+date+"','"+type+"')");
        if(i==0)
        {
            JOptionPane.showMessageDialog(null, "Data not saved successfully try again","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==1)
        {
            ResultSet rs = db.selectData("select max(PID) as PID from tb_payment");
            try {
                while(rs.next())
                {
                    c=rs.getInt("PID");
                }
            } catch (SQLException ex) {
                //Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
            }
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
    public int makePayment(String pid,String bankName,String accountNumber,String cNumber,String cDate,String remark)//Bank
    {
        int c = 0;
        Database db = new Database();
        int i = db.insertUpdateDelete("insert into tb_banktrasfer values('"+pid+"','"+bankName+"','"+accountNumber+"','"+cNumber+"','"+cDate+"','"+remark+"')");
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
    public int makePayment(String pid,String creditPeriod)//Credit
    {
        int c = 0;
        Database db = new Database();
        int i = db.insertUpdateDelete("insert into tb_credit values('"+pid+"','"+creditPeriod+"')");
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
    public int makePayment(String pid)//Cash
    {
        int c = 0;
        Database db = new Database();
        int i = db.insertUpdateDelete("insert into tb_cash values('"+pid+"')");
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

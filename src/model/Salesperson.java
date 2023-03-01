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
public class Salesperson {
    public int addSalesperson(String sID,String sName,String email,String addressNO,String line1,String line2,String city,String telephone,String salary,String photo)
    {
        int c=0;
        Database db = new Database();
        
        int i = db.insertSalesperson(sID, sName, email, addressNO, line1, line2, city, telephone, salary, photo);
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
            JOptionPane.showMessageDialog(null, "Something went wrong in storage","Storage Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==3)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and save again","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        return c;
    }
    public ResultSet viewSalesperson(String searchString,String filter)
    {
        ResultSet rs = null;
        Database db = new Database();
        if(searchString == null)
        {            
            rs = db.selectData("select * from tb_salesperson");
        }
        else
        {
            rs = db.selectData("select * from tb_salesperson where "+filter+" like '%"+searchString+"%'");
        }
        return rs;
    }
    public int deleteSalesperson(String sID)
    {
        
        int c=0;
        int i2 = JOptionPane.showConfirmDialog(null, "Are you Sure to delete this salesperson","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(i2==0)//yes option
        {
            Database db = new Database();
            int i = db.insertUpdateDelete("delete from tb_salesperson where sid = '"+sID+"'");
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
                JOptionPane.showMessageDialog(null, "Something went wrong in storage","Storage Error",JOptionPane.ERROR_MESSAGE);
            }
            if(i==3)
            {
                JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and delete again","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        //i2==1 no option
        
        
        return c;
    }
    public int updateSalesperson(String sID,String sName,String email,String addressNO,String line1,String line2,String city,String telephone,String salary,String photo)
    {
        int c=0;
        Database db = new Database();
        int i = db.updateSalesperson(sID, sName, email, addressNO, line1, line2, city, telephone, salary, photo);
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
            JOptionPane.showMessageDialog(null, "Something went wrong in storage","Storage Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==3)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and save again ","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        return c;
    }
}

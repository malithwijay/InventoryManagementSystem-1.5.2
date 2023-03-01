/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Database;
import javax.swing.JOptionPane;

/**
 *
 * @author navod
 */
public class CustomerReturn {
    public int makeReturn(String cusNIC,String ino,String invNo,String date,String remark,String amount,String qty)
    {
        int c=0;
        Database db = new Database();
        int i = db.insertUpdateDelete("insert into tb_customerreturn values('"+cusNIC+"','"+ino+"','"+invNo+"',NULL,'"+date+"','"+remark+"','"+amount+"','"+qty+"')");
        if(i==0)
        {
            JOptionPane.showMessageDialog(null, "Data not saved successfully try again","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(i==1)
        {
            //JOptionPane.showMessageDialog(null, "Data saved successfully","Done",JOptionPane.INFORMATION_MESSAGE);
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
}

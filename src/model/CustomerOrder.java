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
public class CustomerOrder {
    public int addCOrder()
    {
        int c=0;
        Database db = new Database();
        /*int i = db.insertUpdateDelete("INSERT INTO `tb_dealer` VALUES (NULL, '"+dName+"', '"+dEmail+"', '"+adNo+"', '"+l1+"', '"+l2+"', '"+city+"', '"+tp+"', NULL)");
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
        }*/
        
        return c;
    }
}

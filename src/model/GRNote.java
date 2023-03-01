/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Database;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author navod
 */
public class GRNote {
    public void addGRN(String ino,String qty,String remark)
    {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
        LocalDateTime now = LocalDateTime.now();
        
        Database db = new Database();
        int i = db.insertUpdateDelete("INSERT INTO `tb_grn` VALUES (NULL, '"+ino+"', '"+df.format(now)+"', '"+remark+"', '"+qty+"')");
        if(i==1)
        {
            JOptionPane.showMessageDialog(null, "Goods Receive Noted", "Done", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Goods Receive Noted not Noted", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public ResultSet viewGRN(String ino)
    {
        ResultSet rs = null;
        Database db = new Database();
        rs = db.selectData("SELECT * FROM tb_grn WHERE INO ="+ino+"");
        return rs;
    }
    public ResultSet viewGRN(String ino,String filter,String searchString)
    {
        ResultSet rs = null;
        Database db = new Database();
        rs = db.selectData("SELECT * FROM tb_grn WHERE INO ="+ino+" and "+filter+" LIKE '%"+searchString+"%'");
        return rs;
    }
}

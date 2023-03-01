/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Image;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author navod
 */
public class Database {
    Connection con;
    PreparedStatement cmd;
    
    public int insertUpdateDelete(String sql)
    {
        int resault = 0;

        try {
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_multi_engineering","root","");
            
            cmd = con.prepareStatement(sql);

            int i = cmd.executeUpdate();
            
            if(i==1)
            {
                resault=1;
            }
            else
            {
                resault=0;
            }
        } catch (SQLException ex) {
            resault=2;
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        catch (Exception ex)
        {
            resault = 3;
        }
        
        return resault;
    }
    
    public int credential_check(String sql)
    {
        int resault = 0;
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_multi_engineering","root","");
            cmd = con.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            
            if(rs.next())
            {
                resault = 1;
            }
            else
            {
                resault = 0;
            }
        } catch (SQLException ex) {
            resault = 2;
            
        }
        catch (Exception ex)
        {
            resault = 3;
        }
        
        return resault;
    }
    
    public ResultSet selectData(String sql)
    {
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_multi_engineering","root","");
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
        }
        catch (Exception ex){
            
        }
        
        return rs;
    }
    
    public int insertUser(String username,String password,String fullName,String telephone,String address,String emailID,String userType,String photopath)
    {
        int resault = 0;

        try {
            InputStream in = new FileInputStream(photopath);
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_multi_engineering","root","");
            
            PreparedStatement pst = con.prepareStatement("insert into tb_employee values (?,?,?,?,?,?,?,?)");
            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3, fullName);
            pst.setString(4, telephone);
            pst.setString(5, address);
            pst.setString(6, emailID);
            pst.setString(7, userType);
            pst.setBlob(8, in);
            

            int i = pst.executeUpdate();
            
            if(i==1)
            {
                resault=1;
            }
            else
            {
                resault=0;
            }
        } catch (SQLException ex) {
            resault=2;
            //JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        catch (Exception ex)
        {
            resault = 3;
        }
        
        return resault;
    }
    
    public int modifyUser(String username,String password,String fullName,String telephone,String address,String emailID,String userType,String photopath)
    {
        int resault = 0;

        try {            
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_multi_engineering","root","");
            if(photopath != null)
            {
                InputStream in = new FileInputStream(photopath);
                PreparedStatement pst = con.prepareStatement("UPDATE tb_employee SET username = ?, password = ?, fullname = ?,"
                        + " telephone = ?, address = ?, email = ?, userType = ?, photo =? where username = '"+username+"'");
                pst.setString(1, username);
                pst.setString(2, password);
                pst.setString(3, fullName);
                pst.setString(4, telephone);
                pst.setString(5, address);
                pst.setString(6, emailID);
                pst.setString(7, userType);
                pst.setBlob(8, in);


                int i = pst.executeUpdate();

                if(i==1)
                {
                    resault=1;
                }
                else
                {
                    resault=0;
                }
            }
            else
            {
                PreparedStatement pst = con.prepareStatement("UPDATE tb_employee SET username = ?, password = ?, fullname = ?,"
                    + " telephone = ?, address = ?, email = ?, userType = ? where username = '"+username+"'");
                pst.setString(1, username);
                pst.setString(2, password);
                pst.setString(3, fullName);
                pst.setString(4, telephone);
                pst.setString(5, address);
                pst.setString(6, emailID);
                pst.setString(7, userType);


                int i = pst.executeUpdate();

                if(i==1)
                {
                    resault=1;
                }
                else
                {
                    resault=0;
                }
            }
        } catch (SQLException ex) {
            resault=2;
            JOptionPane.showMessageDialog(null, "SQL : "+ex.getMessage());
        }
        catch (Exception ex)
        {
            resault = 3;
            JOptionPane.showMessageDialog(null, "Super : "+ex.getMessage());
        }
        
        return resault;
    }
    public int insertSalesperson(String sID,String sName,String email,String addressNO,String line1,String line2,String city,String telephone,String salary,String photo)
    {
        int resault = 0;

        try {
            InputStream in = new FileInputStream(photo);
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_multi_engineering","root","");
            
            PreparedStatement pst = con.prepareStatement("insert into tb_salesperson values (?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, sID);
            pst.setString(2, sName);
            pst.setString(3, email);
            pst.setString(4, addressNO);
            pst.setString(5, line1);
            pst.setString(6, line2);
            pst.setString(7, city);
            pst.setString(8, telephone);
            pst.setString(9, salary);            
            pst.setBlob(10, in);
            

            int i = pst.executeUpdate();
            
            if(i==1)
            {
                resault=1;
            }
            else
            {
                resault=0;
            }
        } catch (SQLException ex) {
            resault=2;
        }
        catch (Exception ex)
        {
            resault = 3;
        }
        
        return resault;
    }
    public int updateSalesperson(String sID,String sName,String email,String addressNO,String line1,String line2,String city,String telephone,String salary,String photo)
    {
        int resault = 0;

        try {
            if(photo != null)
            {
                InputStream in = new FileInputStream(photo);
            
                con = DriverManager.getConnection("jdbc:mysql://localhost/db_multi_engineering","root","");

                PreparedStatement pst = con.prepareStatement("UPDATE `tb_salesperson` SET `SName` = ?, `Email` = ?, `AddressNO` = ?, "
                        + "`Line1` = ?, `Line2` = ?, `City` = ?, `Telephone` = ?, `Salary` = ?, `Photo` =? where sid = '"+sID+"'");
                pst.setString(1, sName);
                pst.setString(2, email);
                pst.setString(3, addressNO);
                pst.setString(4, line1);
                pst.setString(5, line2);
                pst.setString(6, city);
                pst.setString(7, telephone);
                pst.setString(8, salary);            
                pst.setBlob(9, in);


                int i = pst.executeUpdate();

                if(i==1)
                {
                    resault=1;
                }
                else
                {
                    resault=0;
                }
            }
            else
            {
            
                con = DriverManager.getConnection("jdbc:mysql://localhost/db_multi_engineering","root","");

                PreparedStatement pst = con.prepareStatement("UPDATE `tb_salesperson` SET `SName` = ?, `Email` = ?, `AddressNO` = ?, `Line1` = ?, "
                        + "`Line2` = ?, `City` = ?, `Telephone` = ?, `Salary` = ? WHERE `tb_salesperson`.`SID` = '"+sID+"'");
                pst.setString(1, sName);
                pst.setString(2, email);
                pst.setString(3, addressNO);
                pst.setString(4, line1);
                pst.setString(5, line2);
                pst.setString(6, city);
                pst.setString(7, telephone);
                pst.setString(8, salary);  


                int i = pst.executeUpdate();

                if(i==1)
                {
                    resault=1;
                }
                else
                {
                    resault=0;
                }
            }
            
        } catch (SQLException ex) {
            resault=2;
            JOptionPane.showMessageDialog(null, ""+ex.getMessage());
        }
        catch (Exception ex)
        {
            resault = 3;
            JOptionPane.showMessageDialog(null, ""+ex.getMessage());
        }
        
        return resault;
    }
}

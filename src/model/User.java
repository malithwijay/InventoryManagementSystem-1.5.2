/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Database;
import controller.EmailGateway;
import controller.ImageResizer;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;



/**
 *
 * @author navod
 */
public class User {
    public int addUser(String username,String password,String fullName,String telephone,String address,String emailID,String userType,String photopath)
    {       
        int i = 0;
        int randomNumber = (int)(Math.random()*(1000000-100000+1)+100000);
        int c = JOptionPane.showConfirmDialog(null, "Would you like to send confirmation code to "+emailID, "Email Verification", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
        if(c == JOptionPane.YES_OPTION)
        {
            String content="<h1><b>MULTI ENGINEERING SERVICES LANKA PRIVATE LIMITED</b></h1>"
                            + "<h2><font style='color:#791803;'>Email Authentication</font></h2>"
                            + "<p>To verify this email : "+emailID+" use this verification code<br><br>"
                            + "Verification Code : <b><u>"+randomNumber+"</u></b><br><br>"
                            + "<br>"
                            + "With regards<br>"
                            + "<br>"
                            + "MULTI ENGINEERING SERVICES LANKA PRIVATE LIMITED<br>"
                            + "Maintanance Services and Civil Constructors<br>"
                            + "No.466/7A Thapowanaya Road,Aggona.<br>"
                            + "Sri Lanka<br>"
                            + "Tel : 0112 794 959, 0114 558 559"
                            + "</p>"
                            +"<hr>"
                            + "<p><font style='color:blue; size:10px; align:center;'>Software By Fitos</p>";
            EmailGateway obj = new EmailGateway();
            String result = obj.sendOnlyMessage(emailID,"Email Authentication",content);
            
            if(result.equals("done"))
            {
                String vCode=null;
                        do{
                            JPanel panel = new JPanel();
                            JLabel label = new JLabel("Enter Verification Code Here...!");
                            JPasswordField verifycode = new JPasswordField(10);
                            panel.add(label);
                            panel.add(verifycode);
                            String[] options = new String[]{"OK", "Cancel"};
                            int option = JOptionPane.showOptionDialog(null, panel, "Verify Email",
                                            JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, options, options[1]);

                            vCode = new String(verifycode.getPassword());

                            if(option==0)
                            {
                                if(vCode.equals(""+randomNumber))
                                {
                                    Database db = new Database();
                                    i = db.insertUser(username,password,fullName,emailID,telephone,address,userType,photopath);
                                    if(i==0)
                                    {
                                        JOptionPane.showMessageDialog(null, "Data not saved successfully try again","Error",JOptionPane.ERROR_MESSAGE);
                                    }
                                    if(i==1)
                                    {
                                        JOptionPane.showMessageDialog(null, "Data saved successfully","Done",JOptionPane.INFORMATION_MESSAGE);
                                        sendUserDetails(emailID,username,password);
                                    }
                                    if(i==2)
                                    {
                                        JOptionPane.showMessageDialog(null, "Something went wrong in storage","Storage Error",JOptionPane.ERROR_MESSAGE);
                                    }
                                    if(i==3)
                                    {
                                        JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and save again","Error",JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null, "Wrong Verification Code", "Verification Error",JOptionPane.ERROR_MESSAGE);

                                }
                            }
                            else
                            {
                                break;
                            }
                        }
                        while(!(vCode.equals(""+randomNumber)));
            }
            else
            {
                JOptionPane.showMessageDialog(null, result, "Cannot send email",JOptionPane.ERROR_MESSAGE);
            }
        }
        return i;
    }
    
    private void sendUserDetails(String email,String username,String password)
    {
        String content="<h1><b>MULTI ENGINEERING SERVICES LANKA PRIVATE LIMITED</b></h1>"
                            + "<h2><font style='color:#791803;'>Welcome</font></h2>"
                            + "<p>You are successfully registered with System<br><br>"
                            + "<br>Use below username and password to login to the system"
                            + "<br>Username : <b>"+username+"</b>"
                            + "<br>Password : <b>"+password+"</b>"
                            + "<br><br>To Protect your account follow the instruction state below"
                            + "<br><ul>"
                            + "<li>Change the password in first login</li>"
                            + "<li>Change the password frequently</li>"
                            + "<li>Make sure to logout when you are not around</li>"
                            + "<li>Do not share the password or username with 3<sup>rd</sup> party</li>"
                            + "</ul>"
                            + "<br>With regards,"
                            + "MULTI ENGINEERING SERVICES LANKA PRIVATE LIMITED<br>"
                            + "Maintanance Services and Civil Constructors<br>"
                            + "No.466/7A Thapowanaya Road,Aggona.<br>"
                            + "Sri Lanka<br>"
                            + "Tel : 0112 794 959, 0114 558 559"
                            + "</p>"
                            +"<hr>"
                            + "<p><font style='color:blue; size:10px; align:center;'>Software By Fitos</p>";
            EmailGateway obj = new EmailGateway();
            String result = obj.sendOnlyMessage(email,"Welcome",content);
            if(result.equals("done"))
            {
                JOptionPane.showMessageDialog(null, "Username and Password Emailed", "Success",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, result, "Cannot send Username and password",JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public ResultSet viewuser(String searchValue)
    {
        Database db = new Database();
        ResultSet rs;
        
        if(searchValue.equals(""))
        {
            rs = db.selectData("select * from tb_employee");
            
        }
        else
        {
            rs = db.selectData("select * from tb_employee where username = '"+searchValue+"'");
            
        }
        
        return rs;
    }
    
    public void updateUser(String username,String password,String fullName,String telephone,String address,String emailID,String userType,String photopath)
    {
        //if want's to verify email again
        
        
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Old Password of "+username);
        JPasswordField verifycode = new JPasswordField(15);
        panel.add(label);
        panel.add(verifycode);
        String[] options = new String[]{"OK", "Cancel"};
        int option = JOptionPane.showOptionDialog(null, panel, "Verify Email",
                JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[1]);

        String oldpassword = new String(verifycode.getPassword());      
        if(option==0)
        {
            Database db = new Database();
        
            int c = db.credential_check("select * from tb_employee where username = '"+username+"' and password = '"+oldpassword+"'");
            if(c==1)
            {
                int i = db.modifyUser(username,password,fullName,telephone,address,emailID,userType,photopath);
                if(i==0)
                {
                    JOptionPane.showMessageDialog(null, "Data not saved successfully try again","Error",JOptionPane.ERROR_MESSAGE);
                }
                if(i==1)
                {
                    JOptionPane.showMessageDialog(null, "Data saved successfully","Done",JOptionPane.INFORMATION_MESSAGE);
                }
                if(i==2)
                {
                    JOptionPane.showMessageDialog(null, "Something went wrong in storage","Storage Error",JOptionPane.ERROR_MESSAGE);
                }
                if(i==3)
                {
                    JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and save again","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Wrong Password Check the password and Try again","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
    
    public void deleteUser(String username)
    {
        Database db = new Database();
        ImageIcon usericon=null;
        String userFullName =null;
        ResultSet rs = db.selectData("select * from tb_employee where username = '"+username+"'");
        if(rs !=null)
        {
            try {
                while(rs.next())
                {
                    userFullName = rs.getString("FullName");
                    byte[] imagebytes = rs.getBytes("photo");
                    ImageResizer ir = new ImageResizer();
                    usericon = ir.ResizeImage(imagebytes);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error while loading image try again", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        int i = JOptionPane.showConfirmDialog(null, "Are you Sure to delete "+userFullName,"Delete User",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,usericon);
        if(i==0)
        {
            
            int i2 = db.insertUpdateDelete("delete from tb_employee where username = '"+username+"'");
            if(i2==1)
            {
                JOptionPane.showMessageDialog(null, "User Deleted Successfully","Done",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "User cannot deleted try again","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void resetPassword(String username)
    {
        int randomNumber = (int)(Math.random()*(1000000-100000+1)+100000);
        String newPassword = "RS"+randomNumber;
        Database db = new Database();
        ResultSet rs = db.selectData("select * from tb_employee where username = '"+username+"'");
        
        try {
            while(rs.next())
            {
                if(rs !=null)
                {
                    byte[] userimage = rs.getBytes("photo");
                    String useremail = rs.getString("email");
                    ImageResizer ir = new ImageResizer();
                    ImageIcon uImage = ir.ResizeImage(userimage);
                    int i = JOptionPane.showConfirmDialog(null, "Are you sure to reset "+username+"'s Password?","Password "
                        + "Reset",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,uImage);
                    if(i==0)
                    {
                        int c = db.insertUpdateDelete("UPDATE `tb_employee` SET `Password` = '"+newPassword+"' WHERE `tb_employee`.`UserName` = '"+username+"'");
                        if(c==0)
                        {
                            JOptionPane.showMessageDialog(null, "Password Not Reset successfully try again","Error",JOptionPane.ERROR_MESSAGE);
                        }
                        if(c==1)
                        {
                            JOptionPane.showMessageDialog(null, "Password Reset successfully","Done",JOptionPane.INFORMATION_MESSAGE);
                            emailResetPassword(username,newPassword,useremail);
                        }
                        if(c==2)
                        {
                            JOptionPane.showMessageDialog(null, "Something went wrong in storage","Storage Error",JOptionPane.ERROR_MESSAGE);
                        }
                        if(c==3)
                        {
                            JOptionPane.showMessageDialog(null, "Something went wrong try to reopen and reset again","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No Such User found in given user Name","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cannot Load user data try again","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    private void emailResetPassword(String username,String newPassword,String email)
    {
        String content="<h1><b>MULTI ENGINEERING SERVICES LANKA PRIVATE LIMITED</b></h1>"
                            + "<h2><font style='color:#791803;'>Your New Password</font></h2>"
                            + "<p>Your password have been reseted by the system administration<br><br>"
                            + "<br>Use below username and password to login to the system"
                            + "<br>Username : <b>"+username+"</b>"
                            + "<br>Password : <b>"+newPassword+"</b>"
                            + "<br><br>To Protect your account follow the instruction state below"
                            + "<br><ul>"
                            + "<li>Change the password in first login</li>"
                            + "<li>Change the password frequently</li>"
                            + "<li>Make sure to logout when you are not around</li>"
                            + "<li>Do not share the password or username with 3<sup>rd</sup> party</li>"
                            + "</ul>"
                            + "<br>With regards,"
                            + "MULTI ENGINEERING SERVICES LANKA PRIVATE LIMITED<br>"
                            + "Maintanance Services and Civil Constructors<br>"
                            + "No.466/7A Thapowanaya Road,Aggona.<br>"
                            + "Sri Lanka<br>"
                            + "Tel : 0112 794 959, 0114 558 559"
                            + "</p>"
                            +"<hr>"
                            + "<p><font style='color:blue; size:10px; align:center;'>Software By Fitos</p>";
        EmailGateway obj = new EmailGateway();
        String result = obj.sendOnlyMessage(email,"New Password",content);
        if(result.equals("done"))
        {
            JOptionPane.showMessageDialog(null, "New Password successfully sent to "+email, "Success",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, result, "Cannot Send Email",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void recordUserOperation(String opBy,String menuName,String operation,String description)
    {
        Date nowDate = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
        String time = ""+hour+":"+min+":"+sec;
        Database db = new Database();
        int i = db.insertUpdateDelete("insert into tb_useroperation values (NULL,'"+opBy+"','"+df.format(nowDate)+"','"+time+"','"+menuName+"','"+operation+"','"+description+"')");
        if(i!=1)
        {
            JOptionPane.showMessageDialog(null, "User Operation Not Recorded Contact Manager or Admin","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}

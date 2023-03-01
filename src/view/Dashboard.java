/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;




import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import static com.sun.webkit.perf.WCFontPerfLogger.reset;
import controller.Database;
import controller.ImageResizer;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.ItemSelectable;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import model.Customer;
import model.Dealer;
import model.DealerOrder;
import model.Item;
import model.Salesperson;
import model.User;
import view.StockAdjusment;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;




/**
 *
 * @author malith
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
        
    
    public Dashboard() {
        initComponents();
        
        //setBackground(new Color (0,0,0,0)); 
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        PanelDashboard.setVisible(true);
        PanelUser.setVisible(false);
        PanelOrder.setVisible(false);
        PanelItem.setVisible(false);
        PanelSalesperson.setVisible(false);
        PanelSale.setVisible(false);
        PanelCustomer.setVisible(false);
        PanelDealer.setVisible(false);
        
        
        
        PanelControlUser.setVisible(true);
        PanelAddUser.setVisible(true);
        PanelViewUser.setVisible(false);    
        panelDeleteUser.setVisible(false);
        PanelModifyUser.setVisible(false);
        PanelResetPassword.setVisible(false);
        PanelUserOperation.setVisible(false);
        
        
        PanelAddSalesperson.setVisible(true);
        PanelUpdateSalesperson.setVisible(false);
        PanelDeleteSalesperson.setVisible(false);
        
        
        PanelAddDealer.setVisible(true);
        PanelViewDealer.setVisible(false);    
        PanelDeleteDealer.setVisible(false);
        PanelModifyDealer.setVisible(false);
       
        
        PanelAddCustomer.setVisible(true);
        PanelViewCustomer.setVisible(false);
        PanelModifyCustomer.setVisible(false);
        PanelDeleteCustomer.setVisible(false);
        
        
        PanelPlaceOrder.setVisible(true);
        PanelViewOrder.setVisible(false);
        PanelOrder3.setVisible(false);
        PanelOrder4.setVisible(false);
        
        lblBtnAddUser.setBackground(Color.GRAY);
        btnAddSalesperson.setBackground(Color.GRAY);
        lblBtnAddDealer.setBackground(Color.GRAY);
        lblBtnAddCustomer.setBackground(Color.GRAY);
        lblBtnPlaceOrder.setBackground(Color.GRAY);
        
        
       
        PanelDeleteCustomer.setVisible(false);
        PanelDeleteDealer.setVisible(false);
        
        
        
        
        
    
         
    }
    
    class DashboardPanelheaderGradient extends JPanel{
        
      
        protected void paintComponent(Graphics g){
            Graphics2D g2d=(Graphics2D) g;
            int width =getWidth();
            int height=getHeight();
            Color color1= (Color.decode("#00B4DB"));
            Color color2= (Color.decode("#0083B0"));
            GradientPaint gp=new GradientPaint(0,0,color1,180,height,color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
        }
        
    }
    
    
 class PanelBorder extends JPanel{
    
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintComponent(grphcs);
    }
 }
        


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDashboard = new javax.swing.JPanel();
        PanelDashboardContent = new javax.swing.JPanel();
        jLabel154 = new javax.swing.JLabel();
        txtDashboardDate = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        txtDashboardTime = new javax.swing.JLabel();
        PanelTotalOrders = new PanelBorder();
        txtTotalOrders1 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        PanelTotalSales = new PanelBorder();
        txtTotalSales1 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        PanelTotalProfit = new PanelBorder();
        jLabel164 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        txtTotalProfit1 = new javax.swing.JLabel();
        PanelTotalReturns = new PanelBorder();
        txtTotalReturns1 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        panelReportMenu = new PanelBorder();
        jLabel151 = new javax.swing.JLabel();
        btnDashboardUserReport = new javax.swing.JLabel();
        btnDashboardStockReport = new javax.swing.JLabel();
        btnDashboardDynamicSalesReport = new javax.swing.JLabel();
        btnDashboardStaticSalesReport = new javax.swing.JLabel();
        btnDashboardItemSalesReport = new javax.swing.JLabel();
        PanelItemDisplay = new PanelBorder();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblDashboardItem = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        PanelUser = new javax.swing.JPanel();
        PanelControlUser = new javax.swing.JPanel();
        btnAddUser = new javax.swing.JPanel();
        lblBtnAddUser = new javax.swing.JLabel();
        btnViewUser = new javax.swing.JPanel();
        lblBtnViewUser = new javax.swing.JLabel();
        btnDeleteUser = new javax.swing.JPanel();
        lblBtnDeleteUser = new javax.swing.JLabel();
        btnModifyUser = new javax.swing.JPanel();
        lblBtnModifyUser = new javax.swing.JLabel();
        btnResetPasswordUser = new javax.swing.JPanel();
        lblBtnResetPasswordUser = new javax.swing.JLabel();
        btnUserOperation = new javax.swing.JPanel();
        lblBtnUserOperationUser = new javax.swing.JLabel();
        PanelAddUser = new javax.swing.JPanel();
        PanelAddUserPersonalDetails = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtAddUserFullName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddUserAddress = new javax.swing.JTextArea();
        txtAddUserTelephone = new javax.swing.JTextField();
        txtAddUserEmailID = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PanelAddUserDetails = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        cmbAddUserType = new javax.swing.JComboBox<>();
        txtAddUserName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtAddUserPassword = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        txtAddUserRetypepassword = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PanelAddUserPhoto = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnAddUserPhoto = new javax.swing.JButton();
        txtAddUserPhoto = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAddUserCancel = new javax.swing.JButton();
        btnAddUserSave = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        PanelModifyUser = new javax.swing.JPanel();
        PanelModifyUserPersonalDetails = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtModifyUserFullName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ModifyUserAddress = new javax.swing.JTextArea();
        txtModifyUserTelephone = new javax.swing.JTextField();
        txtModifyUserEmailID = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        PanelModifyUserDetails = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtModifyUserName = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtModifyUserPassword = new javax.swing.JPasswordField();
        jLabel29 = new javax.swing.JLabel();
        txtModifyUserRetypepassword = new javax.swing.JPasswordField();
        jLabel30 = new javax.swing.JLabel();
        txtModifyUserType = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        PanelModifyUserPhoto = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        btnModifyUserPhoto = new javax.swing.JButton();
        txtModifyUserPhoto = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        btnModifyUserCancel = new javax.swing.JButton();
        btnModifyUserSave = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtModifyUserSearchUsername = new javax.swing.JTextField();
        btnModifyUserSearchUsername = new javax.swing.JButton();
        PanelUserOperation = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        PanelResetPassword = new javax.swing.JPanel();
        LableResetUser = new javax.swing.JLabel();
        PanelresetUserContents = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtResetPasswordUsername = new javax.swing.JTextField();
        btnResetUserPasswordReset = new javax.swing.JButton();
        btnResetUserPasswordResetCancel = new javax.swing.JButton();
        panelDeleteUser = new javax.swing.JPanel();
        LableDeleteUser = new javax.swing.JLabel();
        PanelDeleteUserContents = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtDeleteUsername = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtDeleteUserEmailID = new javax.swing.JTextField();
        btnDeleteUserCancel = new javax.swing.JButton();
        btnDeleteUserDelete = new javax.swing.JButton();
        PanelViewUser = new javax.swing.JPanel();
        LableViewUserContents = new javax.swing.JLabel();
        PanelviewUserContents = new javax.swing.JPanel();
        txtViewUserPhoto = new javax.swing.JLabel();
        txtViewUsername = new javax.swing.JLabel();
        txtViewUserFullname = new javax.swing.JLabel();
        txtViewUserAddress = new javax.swing.JLabel();
        txtViewTelephone = new javax.swing.JLabel();
        txtViewUserType = new javax.swing.JLabel();
        txtViewUserEmailID = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        LableViewUserDeatails = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblViewUser = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        txtViewUserSearchUsername = new javax.swing.JTextField();
        btnViewUserSearch = new javax.swing.JButton();
        PanelOrder = new javax.swing.JPanel();
        PanelControlOrder = new javax.swing.JPanel();
        btnPlaceOrder = new javax.swing.JPanel();
        lblBtnPlaceOrder = new javax.swing.JLabel();
        btnViewOrder = new javax.swing.JPanel();
        lblBtnViewOrder = new javax.swing.JLabel();
        btnOrder3 = new javax.swing.JPanel();
        lblBtnOrder3 = new javax.swing.JLabel();
        btnOrder4 = new javax.swing.JPanel();
        lblBtnOrder4 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        PanelOrder4 = new javax.swing.JPanel();
        PanelOrder3 = new javax.swing.JPanel();
        PanelViewOrder = new javax.swing.JPanel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        cmbViewOrderSearch = new javax.swing.JComboBox<>();
        txtViewOrderSearch = new javax.swing.JTextField();
        btnViewOrderSearch = new javax.swing.JButton();
        btnViewOrderSearchAll = new javax.swing.JButton();
        btnViewOrderSearchClear = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        tableViewOrder = new javax.swing.JTable();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tableViewOrderItem = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        PanelViewOrderCancelContent = new javax.swing.JPanel();
        jLabel145 = new javax.swing.JLabel();
        txtViewOrderCancelOrderID = new javax.swing.JTextField();
        btnViewOrderCancel = new javax.swing.JButton();
        txtViewOrderCancelClear = new javax.swing.JButton();
        PanelPlaceOrder = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        PlaceOrderContent1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPlaceOrderNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPlaceOrderDate = new javax.swing.JFormattedTextField();
        jLabel140 = new javax.swing.JLabel();
        cmbPlaceOrderItemSearch = new javax.swing.JComboBox<>();
        txtPlaceOrderItemSearch = new javax.swing.JTextField();
        btnPlaceOrderItemSearch = new javax.swing.JButton();
        btnPlaceOrderItemSearchClear = new javax.swing.JButton();
        btnPlaceOrderItemSearchViewall = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        TablePlaceOrderViewItem = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        PlaceOrderContent2 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        txtPlaceOrderQtyInHand = new javax.swing.JLabel();
        txtPlaceOrderQty = new javax.swing.JTextField();
        txtPlaceOrderItemIDClear = new javax.swing.JButton();
        txtPlaceOrderAdd = new javax.swing.JButton();
        txtPlaceOrderEnterItemId = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        TablePlaceOrderViewAmount = new javax.swing.JTable();
        btnPlaceOrderPlace = new javax.swing.JButton();
        btnPlaceOrderClear = new javax.swing.JButton();
        PanelPlaceOrderSDContent = new javax.swing.JPanel();
        jLabel141 = new javax.swing.JLabel();
        txtPlaceOrderSPID = new javax.swing.JTextField();
        jLabel142 = new javax.swing.JLabel();
        txtPlaceOrderDID = new javax.swing.JTextField();
        PanelItem = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        PanelAddItemContent = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtAddItemNo = new javax.swing.JTextField();
        txtAddItemQuantity = new javax.swing.JTextField();
        txtAddItemDiscount = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtAddItemName = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        txtAddItemPrice = new javax.swing.JTextField();
        btnAddItemSave = new javax.swing.JButton();
        txtAddItemCancel = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        PanelUpdateItemContent = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        txtUpdateItemNo = new javax.swing.JTextField();
        txtUpdateItemQuantity = new javax.swing.JTextField();
        txtUpdateItemDiscount = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txtUpdateItemName = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        txtUpdateItemPrice = new javax.swing.JTextField();
        btnUpdateItemSave = new javax.swing.JButton();
        txtUpdateItemCancel = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        PanelUpdateQuantityItemContent = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        txtUpdateQuantityItemNo = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txtUpdateQuantityExist = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        UpdateQuantityNew = new javax.swing.JTextField();
        btnUpdateQuantitySave = new javax.swing.JButton();
        btnUpdateQuantityCancel = new javax.swing.JButton();
        btnUpdateQuantityItemNoSearch = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        UpdateQuantityAdd = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblViewItem = new javax.swing.JTable();
        jLabel58 = new javax.swing.JLabel();
        cmbViewItemCategory = new javax.swing.JComboBox<>();
        txtViewItemCategory = new javax.swing.JTextField();
        btnViewItemSearch = new javax.swing.JButton();
        btnViewItemClear = new javax.swing.JButton();
        btnViewItemAll = new javax.swing.JButton();
        btnViewGoodsReceiveNote = new javax.swing.JButton();
        PanelSalesperson = new javax.swing.JPanel();
        PanelAddUpdateDeleteSalesperson = new javax.swing.JPanel();
        PanelDeleteSalesperson = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        txtDeleteSalespersonIDSearch = new javax.swing.JTextField();
        txtDeleteSalespersonName = new javax.swing.JLabel();
        txtDeleteSalespersonTelephone = new javax.swing.JLabel();
        txtDeleteSalespersonEmailID = new javax.swing.JLabel();
        txtDeleteSalespersonSalary = new javax.swing.JLabel();
        txtDeleteSalespersonAddressNo = new javax.swing.JLabel();
        txtDeleteSalespersonAddressLine1 = new javax.swing.JLabel();
        txtDeleteSalespersonPhoto = new javax.swing.JLabel();
        btnDeleteSalespersonSave = new javax.swing.JButton();
        btnDeleteSalespersonClear = new javax.swing.JButton();
        btnDeleteSalespersonIDSearch = new javax.swing.JButton();
        txtDeleteSalespersonAddressLine2 = new javax.swing.JLabel();
        txtDeleteSalespersonCity = new javax.swing.JLabel();
        PanelUpdateSalesperson = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        txtUpdateSalespersonID = new javax.swing.JTextField();
        txtUpdateSalespersonName = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        txtUpdateSalespersonTelephone = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        txtUpdateSalespersonEmailID = new javax.swing.JTextField();
        txtUpdateSalespersonSalary = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        txtUpdateSalespersonAddressNo = new javax.swing.JTextField();
        txtUpdateSalespersonAddressLine1 = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        txtUpdateSalespersonAddressLine2 = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        txtUpdateSalespersonPhoto = new javax.swing.JLabel();
        btnUpdateSalespersonPhoto = new javax.swing.JButton();
        btnUpdateSalespersonSave = new javax.swing.JButton();
        btnUpdateSalespersonClear = new javax.swing.JButton();
        txtUpdateSalespersonCity = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        btnUpdateSalespersonIDSearch = new javax.swing.JButton();
        PanelAddSalesperson = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        txtAddSalespersonID = new javax.swing.JTextField();
        txtAddSalespersonName = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        txtAddSalespersonTelephone = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        txtAddSalespersonEmailID = new javax.swing.JTextField();
        txtAddSalespersonSalary = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        txtAddSalespersonAddressNo = new javax.swing.JTextField();
        txtAddSalespersonAddressLine1 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        txtAddSalespersonAddressLine2 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        txtAddSalespersonPhoto = new javax.swing.JLabel();
        btnAddSalespersonPhoto = new javax.swing.JButton();
        btnAddSalespersonSave = new javax.swing.JButton();
        btnAddSalespersonClear = new javax.swing.JButton();
        txtAddSalespersonCity = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        btnAddSalesperson = new javax.swing.JLabel();
        btnUpdateSalesperson = new javax.swing.JLabel();
        btnDeleteSalesperson = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TblViewSalespersons = new javax.swing.JTable();
        jLabel74 = new javax.swing.JLabel();
        cmbViewSalespersonSearch = new javax.swing.JComboBox<>();
        txtViewSalespersonSearch = new javax.swing.JTextField();
        btnViewSalespersonSearch = new javax.swing.JButton();
        btnViewSalespersonClear = new javax.swing.JButton();
        btnViewSalespersonViewAll = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        PanelViewSalespersonDetailsContent = new javax.swing.JPanel();
        txtViewSalespersonID = new javax.swing.JLabel();
        txtViewSalespersonName = new javax.swing.JLabel();
        txtViewSalespersonAddressNo = new javax.swing.JLabel();
        txtViewSalespersonAddressLine1 = new javax.swing.JLabel();
        txtViewSalespersonAddressLine2 = new javax.swing.JLabel();
        txtViewSalespersonCity = new javax.swing.JLabel();
        txtViewSalespersonTelephone = new javax.swing.JLabel();
        txtViewSalespersonEmailID = new javax.swing.JLabel();
        txtViewSalespersonSalary = new javax.swing.JLabel();
        txtViewSalespersonPhoto = new javax.swing.JLabel();
        PanelSale = new javax.swing.JPanel();
        PanelControlSale = new javax.swing.JPanel();
        btnSaleDealerOrder = new javax.swing.JPanel();
        lblBtnSaleDealerOrder = new javax.swing.JLabel();
        btnSaleCustomerOrder = new javax.swing.JPanel();
        lblBtnSaleCustomerOrder = new javax.swing.JLabel();
        btnViewSales = new javax.swing.JPanel();
        lblBtnViewSales = new javax.swing.JLabel();
        btnManageReturns = new javax.swing.JPanel();
        lblBtnManageReturns = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        PanelCustomer = new javax.swing.JPanel();
        PanelControlCustomer = new javax.swing.JPanel();
        btnAddCustomer = new javax.swing.JPanel();
        lblBtnAddCustomer = new javax.swing.JLabel();
        btnViewCustomer = new javax.swing.JPanel();
        lblBtnViewCustomer = new javax.swing.JLabel();
        btnModifyCustomer = new javax.swing.JPanel();
        lblBtnModifyCustomer = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        PanelViewCustomer = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        txtViewCustomerSearch = new javax.swing.JTextField();
        btnViewCustomerSearch = new javax.swing.JButton();
        btnViewCustomerClear = new javax.swing.JButton();
        btnViewCustomerAll = new javax.swing.JButton();
        PanelViewCustomerContent = new javax.swing.JPanel();
        txtViewCustomerNIC = new javax.swing.JLabel();
        txtViewCustomerName = new javax.swing.JLabel();
        txtViewCustomerAddressNo = new javax.swing.JLabel();
        txtViewCustomerAddressLine1 = new javax.swing.JLabel();
        txtViewCustomerAddressLine2 = new javax.swing.JLabel();
        txtViewCustomerCity = new javax.swing.JLabel();
        txtViewCustomerTelephone = new javax.swing.JLabel();
        txtViewCustomerEmailID = new javax.swing.JLabel();
        txtViewCustomerTotalSale = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbViewCustomerSearch = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        TblViewCustomer = new javax.swing.JTable();
        PanelModifyCustomer = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        PanelModifyCustomerContent = new javax.swing.JPanel();
        jLabel129 = new javax.swing.JLabel();
        txtModifyCustomerNIC = new javax.swing.JTextField();
        txtModifyCustomerName = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        txtModifyCustomerTelephone = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        txtModifyCustomerEmailID = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        txtModifyCustomerAddressNo = new javax.swing.JTextField();
        txtModifyCustomerAddressLine1 = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        txtModifyCustomerAddressLine2 = new javax.swing.JTextField();
        jLabel135 = new javax.swing.JLabel();
        btnModifyCustomerSave = new javax.swing.JButton();
        btnModifyCustomerClear = new javax.swing.JButton();
        txtModifyCustomerCity = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        btnModifyCustomerNICSearch = new javax.swing.JButton();
        PanelDeleteCustomer = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        PanelDeleteCustomerContent = new javax.swing.JPanel();
        jLabel128 = new javax.swing.JLabel();
        txtDeleteCustomerNICSearch = new javax.swing.JTextField();
        txtDeleteCustomerName = new javax.swing.JLabel();
        txtDeleteCustomerTelephone = new javax.swing.JLabel();
        txtDeleteCustomerEmailID = new javax.swing.JLabel();
        txtDeleteCustomerAddressNo = new javax.swing.JLabel();
        txtDeleteCustomerAddressLine1 = new javax.swing.JLabel();
        txtDeleteCustomerAddressLine2 = new javax.swing.JLabel();
        btnDeleteCustomerDelete = new javax.swing.JButton();
        btnDeleteCustomerClear = new javax.swing.JButton();
        txtDeleteCustomerCity = new javax.swing.JLabel();
        btnDeleteCustomerNICSearch = new javax.swing.JButton();
        txtDeleteCustomerAccountType = new javax.swing.JLabel();
        txtDeleteCustomerPhoto = new javax.swing.JLabel();
        PanelAddCustomer = new javax.swing.JPanel();
        PanelAddCustomerContent = new javax.swing.JPanel();
        jLabel119 = new javax.swing.JLabel();
        txtAddCustomerNIC = new javax.swing.JTextField();
        txtAddCustomerName = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        txtAddCustomerTelephone = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        txtAddCustomerEmailID = new javax.swing.JTextField();
        jLabel124 = new javax.swing.JLabel();
        txtAddCustomerAddressNo = new javax.swing.JTextField();
        txtAddCustomerAddressLine1 = new javax.swing.JTextField();
        jLabel125 = new javax.swing.JLabel();
        txtAddCustomerAddressLine2 = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        btnAddCustomerSave = new javax.swing.JButton();
        btnAddCustomerClear = new javax.swing.JButton();
        txtAddCustomerCity = new javax.swing.JTextField();
        jLabel127 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        PanelDealer = new javax.swing.JPanel();
        PanelControlDealer = new javax.swing.JPanel();
        btnAddDealer = new javax.swing.JPanel();
        lblBtnAddDealer = new javax.swing.JLabel();
        btnViewDealer = new javax.swing.JPanel();
        lblBtnViewDealer = new javax.swing.JLabel();
        btnModifyDealer = new javax.swing.JPanel();
        lblBtnModifyDealer = new javax.swing.JLabel();
        PanelAddDealer = new javax.swing.JPanel();
        PanelAddDealerContent = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        txtAddDealerID = new javax.swing.JTextField();
        txtAddDealerName = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        txtAddDealerTelephone = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        txtAddDealerEmailID = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        txtAddDealerAddressNo = new javax.swing.JTextField();
        txtAddDealerAddressLine1 = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        txtAddDealerAddressLine2 = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        btnAddDealerSave = new javax.swing.JButton();
        btnAddDealerClear = new javax.swing.JButton();
        txtAddDealerCity = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        PanelDeleteDealer = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        PanelDeleteDealerContent = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        txtDeleteDealerIDSearch = new javax.swing.JTextField();
        txtDeleteDealerName = new javax.swing.JLabel();
        txtDeleteDealerTelephone = new javax.swing.JLabel();
        txtDeleteDealerEmailID = new javax.swing.JLabel();
        txtDeleteDealerAddressNo = new javax.swing.JLabel();
        txtDeleteDealerAddressLine1 = new javax.swing.JLabel();
        txtDeleteDealerAddressLine2 = new javax.swing.JLabel();
        btnDeleteDealerDelete = new javax.swing.JButton();
        btnDeleteDealerClear = new javax.swing.JButton();
        txtDeleteDealerCity = new javax.swing.JLabel();
        btnDeleteDealerIDSearch = new javax.swing.JButton();
        PanelViewDealer = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        cmbViewDealerSearch = new javax.swing.JComboBox<>();
        txtViewDealerSearch = new javax.swing.JTextField();
        btnViewDealerSearch = new javax.swing.JButton();
        btnViewDealerClear = new javax.swing.JButton();
        btnViewDealerAll = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        TblViewDealer = new javax.swing.JTable();
        PanelViewDealerContent = new javax.swing.JPanel();
        txtViewDealerID = new javax.swing.JLabel();
        txtViewDealerName = new javax.swing.JLabel();
        txtViewDealerAddressNo = new javax.swing.JLabel();
        txtViewDealerAddressLine1 = new javax.swing.JLabel();
        txtViewDealerAddressLine2 = new javax.swing.JLabel();
        txtViewDealerCity = new javax.swing.JLabel();
        txtViewDealerTelephone = new javax.swing.JLabel();
        txtViewDealerEmailID = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        PanelModifyDealer = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        PanelModifyDealerContent = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        txtModifyDealerID = new javax.swing.JTextField();
        txtModifyDealerName = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        txtModifyDealerTelephone = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        txtModifyDealerEmailID = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        txtModifyDealerAddressNo = new javax.swing.JTextField();
        txtModifyDealerAddressLine1 = new javax.swing.JTextField();
        jLabel117 = new javax.swing.JLabel();
        txtModifyDealerAddressLine2 = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        btnModifyDealerSave = new javax.swing.JButton();
        btnModifyDealerClear = new javax.swing.JButton();
        txtModifyDealerCity = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        btnModifyDealerIDSearch = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        ControlPanel = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        PanelMenu = new javax.swing.JPanel();
        lblDashboard = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblOrders = new javax.swing.JLabel();
        lblItem = new javax.swing.JLabel();
        lblSalesperson = new javax.swing.JLabel();
        lblSales = new javax.swing.JLabel();
        lblCustomer = new javax.swing.JLabel();
        lblDealer = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        LblUserImage = new javax.swing.JLabel();
        txtUserName = new javax.swing.JLabel();
        txtUserType = new javax.swing.JLabel();
        txtUserEmail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1000, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PanelDashboard.setBackground(new java.awt.Color(204, 204, 204));
        PanelDashboard.setPreferredSize(new java.awt.Dimension(800, 540));

        PanelDashboardContent.setBackground(new java.awt.Color(204, 204, 204));
        PanelDashboardContent.setForeground(new java.awt.Color(0, 102, 102));

        jLabel154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calendar.png"))); // NOI18N

        txtDashboardDate.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtDashboardDate.setForeground(new java.awt.Color(153, 153, 255));
        txtDashboardDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDashboardDate.setText("Date");

        jLabel157.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clock.png"))); // NOI18N

        txtDashboardTime.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        txtDashboardTime.setForeground(new java.awt.Color(153, 153, 255));
        txtDashboardTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDashboardTime.setText("Time");

        PanelTotalOrders.setBackground(new java.awt.Color(255, 255, 255));
        PanelTotalOrders.setOpaque(false);

        txtTotalOrders1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTotalOrders1.setForeground(new java.awt.Color(0, 102, 102));
        txtTotalOrders1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalOrders1.setText("05");

        jLabel173.setBackground(new java.awt.Color(204, 102, 255));
        jLabel173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Total Orders.png"))); // NOI18N

        jLabel161.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel161.setForeground(new java.awt.Color(0, 0, 0));
        jLabel161.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel161.setText("Pending Orders");

        javax.swing.GroupLayout PanelTotalOrdersLayout = new javax.swing.GroupLayout(PanelTotalOrders);
        PanelTotalOrders.setLayout(PanelTotalOrdersLayout);
        PanelTotalOrdersLayout.setHorizontalGroup(
            PanelTotalOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTotalOrdersLayout.createSequentialGroup()
                .addComponent(jLabel161, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTotalOrdersLayout.createSequentialGroup()
                .addGap(0, 63, Short.MAX_VALUE)
                .addComponent(jLabel173)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalOrders1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        PanelTotalOrdersLayout.setVerticalGroup(
            PanelTotalOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTotalOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel161)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTotalOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel173, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotalOrders1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        PanelTotalSales.setBackground(new java.awt.Color(255, 255, 255));
        PanelTotalSales.setOpaque(false);

        txtTotalSales1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTotalSales1.setForeground(new java.awt.Color(0, 102, 102));
        txtTotalSales1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTotalSales1.setText("100000");

        jLabel174.setBackground(new java.awt.Color(204, 102, 255));
        jLabel174.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Total Sales.png"))); // NOI18N

        jLabel175.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel175.setForeground(new java.awt.Color(0, 102, 102));
        jLabel175.setText("Rs.");

        jLabel176.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel176.setForeground(new java.awt.Color(0, 0, 0));
        jLabel176.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel176.setText("Today Sales");

        javax.swing.GroupLayout PanelTotalSalesLayout = new javax.swing.GroupLayout(PanelTotalSales);
        PanelTotalSales.setLayout(PanelTotalSalesLayout);
        PanelTotalSalesLayout.setHorizontalGroup(
            PanelTotalSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTotalSalesLayout.createSequentialGroup()
                .addGroup(PanelTotalSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTotalSalesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel176, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelTotalSalesLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel174)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel175)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalSales1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelTotalSalesLayout.setVerticalGroup(
            PanelTotalSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTotalSalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel176)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTotalSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTotalSales1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel174, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel175, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        PanelTotalProfit.setBackground(new java.awt.Color(255, 255, 255));
        PanelTotalProfit.setOpaque(false);

        jLabel164.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel164.setForeground(new java.awt.Color(0, 0, 0));
        jLabel164.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel164.setText("Today Returns");

        jLabel177.setBackground(new java.awt.Color(204, 102, 255));
        jLabel177.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Total Profit.png"))); // NOI18N

        jLabel178.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel178.setForeground(new java.awt.Color(0, 102, 102));
        jLabel178.setText("Rs.");

        txtTotalProfit1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTotalProfit1.setForeground(new java.awt.Color(0, 102, 102));
        txtTotalProfit1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTotalProfit1.setText("200000");

        javax.swing.GroupLayout PanelTotalProfitLayout = new javax.swing.GroupLayout(PanelTotalProfit);
        PanelTotalProfit.setLayout(PanelTotalProfitLayout);
        PanelTotalProfitLayout.setHorizontalGroup(
            PanelTotalProfitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTotalProfitLayout.createSequentialGroup()
                .addGroup(PanelTotalProfitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTotalProfitLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel177)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel178)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalProfit1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                    .addComponent(jLabel164, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelTotalProfitLayout.setVerticalGroup(
            PanelTotalProfitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTotalProfitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel164)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTotalProfitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel177, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelTotalProfitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotalProfit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel178, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        PanelTotalReturns.setBackground(new java.awt.Color(255, 255, 255));
        PanelTotalReturns.setOpaque(false);

        txtTotalReturns1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTotalReturns1.setForeground(new java.awt.Color(0, 102, 102));
        txtTotalReturns1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalReturns1.setText("03");

        jLabel179.setBackground(new java.awt.Color(204, 102, 255));
        jLabel179.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Total Return.png"))); // NOI18N

        jLabel180.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel180.setForeground(new java.awt.Color(0, 0, 0));
        jLabel180.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel180.setText("Sale Count");

        javax.swing.GroupLayout PanelTotalReturnsLayout = new javax.swing.GroupLayout(PanelTotalReturns);
        PanelTotalReturns.setLayout(PanelTotalReturnsLayout);
        PanelTotalReturnsLayout.setHorizontalGroup(
            PanelTotalReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTotalReturnsLayout.createSequentialGroup()
                .addGroup(PanelTotalReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTotalReturnsLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel179)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalReturns1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addComponent(jLabel180, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelTotalReturnsLayout.setVerticalGroup(
            PanelTotalReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTotalReturnsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel180)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTotalReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel179, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotalReturns1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        panelReportMenu.setBackground(new java.awt.Color(255, 255, 255));
        panelReportMenu.setOpaque(false);

        jLabel151.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel151.setForeground(new java.awt.Color(0, 102, 102));
        jLabel151.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel151.setText("Reports");

        btnDashboardUserReport.setBackground(java.awt.Color.lightGray);
        btnDashboardUserReport.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboardUserReport.setText("   User Report");
        btnDashboardUserReport.setOpaque(true);
        btnDashboardUserReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashboardUserReportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDashboardUserReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDashboardUserReportMouseExited(evt);
            }
        });

        btnDashboardStockReport.setBackground(java.awt.Color.lightGray);
        btnDashboardStockReport.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboardStockReport.setText("   Stock Report");
        btnDashboardStockReport.setOpaque(true);
        btnDashboardStockReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashboardStockReportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDashboardStockReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDashboardStockReportMouseExited(evt);
            }
        });

        btnDashboardDynamicSalesReport.setBackground(java.awt.Color.lightGray);
        btnDashboardDynamicSalesReport.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboardDynamicSalesReport.setText("   Dynamic Sales Report");
        btnDashboardDynamicSalesReport.setOpaque(true);
        btnDashboardDynamicSalesReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashboardDynamicSalesReportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDashboardDynamicSalesReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDashboardDynamicSalesReportMouseExited(evt);
            }
        });

        btnDashboardStaticSalesReport.setBackground(java.awt.Color.lightGray);
        btnDashboardStaticSalesReport.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboardStaticSalesReport.setText("   Static Sales Report");
        btnDashboardStaticSalesReport.setOpaque(true);
        btnDashboardStaticSalesReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashboardStaticSalesReportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDashboardStaticSalesReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDashboardStaticSalesReportMouseExited(evt);
            }
        });

        btnDashboardItemSalesReport.setBackground(java.awt.Color.lightGray);
        btnDashboardItemSalesReport.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboardItemSalesReport.setText("   Item Sales Report");
        btnDashboardItemSalesReport.setOpaque(true);
        btnDashboardItemSalesReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashboardItemSalesReportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDashboardItemSalesReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDashboardItemSalesReportMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelReportMenuLayout = new javax.swing.GroupLayout(panelReportMenu);
        panelReportMenu.setLayout(panelReportMenuLayout);
        panelReportMenuLayout.setHorizontalGroup(
            panelReportMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportMenuLayout.createSequentialGroup()
                .addComponent(jLabel151, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReportMenuLayout.createSequentialGroup()
                .addGap(0, 48, Short.MAX_VALUE)
                .addGroup(panelReportMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDashboardStaticSalesReport, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelReportMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnDashboardDynamicSalesReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDashboardStockReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDashboardUserReport, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDashboardItemSalesReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(39, 39, 39))
        );
        panelReportMenuLayout.setVerticalGroup(
            panelReportMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel151)
                .addGap(46, 46, 46)
                .addComponent(btnDashboardDynamicSalesReport, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDashboardStaticSalesReport, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDashboardUserReport, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDashboardStockReport, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDashboardItemSalesReport, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelItemDisplay.setBackground(new java.awt.Color(255, 255, 255));
        PanelItemDisplay.setOpaque(false);

        tblDashboardItem.setBackground(new java.awt.Color(255, 255, 255));
        tblDashboardItem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblDashboardItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Number", "Item Name", "Qty In Hand", "Price"
            }
        ));
        tblDashboardItem.setGridColor(new java.awt.Color(255, 255, 255));
        tblDashboardItem.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tblDashboardItem.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane12.setViewportView(tblDashboardItem);

        javax.swing.GroupLayout PanelItemDisplayLayout = new javax.swing.GroupLayout(PanelItemDisplay);
        PanelItemDisplay.setLayout(PanelItemDisplayLayout);
        PanelItemDisplayLayout.setHorizontalGroup(
            PanelItemDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelItemDisplayLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelItemDisplayLayout.setVerticalGroup(
            PanelItemDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelItemDisplayLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelDashboardContentLayout = new javax.swing.GroupLayout(PanelDashboardContent);
        PanelDashboardContent.setLayout(PanelDashboardContentLayout);
        PanelDashboardContentLayout.setHorizontalGroup(
            PanelDashboardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDashboardContentLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(PanelDashboardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDashboardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PanelDashboardContentLayout.createSequentialGroup()
                            .addComponent(PanelTotalOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(PanelTotalSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(PanelTotalProfit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(PanelItemDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDashboardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDashboardContentLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(PanelDashboardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDashboardContentLayout.createSequentialGroup()
                                .addComponent(txtDashboardTime, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelDashboardContentLayout.createSequentialGroup()
                                .addComponent(txtDashboardDate, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel154))))
                    .addComponent(PanelTotalReturns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelReportMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        PanelDashboardContentLayout.setVerticalGroup(
            PanelDashboardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDashboardContentLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelDashboardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelTotalProfit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelTotalSales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelTotalOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelTotalReturns, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(PanelDashboardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDashboardContentLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PanelDashboardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel154)
                            .addComponent(txtDashboardDate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelDashboardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDashboardTime, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelDashboardContentLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(PanelDashboardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelItemDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelReportMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(300, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelDashboardLayout = new javax.swing.GroupLayout(PanelDashboard);
        PanelDashboard.setLayout(PanelDashboardLayout);
        PanelDashboardLayout.setHorizontalGroup(
            PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDashboardContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelDashboardLayout.setVerticalGroup(
            PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDashboardContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelUser.setBackground(new java.awt.Color(204, 204, 204));
        PanelUser.setPreferredSize(new java.awt.Dimension(800, 540));

        PanelControlUser.setBackground(new java.awt.Color(204, 204, 204));

        btnAddUser.setBackground(new java.awt.Color(153, 153, 153));
        btnAddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddUserMouseClicked(evt);
            }
        });

        lblBtnAddUser.setBackground(new java.awt.Color(0, 102, 102));
        lblBtnAddUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnAddUser.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnAddUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnAddUser.setText("Add");
        lblBtnAddUser.setOpaque(true);
        lblBtnAddUser.setPreferredSize(new java.awt.Dimension(350, 50));
        lblBtnAddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnAddUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnAddUserLayout = new javax.swing.GroupLayout(btnAddUser);
        btnAddUser.setLayout(btnAddUserLayout);
        btnAddUserLayout.setHorizontalGroup(
            btnAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnAddUserLayout.setVerticalGroup(
            btnAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnAddUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnViewUser.setBackground(new java.awt.Color(153, 153, 153));
        btnViewUser.setPreferredSize(new java.awt.Dimension(350, 50));
        btnViewUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewUserMouseClicked(evt);
            }
        });

        lblBtnViewUser.setBackground(new java.awt.Color(0, 102, 102));
        lblBtnViewUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnViewUser.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnViewUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnViewUser.setText("View");
        lblBtnViewUser.setOpaque(true);
        lblBtnViewUser.setPreferredSize(new java.awt.Dimension(350, 50));
        lblBtnViewUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnViewUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnViewUserLayout = new javax.swing.GroupLayout(btnViewUser);
        btnViewUser.setLayout(btnViewUserLayout);
        btnViewUserLayout.setHorizontalGroup(
            btnViewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnViewUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnViewUserLayout.setVerticalGroup(
            btnViewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnViewUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnDeleteUser.setBackground(new java.awt.Color(153, 153, 153));
        btnDeleteUser.setPreferredSize(new java.awt.Dimension(350, 50));
        btnDeleteUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteUserMouseClicked(evt);
            }
        });

        lblBtnDeleteUser.setBackground(new java.awt.Color(0, 102, 102));
        lblBtnDeleteUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnDeleteUser.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnDeleteUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnDeleteUser.setText("Delete");
        lblBtnDeleteUser.setOpaque(true);
        lblBtnDeleteUser.setPreferredSize(new java.awt.Dimension(350, 50));
        lblBtnDeleteUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnDeleteUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnDeleteUserLayout = new javax.swing.GroupLayout(btnDeleteUser);
        btnDeleteUser.setLayout(btnDeleteUserLayout);
        btnDeleteUserLayout.setHorizontalGroup(
            btnDeleteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnDeleteUserLayout.setVerticalGroup(
            btnDeleteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnDeleteUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnModifyUser.setBackground(new java.awt.Color(153, 153, 153));
        btnModifyUser.setPreferredSize(new java.awt.Dimension(350, 50));
        btnModifyUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModifyUserMouseClicked(evt);
            }
        });

        lblBtnModifyUser.setBackground(new java.awt.Color(0, 102, 102));
        lblBtnModifyUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnModifyUser.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnModifyUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnModifyUser.setText("Modify");
        lblBtnModifyUser.setOpaque(true);
        lblBtnModifyUser.setPreferredSize(new java.awt.Dimension(350, 50));
        lblBtnModifyUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnModifyUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnModifyUserLayout = new javax.swing.GroupLayout(btnModifyUser);
        btnModifyUser.setLayout(btnModifyUserLayout);
        btnModifyUserLayout.setHorizontalGroup(
            btnModifyUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnModifyUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnModifyUserLayout.setVerticalGroup(
            btnModifyUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnModifyUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnResetPasswordUser.setBackground(new java.awt.Color(153, 153, 153));
        btnResetPasswordUser.setPreferredSize(new java.awt.Dimension(350, 50));
        btnResetPasswordUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetPasswordUserMouseClicked(evt);
            }
        });

        lblBtnResetPasswordUser.setBackground(new java.awt.Color(0, 102, 102));
        lblBtnResetPasswordUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnResetPasswordUser.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnResetPasswordUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnResetPasswordUser.setText("Reset Password");
        lblBtnResetPasswordUser.setOpaque(true);
        lblBtnResetPasswordUser.setPreferredSize(new java.awt.Dimension(350, 50));
        lblBtnResetPasswordUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnResetPasswordUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnResetPasswordUserLayout = new javax.swing.GroupLayout(btnResetPasswordUser);
        btnResetPasswordUser.setLayout(btnResetPasswordUserLayout);
        btnResetPasswordUserLayout.setHorizontalGroup(
            btnResetPasswordUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnResetPasswordUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnResetPasswordUserLayout.setVerticalGroup(
            btnResetPasswordUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnResetPasswordUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnUserOperation.setBackground(new java.awt.Color(153, 153, 153));
        btnUserOperation.setPreferredSize(new java.awt.Dimension(350, 50));
        btnUserOperation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserOperationMouseClicked(evt);
            }
        });

        lblBtnUserOperationUser.setBackground(new java.awt.Color(0, 102, 102));
        lblBtnUserOperationUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnUserOperationUser.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnUserOperationUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnUserOperationUser.setText("User Operation");
        lblBtnUserOperationUser.setOpaque(true);
        lblBtnUserOperationUser.setPreferredSize(new java.awt.Dimension(350, 50));
        lblBtnUserOperationUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnUserOperationUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnUserOperationUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnUserOperationUserMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnUserOperationLayout = new javax.swing.GroupLayout(btnUserOperation);
        btnUserOperation.setLayout(btnUserOperationLayout);
        btnUserOperationLayout.setHorizontalGroup(
            btnUserOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnUserOperationUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnUserOperationLayout.setVerticalGroup(
            btnUserOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnUserOperationUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelControlUserLayout = new javax.swing.GroupLayout(PanelControlUser);
        PanelControlUser.setLayout(PanelControlUserLayout);
        PanelControlUserLayout.setHorizontalGroup(
            PanelControlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlUserLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelControlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModifyUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelControlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetPasswordUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelControlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUserOperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        PanelControlUserLayout.setVerticalGroup(
            PanelControlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelControlUserLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(PanelControlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(PanelControlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUserOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnResetPasswordUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModifyUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        PanelAddUser.setBackground(new java.awt.Color(204, 204, 204));

        PanelAddUserPersonalDetails.setPreferredSize(new java.awt.Dimension(350, 380));
        PanelAddUserPersonalDetails.setRequestFocusEnabled(false);

        jLabel7.setText("Address");

        jLabel11.setText("Telephone");

        jLabel12.setText("Email ID");

        txtAddUserFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddUserFullNameActionPerformed(evt);
            }
        });
        txtAddUserFullName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddUserFullNameKeyReleased(evt);
            }
        });

        txtAddUserAddress.setColumns(10);
        txtAddUserAddress.setRows(2);
        txtAddUserAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddUserAddressKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtAddUserAddress);

        txtAddUserTelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddUserTelephoneKeyReleased(evt);
            }
        });

        txtAddUserEmailID.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtAddUserEmailIDInputMethodTextChanged(evt);
            }
        });
        txtAddUserEmailID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddUserEmailIDKeyReleased(evt);
            }
        });

        jLabel26.setText("Full Name");

        javax.swing.GroupLayout PanelAddUserPersonalDetailsLayout = new javax.swing.GroupLayout(PanelAddUserPersonalDetails);
        PanelAddUserPersonalDetails.setLayout(PanelAddUserPersonalDetailsLayout);
        PanelAddUserPersonalDetailsLayout.setHorizontalGroup(
            PanelAddUserPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddUserPersonalDetailsLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelAddUserPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAddUserPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAddUserEmailID)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(txtAddUserFullName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddUserTelephone))
                .addGap(28, 28, 28))
        );
        PanelAddUserPersonalDetailsLayout.setVerticalGroup(
            PanelAddUserPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddUserPersonalDetailsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelAddUserPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddUserFullName)
                    .addComponent(jLabel26))
                .addGroup(PanelAddUserPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAddUserPersonalDetailsLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(292, 292, 292))
                    .addGroup(PanelAddUserPersonalDetailsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelAddUserPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddUserTelephone)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(PanelAddUserPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddUserEmailID)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel8.setBackground(new java.awt.Color(0, 102, 102));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("     Personal Details");
        jLabel8.setOpaque(true);

        PanelAddUserDetails.setPreferredSize(new java.awt.Dimension(340, 380));

        jLabel13.setText("User type");

        cmbAddUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Manager", "Cashier" }));
        cmbAddUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAddUserTypeActionPerformed(evt);
            }
        });

        txtAddUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddUserNameKeyReleased(evt);
            }
        });

        jLabel14.setText("Username");

        txtAddUserPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddUserPasswordKeyReleased(evt);
            }
        });

        jLabel15.setText("Password");

        txtAddUserRetypepassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddUserRetypepasswordKeyReleased(evt);
            }
        });

        jLabel16.setText("Retype Password");

        javax.swing.GroupLayout PanelAddUserDetailsLayout = new javax.swing.GroupLayout(PanelAddUserDetails);
        PanelAddUserDetails.setLayout(PanelAddUserDetailsLayout);
        PanelAddUserDetailsLayout.setHorizontalGroup(
            PanelAddUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddUserDetailsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelAddUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelAddUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddUserPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAddUserName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbAddUserType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAddUserRetypepassword, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        PanelAddUserDetailsLayout.setVerticalGroup(
            PanelAddUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddUserDetailsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelAddUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbAddUserType))
                .addGap(18, 18, 18)
                .addGroup(PanelAddUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddUserName)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelAddUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddUserPassword)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelAddUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddUserRetypepassword)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(177, 177, 177))
        );

        jLabel9.setBackground(new java.awt.Color(0, 102, 102));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("     User Details");
        jLabel9.setOpaque(true);

        PanelAddUserPhoto.setPreferredSize(new java.awt.Dimension(350, 413));

        jLabel17.setText("User Image");

        btnAddUserPhoto.setBackground(new java.awt.Color(0, 102, 102));
        btnAddUserPhoto.setForeground(new java.awt.Color(255, 255, 255));
        btnAddUserPhoto.setText("Browse");
        btnAddUserPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserPhotoActionPerformed(evt);
            }
        });

        txtAddUserPhoto.setBackground(new java.awt.Color(255, 255, 255));
        txtAddUserPhoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtAddUserPhoto.setOpaque(true);
        txtAddUserPhoto.setPreferredSize(new java.awt.Dimension(104, 104));

        javax.swing.GroupLayout PanelAddUserPhotoLayout = new javax.swing.GroupLayout(PanelAddUserPhoto);
        PanelAddUserPhoto.setLayout(PanelAddUserPhotoLayout);
        PanelAddUserPhotoLayout.setHorizontalGroup(
            PanelAddUserPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAddUserPhotoLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(txtAddUserPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAddUserPhotoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddUserPhoto)
                .addGap(68, 68, 68))
        );
        PanelAddUserPhotoLayout.setVerticalGroup(
            PanelAddUserPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddUserPhotoLayout.createSequentialGroup()
                .addGroup(PanelAddUserPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAddUserPhotoLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel17))
                    .addGroup(PanelAddUserPhotoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txtAddUserPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnAddUserPhoto)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jLabel10.setBackground(new java.awt.Color(0, 102, 102));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("     User Photo");
        jLabel10.setOpaque(true);

        btnAddUserCancel.setBackground(new java.awt.Color(255, 0, 0));
        btnAddUserCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnAddUserCancel.setText("Cancel");
        btnAddUserCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserCancelActionPerformed(evt);
            }
        });

        btnAddUserSave.setBackground(new java.awt.Color(0, 102, 102));
        btnAddUserSave.setForeground(new java.awt.Color(255, 255, 255));
        btnAddUserSave.setText("Save");
        btnAddUserSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserSaveActionPerformed(evt);
            }
        });

        jLabel36.setBackground(new java.awt.Color(0, 102, 102));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("     Add User");
        jLabel36.setOpaque(true);

        javax.swing.GroupLayout PanelAddUserLayout = new javax.swing.GroupLayout(PanelAddUser);
        PanelAddUser.setLayout(PanelAddUserLayout);
        PanelAddUserLayout.setHorizontalGroup(
            PanelAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddUserLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelAddUserLayout.createSequentialGroup()
                        .addGroup(PanelAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelAddUserPersonalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanelAddUserDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PanelAddUserPhoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelAddUserLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnAddUserSave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddUserCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(40, 40, 40))
        );
        PanelAddUserLayout.setVerticalGroup(
            PanelAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAddUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(PanelAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PanelAddUserDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelAddUserPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelAddUserPersonalDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddUserSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddUserCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        PanelModifyUser.setBackground(new java.awt.Color(204, 204, 204));

        PanelModifyUserPersonalDetails.setPreferredSize(new java.awt.Dimension(350, 380));
        PanelModifyUserPersonalDetails.setRequestFocusEnabled(false);

        jLabel21.setText("Address");

        jLabel22.setText("Telephone");

        jLabel23.setText("Email ID");

        txtModifyUserFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModifyUserFullNameActionPerformed(evt);
            }
        });
        txtModifyUserFullName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyUserFullNameKeyReleased(evt);
            }
        });

        ModifyUserAddress.setColumns(10);
        ModifyUserAddress.setRows(2);
        ModifyUserAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ModifyUserAddressKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(ModifyUserAddress);

        txtModifyUserTelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyUserTelephoneKeyReleased(evt);
            }
        });

        txtModifyUserEmailID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyUserEmailIDKeyReleased(evt);
            }
        });

        jLabel27.setText("Full Name");

        javax.swing.GroupLayout PanelModifyUserPersonalDetailsLayout = new javax.swing.GroupLayout(PanelModifyUserPersonalDetails);
        PanelModifyUserPersonalDetails.setLayout(PanelModifyUserPersonalDetailsLayout);
        PanelModifyUserPersonalDetailsLayout.setHorizontalGroup(
            PanelModifyUserPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModifyUserPersonalDetailsLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelModifyUserPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelModifyUserPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtModifyUserEmailID)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(txtModifyUserFullName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModifyUserTelephone))
                .addGap(28, 28, 28))
        );
        PanelModifyUserPersonalDetailsLayout.setVerticalGroup(
            PanelModifyUserPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModifyUserPersonalDetailsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelModifyUserPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModifyUserFullName)
                    .addComponent(jLabel27))
                .addGroup(PanelModifyUserPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelModifyUserPersonalDetailsLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(292, 292, 292))
                    .addGroup(PanelModifyUserPersonalDetailsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelModifyUserPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModifyUserTelephone)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(PanelModifyUserPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModifyUserEmailID)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel24.setBackground(new java.awt.Color(0, 102, 102));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("     Personal Details");
        jLabel24.setOpaque(true);

        PanelModifyUserDetails.setPreferredSize(new java.awt.Dimension(340, 380));

        jLabel25.setText("User type");

        txtModifyUserName.setEditable(false);
        txtModifyUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyUserNameKeyReleased(evt);
            }
        });

        jLabel28.setText("Username");

        txtModifyUserPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyUserPasswordKeyReleased(evt);
            }
        });

        jLabel29.setText("Password");

        txtModifyUserRetypepassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyUserRetypepasswordKeyReleased(evt);
            }
        });

        jLabel30.setText("Retype Password");

        txtModifyUserType.setEditable(false);

        javax.swing.GroupLayout PanelModifyUserDetailsLayout = new javax.swing.GroupLayout(PanelModifyUserDetails);
        PanelModifyUserDetails.setLayout(PanelModifyUserDetailsLayout);
        PanelModifyUserDetailsLayout.setHorizontalGroup(
            PanelModifyUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModifyUserDetailsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelModifyUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelModifyUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModifyUserPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(txtModifyUserName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtModifyUserRetypepassword)
                    .addComponent(txtModifyUserType))
                .addGap(32, 32, 32))
        );
        PanelModifyUserDetailsLayout.setVerticalGroup(
            PanelModifyUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModifyUserDetailsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PanelModifyUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtModifyUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelModifyUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModifyUserName)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelModifyUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModifyUserPassword)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelModifyUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModifyUserRetypepassword)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
        );

        jLabel31.setBackground(new java.awt.Color(0, 102, 102));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("     User Details");
        jLabel31.setOpaque(true);

        PanelModifyUserPhoto.setPreferredSize(new java.awt.Dimension(350, 413));

        jLabel32.setText("User Image");

        btnModifyUserPhoto.setBackground(new java.awt.Color(0, 102, 102));
        btnModifyUserPhoto.setForeground(new java.awt.Color(255, 255, 255));
        btnModifyUserPhoto.setText("Browse");
        btnModifyUserPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyUserPhotoActionPerformed(evt);
            }
        });

        txtModifyUserPhoto.setBackground(new java.awt.Color(255, 255, 255));
        txtModifyUserPhoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtModifyUserPhoto.setOpaque(true);
        txtModifyUserPhoto.setPreferredSize(new java.awt.Dimension(104, 104));

        javax.swing.GroupLayout PanelModifyUserPhotoLayout = new javax.swing.GroupLayout(PanelModifyUserPhoto);
        PanelModifyUserPhoto.setLayout(PanelModifyUserPhotoLayout);
        PanelModifyUserPhotoLayout.setHorizontalGroup(
            PanelModifyUserPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelModifyUserPhotoLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(txtModifyUserPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelModifyUserPhotoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModifyUserPhoto)
                .addGap(68, 68, 68))
        );
        PanelModifyUserPhotoLayout.setVerticalGroup(
            PanelModifyUserPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModifyUserPhotoLayout.createSequentialGroup()
                .addGroup(PanelModifyUserPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelModifyUserPhotoLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel32))
                    .addGroup(PanelModifyUserPhotoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txtModifyUserPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnModifyUserPhoto)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jLabel33.setBackground(new java.awt.Color(0, 102, 102));
        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("     User Photo");
        jLabel33.setOpaque(true);

        btnModifyUserCancel.setBackground(new java.awt.Color(255, 0, 0));
        btnModifyUserCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnModifyUserCancel.setText("Cancel");
        btnModifyUserCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyUserCancelActionPerformed(evt);
            }
        });

        btnModifyUserSave.setBackground(new java.awt.Color(0, 102, 102));
        btnModifyUserSave.setForeground(new java.awt.Color(255, 255, 255));
        btnModifyUserSave.setText("Modify");
        btnModifyUserSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyUserSaveActionPerformed(evt);
            }
        });

        jLabel34.setBackground(new java.awt.Color(0, 102, 102));
        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("     Modify User");
        jLabel34.setOpaque(true);

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("By Username");

        txtModifyUserSearchUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtModifyUserSearchUsernameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyUserSearchUsernameKeyReleased(evt);
            }
        });

        btnModifyUserSearchUsername.setBackground(new java.awt.Color(51, 153, 255));
        btnModifyUserSearchUsername.setForeground(new java.awt.Color(255, 255, 255));
        btnModifyUserSearchUsername.setText("Search");
        btnModifyUserSearchUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyUserSearchUsernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelModifyUserLayout = new javax.swing.GroupLayout(PanelModifyUser);
        PanelModifyUser.setLayout(PanelModifyUserLayout);
        PanelModifyUserLayout.setHorizontalGroup(
            PanelModifyUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModifyUserLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelModifyUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelModifyUserLayout.createSequentialGroup()
                        .addGroup(PanelModifyUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PanelModifyUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PanelModifyUserPersonalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelModifyUserLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtModifyUserSearchUsername)))
                        .addGap(18, 18, 18)
                        .addGroup(PanelModifyUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModifyUserSearchUsername)
                            .addGroup(PanelModifyUserLayout.createSequentialGroup()
                                .addGroup(PanelModifyUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PanelModifyUserDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelModifyUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(PanelModifyUserPhoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelModifyUserLayout.createSequentialGroup()
                                .addComponent(btnModifyUserSave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModifyUserCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))))
                .addGap(0, 0, 0))
        );
        PanelModifyUserLayout.setVerticalGroup(
            PanelModifyUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelModifyUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelModifyUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtModifyUserSearchUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifyUserSearchUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelModifyUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelModifyUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelModifyUserDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelModifyUserPersonalDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelModifyUserPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelModifyUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifyUserSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifyUserCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        PanelUserOperation.setBackground(new java.awt.Color(204, 204, 204));

        jLabel39.setBackground(new java.awt.Color(0, 102, 102));
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("     User Operations");
        jLabel39.setOpaque(true);
        jLabel39.setPreferredSize(new java.awt.Dimension(1086, 30));

        javax.swing.GroupLayout PanelUserOperationLayout = new javax.swing.GroupLayout(PanelUserOperation);
        PanelUserOperation.setLayout(PanelUserOperationLayout);
        PanelUserOperationLayout.setHorizontalGroup(
            PanelUserOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUserOperationLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        PanelUserOperationLayout.setVerticalGroup(
            PanelUserOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUserOperationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(482, Short.MAX_VALUE))
        );

        PanelResetPassword.setBackground(new java.awt.Color(204, 204, 204));

        LableResetUser.setBackground(new java.awt.Color(0, 102, 102));
        LableResetUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LableResetUser.setForeground(new java.awt.Color(255, 255, 255));
        LableResetUser.setText("     Reset Password");
        LableResetUser.setOpaque(true);

        PanelresetUserContents.setPreferredSize(new java.awt.Dimension(495, 280));

        jLabel20.setText("Username");

        txtResetPasswordUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtResetPasswordUsernameKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout PanelresetUserContentsLayout = new javax.swing.GroupLayout(PanelresetUserContents);
        PanelresetUserContents.setLayout(PanelresetUserContentsLayout);
        PanelresetUserContentsLayout.setHorizontalGroup(
            PanelresetUserContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelresetUserContentsLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtResetPasswordUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        PanelresetUserContentsLayout.setVerticalGroup(
            PanelresetUserContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelresetUserContentsLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(PanelresetUserContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtResetPasswordUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133))
        );

        btnResetUserPasswordReset.setBackground(new java.awt.Color(0, 102, 102));
        btnResetUserPasswordReset.setForeground(new java.awt.Color(255, 255, 255));
        btnResetUserPasswordReset.setText("Reset");
        btnResetUserPasswordReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetUserPasswordResetActionPerformed(evt);
            }
        });

        btnResetUserPasswordResetCancel.setBackground(new java.awt.Color(255, 0, 0));
        btnResetUserPasswordResetCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnResetUserPasswordResetCancel.setText("Cancel");
        btnResetUserPasswordResetCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetUserPasswordResetCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelResetPasswordLayout = new javax.swing.GroupLayout(PanelResetPassword);
        PanelResetPassword.setLayout(PanelResetPasswordLayout);
        PanelResetPasswordLayout.setHorizontalGroup(
            PanelResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelResetPasswordLayout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addGroup(PanelResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PanelresetUserContents, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LableResetUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(341, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelResetPasswordLayout.createSequentialGroup()
                .addContainerGap(425, Short.MAX_VALUE)
                .addComponent(btnResetUserPasswordReset, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnResetUserPasswordResetCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(423, 423, 423))
        );
        PanelResetPasswordLayout.setVerticalGroup(
            PanelResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelResetPasswordLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(LableResetUser, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelresetUserContents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(PanelResetPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetUserPasswordReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetUserPasswordResetCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        panelDeleteUser.setBackground(new java.awt.Color(204, 204, 204));

        LableDeleteUser.setBackground(new java.awt.Color(0, 102, 102));
        LableDeleteUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LableDeleteUser.setForeground(new java.awt.Color(255, 255, 255));
        LableDeleteUser.setText("     Delete User");
        LableDeleteUser.setOpaque(true);

        PanelDeleteUserContents.setPreferredSize(new java.awt.Dimension(495, 280));

        jLabel18.setText("Username");

        txtDeleteUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDeleteUsernameKeyReleased(evt);
            }
        });

        jLabel19.setText("EmailID");

        txtDeleteUserEmailID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDeleteUserEmailIDKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout PanelDeleteUserContentsLayout = new javax.swing.GroupLayout(PanelDeleteUserContents);
        PanelDeleteUserContents.setLayout(PanelDeleteUserContentsLayout);
        PanelDeleteUserContentsLayout.setHorizontalGroup(
            PanelDeleteUserContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeleteUserContentsLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(PanelDeleteUserContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDeleteUserContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDeleteUserEmailID, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(txtDeleteUsername))
                .addGap(57, 57, 57))
        );
        PanelDeleteUserContentsLayout.setVerticalGroup(
            PanelDeleteUserContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeleteUserContentsLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(PanelDeleteUserContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtDeleteUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(PanelDeleteUserContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtDeleteUserEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
        );

        btnDeleteUserCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteUserCancel.setForeground(new java.awt.Color(255, 0, 0));
        btnDeleteUserCancel.setText("Cancel");
        btnDeleteUserCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserCancelActionPerformed(evt);
            }
        });

        btnDeleteUserDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDeleteUserDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteUserDelete.setText("Delete");
        btnDeleteUserDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDeleteUserLayout = new javax.swing.GroupLayout(panelDeleteUser);
        panelDeleteUser.setLayout(panelDeleteUserLayout);
        panelDeleteUserLayout.setHorizontalGroup(
            panelDeleteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeleteUserLayout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addGroup(panelDeleteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelDeleteUserContents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LableDeleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeleteUserLayout.createSequentialGroup()
                .addContainerGap(425, Short.MAX_VALUE)
                .addComponent(btnDeleteUserDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteUserCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(423, 423, 423))
        );
        panelDeleteUserLayout.setVerticalGroup(
            panelDeleteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeleteUserLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(LableDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelDeleteUserContents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panelDeleteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteUserCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteUserDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        PanelViewUser.setBackground(new java.awt.Color(204, 204, 204));
        PanelViewUser.setPreferredSize(new java.awt.Dimension(1166, 495));

        LableViewUserContents.setBackground(new java.awt.Color(0, 102, 102));
        LableViewUserContents.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LableViewUserContents.setForeground(new java.awt.Color(255, 255, 255));
        LableViewUserContents.setText("     User Table");
        LableViewUserContents.setOpaque(true);

        PanelviewUserContents.setPreferredSize(new java.awt.Dimension(495, 280));

        txtViewUserPhoto.setBackground(new java.awt.Color(255, 255, 255));
        txtViewUserPhoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtViewUserPhoto.setOpaque(true);

        txtViewUsername.setText("Username");

        txtViewUserFullname.setText("Full Name");

        txtViewUserAddress.setText("Address");

        txtViewTelephone.setText("Telephone");

        txtViewUserType.setText("User Type");

        txtViewUserEmailID.setText("Email ID");

        javax.swing.GroupLayout PanelviewUserContentsLayout = new javax.swing.GroupLayout(PanelviewUserContents);
        PanelviewUserContents.setLayout(PanelviewUserContentsLayout);
        PanelviewUserContentsLayout.setHorizontalGroup(
            PanelviewUserContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelviewUserContentsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PanelviewUserContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelviewUserContentsLayout.createSequentialGroup()
                        .addGroup(PanelviewUserContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtViewUserFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtViewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtViewUserAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtViewTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(txtViewUserPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelviewUserContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtViewUserEmailID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtViewUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        PanelviewUserContentsLayout.setVerticalGroup(
            PanelviewUserContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelviewUserContentsLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(PanelviewUserContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelviewUserContentsLayout.createSequentialGroup()
                        .addComponent(txtViewUsername)
                        .addGap(18, 18, 18)
                        .addComponent(txtViewUserFullname)
                        .addGap(18, 18, 18)
                        .addComponent(txtViewUserAddress))
                    .addComponent(txtViewUserPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtViewTelephone)
                .addGap(18, 18, 18)
                .addComponent(txtViewUserType)
                .addGap(18, 18, 18)
                .addComponent(txtViewUserEmailID)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jLabel38.setBackground(new java.awt.Color(0, 102, 102));
        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("     View Users");
        jLabel38.setOpaque(true);

        LableViewUserDeatails.setBackground(new java.awt.Color(0, 102, 102));
        LableViewUserDeatails.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LableViewUserDeatails.setForeground(new java.awt.Color(255, 255, 255));
        LableViewUserDeatails.setText("     User Details");
        LableViewUserDeatails.setOpaque(true);

        tblViewUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblViewUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Fullname", "Telephone", "Address", "Email", "User Type"
            }
        ));
        tblViewUser.setGridColor(new java.awt.Color(255, 255, 255));
        tblViewUser.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tblViewUser.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblViewUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblViewUserMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblViewUser);

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Search By Username");

        txtViewUserSearchUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtViewUserSearchUsernameKeyReleased(evt);
            }
        });

        btnViewUserSearch.setBackground(new java.awt.Color(51, 153, 255));
        btnViewUserSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnViewUserSearch.setText("Search");
        btnViewUserSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUserSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelViewUserLayout = new javax.swing.GroupLayout(PanelViewUser);
        PanelViewUser.setLayout(PanelViewUserLayout);
        PanelViewUserLayout.setHorizontalGroup(
            PanelViewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewUserLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelViewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelViewUserLayout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addGap(18, 18, 18)
                        .addComponent(PanelviewUserContents, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 1086, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelViewUserLayout.createSequentialGroup()
                        .addComponent(LableViewUserContents, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LableViewUserDeatails, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73))
            .addGroup(PanelViewUserLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtViewUserSearchUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewUserSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelViewUserLayout.setVerticalGroup(
            PanelViewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewUserLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelViewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtViewUserSearchUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewUserSearch))
                .addGap(16, 16, 16)
                .addGroup(PanelViewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LableViewUserContents, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LableViewUserDeatails, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelViewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(PanelviewUserContents, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelUserLayout = new javax.swing.GroupLayout(PanelUser);
        PanelUser.setLayout(PanelUserLayout);
        PanelUserLayout.setHorizontalGroup(
            PanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelControlUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelViewUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(PanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelDeleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelResetPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelUserOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelUserLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(PanelModifyUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PanelUserLayout.setVerticalGroup(
            PanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUserLayout.createSequentialGroup()
                .addComponent(PanelControlUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelViewUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
            .addGroup(PanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUserLayout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addComponent(PanelAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(PanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUserLayout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addComponent(panelDeleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(PanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUserLayout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addComponent(PanelResetPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(PanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUserLayout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addComponent(PanelUserOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(PanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelUserLayout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addComponent(PanelModifyUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        PanelOrder.setBackground(new java.awt.Color(204, 204, 204));

        PanelControlOrder.setBackground(new java.awt.Color(204, 204, 204));

        btnPlaceOrder.setBackground(new java.awt.Color(153, 153, 153));
        btnPlaceOrder.setPreferredSize(new java.awt.Dimension(258, 50));

        lblBtnPlaceOrder.setBackground(new java.awt.Color(0, 102, 102));
        lblBtnPlaceOrder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnPlaceOrder.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnPlaceOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnPlaceOrder.setText("Place");
        lblBtnPlaceOrder.setOpaque(true);
        lblBtnPlaceOrder.setPreferredSize(new java.awt.Dimension(350, 50));
        lblBtnPlaceOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnPlaceOrderMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnPlaceOrderLayout = new javax.swing.GroupLayout(btnPlaceOrder);
        btnPlaceOrder.setLayout(btnPlaceOrderLayout);
        btnPlaceOrderLayout.setHorizontalGroup(
            btnPlaceOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnPlaceOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        btnPlaceOrderLayout.setVerticalGroup(
            btnPlaceOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnPlaceOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnViewOrder.setBackground(new java.awt.Color(153, 153, 153));
        btnViewOrder.setPreferredSize(new java.awt.Dimension(350, 50));

        lblBtnViewOrder.setBackground(new java.awt.Color(0, 102, 102));
        lblBtnViewOrder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnViewOrder.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnViewOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnViewOrder.setText("View");
        lblBtnViewOrder.setOpaque(true);
        lblBtnViewOrder.setPreferredSize(new java.awt.Dimension(350, 50));
        lblBtnViewOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnViewOrderMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnViewOrderLayout = new javax.swing.GroupLayout(btnViewOrder);
        btnViewOrder.setLayout(btnViewOrderLayout);
        btnViewOrderLayout.setHorizontalGroup(
            btnViewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnViewOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        btnViewOrderLayout.setVerticalGroup(
            btnViewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnViewOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnOrder3.setBackground(new java.awt.Color(153, 153, 153));
        btnOrder3.setPreferredSize(new java.awt.Dimension(350, 50));

        lblBtnOrder3.setBackground(new java.awt.Color(0, 102, 102));
        lblBtnOrder3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnOrder3.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnOrder3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnOrder3.setText("3");
        lblBtnOrder3.setOpaque(true);
        lblBtnOrder3.setPreferredSize(new java.awt.Dimension(350, 50));
        lblBtnOrder3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnOrder3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnOrder3Layout = new javax.swing.GroupLayout(btnOrder3);
        btnOrder3.setLayout(btnOrder3Layout);
        btnOrder3Layout.setHorizontalGroup(
            btnOrder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnOrder3, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        btnOrder3Layout.setVerticalGroup(
            btnOrder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnOrder3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnOrder4.setBackground(new java.awt.Color(153, 153, 153));
        btnOrder4.setPreferredSize(new java.awt.Dimension(350, 50));

        lblBtnOrder4.setBackground(new java.awt.Color(0, 102, 102));
        lblBtnOrder4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnOrder4.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnOrder4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnOrder4.setText("4");
        lblBtnOrder4.setOpaque(true);
        lblBtnOrder4.setPreferredSize(new java.awt.Dimension(350, 50));
        lblBtnOrder4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnOrder4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnOrder4Layout = new javax.swing.GroupLayout(btnOrder4);
        btnOrder4.setLayout(btnOrder4Layout);
        btnOrder4Layout.setHorizontalGroup(
            btnOrder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnOrder4, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        btnOrder4Layout.setVerticalGroup(
            btnOrder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnOrder4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout PanelControlOrderLayout = new javax.swing.GroupLayout(PanelControlOrder);
        PanelControlOrder.setLayout(PanelControlOrderLayout);
        PanelControlOrderLayout.setHorizontalGroup(
            PanelControlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlOrderLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOrder3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOrder4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelControlOrderLayout.setVerticalGroup(
            PanelControlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlOrderLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PanelControlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOrder3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrder4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jLabel89.setBackground(new java.awt.Color(0, 102, 102));
        jLabel89.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("     Order");
        jLabel89.setOpaque(true);
        jLabel89.setPreferredSize(new java.awt.Dimension(1086, 30));

        PanelOrder4.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout PanelOrder4Layout = new javax.swing.GroupLayout(PanelOrder4);
        PanelOrder4.setLayout(PanelOrder4Layout);
        PanelOrder4Layout.setHorizontalGroup(
            PanelOrder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
        );
        PanelOrder4Layout.setVerticalGroup(
            PanelOrder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 807, Short.MAX_VALUE)
        );

        PanelOrder3.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout PanelOrder3Layout = new javax.swing.GroupLayout(PanelOrder3);
        PanelOrder3.setLayout(PanelOrder3Layout);
        PanelOrder3Layout.setHorizontalGroup(
            PanelOrder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
        );
        PanelOrder3Layout.setVerticalGroup(
            PanelOrder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 807, Short.MAX_VALUE)
        );

        PanelViewOrder.setBackground(new java.awt.Color(204, 204, 204));
        PanelViewOrder.setPreferredSize(new java.awt.Dimension(1237, 796));

        jLabel138.setBackground(new java.awt.Color(0, 102, 102));
        jLabel138.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(255, 255, 255));
        jLabel138.setText("     View Order");
        jLabel138.setOpaque(true);

        jLabel139.setText("Search By");

        cmbViewOrderSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Order ID", "Date", "Dealer ID", "Dealer Name", "Salesperson Name", "Order Status" }));

        txtViewOrderSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtViewOrderSearchKeyReleased(evt);
            }
        });

        btnViewOrderSearch.setBackground(new java.awt.Color(51, 153, 255));
        btnViewOrderSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnViewOrderSearch.setText("Search");
        btnViewOrderSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderSearchActionPerformed(evt);
            }
        });

        btnViewOrderSearchAll.setBackground(new java.awt.Color(0, 102, 102));
        btnViewOrderSearchAll.setForeground(new java.awt.Color(255, 255, 255));
        btnViewOrderSearchAll.setText("View All");
        btnViewOrderSearchAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderSearchAllActionPerformed(evt);
            }
        });

        btnViewOrderSearchClear.setBackground(new java.awt.Color(255, 255, 255));
        btnViewOrderSearchClear.setForeground(new java.awt.Color(255, 51, 51));
        btnViewOrderSearchClear.setText("Clear");
        btnViewOrderSearchClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderSearchClearActionPerformed(evt);
            }
        });

        tableViewOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "Date", "Dealer ID", "Name", "Sale By", "Status"
            }
        ));
        tableViewOrder.setGridColor(new java.awt.Color(255, 255, 255));
        tableViewOrder.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tableViewOrder.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableViewOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableViewOrderMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tableViewOrder);

        jLabel143.setBackground(new java.awt.Color(0, 102, 102));
        jLabel143.setForeground(new java.awt.Color(0, 102, 102));
        jLabel143.setText("Click on row to view item in order");

        jLabel144.setBackground(new java.awt.Color(0, 102, 102));
        jLabel144.setForeground(new java.awt.Color(255, 255, 255));
        jLabel144.setText("     Items In Order");
        jLabel144.setOpaque(true);

        tableViewOrderItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item No", "Item Name", "Quantity"
            }
        ));
        tableViewOrderItem.setGridColor(new java.awt.Color(255, 255, 255));
        tableViewOrderItem.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tableViewOrderItem.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane11.setViewportView(tableViewOrderItem);

        jLabel145.setBackground(new java.awt.Color(204, 0, 0));
        jLabel145.setForeground(new java.awt.Color(204, 0, 0));
        jLabel145.setText("Enter orderID to cancel order");

        txtViewOrderCancelOrderID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtViewOrderCancelOrderIDKeyReleased(evt);
            }
        });

        btnViewOrderCancel.setBackground(new java.awt.Color(0, 102, 102));
        btnViewOrderCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnViewOrderCancel.setText("Confirm");
        btnViewOrderCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderCancelActionPerformed(evt);
            }
        });

        txtViewOrderCancelClear.setBackground(new java.awt.Color(255, 255, 255));
        txtViewOrderCancelClear.setForeground(new java.awt.Color(255, 51, 51));
        txtViewOrderCancelClear.setText("Clear");
        txtViewOrderCancelClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViewOrderCancelClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelViewOrderCancelContentLayout = new javax.swing.GroupLayout(PanelViewOrderCancelContent);
        PanelViewOrderCancelContent.setLayout(PanelViewOrderCancelContentLayout);
        PanelViewOrderCancelContentLayout.setHorizontalGroup(
            PanelViewOrderCancelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelViewOrderCancelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtViewOrderCancelOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnViewOrderCancel)
                .addGap(18, 18, 18)
                .addComponent(txtViewOrderCancelClear)
                .addGap(75, 75, 75))
        );

        PanelViewOrderCancelContentLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnViewOrderCancel, txtViewOrderCancelClear});

        PanelViewOrderCancelContentLayout.setVerticalGroup(
            PanelViewOrderCancelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewOrderCancelContentLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PanelViewOrderCancelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtViewOrderCancelOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewOrderCancel)
                    .addComponent(txtViewOrderCancelClear)
                    .addComponent(jLabel145))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelViewOrderLayout = new javax.swing.GroupLayout(PanelViewOrder);
        PanelViewOrder.setLayout(PanelViewOrderLayout);
        PanelViewOrderLayout.setHorizontalGroup(
            PanelViewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewOrderLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelViewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelViewOrderLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(PanelViewOrderLayout.createSequentialGroup()
                        .addGroup(PanelViewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel138, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelViewOrderLayout.createSequentialGroup()
                                .addGroup(PanelViewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(PanelViewOrderCancelContent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(PanelViewOrderLayout.createSequentialGroup()
                                        .addGroup(PanelViewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(PanelViewOrderLayout.createSequentialGroup()
                                                .addComponent(jLabel139)
                                                .addGap(18, 18, 18)
                                                .addComponent(cmbViewOrderSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtViewOrderSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnViewOrderSearch)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnViewOrderSearchAll)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnViewOrderSearchClear))
                                            .addComponent(jLabel143, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane10))
                                        .addGap(2, 2, 2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelViewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel144, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addGap(220, 220, 220))))
        );

        PanelViewOrderLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnViewOrderSearch, btnViewOrderSearchAll, btnViewOrderSearchClear});

        PanelViewOrderLayout.setVerticalGroup(
            PanelViewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewOrderLayout.createSequentialGroup()
                .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelViewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel139)
                    .addComponent(cmbViewOrderSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewOrderSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewOrderSearch)
                    .addComponent(btnViewOrderSearchAll)
                    .addComponent(btnViewOrderSearchClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelViewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel143)
                    .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(PanelViewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PanelViewOrderCancelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(314, 314, 314))
        );

        PanelPlaceOrder.setBackground(new java.awt.Color(204, 204, 204));
        PanelPlaceOrder.setPreferredSize(new java.awt.Dimension(1170, 630));

        jLabel90.setBackground(new java.awt.Color(0, 102, 102));
        jLabel90.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setText("     Place Order");
        jLabel90.setOpaque(true);

        jLabel3.setText("Dealer Order");

        jLabel4.setText("Order Number");

        txtPlaceOrderNumber.setEditable(false);
        txtPlaceOrderNumber.setToolTipText("Click here to load next available Dealer Order Number");
        txtPlaceOrderNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPlaceOrderNumberMouseClicked(evt);
            }
        });

        jLabel5.setText("Date");

        txtPlaceOrderDate.setEditable(false);
        txtPlaceOrderDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.LONG))));

        jLabel140.setText("Enter Item");

        cmbPlaceOrderItemSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item Number", "Item Name", "Item Price" }));

        txtPlaceOrderItemSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlaceOrderItemSearchKeyReleased(evt);
            }
        });

        btnPlaceOrderItemSearch.setBackground(new java.awt.Color(51, 153, 255));
        btnPlaceOrderItemSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnPlaceOrderItemSearch.setText("Search");
        btnPlaceOrderItemSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderItemSearchActionPerformed(evt);
            }
        });

        btnPlaceOrderItemSearchClear.setBackground(new java.awt.Color(255, 255, 255));
        btnPlaceOrderItemSearchClear.setForeground(new java.awt.Color(255, 51, 51));
        btnPlaceOrderItemSearchClear.setText("Clear");
        btnPlaceOrderItemSearchClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderItemSearchClearActionPerformed(evt);
            }
        });

        btnPlaceOrderItemSearchViewall.setBackground(new java.awt.Color(0, 102, 102));
        btnPlaceOrderItemSearchViewall.setForeground(new java.awt.Color(255, 255, 255));
        btnPlaceOrderItemSearchViewall.setText("View All");
        btnPlaceOrderItemSearchViewall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderItemSearchViewallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PlaceOrderContent1Layout = new javax.swing.GroupLayout(PlaceOrderContent1);
        PlaceOrderContent1.setLayout(PlaceOrderContent1Layout);
        PlaceOrderContent1Layout.setHorizontalGroup(
            PlaceOrderContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlaceOrderContent1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlaceOrderContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(PlaceOrderContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPlaceOrderNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPlaceOrderItemSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(PlaceOrderContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PlaceOrderContent1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPlaceOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PlaceOrderContent1Layout.createSequentialGroup()
                        .addComponent(txtPlaceOrderItemSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnPlaceOrderItemSearch)
                        .addGap(34, 34, 34)
                        .addComponent(btnPlaceOrderItemSearchClear)
                        .addGap(29, 29, 29)
                        .addComponent(btnPlaceOrderItemSearchViewall)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        PlaceOrderContent1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnPlaceOrderItemSearch, btnPlaceOrderItemSearchClear, btnPlaceOrderItemSearchViewall});

        PlaceOrderContent1Layout.setVerticalGroup(
            PlaceOrderContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlaceOrderContent1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PlaceOrderContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(txtPlaceOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaceOrderNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(PlaceOrderContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel140)
                    .addComponent(cmbPlaceOrderItemSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaceOrderItemSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlaceOrderItemSearch)
                    .addComponent(btnPlaceOrderItemSearchClear)
                    .addComponent(btnPlaceOrderItemSearchViewall))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        TablePlaceOrderViewItem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TablePlaceOrderViewItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Number", "Item Name", "Price", "Qantity In Hand", "Discount Margine"
            }
        ));
        TablePlaceOrderViewItem.setGridColor(new java.awt.Color(255, 255, 255));
        TablePlaceOrderViewItem.setSelectionBackground(new java.awt.Color(0, 102, 102));
        TablePlaceOrderViewItem.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TablePlaceOrderViewItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePlaceOrderViewItemMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(TablePlaceOrderViewItem);

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Click on table to load item details");

        jLabel91.setText("Item ID");

        jLabel92.setText("Qty In Warehouse");

        jLabel137.setText("Quantity");

        txtPlaceOrderQtyInHand.setText("----------------");

        txtPlaceOrderQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlaceOrderQtyKeyReleased(evt);
            }
        });

        txtPlaceOrderItemIDClear.setBackground(new java.awt.Color(255, 255, 255));
        txtPlaceOrderItemIDClear.setForeground(new java.awt.Color(255, 51, 51));
        txtPlaceOrderItemIDClear.setText("Clear");
        txtPlaceOrderItemIDClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlaceOrderItemIDClearActionPerformed(evt);
            }
        });

        txtPlaceOrderAdd.setBackground(new java.awt.Color(0, 102, 102));
        txtPlaceOrderAdd.setForeground(new java.awt.Color(255, 255, 255));
        txtPlaceOrderAdd.setText("ADD");
        txtPlaceOrderAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlaceOrderAddActionPerformed(evt);
            }
        });

        txtPlaceOrderEnterItemId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlaceOrderEnterItemIdKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout PlaceOrderContent2Layout = new javax.swing.GroupLayout(PlaceOrderContent2);
        PlaceOrderContent2.setLayout(PlaceOrderContent2Layout);
        PlaceOrderContent2Layout.setHorizontalGroup(
            PlaceOrderContent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlaceOrderContent2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PlaceOrderContent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel137, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PlaceOrderContent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPlaceOrderQty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaceOrderEnterItemId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaceOrderQtyInHand, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlaceOrderContent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPlaceOrderItemIDClear)
                    .addComponent(txtPlaceOrderAdd))
                .addGap(16, 16, 16))
        );

        PlaceOrderContent2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPlaceOrderAdd, txtPlaceOrderItemIDClear});

        PlaceOrderContent2Layout.setVerticalGroup(
            PlaceOrderContent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlaceOrderContent2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(PlaceOrderContent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(txtPlaceOrderItemIDClear)
                    .addComponent(txtPlaceOrderEnterItemId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PlaceOrderContent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(txtPlaceOrderQtyInHand))
                .addGap(18, 18, 18)
                .addGroup(PlaceOrderContent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel137)
                    .addComponent(txtPlaceOrderQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaceOrderAdd))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        TablePlaceOrderViewAmount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No", "Item Name", "Qty"
            }
        ));
        TablePlaceOrderViewAmount.setGridColor(new java.awt.Color(255, 255, 255));
        TablePlaceOrderViewAmount.setSelectionBackground(new java.awt.Color(0, 102, 102));
        TablePlaceOrderViewAmount.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TablePlaceOrderViewAmount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePlaceOrderViewAmountMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(TablePlaceOrderViewAmount);

        btnPlaceOrderPlace.setBackground(new java.awt.Color(0, 102, 102));
        btnPlaceOrderPlace.setForeground(new java.awt.Color(255, 255, 255));
        btnPlaceOrderPlace.setText("Place");
        btnPlaceOrderPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderPlaceActionPerformed(evt);
            }
        });

        btnPlaceOrderClear.setBackground(new java.awt.Color(255, 255, 255));
        btnPlaceOrderClear.setForeground(new java.awt.Color(255, 51, 51));
        btnPlaceOrderClear.setText("Clear");
        btnPlaceOrderClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderClearActionPerformed(evt);
            }
        });

        jLabel141.setText("Enter Salesperson Number");

        txtPlaceOrderSPID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlaceOrderSPIDKeyReleased(evt);
            }
        });

        jLabel142.setText("Enter Dealer ID");

        txtPlaceOrderDID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlaceOrderDIDKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout PanelPlaceOrderSDContentLayout = new javax.swing.GroupLayout(PanelPlaceOrderSDContent);
        PanelPlaceOrderSDContent.setLayout(PanelPlaceOrderSDContentLayout);
        PanelPlaceOrderSDContentLayout.setHorizontalGroup(
            PanelPlaceOrderSDContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlaceOrderSDContentLayout.createSequentialGroup()
                .addGroup(PanelPlaceOrderSDContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPlaceOrderDID, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelPlaceOrderSDContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelPlaceOrderSDContentLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(PanelPlaceOrderSDContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel141)
                                .addComponent(jLabel142)))
                        .addGroup(PanelPlaceOrderSDContentLayout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(txtPlaceOrderSPID, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelPlaceOrderSDContentLayout.setVerticalGroup(
            PanelPlaceOrderSDContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlaceOrderSDContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel141)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPlaceOrderSPID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel142)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPlaceOrderDID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelPlaceOrderLayout = new javax.swing.GroupLayout(PanelPlaceOrder);
        PanelPlaceOrder.setLayout(PanelPlaceOrderLayout);
        PanelPlaceOrderLayout.setHorizontalGroup(
            PanelPlaceOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlaceOrderLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelPlaceOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelPlaceOrderLayout.createSequentialGroup()
                        .addGroup(PanelPlaceOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPlaceOrderLayout.createSequentialGroup()
                                .addComponent(PlaceOrderContent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelPlaceOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelPlaceOrderLayout.createSequentialGroup()
                                        .addComponent(btnPlaceOrderPlace)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnPlaceOrderClear)
                                        .addGap(6, 6, 6))
                                    .addComponent(PanelPlaceOrderSDContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelPlaceOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PlaceOrderContent1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel90, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 304, Short.MAX_VALUE))))
        );
        PanelPlaceOrderLayout.setVerticalGroup(
            PanelPlaceOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlaceOrderLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PlaceOrderContent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPlaceOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(PanelPlaceOrderLayout.createSequentialGroup()
                        .addComponent(PanelPlaceOrderSDContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelPlaceOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPlaceOrderPlace)
                            .addComponent(btnPlaceOrderClear)))
                    .addComponent(PlaceOrderContent2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(283, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelOrderLayout = new javax.swing.GroupLayout(PanelOrder);
        PanelOrder.setLayout(PanelOrderLayout);
        PanelOrderLayout.setHorizontalGroup(
            PanelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPlaceOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 1485, Short.MAX_VALUE)
            .addGroup(PanelOrderLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelOrderLayout.createSequentialGroup()
                .addComponent(PanelControlOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PanelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelViewOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 1485, Short.MAX_VALUE))
            .addGroup(PanelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelOrder3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelOrder4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelOrderLayout.setVerticalGroup(
            PanelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOrderLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelControlOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelPlaceOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE))
            .addGroup(PanelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelOrderLayout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addComponent(PanelViewOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)))
            .addGroup(PanelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelOrderLayout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addComponent(PanelOrder3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(PanelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelOrderLayout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addComponent(PanelOrder4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        PanelItem.setBackground(new java.awt.Color(204, 204, 204));

        jLabel41.setBackground(new java.awt.Color(0, 102, 102));
        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("     Add Item");
        jLabel41.setOpaque(true);

        PanelAddItemContent.setPreferredSize(new java.awt.Dimension(350, 380));
        PanelAddItemContent.setRequestFocusEnabled(false);

        jLabel42.setText("Item Name");

        jLabel43.setText("Quantity");

        jLabel44.setText("Discount Margine");

        txtAddItemNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddItemNoActionPerformed(evt);
            }
        });
        txtAddItemNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddItemNoKeyReleased(evt);
            }
        });

        txtAddItemQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddItemQuantityKeyReleased(evt);
            }
        });

        txtAddItemDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddItemDiscountKeyReleased(evt);
            }
        });

        jLabel45.setText("Item NO");

        txtAddItemName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddItemNameKeyReleased(evt);
            }
        });

        jLabel49.setText("Price");

        txtAddItemPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddItemPriceKeyReleased(evt);
            }
        });

        btnAddItemSave.setBackground(new java.awt.Color(0, 102, 102));
        btnAddItemSave.setForeground(new java.awt.Color(255, 255, 255));
        btnAddItemSave.setText("Save");
        btnAddItemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemSaveActionPerformed(evt);
            }
        });

        txtAddItemCancel.setBackground(new java.awt.Color(255, 255, 255));
        txtAddItemCancel.setForeground(new java.awt.Color(255, 0, 0));
        txtAddItemCancel.setText("Cancel");
        txtAddItemCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddItemCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAddItemContentLayout = new javax.swing.GroupLayout(PanelAddItemContent);
        PanelAddItemContent.setLayout(PanelAddItemContentLayout);
        PanelAddItemContentLayout.setHorizontalGroup(
            PanelAddItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddItemContentLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelAddItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(PanelAddItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAddItemContentLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnAddItemSave)
                        .addGap(18, 18, 18)
                        .addComponent(txtAddItemCancel)
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(PanelAddItemContentLayout.createSequentialGroup()
                        .addGroup(PanelAddItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddItemPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAddItemDiscount, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAddItemNo)
                            .addComponent(txtAddItemQuantity, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAddItemName, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(30, 30, 30))))
        );

        PanelAddItemContentLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddItemSave, txtAddItemCancel});

        PanelAddItemContentLayout.setVerticalGroup(
            PanelAddItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddItemContentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelAddItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddItemNo)
                    .addComponent(jLabel45))
                .addGap(18, 18, 18)
                .addGroup(PanelAddItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAddItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAddItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddItemPrice)
                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelAddItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddItemQuantity)
                    .addComponent(jLabel43))
                .addGap(18, 18, 18)
                .addGroup(PanelAddItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddItemDiscount)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAddItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddItemSave)
                    .addComponent(txtAddItemCancel))
                .addGap(44, 44, 44))
        );

        jLabel48.setBackground(new java.awt.Color(0, 102, 102));
        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("     Item ");
        jLabel48.setOpaque(true);
        jLabel48.setPreferredSize(new java.awt.Dimension(1086, 30));

        jLabel50.setBackground(new java.awt.Color(0, 102, 102));
        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("     Update Item");
        jLabel50.setOpaque(true);

        PanelUpdateItemContent.setPreferredSize(new java.awt.Dimension(350, 380));
        PanelUpdateItemContent.setRequestFocusEnabled(false);

        jLabel51.setText("Item Name");

        jLabel52.setText("Quantity");

        jLabel53.setText("Discount");

        txtUpdateItemNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateItemNoActionPerformed(evt);
            }
        });
        txtUpdateItemNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUpdateItemNoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUpdateItemNoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUpdateItemNoKeyTyped(evt);
            }
        });

        txtUpdateItemQuantity.setEditable(false);
        txtUpdateItemQuantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUpdateItemQuantityMouseClicked(evt);
            }
        });
        txtUpdateItemQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateItemQuantityActionPerformed(evt);
            }
        });
        txtUpdateItemQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUpdateItemQuantityKeyReleased(evt);
            }
        });

        txtUpdateItemDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUpdateItemDiscountKeyReleased(evt);
            }
        });

        jLabel54.setText("Item NO");

        txtUpdateItemName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUpdateItemNameKeyReleased(evt);
            }
        });

        jLabel55.setText("Price");

        txtUpdateItemPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUpdateItemPriceKeyReleased(evt);
            }
        });

        btnUpdateItemSave.setBackground(new java.awt.Color(0, 102, 102));
        btnUpdateItemSave.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateItemSave.setText("Update");
        btnUpdateItemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateItemSaveActionPerformed(evt);
            }
        });

        txtUpdateItemCancel.setBackground(new java.awt.Color(255, 255, 255));
        txtUpdateItemCancel.setForeground(new java.awt.Color(255, 0, 0));
        txtUpdateItemCancel.setText("Cancel");
        txtUpdateItemCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateItemCancelActionPerformed(evt);
            }
        });

        jLabel63.setBackground(new java.awt.Color(0, 102, 102));
        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel63.setText("click on quantity to stock adjusment");

        javax.swing.GroupLayout PanelUpdateItemContentLayout = new javax.swing.GroupLayout(PanelUpdateItemContent);
        PanelUpdateItemContent.setLayout(PanelUpdateItemContentLayout);
        PanelUpdateItemContentLayout.setHorizontalGroup(
            PanelUpdateItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUpdateItemContentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdateItemSave)
                .addGap(18, 18, 18)
                .addComponent(txtUpdateItemCancel)
                .addGap(50, 50, 50))
            .addGroup(PanelUpdateItemContentLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelUpdateItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(PanelUpdateItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUpdateItemPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUpdateItemDiscount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(txtUpdateItemNo)
                    .addComponent(txtUpdateItemQuantity, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUpdateItemName, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30))
        );
        PanelUpdateItemContentLayout.setVerticalGroup(
            PanelUpdateItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUpdateItemContentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelUpdateItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateItemNo)
                    .addComponent(jLabel54))
                .addGap(18, 18, 18)
                .addGroup(PanelUpdateItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUpdateItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelUpdateItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateItemPrice)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelUpdateItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateItemQuantity)
                    .addComponent(jLabel52))
                .addGap(2, 2, 2)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelUpdateItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateItemDiscount)
                    .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelUpdateItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUpdateItemCancel)
                    .addComponent(btnUpdateItemSave))
                .addGap(44, 44, 44))
        );

        jLabel56.setBackground(new java.awt.Color(0, 102, 102));
        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("     Update Quantity In Hand");
        jLabel56.setOpaque(true);

        PanelUpdateQuantityItemContent.setPreferredSize(new java.awt.Dimension(350, 380));
        PanelUpdateQuantityItemContent.setRequestFocusEnabled(false);

        jLabel57.setText("Exist Quantity");

        txtUpdateQuantityItemNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateQuantityItemNoActionPerformed(evt);
            }
        });
        txtUpdateQuantityItemNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUpdateQuantityItemNoKeyReleased(evt);
            }
        });

        jLabel60.setText("Item NO");

        txtUpdateQuantityExist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateQuantityExistActionPerformed(evt);
            }
        });
        txtUpdateQuantityExist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUpdateQuantityExistKeyReleased(evt);
            }
        });

        jLabel61.setText("New Quantity");

        UpdateQuantityNew.setEditable(false);
        UpdateQuantityNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateQuantityNewActionPerformed(evt);
            }
        });
        UpdateQuantityNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UpdateQuantityNewKeyReleased(evt);
            }
        });

        btnUpdateQuantitySave.setBackground(new java.awt.Color(0, 102, 102));
        btnUpdateQuantitySave.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateQuantitySave.setText("Save");
        btnUpdateQuantitySave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateQuantitySaveActionPerformed(evt);
            }
        });

        btnUpdateQuantityCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateQuantityCancel.setForeground(new java.awt.Color(255, 0, 0));
        btnUpdateQuantityCancel.setText("Cancel");
        btnUpdateQuantityCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateQuantityCancelActionPerformed(evt);
            }
        });

        btnUpdateQuantityItemNoSearch.setBackground(new java.awt.Color(51, 153, 255));
        btnUpdateQuantityItemNoSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateQuantityItemNoSearch.setText("Search");
        btnUpdateQuantityItemNoSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateQuantityItemNoSearchActionPerformed(evt);
            }
        });

        jLabel62.setText("Add Quantity");

        UpdateQuantityAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateQuantityAddActionPerformed(evt);
            }
        });
        UpdateQuantityAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UpdateQuantityAddKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UpdateQuantityAddKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UpdateQuantityAddKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout PanelUpdateQuantityItemContentLayout = new javax.swing.GroupLayout(PanelUpdateQuantityItemContent);
        PanelUpdateQuantityItemContent.setLayout(PanelUpdateQuantityItemContentLayout);
        PanelUpdateQuantityItemContentLayout.setHorizontalGroup(
            PanelUpdateQuantityItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUpdateQuantityItemContentLayout.createSequentialGroup()
                .addGroup(PanelUpdateQuantityItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelUpdateQuantityItemContentLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdateQuantitySave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateQuantityCancel)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelUpdateQuantityItemContentLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(PanelUpdateQuantityItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelUpdateQuantityItemContentLayout.createSequentialGroup()
                                .addGroup(PanelUpdateQuantityItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelUpdateQuantityItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(PanelUpdateQuantityItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UpdateQuantityAdd)
                                    .addComponent(txtUpdateQuantityExist, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelUpdateQuantityItemContentLayout.createSequentialGroup()
                                        .addComponent(txtUpdateQuantityItemNo, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUpdateQuantityItemNoSearch))))
                            .addGroup(PanelUpdateQuantityItemContentLayout.createSequentialGroup()
                                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(UpdateQuantityNew)))))
                .addGap(30, 30, 30))
        );
        PanelUpdateQuantityItemContentLayout.setVerticalGroup(
            PanelUpdateQuantityItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUpdateQuantityItemContentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelUpdateQuantityItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateQuantityItemNo)
                    .addComponent(jLabel60)
                    .addComponent(btnUpdateQuantityItemNoSearch))
                .addGap(18, 18, 18)
                .addGroup(PanelUpdateQuantityItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUpdateQuantityExist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(PanelUpdateQuantityItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateQuantityAdd)
                    .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelUpdateQuantityItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateQuantityNew)
                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(PanelUpdateQuantityItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateQuantityCancel)
                    .addComponent(btnUpdateQuantitySave))
                .addGap(35, 35, 35))
        );

        jLabel59.setBackground(new java.awt.Color(0, 102, 102));
        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("     View Item");
        jLabel59.setOpaque(true);

        tblViewItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblViewItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No", "Item Name", "Price", "Quantity In Hand", "Discount Margine"
            }
        ));
        tblViewItem.setGridColor(new java.awt.Color(255, 255, 255));
        tblViewItem.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tblViewItem.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(tblViewItem);

        jLabel58.setText("Enter Item");

        cmbViewItemCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Number", "Name", "Price", "Quantity In Hand", "Discount Margine" }));

        txtViewItemCategory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtViewItemCategoryKeyReleased(evt);
            }
        });

        btnViewItemSearch.setBackground(new java.awt.Color(51, 153, 255));
        btnViewItemSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnViewItemSearch.setText("Search");
        btnViewItemSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewItemSearchActionPerformed(evt);
            }
        });

        btnViewItemClear.setBackground(new java.awt.Color(255, 255, 255));
        btnViewItemClear.setForeground(new java.awt.Color(255, 0, 0));
        btnViewItemClear.setText("Clear");
        btnViewItemClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewItemClearActionPerformed(evt);
            }
        });

        btnViewItemAll.setBackground(new java.awt.Color(0, 102, 102));
        btnViewItemAll.setForeground(new java.awt.Color(255, 255, 255));
        btnViewItemAll.setText("View All");
        btnViewItemAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewItemAllActionPerformed(evt);
            }
        });

        btnViewGoodsReceiveNote.setBackground(new java.awt.Color(255, 255, 255));
        btnViewGoodsReceiveNote.setForeground(new java.awt.Color(0, 102, 102));
        btnViewGoodsReceiveNote.setText("View Goods Receive Note & Stock Adjusment");
        btnViewGoodsReceiveNote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewGoodsReceiveNoteMouseClicked(evt);
            }
        });
        btnViewGoodsReceiveNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewGoodsReceiveNoteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelItemLayout = new javax.swing.GroupLayout(PanelItem);
        PanelItem.setLayout(PanelItemLayout);
        PanelItemLayout.setHorizontalGroup(
            PanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelItemLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelItemLayout.createSequentialGroup()
                        .addGroup(PanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelItemLayout.createSequentialGroup()
                                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbViewItemCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtViewItemCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnViewItemSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViewItemClear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViewItemAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelItemLayout.createSequentialGroup()
                                .addGroup(PanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PanelAddItemContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PanelUpdateItemContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(PanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanelUpdateQuantityItemContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(btnViewGoodsReceiveNote, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)))
                    .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(359, Short.MAX_VALUE))
        );

        PanelItemLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnViewItemAll, btnViewItemClear, btnViewItemSearch});

        PanelItemLayout.setVerticalGroup(
            PanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelItemLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelItemLayout.createSequentialGroup()
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelUpdateQuantityItemContent, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewGoodsReceiveNote, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PanelItemLayout.createSequentialGroup()
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(PanelAddItemContent, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelItemLayout.createSequentialGroup()
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(PanelUpdateItemContent, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(cmbViewItemCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewItemCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewItemSearch)
                    .addComponent(btnViewItemClear)
                    .addComponent(btnViewItemAll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        PanelSalesperson.setBackground(new java.awt.Color(204, 204, 204));

        PanelAddUpdateDeleteSalesperson.setPreferredSize(new java.awt.Dimension(648, 297));

        PanelDeleteSalesperson.setPreferredSize(new java.awt.Dimension(684, 297));

        jLabel83.setText("ID");

        txtDeleteSalespersonIDSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDeleteSalespersonIDSearchKeyReleased(evt);
            }
        });

        txtDeleteSalespersonName.setText("Name");

        txtDeleteSalespersonTelephone.setText("Telephone");

        txtDeleteSalespersonEmailID.setText("Email ID");

        txtDeleteSalespersonSalary.setText("Salary");

        txtDeleteSalespersonAddressNo.setText("Address No");

        txtDeleteSalespersonAddressLine1.setText("Address Line 1");

        txtDeleteSalespersonPhoto.setBackground(new java.awt.Color(255, 255, 255));
        txtDeleteSalespersonPhoto.setForeground(new java.awt.Color(255, 255, 255));
        txtDeleteSalespersonPhoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDeleteSalespersonPhoto.setOpaque(true);

        btnDeleteSalespersonSave.setBackground(new java.awt.Color(255, 0, 0));
        btnDeleteSalespersonSave.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteSalespersonSave.setText("Delete");
        btnDeleteSalespersonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSalespersonSaveActionPerformed(evt);
            }
        });

        btnDeleteSalespersonClear.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteSalespersonClear.setForeground(new java.awt.Color(255, 0, 0));
        btnDeleteSalespersonClear.setText("Clear");
        btnDeleteSalespersonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSalespersonClearActionPerformed(evt);
            }
        });

        btnDeleteSalespersonIDSearch.setBackground(new java.awt.Color(51, 153, 255));
        btnDeleteSalespersonIDSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteSalespersonIDSearch.setText("Search");
        btnDeleteSalespersonIDSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSalespersonIDSearchActionPerformed(evt);
            }
        });

        txtDeleteSalespersonAddressLine2.setText("Address Line 2");

        txtDeleteSalespersonCity.setText("City");

        javax.swing.GroupLayout PanelDeleteSalespersonLayout = new javax.swing.GroupLayout(PanelDeleteSalesperson);
        PanelDeleteSalesperson.setLayout(PanelDeleteSalespersonLayout);
        PanelDeleteSalespersonLayout.setHorizontalGroup(
            PanelDeleteSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeleteSalespersonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeleteSalespersonSave)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteSalespersonClear)
                .addGap(80, 80, 80))
            .addGroup(PanelDeleteSalespersonLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PanelDeleteSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDeleteSalespersonLayout.createSequentialGroup()
                        .addGroup(PanelDeleteSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDeleteSalespersonAddressLine2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDeleteSalespersonAddressLine1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDeleteSalespersonAddressNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDeleteSalespersonName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addGroup(PanelDeleteSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDeleteSalespersonCity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDeleteSalespersonTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDeleteSalespersonEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDeleteSalespersonSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtDeleteSalespersonPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelDeleteSalespersonLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDeleteSalespersonIDSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteSalespersonIDSearch)
                        .addGap(276, 276, 276))))
        );
        PanelDeleteSalespersonLayout.setVerticalGroup(
            PanelDeleteSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeleteSalespersonLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PanelDeleteSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(txtDeleteSalespersonIDSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteSalespersonIDSearch))
                .addGap(42, 42, 42)
                .addGroup(PanelDeleteSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDeleteSalespersonLayout.createSequentialGroup()
                        .addGroup(PanelDeleteSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDeleteSalespersonName)
                            .addComponent(txtDeleteSalespersonCity))
                        .addGap(18, 18, 18)
                        .addGroup(PanelDeleteSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDeleteSalespersonAddressNo)
                            .addComponent(txtDeleteSalespersonTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(PanelDeleteSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDeleteSalespersonAddressLine1)
                            .addComponent(txtDeleteSalespersonEmailID)))
                    .addComponent(txtDeleteSalespersonPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(PanelDeleteSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeleteSalespersonAddressLine2)
                    .addComponent(txtDeleteSalespersonSalary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDeleteSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteSalespersonSave)
                    .addComponent(btnDeleteSalespersonClear))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        PanelUpdateSalesperson.setPreferredSize(new java.awt.Dimension(684, 296));

        jLabel93.setText("ID");

        txtUpdateSalespersonID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUpdateSalespersonIDKeyReleased(evt);
            }
        });

        txtUpdateSalespersonName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUpdateSalespersonNameKeyReleased(evt);
            }
        });

        jLabel94.setText("Name");

        jLabel95.setText("Telephone");

        txtUpdateSalespersonTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateSalespersonTelephoneActionPerformed(evt);
            }
        });
        txtUpdateSalespersonTelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUpdateSalespersonTelephoneKeyReleased(evt);
            }
        });

        jLabel96.setText("Email ID");

        txtUpdateSalespersonEmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateSalespersonEmailIDActionPerformed(evt);
            }
        });
        txtUpdateSalespersonEmailID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUpdateSalespersonEmailIDKeyReleased(evt);
            }
        });

        txtUpdateSalespersonSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUpdateSalespersonSalaryKeyReleased(evt);
            }
        });

        jLabel97.setText("Salary");

        jLabel98.setText("Address No");

        txtUpdateSalespersonAddressNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUpdateSalespersonAddressNoKeyReleased(evt);
            }
        });

        txtUpdateSalespersonAddressLine1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUpdateSalespersonAddressLine1KeyReleased(evt);
            }
        });

        jLabel99.setText("Address Line 1");

        txtUpdateSalespersonAddressLine2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUpdateSalespersonAddressLine2KeyReleased(evt);
            }
        });

        jLabel100.setText("Address Line 2");

        jLabel101.setText("Photo");

        txtUpdateSalespersonPhoto.setBackground(new java.awt.Color(255, 255, 255));
        txtUpdateSalespersonPhoto.setForeground(new java.awt.Color(255, 255, 255));
        txtUpdateSalespersonPhoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUpdateSalespersonPhoto.setOpaque(true);

        btnUpdateSalespersonPhoto.setBackground(new java.awt.Color(0, 102, 102));
        btnUpdateSalespersonPhoto.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateSalespersonPhoto.setText("Browse");
        btnUpdateSalespersonPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSalespersonPhotoActionPerformed(evt);
            }
        });

        btnUpdateSalespersonSave.setBackground(new java.awt.Color(0, 102, 102));
        btnUpdateSalespersonSave.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateSalespersonSave.setText("Save");
        btnUpdateSalespersonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSalespersonSaveActionPerformed(evt);
            }
        });

        btnUpdateSalespersonClear.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateSalespersonClear.setForeground(new java.awt.Color(255, 0, 0));
        btnUpdateSalespersonClear.setText("Clear");
        btnUpdateSalespersonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSalespersonClearActionPerformed(evt);
            }
        });

        txtUpdateSalespersonCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUpdateSalespersonCityKeyReleased(evt);
            }
        });

        jLabel102.setText("City");

        btnUpdateSalespersonIDSearch.setBackground(new java.awt.Color(51, 153, 255));
        btnUpdateSalespersonIDSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateSalespersonIDSearch.setText("Search");
        btnUpdateSalespersonIDSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSalespersonIDSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelUpdateSalespersonLayout = new javax.swing.GroupLayout(PanelUpdateSalesperson);
        PanelUpdateSalesperson.setLayout(PanelUpdateSalespersonLayout);
        PanelUpdateSalespersonLayout.setHorizontalGroup(
            PanelUpdateSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUpdateSalespersonLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PanelUpdateSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelUpdateSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUpdateSalespersonCity, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(txtUpdateSalespersonAddressLine2)
                    .addComponent(txtUpdateSalespersonAddressLine1)
                    .addComponent(txtUpdateSalespersonName)
                    .addComponent(txtUpdateSalespersonID)
                    .addComponent(txtUpdateSalespersonAddressNo))
                .addGap(38, 38, 38)
                .addGroup(PanelUpdateSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelUpdateSalespersonLayout.createSequentialGroup()
                        .addGroup(PanelUpdateSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel96, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel95, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel97, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelUpdateSalespersonLayout.createSequentialGroup()
                                .addGroup(PanelUpdateSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdateSalespersonIDSearch))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(PanelUpdateSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUpdateSalespersonLayout.createSequentialGroup()
                                .addComponent(btnUpdateSalespersonPhoto)
                                .addGap(18, 18, 18)
                                .addComponent(txtUpdateSalespersonPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUpdateSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUpdateSalespersonSalary)
                                .addComponent(txtUpdateSalespersonTelephone)
                                .addComponent(txtUpdateSalespersonEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUpdateSalespersonLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUpdateSalespersonSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateSalespersonClear)
                        .addGap(8, 8, 8)))
                .addGap(25, 25, 25))
        );
        PanelUpdateSalespersonLayout.setVerticalGroup(
            PanelUpdateSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUpdateSalespersonLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(PanelUpdateSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelUpdateSalespersonLayout.createSequentialGroup()
                        .addGroup(PanelUpdateSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelUpdateSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel93)
                                .addComponent(txtUpdateSalespersonID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnUpdateSalespersonIDSearch, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(PanelUpdateSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelUpdateSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel94)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUpdateSalespersonLayout.createSequentialGroup()
                                    .addGroup(PanelUpdateSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnUpdateSalespersonPhoto)
                                        .addComponent(jLabel101))
                                    .addGap(16, 16, 16)))
                            .addComponent(txtUpdateSalespersonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtUpdateSalespersonPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelUpdateSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateSalespersonTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpdateSalespersonAddressNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel98)
                    .addComponent(jLabel95))
                .addGap(18, 18, 18)
                .addGroup(PanelUpdateSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateSalespersonEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpdateSalespersonAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel99)
                    .addComponent(jLabel96))
                .addGap(18, 18, 18)
                .addGroup(PanelUpdateSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateSalespersonSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpdateSalespersonAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel100)
                    .addComponent(jLabel97))
                .addGap(18, 18, 18)
                .addGroup(PanelUpdateSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateSalespersonSave)
                    .addComponent(btnUpdateSalespersonClear)
                    .addComponent(txtUpdateSalespersonCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel102))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelAddSalesperson.setPreferredSize(new java.awt.Dimension(684, 275));

        jLabel40.setText("ID");

        jLabel47.setText("Name");

        jLabel65.setText("Telephone");

        jLabel66.setText("Email ID");

        jLabel67.setText("Salary");

        jLabel69.setText("Address No");

        jLabel70.setText("Address Line 1");

        jLabel71.setText("Address Line 2");

        jLabel72.setText("Photo");

        txtAddSalespersonPhoto.setBackground(new java.awt.Color(255, 255, 255));
        txtAddSalespersonPhoto.setForeground(new java.awt.Color(255, 255, 255));
        txtAddSalespersonPhoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtAddSalespersonPhoto.setOpaque(true);

        btnAddSalespersonPhoto.setBackground(new java.awt.Color(0, 102, 102));
        btnAddSalespersonPhoto.setForeground(new java.awt.Color(255, 255, 255));
        btnAddSalespersonPhoto.setText("Browse");
        btnAddSalespersonPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSalespersonPhotoActionPerformed(evt);
            }
        });

        btnAddSalespersonSave.setBackground(new java.awt.Color(0, 102, 102));
        btnAddSalespersonSave.setForeground(new java.awt.Color(255, 255, 255));
        btnAddSalespersonSave.setText("Save");
        btnAddSalespersonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSalespersonSaveActionPerformed(evt);
            }
        });

        btnAddSalespersonClear.setBackground(new java.awt.Color(255, 255, 255));
        btnAddSalespersonClear.setForeground(new java.awt.Color(255, 0, 0));
        btnAddSalespersonClear.setText("Clear");
        btnAddSalespersonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSalespersonClearActionPerformed(evt);
            }
        });

        jLabel68.setText("City");

        javax.swing.GroupLayout PanelAddSalespersonLayout = new javax.swing.GroupLayout(PanelAddSalesperson);
        PanelAddSalesperson.setLayout(PanelAddSalespersonLayout);
        PanelAddSalespersonLayout.setHorizontalGroup(
            PanelAddSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddSalespersonLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PanelAddSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelAddSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAddSalespersonCity, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(txtAddSalespersonAddressLine2)
                    .addComponent(txtAddSalespersonAddressLine1)
                    .addComponent(txtAddSalespersonName)
                    .addComponent(txtAddSalespersonID)
                    .addComponent(txtAddSalespersonAddressNo))
                .addGap(38, 38, 38)
                .addGroup(PanelAddSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelAddSalespersonLayout.createSequentialGroup()
                        .addComponent(btnAddSalespersonSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddSalespersonClear))
                    .addGroup(PanelAddSalespersonLayout.createSequentialGroup()
                        .addGroup(PanelAddSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelAddSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAddSalespersonLayout.createSequentialGroup()
                                .addComponent(btnAddSalespersonPhoto)
                                .addGap(18, 18, 18)
                                .addComponent(txtAddSalespersonPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAddSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtAddSalespersonSalary)
                                .addComponent(txtAddSalespersonTelephone)
                                .addComponent(txtAddSalespersonEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(26, 26, 26))
        );
        PanelAddSalespersonLayout.setVerticalGroup(
            PanelAddSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddSalespersonLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(PanelAddSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAddSalespersonLayout.createSequentialGroup()
                        .addGroup(PanelAddSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(txtAddSalespersonID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelAddSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAddSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel47)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAddSalespersonLayout.createSequentialGroup()
                                    .addComponent(btnAddSalespersonPhoto)
                                    .addGap(16, 16, 16)))
                            .addGroup(PanelAddSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAddSalespersonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel72))))
                    .addComponent(txtAddSalespersonPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAddSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddSalespersonTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddSalespersonAddressNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69)
                    .addComponent(jLabel65))
                .addGap(18, 18, 18)
                .addGroup(PanelAddSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddSalespersonEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddSalespersonAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70)
                    .addComponent(jLabel66))
                .addGap(18, 18, 18)
                .addGroup(PanelAddSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddSalespersonSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddSalespersonAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71)
                    .addComponent(jLabel67))
                .addGap(18, 18, 18)
                .addGroup(PanelAddSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddSalespersonSave)
                    .addComponent(btnAddSalespersonClear)
                    .addComponent(txtAddSalespersonCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelAddUpdateDeleteSalespersonLayout = new javax.swing.GroupLayout(PanelAddUpdateDeleteSalesperson);
        PanelAddUpdateDeleteSalesperson.setLayout(PanelAddUpdateDeleteSalespersonLayout);
        PanelAddUpdateDeleteSalespersonLayout.setHorizontalGroup(
            PanelAddUpdateDeleteSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddUpdateDeleteSalespersonLayout.createSequentialGroup()
                .addComponent(PanelAddSalesperson, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(PanelAddUpdateDeleteSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelAddUpdateDeleteSalespersonLayout.createSequentialGroup()
                    .addComponent(PanelDeleteSalesperson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(PanelAddUpdateDeleteSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelAddUpdateDeleteSalespersonLayout.createSequentialGroup()
                    .addComponent(PanelUpdateSalesperson, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 36, Short.MAX_VALUE)))
        );
        PanelAddUpdateDeleteSalespersonLayout.setVerticalGroup(
            PanelAddUpdateDeleteSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAddSalesperson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(PanelAddUpdateDeleteSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelAddUpdateDeleteSalespersonLayout.createSequentialGroup()
                    .addComponent(PanelDeleteSalesperson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(PanelAddUpdateDeleteSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelAddUpdateDeleteSalespersonLayout.createSequentialGroup()
                    .addComponent(PanelUpdateSalesperson, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel64.setBackground(new java.awt.Color(0, 102, 102));
        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("     Sales Person");
        jLabel64.setOpaque(true);
        jLabel64.setPreferredSize(new java.awt.Dimension(1086, 30));

        jLabel46.setBackground(new java.awt.Color(0, 102, 102));
        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("     Add / Update / Delete Salesperson");
        jLabel46.setOpaque(true);
        jLabel46.setPreferredSize(new java.awt.Dimension(648, 47));

        btnAddSalesperson.setBackground(new java.awt.Color(0, 102, 102));
        btnAddSalesperson.setForeground(new java.awt.Color(255, 255, 255));
        btnAddSalesperson.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddSalesperson.setText("Add");
        btnAddSalesperson.setOpaque(true);
        btnAddSalesperson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddSalespersonMouseClicked(evt);
            }
        });

        btnUpdateSalesperson.setBackground(new java.awt.Color(0, 102, 102));
        btnUpdateSalesperson.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateSalesperson.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUpdateSalesperson.setText("Update");
        btnUpdateSalesperson.setOpaque(true);
        btnUpdateSalesperson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateSalespersonMouseClicked(evt);
            }
        });

        btnDeleteSalesperson.setBackground(new java.awt.Color(0, 102, 102));
        btnDeleteSalesperson.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteSalesperson.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDeleteSalesperson.setText("Delete");
        btnDeleteSalesperson.setOpaque(true);
        btnDeleteSalesperson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteSalespersonMouseClicked(evt);
            }
        });

        jLabel73.setBackground(new java.awt.Color(0, 102, 102));
        jLabel73.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("     View Salesperson");
        jLabel73.setOpaque(true);
        jLabel73.setPreferredSize(new java.awt.Dimension(648, 47));

        TblViewSalespersons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address No", "Address line 1", "Address line 2", "City", "Telephone", "Email ID", "Salary"
            }
        ));
        TblViewSalespersons.setGridColor(new java.awt.Color(255, 255, 255));
        TblViewSalespersons.setSelectionBackground(new java.awt.Color(0, 102, 102));
        TblViewSalespersons.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TblViewSalespersons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblViewSalespersonsMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(TblViewSalespersons);

        jLabel74.setText("Search By");

        cmbViewSalespersonSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salesperson ID", "Name", "Telephone", "Email", "Living City", "Salary" }));

        txtViewSalespersonSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtViewSalespersonSearchKeyReleased(evt);
            }
        });

        btnViewSalespersonSearch.setBackground(new java.awt.Color(51, 153, 255));
        btnViewSalespersonSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnViewSalespersonSearch.setText("Search");
        btnViewSalespersonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSalespersonSearchActionPerformed(evt);
            }
        });

        btnViewSalespersonClear.setBackground(new java.awt.Color(255, 255, 255));
        btnViewSalespersonClear.setForeground(new java.awt.Color(255, 0, 0));
        btnViewSalespersonClear.setText("Clear");
        btnViewSalespersonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSalespersonClearActionPerformed(evt);
            }
        });

        btnViewSalespersonViewAll.setBackground(new java.awt.Color(0, 102, 102));
        btnViewSalespersonViewAll.setForeground(new java.awt.Color(255, 255, 255));
        btnViewSalespersonViewAll.setText("View All");
        btnViewSalespersonViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSalespersonViewAllActionPerformed(evt);
            }
        });

        jLabel75.setBackground(new java.awt.Color(0, 102, 102));
        jLabel75.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("     Sales Person Details");
        jLabel75.setOpaque(true);

        txtViewSalespersonID.setText("ID :");

        txtViewSalespersonName.setText("Name :");

        txtViewSalespersonAddressNo.setText("Address No :");

        txtViewSalespersonAddressLine1.setText("Address Line 1 :");

        txtViewSalespersonAddressLine2.setText("Address Line 2 :");

        txtViewSalespersonCity.setText("City :");

        txtViewSalespersonTelephone.setText("Telephone :");

        txtViewSalespersonEmailID.setText("Email ID :");

        txtViewSalespersonSalary.setText("Salary");

        txtViewSalespersonPhoto.setBackground(new java.awt.Color(255, 255, 255));
        txtViewSalespersonPhoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtViewSalespersonPhoto.setOpaque(true);

        javax.swing.GroupLayout PanelViewSalespersonDetailsContentLayout = new javax.swing.GroupLayout(PanelViewSalespersonDetailsContent);
        PanelViewSalespersonDetailsContent.setLayout(PanelViewSalespersonDetailsContentLayout);
        PanelViewSalespersonDetailsContentLayout.setHorizontalGroup(
            PanelViewSalespersonDetailsContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewSalespersonDetailsContentLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PanelViewSalespersonDetailsContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtViewSalespersonID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtViewSalespersonName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtViewSalespersonAddressNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtViewSalespersonAddressLine1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(txtViewSalespersonAddressLine2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtViewSalespersonCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtViewSalespersonTelephone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtViewSalespersonEmailID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtViewSalespersonSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(txtViewSalespersonPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelViewSalespersonDetailsContentLayout.setVerticalGroup(
            PanelViewSalespersonDetailsContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewSalespersonDetailsContentLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PanelViewSalespersonDetailsContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtViewSalespersonPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelViewSalespersonDetailsContentLayout.createSequentialGroup()
                        .addComponent(txtViewSalespersonID)
                        .addGap(14, 14, 14)
                        .addComponent(txtViewSalespersonName)
                        .addGap(14, 14, 14)
                        .addComponent(txtViewSalespersonAddressNo)))
                .addGap(14, 14, 14)
                .addComponent(txtViewSalespersonAddressLine1)
                .addGap(14, 14, 14)
                .addComponent(txtViewSalespersonAddressLine2)
                .addGap(14, 14, 14)
                .addComponent(txtViewSalespersonCity)
                .addGap(14, 14, 14)
                .addComponent(txtViewSalespersonTelephone)
                .addGap(14, 14, 14)
                .addComponent(txtViewSalespersonEmailID)
                .addGap(14, 14, 14)
                .addComponent(txtViewSalespersonSalary)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelSalespersonLayout = new javax.swing.GroupLayout(PanelSalesperson);
        PanelSalesperson.setLayout(PanelSalespersonLayout);
        PanelSalespersonLayout.setHorizontalGroup(
            PanelSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSalespersonLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSalespersonLayout.createSequentialGroup()
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbViewSalespersonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtViewSalespersonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewSalespersonSearch)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewSalespersonClear)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewSalespersonViewAll)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelSalespersonLayout.createSequentialGroup()
                        .addGroup(PanelSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelSalespersonLayout.createSequentialGroup()
                                .addGroup(PanelSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(PanelAddUpdateDeleteSalesperson, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelSalespersonLayout.createSequentialGroup()
                                        .addComponent(btnAddSalesperson, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUpdateSalesperson, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDeleteSalesperson, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(PanelSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PanelViewSalespersonDetailsContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(70, Short.MAX_VALUE))))
        );
        PanelSalespersonLayout.setVerticalGroup(
            PanelSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSalespersonLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelSalespersonLayout.createSequentialGroup()
                        .addGroup(PanelSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddSalesperson, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateSalesperson, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteSalesperson, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelAddUpdateDeleteSalesperson, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelViewSalespersonDetailsContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelSalespersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(cmbViewSalespersonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewSalespersonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewSalespersonSearch)
                    .addComponent(btnViewSalespersonClear)
                    .addComponent(btnViewSalespersonViewAll))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelSale.setBackground(new java.awt.Color(204, 204, 204));

        PanelControlSale.setBackground(new java.awt.Color(204, 204, 204));

        btnSaleDealerOrder.setBackground(new java.awt.Color(153, 153, 153));
        btnSaleDealerOrder.setPreferredSize(new java.awt.Dimension(258, 50));

        lblBtnSaleDealerOrder.setBackground(new java.awt.Color(0, 102, 102));
        lblBtnSaleDealerOrder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnSaleDealerOrder.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnSaleDealerOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnSaleDealerOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sell Order.png"))); // NOI18N
        lblBtnSaleDealerOrder.setText("Sale Dealer Order");
        lblBtnSaleDealerOrder.setOpaque(true);
        lblBtnSaleDealerOrder.setPreferredSize(new java.awt.Dimension(350, 50));
        lblBtnSaleDealerOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnSaleDealerOrderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnSaleDealerOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnSaleDealerOrderMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnSaleDealerOrderLayout = new javax.swing.GroupLayout(btnSaleDealerOrder);
        btnSaleDealerOrder.setLayout(btnSaleDealerOrderLayout);
        btnSaleDealerOrderLayout.setHorizontalGroup(
            btnSaleDealerOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnSaleDealerOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        btnSaleDealerOrderLayout.setVerticalGroup(
            btnSaleDealerOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnSaleDealerOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        btnSaleCustomerOrder.setBackground(new java.awt.Color(153, 153, 153));
        btnSaleCustomerOrder.setPreferredSize(new java.awt.Dimension(350, 50));

        lblBtnSaleCustomerOrder.setBackground(new java.awt.Color(0, 102, 102));
        lblBtnSaleCustomerOrder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnSaleCustomerOrder.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnSaleCustomerOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnSaleCustomerOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sell Order.png"))); // NOI18N
        lblBtnSaleCustomerOrder.setText("Sale Customer Order");
        lblBtnSaleCustomerOrder.setOpaque(true);
        lblBtnSaleCustomerOrder.setPreferredSize(new java.awt.Dimension(350, 50));
        lblBtnSaleCustomerOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnSaleCustomerOrderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnSaleCustomerOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnSaleCustomerOrderMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnSaleCustomerOrderLayout = new javax.swing.GroupLayout(btnSaleCustomerOrder);
        btnSaleCustomerOrder.setLayout(btnSaleCustomerOrderLayout);
        btnSaleCustomerOrderLayout.setHorizontalGroup(
            btnSaleCustomerOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnSaleCustomerOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        btnSaleCustomerOrderLayout.setVerticalGroup(
            btnSaleCustomerOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnSaleCustomerOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnViewSales.setBackground(new java.awt.Color(153, 153, 153));
        btnViewSales.setPreferredSize(new java.awt.Dimension(350, 50));

        lblBtnViewSales.setBackground(new java.awt.Color(0, 102, 102));
        lblBtnViewSales.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnViewSales.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnViewSales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnViewSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Invoice.png"))); // NOI18N
        lblBtnViewSales.setText("View Invoice");
        lblBtnViewSales.setOpaque(true);
        lblBtnViewSales.setPreferredSize(new java.awt.Dimension(350, 50));
        lblBtnViewSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnViewSalesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnViewSalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnViewSalesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnViewSalesLayout = new javax.swing.GroupLayout(btnViewSales);
        btnViewSales.setLayout(btnViewSalesLayout);
        btnViewSalesLayout.setHorizontalGroup(
            btnViewSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnViewSales, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        btnViewSalesLayout.setVerticalGroup(
            btnViewSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnViewSales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnManageReturns.setBackground(new java.awt.Color(153, 153, 153));
        btnManageReturns.setPreferredSize(new java.awt.Dimension(350, 50));

        lblBtnManageReturns.setBackground(new java.awt.Color(0, 102, 102));
        lblBtnManageReturns.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnManageReturns.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnManageReturns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnManageReturns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Manage Return.png"))); // NOI18N
        lblBtnManageReturns.setText("Manage Returns");
        lblBtnManageReturns.setOpaque(true);
        lblBtnManageReturns.setPreferredSize(new java.awt.Dimension(350, 50));
        lblBtnManageReturns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnManageReturnsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnManageReturnsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnManageReturnsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnManageReturnsLayout = new javax.swing.GroupLayout(btnManageReturns);
        btnManageReturns.setLayout(btnManageReturnsLayout);
        btnManageReturnsLayout.setHorizontalGroup(
            btnManageReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnManageReturns, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        btnManageReturnsLayout.setVerticalGroup(
            btnManageReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnManageReturns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelControlSaleLayout = new javax.swing.GroupLayout(PanelControlSale);
        PanelControlSale.setLayout(PanelControlSaleLayout);
        PanelControlSaleLayout.setHorizontalGroup(
            PanelControlSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlSaleLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnSaleDealerOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSaleCustomerOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageReturns, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewSales, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        PanelControlSaleLayout.setVerticalGroup(
            PanelControlSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlSaleLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelControlSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSaleDealerOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(btnSaleCustomerOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(btnManageReturns, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(btnViewSales, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel146.setBackground(new java.awt.Color(0, 102, 102));
        jLabel146.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(255, 255, 255));
        jLabel146.setText("     Sale");
        jLabel146.setOpaque(true);
        jLabel146.setPreferredSize(new java.awt.Dimension(1086, 30));

        javax.swing.GroupLayout PanelSaleLayout = new javax.swing.GroupLayout(PanelSale);
        PanelSale.setLayout(PanelSaleLayout);
        PanelSaleLayout.setHorizontalGroup(
            PanelSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSaleLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addComponent(PanelControlSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelSaleLayout.setVerticalGroup(
            PanelSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSaleLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelControlSale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(653, Short.MAX_VALUE))
        );

        PanelCustomer.setBackground(new java.awt.Color(204, 204, 204));
        PanelCustomer.setPreferredSize(new java.awt.Dimension(1176, 916));

        PanelControlCustomer.setBackground(new java.awt.Color(204, 204, 204));

        btnAddCustomer.setBackground(new java.awt.Color(153, 153, 153));

        lblBtnAddCustomer.setBackground(new java.awt.Color(0, 102, 102));
        lblBtnAddCustomer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnAddCustomer.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnAddCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnAddCustomer.setText("Add");
        lblBtnAddCustomer.setOpaque(true);
        lblBtnAddCustomer.setPreferredSize(new java.awt.Dimension(350, 50));
        lblBtnAddCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnAddCustomerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnAddCustomerLayout = new javax.swing.GroupLayout(btnAddCustomer);
        btnAddCustomer.setLayout(btnAddCustomerLayout);
        btnAddCustomerLayout.setHorizontalGroup(
            btnAddCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnAddCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnAddCustomerLayout.setVerticalGroup(
            btnAddCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnAddCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnViewCustomer.setBackground(new java.awt.Color(153, 153, 153));
        btnViewCustomer.setPreferredSize(new java.awt.Dimension(350, 50));

        lblBtnViewCustomer.setBackground(new java.awt.Color(0, 102, 102));
        lblBtnViewCustomer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnViewCustomer.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnViewCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnViewCustomer.setText("View");
        lblBtnViewCustomer.setOpaque(true);
        lblBtnViewCustomer.setPreferredSize(new java.awt.Dimension(350, 50));
        lblBtnViewCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnViewCustomerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnViewCustomerLayout = new javax.swing.GroupLayout(btnViewCustomer);
        btnViewCustomer.setLayout(btnViewCustomerLayout);
        btnViewCustomerLayout.setHorizontalGroup(
            btnViewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnViewCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnViewCustomerLayout.setVerticalGroup(
            btnViewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnViewCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnModifyCustomer.setBackground(new java.awt.Color(153, 153, 153));
        btnModifyCustomer.setPreferredSize(new java.awt.Dimension(350, 50));

        lblBtnModifyCustomer.setBackground(new java.awt.Color(0, 102, 102));
        lblBtnModifyCustomer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnModifyCustomer.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnModifyCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnModifyCustomer.setText("Modify");
        lblBtnModifyCustomer.setOpaque(true);
        lblBtnModifyCustomer.setPreferredSize(new java.awt.Dimension(350, 50));
        lblBtnModifyCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnModifyCustomerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnModifyCustomerLayout = new javax.swing.GroupLayout(btnModifyCustomer);
        btnModifyCustomer.setLayout(btnModifyCustomerLayout);
        btnModifyCustomerLayout.setHorizontalGroup(
            btnModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnModifyCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnModifyCustomerLayout.setVerticalGroup(
            btnModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnModifyCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout PanelControlCustomerLayout = new javax.swing.GroupLayout(PanelControlCustomer);
        PanelControlCustomer.setLayout(PanelControlCustomerLayout);
        PanelControlCustomerLayout.setHorizontalGroup(
            PanelControlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlCustomerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModifyCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        PanelControlCustomerLayout.setVerticalGroup(
            PanelControlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlCustomerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PanelControlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModifyCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel88.setBackground(new java.awt.Color(0, 102, 102));
        jLabel88.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setText("     Customer");
        jLabel88.setOpaque(true);
        jLabel88.setPreferredSize(new java.awt.Dimension(1086, 30));

        PanelViewCustomer.setBackground(new java.awt.Color(204, 204, 204));
        PanelViewCustomer.setPreferredSize(new java.awt.Dimension(1223, 785));

        jLabel84.setBackground(new java.awt.Color(0, 102, 102));
        jLabel84.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("     View Customer");
        jLabel84.setOpaque(true);
        jLabel84.setPreferredSize(new java.awt.Dimension(760, 47));

        txtViewCustomerSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtViewCustomerSearchKeyReleased(evt);
            }
        });

        btnViewCustomerSearch.setBackground(new java.awt.Color(51, 153, 255));
        btnViewCustomerSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnViewCustomerSearch.setText("Search");
        btnViewCustomerSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustomerSearchActionPerformed(evt);
            }
        });

        btnViewCustomerClear.setBackground(new java.awt.Color(255, 255, 255));
        btnViewCustomerClear.setForeground(new java.awt.Color(255, 0, 0));
        btnViewCustomerClear.setText("Clear");
        btnViewCustomerClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustomerClearActionPerformed(evt);
            }
        });

        btnViewCustomerAll.setBackground(new java.awt.Color(0, 102, 102));
        btnViewCustomerAll.setForeground(new java.awt.Color(255, 255, 255));
        btnViewCustomerAll.setText("View All");
        btnViewCustomerAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustomerAllActionPerformed(evt);
            }
        });

        txtViewCustomerNIC.setText("NIC :");

        txtViewCustomerName.setText("Name :");

        txtViewCustomerAddressNo.setText("Address No :");

        txtViewCustomerAddressLine1.setText("Address Line 1 :");

        txtViewCustomerAddressLine2.setText("Address Line 2 :");

        txtViewCustomerCity.setText("City :");

        txtViewCustomerTelephone.setText("Telephone :");

        txtViewCustomerEmailID.setText("Email ID :");

        txtViewCustomerTotalSale.setText("Total Sale :");

        javax.swing.GroupLayout PanelViewCustomerContentLayout = new javax.swing.GroupLayout(PanelViewCustomerContent);
        PanelViewCustomerContent.setLayout(PanelViewCustomerContentLayout);
        PanelViewCustomerContentLayout.setHorizontalGroup(
            PanelViewCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewCustomerContentLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(PanelViewCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtViewCustomerTotalSale, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelViewCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtViewCustomerNIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtViewCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtViewCustomerAddressNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtViewCustomerAddressLine1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtViewCustomerAddressLine2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtViewCustomerCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtViewCustomerTelephone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtViewCustomerEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        PanelViewCustomerContentLayout.setVerticalGroup(
            PanelViewCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewCustomerContentLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(txtViewCustomerNIC)
                .addGap(18, 18, 18)
                .addComponent(txtViewCustomerName)
                .addGap(18, 18, 18)
                .addComponent(txtViewCustomerAddressNo)
                .addGap(18, 18, 18)
                .addComponent(txtViewCustomerAddressLine1)
                .addGap(18, 18, 18)
                .addComponent(txtViewCustomerAddressLine2)
                .addGap(18, 18, 18)
                .addComponent(txtViewCustomerCity)
                .addGap(18, 18, 18)
                .addComponent(txtViewCustomerTelephone)
                .addGap(18, 18, 18)
                .addComponent(txtViewCustomerEmailID)
                .addGap(12, 12, 12)
                .addComponent(txtViewCustomerTotalSale)
                .addGap(20, 20, 20))
        );

        jLabel85.setBackground(new java.awt.Color(0, 102, 102));
        jLabel85.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setText("     Customer Details");
        jLabel85.setOpaque(true);
        jLabel85.setPreferredSize(new java.awt.Dimension(141, 47));

        jLabel1.setText("Search By");

        cmbViewCustomerSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "NIC", "Telephone", "City", "Total Sale", "Email" }));

        TblViewCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer NIC", "Name", "Telephone", "Email", "Address NO", "Line 1", "Line 2", "City", "Total Sale"
            }
        ));
        TblViewCustomer.setGridColor(new java.awt.Color(255, 255, 255));
        TblViewCustomer.setSelectionBackground(new java.awt.Color(0, 102, 102));
        TblViewCustomer.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TblViewCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblViewCustomerMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(TblViewCustomer);

        javax.swing.GroupLayout PanelViewCustomerLayout = new javax.swing.GroupLayout(PanelViewCustomer);
        PanelViewCustomer.setLayout(PanelViewCustomerLayout);
        PanelViewCustomerLayout.setHorizontalGroup(
            PanelViewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewCustomerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelViewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelViewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PanelViewCustomerLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbViewCustomerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtViewCustomerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewCustomerSearch)
                            .addGap(18, 18, 18)
                            .addComponent(btnViewCustomerClear)
                            .addGap(18, 18, 18)
                            .addComponent(btnViewCustomerAll))
                        .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(PanelViewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelViewCustomerContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(97, 97, 97))
        );

        PanelViewCustomerLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnViewCustomerAll, btnViewCustomerClear, btnViewCustomerSearch});

        PanelViewCustomerLayout.setVerticalGroup(
            PanelViewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewCustomerLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(PanelViewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelViewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelViewCustomerLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(PanelViewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtViewCustomerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewCustomerSearch)
                            .addComponent(btnViewCustomerClear)
                            .addComponent(btnViewCustomerAll)
                            .addComponent(jLabel1)
                            .addComponent(cmbViewCustomerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(PanelViewCustomerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelViewCustomerContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(259, Short.MAX_VALUE))
        );

        PanelModifyCustomer.setBackground(new java.awt.Color(204, 204, 204));

        jLabel87.setBackground(new java.awt.Color(0, 102, 102));
        jLabel87.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setText("     Modify Customer Details");
        jLabel87.setOpaque(true);

        PanelModifyCustomerContent.setPreferredSize(new java.awt.Dimension(684, 296));

        jLabel129.setText("NIC");

        txtModifyCustomerNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModifyCustomerNICActionPerformed(evt);
            }
        });
        txtModifyCustomerNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyCustomerNICKeyReleased(evt);
            }
        });

        txtModifyCustomerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyCustomerNameKeyReleased(evt);
            }
        });

        jLabel130.setText("Name");

        jLabel131.setText("Telephone");

        txtModifyCustomerTelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyCustomerTelephoneKeyReleased(evt);
            }
        });

        jLabel132.setText("Email ID");

        txtModifyCustomerEmailID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyCustomerEmailIDKeyReleased(evt);
            }
        });

        jLabel133.setText("Address No");

        txtModifyCustomerAddressNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyCustomerAddressNoKeyReleased(evt);
            }
        });

        txtModifyCustomerAddressLine1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyCustomerAddressLine1KeyReleased(evt);
            }
        });

        jLabel134.setText("Address Line 1");

        txtModifyCustomerAddressLine2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyCustomerAddressLine2KeyReleased(evt);
            }
        });

        jLabel135.setText("Address Line 2");

        btnModifyCustomerSave.setBackground(new java.awt.Color(0, 102, 102));
        btnModifyCustomerSave.setForeground(new java.awt.Color(255, 255, 255));
        btnModifyCustomerSave.setText("Save");
        btnModifyCustomerSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyCustomerSaveActionPerformed(evt);
            }
        });

        btnModifyCustomerClear.setBackground(new java.awt.Color(255, 255, 255));
        btnModifyCustomerClear.setForeground(new java.awt.Color(255, 0, 0));
        btnModifyCustomerClear.setText("Clear");
        btnModifyCustomerClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyCustomerClearActionPerformed(evt);
            }
        });

        txtModifyCustomerCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyCustomerCityKeyReleased(evt);
            }
        });

        jLabel136.setText("City");

        btnModifyCustomerNICSearch.setBackground(new java.awt.Color(51, 153, 255));
        btnModifyCustomerNICSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnModifyCustomerNICSearch.setText("Search");
        btnModifyCustomerNICSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyCustomerNICSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelModifyCustomerContentLayout = new javax.swing.GroupLayout(PanelModifyCustomerContent);
        PanelModifyCustomerContent.setLayout(PanelModifyCustomerContentLayout);
        PanelModifyCustomerContentLayout.setHorizontalGroup(
            PanelModifyCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModifyCustomerContentLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(PanelModifyCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel129, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel130, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel133, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel134, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel135, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelModifyCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtModifyCustomerAddressLine2, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(txtModifyCustomerAddressLine1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModifyCustomerAddressNo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModifyCustomerName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModifyCustomerNIC, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModifyCustomerCity))
                .addGroup(PanelModifyCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelModifyCustomerContentLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModifyCustomerSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnModifyCustomerClear)
                        .addGap(67, 67, 67))
                    .addGroup(PanelModifyCustomerContentLayout.createSequentialGroup()
                        .addGroup(PanelModifyCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelModifyCustomerContentLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(PanelModifyCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel131, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(jLabel132, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelModifyCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtModifyCustomerTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModifyCustomerEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelModifyCustomerContentLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnModifyCustomerNICSearch)))
                        .addContainerGap(40, Short.MAX_VALUE))))
        );
        PanelModifyCustomerContentLayout.setVerticalGroup(
            PanelModifyCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModifyCustomerContentLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(PanelModifyCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel129)
                    .addGroup(PanelModifyCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtModifyCustomerNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModifyCustomerNICSearch)))
                .addGap(18, 18, 18)
                .addGroup(PanelModifyCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModifyCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel130)
                    .addComponent(jLabel131)
                    .addComponent(txtModifyCustomerTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelModifyCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelModifyCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel132)
                        .addComponent(txtModifyCustomerEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelModifyCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtModifyCustomerAddressNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel133)))
                .addGap(18, 18, 18)
                .addGroup(PanelModifyCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModifyCustomerAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel134))
                .addGap(18, 18, 18)
                .addGroup(PanelModifyCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModifyCustomerAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel135)
                    .addComponent(btnModifyCustomerSave)
                    .addComponent(btnModifyCustomerClear))
                .addGap(18, 18, 18)
                .addGroup(PanelModifyCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModifyCustomerCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel136))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelModifyCustomerLayout = new javax.swing.GroupLayout(PanelModifyCustomer);
        PanelModifyCustomer.setLayout(PanelModifyCustomerLayout);
        PanelModifyCustomerLayout.setHorizontalGroup(
            PanelModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModifyCustomerLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(PanelModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelModifyCustomerContent, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        PanelModifyCustomerLayout.setVerticalGroup(
            PanelModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModifyCustomerLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelModifyCustomerContent, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );

        PanelDeleteCustomer.setBackground(new java.awt.Color(204, 204, 204));

        jLabel86.setBackground(new java.awt.Color(0, 102, 102));
        jLabel86.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("     Delete Dealer ");
        jLabel86.setOpaque(true);

        PanelDeleteCustomerContent.setPreferredSize(new java.awt.Dimension(684, 296));

        jLabel128.setText("Customer NIC");

        txtDeleteCustomerNICSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDeleteCustomerNICSearchKeyReleased(evt);
            }
        });

        txtDeleteCustomerName.setText("Name :");

        txtDeleteCustomerTelephone.setText("Telephone :");

        txtDeleteCustomerEmailID.setText("Email ID :");

        txtDeleteCustomerAddressNo.setText("Address No :");

        txtDeleteCustomerAddressLine1.setText("Address Line 1 :");

        txtDeleteCustomerAddressLine2.setText("Address Line 2 :");

        btnDeleteCustomerDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDeleteCustomerDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteCustomerDelete.setText("Delete");
        btnDeleteCustomerDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustomerDeleteActionPerformed(evt);
            }
        });

        btnDeleteCustomerClear.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteCustomerClear.setForeground(new java.awt.Color(255, 0, 0));
        btnDeleteCustomerClear.setText("Clear");
        btnDeleteCustomerClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustomerClearActionPerformed(evt);
            }
        });

        txtDeleteCustomerCity.setText("City :");

        btnDeleteCustomerNICSearch.setBackground(new java.awt.Color(51, 153, 255));
        btnDeleteCustomerNICSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteCustomerNICSearch.setText("Search");
        btnDeleteCustomerNICSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustomerNICSearchActionPerformed(evt);
            }
        });

        txtDeleteCustomerAccountType.setText("Account type :");

        txtDeleteCustomerPhoto.setBackground(new java.awt.Color(255, 255, 255));
        txtDeleteCustomerPhoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDeleteCustomerPhoto.setOpaque(true);

        javax.swing.GroupLayout PanelDeleteCustomerContentLayout = new javax.swing.GroupLayout(PanelDeleteCustomerContent);
        PanelDeleteCustomerContent.setLayout(PanelDeleteCustomerContentLayout);
        PanelDeleteCustomerContentLayout.setHorizontalGroup(
            PanelDeleteCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeleteCustomerContentLayout.createSequentialGroup()
                .addContainerGap(566, Short.MAX_VALUE)
                .addComponent(btnDeleteCustomerDelete)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteCustomerClear)
                .addGap(122, 122, 122))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeleteCustomerContentLayout.createSequentialGroup()
                .addGroup(PanelDeleteCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelDeleteCustomerContentLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDeleteCustomerNICSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteCustomerNICSearch)
                        .addGap(69, 69, 69)
                        .addComponent(txtDeleteCustomerPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDeleteCustomerContentLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(PanelDeleteCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDeleteCustomerAddressLine1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDeleteCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDeleteCustomerAddressNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDeleteCustomerAddressLine2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDeleteCustomerCity, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelDeleteCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDeleteCustomerTelephone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDeleteCustomerEmailID, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(txtDeleteCustomerAccountType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(75, 75, 75))
        );
        PanelDeleteCustomerContentLayout.setVerticalGroup(
            PanelDeleteCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeleteCustomerContentLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelDeleteCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeleteCustomerNICSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteCustomerNICSearch)
                    .addComponent(jLabel128)
                    .addComponent(txtDeleteCustomerPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(PanelDeleteCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDeleteCustomerContentLayout.createSequentialGroup()
                        .addComponent(txtDeleteCustomerName)
                        .addGap(18, 18, 18)
                        .addComponent(txtDeleteCustomerAddressNo))
                    .addGroup(PanelDeleteCustomerContentLayout.createSequentialGroup()
                        .addComponent(txtDeleteCustomerTelephone)
                        .addGap(18, 18, 18)
                        .addComponent(txtDeleteCustomerEmailID)))
                .addGap(18, 18, 18)
                .addGroup(PanelDeleteCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDeleteCustomerAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDeleteCustomerAccountType))
                .addGap(18, 18, 18)
                .addComponent(txtDeleteCustomerAddressLine2)
                .addGap(18, 18, 18)
                .addComponent(txtDeleteCustomerCity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(PanelDeleteCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteCustomerDelete)
                    .addComponent(btnDeleteCustomerClear))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout PanelDeleteCustomerLayout = new javax.swing.GroupLayout(PanelDeleteCustomer);
        PanelDeleteCustomer.setLayout(PanelDeleteCustomerLayout);
        PanelDeleteCustomerLayout.setHorizontalGroup(
            PanelDeleteCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeleteCustomerLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(PanelDeleteCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelDeleteCustomerContent, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        PanelDeleteCustomerLayout.setVerticalGroup(
            PanelDeleteCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeleteCustomerLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelDeleteCustomerContent, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );

        PanelAddCustomer.setBackground(new java.awt.Color(204, 204, 204));
        PanelAddCustomer.setPreferredSize(new java.awt.Dimension(1170, 630));

        PanelAddCustomerContent.setPreferredSize(new java.awt.Dimension(684, 296));

        jLabel119.setText("NIC");

        txtAddCustomerNIC.setToolTipText("The next available Delaer ID");
        txtAddCustomerNIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAddCustomerNICMouseClicked(evt);
            }
        });
        txtAddCustomerNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddCustomerNICKeyReleased(evt);
            }
        });

        txtAddCustomerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddCustomerNameKeyReleased(evt);
            }
        });

        jLabel121.setText("Name");

        jLabel122.setText("Telephone");

        txtAddCustomerTelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddCustomerTelephoneKeyReleased(evt);
            }
        });

        jLabel123.setText("Email ID");

        txtAddCustomerEmailID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddCustomerEmailIDKeyReleased(evt);
            }
        });

        jLabel124.setText("Address No");

        txtAddCustomerAddressNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddCustomerAddressNoKeyReleased(evt);
            }
        });

        txtAddCustomerAddressLine1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddCustomerAddressLine1KeyReleased(evt);
            }
        });

        jLabel125.setText("Address Line 1");

        txtAddCustomerAddressLine2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddCustomerAddressLine2ActionPerformed(evt);
            }
        });
        txtAddCustomerAddressLine2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddCustomerAddressLine2KeyReleased(evt);
            }
        });

        jLabel126.setText("Address Line 2");

        btnAddCustomerSave.setBackground(new java.awt.Color(0, 102, 102));
        btnAddCustomerSave.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCustomerSave.setText("Save");
        btnAddCustomerSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerSaveActionPerformed(evt);
            }
        });

        btnAddCustomerClear.setBackground(new java.awt.Color(255, 255, 255));
        btnAddCustomerClear.setForeground(new java.awt.Color(255, 0, 0));
        btnAddCustomerClear.setText("Clear");
        btnAddCustomerClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerClearActionPerformed(evt);
            }
        });

        txtAddCustomerCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddCustomerCityKeyReleased(evt);
            }
        });

        jLabel127.setText("City");

        javax.swing.GroupLayout PanelAddCustomerContentLayout = new javax.swing.GroupLayout(PanelAddCustomerContent);
        PanelAddCustomerContent.setLayout(PanelAddCustomerContentLayout);
        PanelAddCustomerContentLayout.setHorizontalGroup(
            PanelAddCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddCustomerContentLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(PanelAddCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAddCustomerContentLayout.createSequentialGroup()
                        .addGroup(PanelAddCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel124, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel125, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel126, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelAddCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAddCustomerCity, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(txtAddCustomerAddressLine2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAddCustomerAddressLine1)
                            .addComponent(txtAddCustomerAddressNo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(240, 240, 240)
                        .addComponent(btnAddCustomerSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddCustomerClear))
                    .addGroup(PanelAddCustomerContentLayout.createSequentialGroup()
                        .addGroup(PanelAddCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel119, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel121, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelAddCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAddCustomerNIC, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(txtAddCustomerName))
                        .addGap(78, 78, 78)
                        .addGroup(PanelAddCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel122, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAddCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAddCustomerEmailID, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(txtAddCustomerTelephone))))
                .addGap(47, 47, 47))
        );
        PanelAddCustomerContentLayout.setVerticalGroup(
            PanelAddCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddCustomerContentLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(PanelAddCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel119)
                    .addGroup(PanelAddCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAddCustomerNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAddCustomerTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel122)))
                .addGap(18, 18, 18)
                .addGroup(PanelAddCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel121)
                    .addComponent(txtAddCustomerEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel123))
                .addGap(18, 18, 18)
                .addGroup(PanelAddCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddCustomerAddressNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel124))
                .addGap(18, 18, 18)
                .addGroup(PanelAddCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddCustomerAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel125)
                    .addComponent(btnAddCustomerSave)
                    .addComponent(btnAddCustomerClear))
                .addGap(18, 18, 18)
                .addGroup(PanelAddCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddCustomerAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel126))
                .addGap(18, 18, 18)
                .addGroup(PanelAddCustomerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddCustomerCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel127))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jLabel82.setBackground(new java.awt.Color(0, 102, 102));
        jLabel82.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("     Add Customer Details");
        jLabel82.setOpaque(true);

        javax.swing.GroupLayout PanelAddCustomerLayout = new javax.swing.GroupLayout(PanelAddCustomer);
        PanelAddCustomer.setLayout(PanelAddCustomerLayout);
        PanelAddCustomerLayout.setHorizontalGroup(
            PanelAddCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddCustomerLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(PanelAddCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelAddCustomerContent, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelAddCustomerLayout.setVerticalGroup(
            PanelAddCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddCustomerLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelAddCustomerContent, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelCustomerLayout = new javax.swing.GroupLayout(PanelCustomer);
        PanelCustomer.setLayout(PanelCustomerLayout);
        PanelCustomerLayout.setHorizontalGroup(
            PanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCustomerLayout.createSequentialGroup()
                .addComponent(PanelControlCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(PanelAddCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 1254, Short.MAX_VALUE)
            .addGroup(PanelCustomerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelViewCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1254, Short.MAX_VALUE))
            .addGroup(PanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelModifyCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelDeleteCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCustomerLayout.setVerticalGroup(
            PanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCustomerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelControlCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelAddCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE))
            .addGroup(PanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCustomerLayout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addComponent(PanelViewCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)))
            .addGroup(PanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCustomerLayout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addComponent(PanelModifyCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(PanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCustomerLayout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addComponent(PanelDeleteCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        PanelDealer.setBackground(new java.awt.Color(204, 204, 204));

        PanelControlDealer.setBackground(new java.awt.Color(204, 204, 204));

        btnAddDealer.setBackground(new java.awt.Color(153, 153, 153));
        btnAddDealer.setPreferredSize(new java.awt.Dimension(350, 50));

        lblBtnAddDealer.setBackground(new java.awt.Color(0, 102, 102));
        lblBtnAddDealer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnAddDealer.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnAddDealer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnAddDealer.setText("Add");
        lblBtnAddDealer.setOpaque(true);
        lblBtnAddDealer.setPreferredSize(new java.awt.Dimension(350, 50));
        lblBtnAddDealer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnAddDealerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnAddDealerLayout = new javax.swing.GroupLayout(btnAddDealer);
        btnAddDealer.setLayout(btnAddDealerLayout);
        btnAddDealerLayout.setHorizontalGroup(
            btnAddDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnAddDealer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnAddDealerLayout.setVerticalGroup(
            btnAddDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnAddDealer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnViewDealer.setBackground(new java.awt.Color(153, 153, 153));
        btnViewDealer.setPreferredSize(new java.awt.Dimension(350, 50));

        lblBtnViewDealer.setBackground(new java.awt.Color(0, 102, 102));
        lblBtnViewDealer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnViewDealer.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnViewDealer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnViewDealer.setText("View");
        lblBtnViewDealer.setOpaque(true);
        lblBtnViewDealer.setPreferredSize(new java.awt.Dimension(350, 50));
        lblBtnViewDealer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnViewDealerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnViewDealerLayout = new javax.swing.GroupLayout(btnViewDealer);
        btnViewDealer.setLayout(btnViewDealerLayout);
        btnViewDealerLayout.setHorizontalGroup(
            btnViewDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnViewDealer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnViewDealerLayout.setVerticalGroup(
            btnViewDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnViewDealer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnModifyDealer.setBackground(new java.awt.Color(153, 153, 153));
        btnModifyDealer.setPreferredSize(new java.awt.Dimension(350, 50));

        lblBtnModifyDealer.setBackground(new java.awt.Color(0, 102, 102));
        lblBtnModifyDealer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBtnModifyDealer.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnModifyDealer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnModifyDealer.setText("Modify");
        lblBtnModifyDealer.setOpaque(true);
        lblBtnModifyDealer.setPreferredSize(new java.awt.Dimension(350, 50));
        lblBtnModifyDealer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnModifyDealerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnModifyDealerLayout = new javax.swing.GroupLayout(btnModifyDealer);
        btnModifyDealer.setLayout(btnModifyDealerLayout);
        btnModifyDealerLayout.setHorizontalGroup(
            btnModifyDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnModifyDealer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnModifyDealerLayout.setVerticalGroup(
            btnModifyDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnModifyDealer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout PanelControlDealerLayout = new javax.swing.GroupLayout(PanelControlDealer);
        PanelControlDealer.setLayout(PanelControlDealerLayout);
        PanelControlDealerLayout.setHorizontalGroup(
            PanelControlDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlDealerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnAddDealer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewDealer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModifyDealer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(316, 316, 316))
        );

        PanelControlDealerLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddDealer, btnModifyDealer, btnViewDealer});

        PanelControlDealerLayout.setVerticalGroup(
            PanelControlDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlDealerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PanelControlDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModifyDealer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddDealer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewDealer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PanelAddDealer.setBackground(new java.awt.Color(204, 204, 204));
        PanelAddDealer.setPreferredSize(new java.awt.Dimension(1170, 630));

        PanelAddDealerContent.setPreferredSize(new java.awt.Dimension(684, 296));

        jLabel103.setText("ID");

        txtAddDealerID.setEditable(false);
        txtAddDealerID.setToolTipText("The next available Delaer ID");
        txtAddDealerID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAddDealerIDMouseClicked(evt);
            }
        });

        txtAddDealerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddDealerNameKeyReleased(evt);
            }
        });

        jLabel104.setText("Name");

        jLabel105.setText("Telephone");

        txtAddDealerTelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddDealerTelephoneKeyReleased(evt);
            }
        });

        jLabel106.setText("Email ID");

        txtAddDealerEmailID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddDealerEmailIDKeyReleased(evt);
            }
        });

        jLabel108.setText("Address No");

        txtAddDealerAddressNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddDealerAddressNoKeyReleased(evt);
            }
        });

        txtAddDealerAddressLine1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddDealerAddressLine1KeyReleased(evt);
            }
        });

        jLabel109.setText("Address Line 1");

        txtAddDealerAddressLine2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddDealerAddressLine2KeyReleased(evt);
            }
        });

        jLabel110.setText("Address Line 2");

        btnAddDealerSave.setBackground(new java.awt.Color(0, 102, 102));
        btnAddDealerSave.setForeground(new java.awt.Color(255, 255, 255));
        btnAddDealerSave.setText("Save");
        btnAddDealerSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDealerSaveActionPerformed(evt);
            }
        });

        btnAddDealerClear.setBackground(new java.awt.Color(255, 255, 255));
        btnAddDealerClear.setForeground(new java.awt.Color(255, 0, 0));
        btnAddDealerClear.setText("Clear");
        btnAddDealerClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDealerClearActionPerformed(evt);
            }
        });

        txtAddDealerCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddDealerCityKeyReleased(evt);
            }
        });

        jLabel112.setText("City");

        javax.swing.GroupLayout PanelAddDealerContentLayout = new javax.swing.GroupLayout(PanelAddDealerContent);
        PanelAddDealerContent.setLayout(PanelAddDealerContentLayout);
        PanelAddDealerContentLayout.setHorizontalGroup(
            PanelAddDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddDealerContentLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(PanelAddDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAddDealerContentLayout.createSequentialGroup()
                        .addGroup(PanelAddDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel110, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelAddDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAddDealerCity, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(txtAddDealerAddressLine2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAddDealerAddressLine1)
                            .addComponent(txtAddDealerAddressNo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(234, 234, 234)
                        .addComponent(btnAddDealerSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddDealerClear))
                    .addGroup(PanelAddDealerContentLayout.createSequentialGroup()
                        .addGroup(PanelAddDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel104, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelAddDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAddDealerID, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(txtAddDealerName))
                        .addGap(78, 78, 78)
                        .addGroup(PanelAddDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel105, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAddDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAddDealerTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddDealerEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47))
        );
        PanelAddDealerContentLayout.setVerticalGroup(
            PanelAddDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddDealerContentLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(PanelAddDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel103)
                    .addGroup(PanelAddDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAddDealerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAddDealerTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel105)))
                .addGap(18, 18, 18)
                .addGroup(PanelAddDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddDealerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel104)
                    .addComponent(txtAddDealerEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106))
                .addGap(18, 18, 18)
                .addGroup(PanelAddDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddDealerAddressNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel108))
                .addGap(18, 18, 18)
                .addGroup(PanelAddDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddDealerAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel109)
                    .addComponent(btnAddDealerSave)
                    .addComponent(btnAddDealerClear))
                .addGap(18, 18, 18)
                .addGroup(PanelAddDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddDealerAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel110))
                .addGap(18, 18, 18)
                .addGroup(PanelAddDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddDealerCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel112))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jLabel77.setBackground(new java.awt.Color(0, 102, 102));
        jLabel77.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("     Add Dealer Details");
        jLabel77.setOpaque(true);

        javax.swing.GroupLayout PanelAddDealerLayout = new javax.swing.GroupLayout(PanelAddDealer);
        PanelAddDealer.setLayout(PanelAddDealerLayout);
        PanelAddDealerLayout.setHorizontalGroup(
            PanelAddDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddDealerLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(PanelAddDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelAddDealerContent, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelAddDealerLayout.setVerticalGroup(
            PanelAddDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddDealerLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelAddDealerContent, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        PanelDeleteDealer.setBackground(new java.awt.Color(204, 204, 204));

        jLabel81.setBackground(new java.awt.Color(0, 102, 102));
        jLabel81.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("     Delete Dealer ");
        jLabel81.setOpaque(true);

        PanelDeleteDealerContent.setPreferredSize(new java.awt.Dimension(684, 296));

        jLabel111.setText("Dealer ID");

        txtDeleteDealerIDSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDeleteDealerIDSearchKeyReleased(evt);
            }
        });

        txtDeleteDealerName.setText("Name :");

        txtDeleteDealerTelephone.setText("Telephone :");

        txtDeleteDealerEmailID.setText("Email ID :");

        txtDeleteDealerAddressNo.setText("Address No :");

        txtDeleteDealerAddressLine1.setText("Address Line 1 :");

        txtDeleteDealerAddressLine2.setText("Address Line 2 :");

        btnDeleteDealerDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDeleteDealerDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteDealerDelete.setText("Delete");
        btnDeleteDealerDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDealerDeleteActionPerformed(evt);
            }
        });

        btnDeleteDealerClear.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteDealerClear.setForeground(new java.awt.Color(255, 0, 0));
        btnDeleteDealerClear.setText("Clear");
        btnDeleteDealerClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDealerClearActionPerformed(evt);
            }
        });

        txtDeleteDealerCity.setText("City :");

        btnDeleteDealerIDSearch.setBackground(new java.awt.Color(51, 153, 255));
        btnDeleteDealerIDSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteDealerIDSearch.setText("Search");
        btnDeleteDealerIDSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDealerIDSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDeleteDealerContentLayout = new javax.swing.GroupLayout(PanelDeleteDealerContent);
        PanelDeleteDealerContent.setLayout(PanelDeleteDealerContentLayout);
        PanelDeleteDealerContentLayout.setHorizontalGroup(
            PanelDeleteDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeleteDealerContentLayout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDeleteDealerIDSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteDealerIDSearch)
                .addGap(224, 224, 224))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeleteDealerContentLayout.createSequentialGroup()
                .addContainerGap(566, Short.MAX_VALUE)
                .addComponent(btnDeleteDealerDelete)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteDealerClear)
                .addGap(122, 122, 122))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeleteDealerContentLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(PanelDeleteDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDeleteDealerAddressLine1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDeleteDealerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDeleteDealerAddressNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDeleteDealerAddressLine2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDeleteDealerCity, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelDeleteDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDeleteDealerTelephone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDeleteDealerEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        PanelDeleteDealerContentLayout.setVerticalGroup(
            PanelDeleteDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeleteDealerContentLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(PanelDeleteDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeleteDealerIDSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteDealerIDSearch)
                    .addComponent(jLabel111))
                .addGap(62, 62, 62)
                .addGroup(PanelDeleteDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDeleteDealerContentLayout.createSequentialGroup()
                        .addComponent(txtDeleteDealerName)
                        .addGap(18, 18, 18)
                        .addComponent(txtDeleteDealerAddressNo))
                    .addGroup(PanelDeleteDealerContentLayout.createSequentialGroup()
                        .addComponent(txtDeleteDealerTelephone)
                        .addGap(18, 18, 18)
                        .addComponent(txtDeleteDealerEmailID)))
                .addGap(18, 18, 18)
                .addComponent(txtDeleteDealerAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDeleteDealerAddressLine2)
                .addGap(18, 18, 18)
                .addComponent(txtDeleteDealerCity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelDeleteDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteDealerDelete)
                    .addComponent(btnDeleteDealerClear))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout PanelDeleteDealerLayout = new javax.swing.GroupLayout(PanelDeleteDealer);
        PanelDeleteDealer.setLayout(PanelDeleteDealerLayout);
        PanelDeleteDealerLayout.setHorizontalGroup(
            PanelDeleteDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeleteDealerLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(PanelDeleteDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelDeleteDealerContent, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        PanelDeleteDealerLayout.setVerticalGroup(
            PanelDeleteDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeleteDealerLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelDeleteDealerContent, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        PanelViewDealer.setBackground(new java.awt.Color(204, 204, 204));

        jLabel79.setBackground(new java.awt.Color(0, 102, 102));
        jLabel79.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("     View Dealer");
        jLabel79.setOpaque(true);
        jLabel79.setPreferredSize(new java.awt.Dimension(648, 47));

        cmbViewDealerSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "ID", "City", "Telephone", "Email ID", "Total Sale" }));

        txtViewDealerSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtViewDealerSearchKeyReleased(evt);
            }
        });

        btnViewDealerSearch.setBackground(new java.awt.Color(51, 153, 255));
        btnViewDealerSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnViewDealerSearch.setText("Search");
        btnViewDealerSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDealerSearchActionPerformed(evt);
            }
        });

        btnViewDealerClear.setBackground(new java.awt.Color(255, 255, 255));
        btnViewDealerClear.setForeground(new java.awt.Color(255, 0, 0));
        btnViewDealerClear.setText("Clear");
        btnViewDealerClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDealerClearActionPerformed(evt);
            }
        });

        btnViewDealerAll.setBackground(new java.awt.Color(0, 102, 102));
        btnViewDealerAll.setForeground(new java.awt.Color(255, 255, 255));
        btnViewDealerAll.setText("View All");
        btnViewDealerAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDealerAllActionPerformed(evt);
            }
        });

        TblViewDealer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address No", "Line 1", "Line 2", "City", "Telephone", "Email ID", "Total Sale"
            }
        ));
        TblViewDealer.setGridColor(new java.awt.Color(255, 255, 255));
        TblViewDealer.setSelectionBackground(new java.awt.Color(0, 102, 102));
        TblViewDealer.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TblViewDealer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblViewDealerMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(TblViewDealer);

        txtViewDealerID.setText("ID :");

        txtViewDealerName.setText("Name :");

        txtViewDealerAddressNo.setText("Address No :");

        txtViewDealerAddressLine1.setText("Address Line 1 :");

        txtViewDealerAddressLine2.setText("Address Line 2 :");

        txtViewDealerCity.setText("City :");

        txtViewDealerTelephone.setText("Telephone :");

        txtViewDealerEmailID.setText("Email ID :");

        javax.swing.GroupLayout PanelViewDealerContentLayout = new javax.swing.GroupLayout(PanelViewDealerContent);
        PanelViewDealerContent.setLayout(PanelViewDealerContentLayout);
        PanelViewDealerContentLayout.setHorizontalGroup(
            PanelViewDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewDealerContentLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(PanelViewDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtViewDealerID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtViewDealerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtViewDealerAddressNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtViewDealerAddressLine1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtViewDealerAddressLine2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtViewDealerCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtViewDealerTelephone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtViewDealerEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        PanelViewDealerContentLayout.setVerticalGroup(
            PanelViewDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewDealerContentLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(txtViewDealerID)
                .addGap(18, 18, 18)
                .addComponent(txtViewDealerName)
                .addGap(18, 18, 18)
                .addComponent(txtViewDealerAddressNo)
                .addGap(18, 18, 18)
                .addComponent(txtViewDealerAddressLine1)
                .addGap(18, 18, 18)
                .addComponent(txtViewDealerAddressLine2)
                .addGap(18, 18, 18)
                .addComponent(txtViewDealerCity)
                .addGap(18, 18, 18)
                .addComponent(txtViewDealerTelephone)
                .addGap(18, 18, 18)
                .addComponent(txtViewDealerEmailID)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel80.setBackground(new java.awt.Color(0, 102, 102));
        jLabel80.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("     Dealer Details");
        jLabel80.setOpaque(true);
        jLabel80.setPreferredSize(new java.awt.Dimension(141, 47));

        javax.swing.GroupLayout PanelViewDealerLayout = new javax.swing.GroupLayout(PanelViewDealer);
        PanelViewDealer.setLayout(PanelViewDealerLayout);
        PanelViewDealerLayout.setHorizontalGroup(
            PanelViewDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewDealerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelViewDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelViewDealerLayout.createSequentialGroup()
                        .addComponent(cmbViewDealerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtViewDealerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewDealerSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnViewDealerClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnViewDealerAll))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelViewDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelViewDealerContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelViewDealerLayout.setVerticalGroup(
            PanelViewDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewDealerLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(PanelViewDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelViewDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelViewDealerLayout.createSequentialGroup()
                        .addGroup(PanelViewDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbViewDealerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtViewDealerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewDealerSearch)
                            .addComponent(btnViewDealerClear)
                            .addComponent(btnViewDealerAll))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelViewDealerContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelModifyDealer.setBackground(new java.awt.Color(204, 204, 204));
        PanelModifyDealer.setPreferredSize(new java.awt.Dimension(1170, 630));

        jLabel78.setBackground(new java.awt.Color(0, 102, 102));
        jLabel78.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("     Modify Dealer Details");
        jLabel78.setOpaque(true);

        PanelModifyDealerContent.setPreferredSize(new java.awt.Dimension(684, 296));

        jLabel107.setText("ID");

        txtModifyDealerID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyDealerIDKeyReleased(evt);
            }
        });

        txtModifyDealerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyDealerNameKeyReleased(evt);
            }
        });

        jLabel113.setText("Name");

        jLabel114.setText("Telephone");

        txtModifyDealerTelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyDealerTelephoneKeyReleased(evt);
            }
        });

        jLabel115.setText("Email ID");

        txtModifyDealerEmailID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyDealerEmailIDKeyReleased(evt);
            }
        });

        jLabel116.setText("Address No");

        txtModifyDealerAddressNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyDealerAddressNoKeyReleased(evt);
            }
        });

        txtModifyDealerAddressLine1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyDealerAddressLine1KeyReleased(evt);
            }
        });

        jLabel117.setText("Address Line 1");

        txtModifyDealerAddressLine2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyDealerAddressLine2KeyReleased(evt);
            }
        });

        jLabel118.setText("Address Line 2");

        btnModifyDealerSave.setBackground(new java.awt.Color(0, 102, 102));
        btnModifyDealerSave.setForeground(new java.awt.Color(255, 255, 255));
        btnModifyDealerSave.setText("Save");
        btnModifyDealerSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyDealerSaveActionPerformed(evt);
            }
        });

        btnModifyDealerClear.setBackground(new java.awt.Color(255, 255, 255));
        btnModifyDealerClear.setForeground(new java.awt.Color(255, 0, 0));
        btnModifyDealerClear.setText("Clear");
        btnModifyDealerClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyDealerClearActionPerformed(evt);
            }
        });

        txtModifyDealerCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifyDealerCityKeyReleased(evt);
            }
        });

        jLabel120.setText("City");

        btnModifyDealerIDSearch.setBackground(new java.awt.Color(51, 153, 255));
        btnModifyDealerIDSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnModifyDealerIDSearch.setText("Search");
        btnModifyDealerIDSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyDealerIDSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelModifyDealerContentLayout = new javax.swing.GroupLayout(PanelModifyDealerContent);
        PanelModifyDealerContent.setLayout(PanelModifyDealerContentLayout);
        PanelModifyDealerContentLayout.setHorizontalGroup(
            PanelModifyDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModifyDealerContentLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(PanelModifyDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel116, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel117, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel118, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelModifyDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtModifyDealerAddressLine2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(txtModifyDealerAddressLine1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModifyDealerID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModifyDealerName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModifyDealerAddressNo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModifyDealerCity))
                .addGap(18, 18, 18)
                .addGroup(PanelModifyDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelModifyDealerContentLayout.createSequentialGroup()
                        .addGap(0, 60, Short.MAX_VALUE)
                        .addGroup(PanelModifyDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelModifyDealerContentLayout.createSequentialGroup()
                                .addGroup(PanelModifyDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelModifyDealerContentLayout.createSequentialGroup()
                                        .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtModifyDealerTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelModifyDealerContentLayout.createSequentialGroup()
                                        .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtModifyDealerEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelModifyDealerContentLayout.createSequentialGroup()
                                .addComponent(btnModifyDealerSave)
                                .addGap(18, 18, 18)
                                .addComponent(btnModifyDealerClear)
                                .addGap(67, 67, 67))))
                    .addGroup(PanelModifyDealerContentLayout.createSequentialGroup()
                        .addComponent(btnModifyDealerIDSearch)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PanelModifyDealerContentLayout.setVerticalGroup(
            PanelModifyDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModifyDealerContentLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(PanelModifyDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel107)
                    .addGroup(PanelModifyDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtModifyDealerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModifyDealerIDSearch)))
                .addGap(18, 18, 18)
                .addGroup(PanelModifyDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModifyDealerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel113)
                    .addComponent(jLabel114)
                    .addComponent(txtModifyDealerTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelModifyDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelModifyDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel115)
                        .addComponent(txtModifyDealerEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelModifyDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtModifyDealerAddressNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel116)))
                .addGap(18, 18, 18)
                .addGroup(PanelModifyDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModifyDealerAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel117))
                .addGap(18, 18, 18)
                .addGroup(PanelModifyDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModifyDealerAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel118)
                    .addComponent(btnModifyDealerSave)
                    .addComponent(btnModifyDealerClear))
                .addGap(18, 18, 18)
                .addGroup(PanelModifyDealerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModifyDealerCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel120))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelModifyDealerLayout = new javax.swing.GroupLayout(PanelModifyDealer);
        PanelModifyDealer.setLayout(PanelModifyDealerLayout);
        PanelModifyDealerLayout.setHorizontalGroup(
            PanelModifyDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModifyDealerLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(PanelModifyDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelModifyDealerContent, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        PanelModifyDealerLayout.setVerticalGroup(
            PanelModifyDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModifyDealerLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelModifyDealerContent, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jLabel76.setBackground(new java.awt.Color(0, 102, 102));
        jLabel76.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("     Dealer");
        jLabel76.setOpaque(true);
        jLabel76.setPreferredSize(new java.awt.Dimension(1086, 30));

        javax.swing.GroupLayout PanelDealerLayout = new javax.swing.GroupLayout(PanelDealer);
        PanelDealer.setLayout(PanelDealerLayout);
        PanelDealerLayout.setHorizontalGroup(
            PanelDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDealerLayout.createSequentialGroup()
                .addGroup(PanelDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelControlDealer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelDealerLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(PanelAddDealer, javax.swing.GroupLayout.DEFAULT_SIZE, 1448, Short.MAX_VALUE)
            .addGroup(PanelDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelDealerLayout.createSequentialGroup()
                    .addComponent(PanelModifyDealer, javax.swing.GroupLayout.DEFAULT_SIZE, 1442, Short.MAX_VALUE)
                    .addGap(6, 6, 6)))
            .addGroup(PanelDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelDealerLayout.createSequentialGroup()
                    .addComponent(PanelViewDealer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(6, 6, 6)))
            .addGroup(PanelDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelDealerLayout.createSequentialGroup()
                    .addComponent(PanelDeleteDealer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(6, 6, 6)))
        );
        PanelDealerLayout.setVerticalGroup(
            PanelDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDealerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelControlDealer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelAddDealer, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PanelDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDealerLayout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addComponent(PanelModifyDealer, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(PanelDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDealerLayout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addComponent(PanelViewDealer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(PanelDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDealerLayout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addComponent(PanelDeleteDealer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        ControlPanel.setBackground(new java.awt.Color(0, 102, 102));
        ControlPanel.setPreferredSize(new java.awt.Dimension(1000, 60));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LOGO.png"))); // NOI18N

        jLabel147.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel147.setForeground(new java.awt.Color(255, 255, 255));
        jLabel147.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel147.setText("MULTI ENGINEERING SERVICES LANKA PRIVATE LIMITED");
        jLabel147.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel148.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(255, 255, 255));
        jLabel148.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel148.setText("Maintanance Services and Civil Constructors -  No.466/7A Thapowanaya Road,Aggona. Sri Lanka ");

        jLabel149.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(255, 255, 255));
        jLabel149.setText("Date");

        jLabel150.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel150.setForeground(new java.awt.Color(255, 255, 255));
        jLabel150.setText("Time");

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimize.png"))); // NOI18N
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(306, 306, 306)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel148, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit)
                .addGap(30, 30, 30))
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo)
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel147)
                            .addComponent(jLabel149))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel148)
                            .addComponent(jLabel150))))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit)
                    .addComponent(btnMinimize))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PanelMenu.setBackground(new java.awt.Color(204, 204, 204));
        PanelMenu.setPreferredSize(new java.awt.Dimension(200, 540));

        lblDashboard.setBackground(java.awt.Color.lightGray);
        lblDashboard.setForeground(new java.awt.Color(0, 0, 0));
        lblDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-dashboard-layout-24.png"))); // NOI18N
        lblDashboard.setText("Dashboard");
        lblDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDashboard.setOpaque(true);
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDashboardMouseExited(evt);
            }
        });

        lblUser.setBackground(java.awt.Color.lightGray);
        lblUser.setForeground(new java.awt.Color(0, 0, 0));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-24.png"))); // NOI18N
        lblUser.setText("User");
        lblUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUser.setOpaque(true);
        lblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUserMouseExited(evt);
            }
        });

        lblOrders.setBackground(java.awt.Color.lightGray);
        lblOrders.setForeground(new java.awt.Color(0, 0, 0));
        lblOrders.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOrders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-order-24.png"))); // NOI18N
        lblOrders.setText("Orders");
        lblOrders.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOrders.setOpaque(true);
        lblOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrdersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOrdersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOrdersMouseExited(evt);
            }
        });

        lblItem.setBackground(java.awt.Color.lightGray);
        lblItem.setForeground(new java.awt.Color(0, 0, 0));
        lblItem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-item-24.png"))); // NOI18N
        lblItem.setText("Item");
        lblItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblItem.setOpaque(true);
        lblItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblItemMouseExited(evt);
            }
        });

        lblSalesperson.setBackground(java.awt.Color.lightGray);
        lblSalesperson.setForeground(new java.awt.Color(0, 0, 0));
        lblSalesperson.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSalesperson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-salesperson-24.png"))); // NOI18N
        lblSalesperson.setText("Sales Person");
        lblSalesperson.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalesperson.setOpaque(true);
        lblSalesperson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalespersonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSalespersonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalespersonMouseExited(evt);
            }
        });

        lblSales.setBackground(java.awt.Color.lightGray);
        lblSales.setForeground(new java.awt.Color(0, 0, 0));
        lblSales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-sales-24.png"))); // NOI18N
        lblSales.setText("Sale");
        lblSales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSales.setOpaque(true);
        lblSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalesMouseExited(evt);
            }
        });

        lblCustomer.setBackground(java.awt.Color.lightGray);
        lblCustomer.setForeground(new java.awt.Color(0, 0, 0));
        lblCustomer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-customer-24.png"))); // NOI18N
        lblCustomer.setText("Customer");
        lblCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCustomer.setOpaque(true);
        lblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCustomerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCustomerMouseExited(evt);
            }
        });

        lblDealer.setBackground(java.awt.Color.lightGray);
        lblDealer.setForeground(new java.awt.Color(0, 0, 0));
        lblDealer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDealer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-dealer-24.png"))); // NOI18N
        lblDealer.setText("Dealers");
        lblDealer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDealer.setOpaque(true);
        lblDealer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDealerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDealerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDealerMouseExited(evt);
            }
        });

        lblLogout.setBackground(java.awt.Color.lightGray);
        lblLogout.setForeground(new java.awt.Color(255, 0, 0));
        lblLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogout.setText("Logout");
        lblLogout.setOpaque(true);
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        LblUserImage.setBackground(new java.awt.Color(51, 255, 51));
        LblUserImage.setForeground(new java.awt.Color(255, 255, 255));
        LblUserImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblUserImage.setText("USER");

        txtUserName.setBackground(java.awt.Color.lightGray);
        txtUserName.setForeground(new java.awt.Color(0, 102, 102));
        txtUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUserName.setText("Name");
        txtUserName.setOpaque(true);

        txtUserType.setBackground(java.awt.Color.lightGray);
        txtUserType.setForeground(new java.awt.Color(0, 102, 102));
        txtUserType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUserType.setText("Type");
        txtUserType.setOpaque(true);

        txtUserEmail.setBackground(new java.awt.Color(0, 0, 204));
        txtUserEmail.setForeground(new java.awt.Color(0, 0, 255));
        txtUserEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUserEmail.setText("useremail");
        txtUserEmail.setToolTipText(txtUserEmail.getText());
        txtUserEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserEmailMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelMenuLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblDealer, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                        .addComponent(lblCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblSales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblSalesperson, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                        .addComponent(lblItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtUserType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(PanelMenuLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(LblUserImage, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addComponent(txtUserEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblItem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSalesperson, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSales, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDealer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(LblUserImage, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(txtUserEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(PanelDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 1485, Short.MAX_VALUE))
                    .addComponent(ControlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1685, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(PanelUser, javax.swing.GroupLayout.DEFAULT_SIZE, 1485, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(PanelOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(PanelItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(PanelSalesperson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(PanelSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(PanelCustomer, 1196, 1196, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(PanelDealer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ControlPanel, 66, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
                    .addComponent(PanelDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(PanelUser, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(PanelOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(PanelItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(PanelSalesperson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(PanelSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(PanelCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(PanelDealer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        PanelUser.getAccessibleContext().setAccessibleParent(this);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblDealerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDealerMouseExited
        lblDealer.setBackground(Color.lightGray);
        
    }//GEN-LAST:event_lblDealerMouseExited

    private void lblDealerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDealerMouseEntered
        lblDealer.setBackground(Color.gray);
    }//GEN-LAST:event_lblDealerMouseEntered

    private void lblDealerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDealerMouseClicked
        PanelDashboard.setVisible(false);
        PanelUser.setVisible(false);
        PanelOrder.setVisible(false);
        PanelItem.setVisible(false);
        PanelSalesperson.setVisible(false);
        PanelSale.setVisible(false);
        PanelCustomer.setVisible(false);
        PanelDealer.setVisible(true);
        
        lblDashboard.setForeground(Color.BLACK);
        lblUser.setForeground(Color.BLACK);
        lblItem.setForeground(Color.BLACK);
        lblSalesperson.setForeground(Color.BLACK);
        lblSales.setForeground(Color.BLACK);
        lblCustomer.setForeground(Color.BLACK);
        lblDealer.setForeground(new Color (0,102,102));
        lblOrders.setForeground(Color.BLACK);

        
        Dealer d = new Dealer();
        txtAddDealerID.setText(d.loadDealerID());
   
    }//GEN-LAST:event_lblDealerMouseClicked

    private void lblCustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCustomerMouseExited
        lblCustomer.setBackground(Color.lightGray);
    }//GEN-LAST:event_lblCustomerMouseExited

    private void lblCustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCustomerMouseEntered
        lblCustomer.setBackground(Color.gray);
    }//GEN-LAST:event_lblCustomerMouseEntered

    private void lblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCustomerMouseClicked
        PanelDashboard.setVisible(false);
        PanelUser.setVisible(false);
        PanelOrder.setVisible(false);
        PanelItem.setVisible(false);
        PanelSale.setVisible(false);
        PanelCustomer.setVisible(true);
        PanelDealer.setVisible(false);
        PanelSalesperson.setVisible(false);
 
        lblDashboard.setForeground(Color.BLACK);
        lblUser.setForeground(Color.BLACK);
        lblItem.setForeground(Color.BLACK);
        lblSalesperson.setForeground(Color.BLACK);
        lblSales.setForeground(Color.BLACK);
        lblCustomer.setForeground(new Color (0,102,102));
        lblDealer.setForeground(Color.BLACK);
        lblOrders.setForeground(Color.BLACK);

    }//GEN-LAST:event_lblCustomerMouseClicked

    private void lblSalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalesMouseExited
        lblSales.setBackground(Color.lightGray);
    }//GEN-LAST:event_lblSalesMouseExited

    private void lblSalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalesMouseEntered
        lblSales.setBackground(Color.gray);
    }//GEN-LAST:event_lblSalesMouseEntered

    private void lblSalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalesMouseClicked
        PanelDashboard.setVisible(false);
        PanelUser.setVisible(false);
        PanelOrder.setVisible(false);
        PanelItem.setVisible(false);
        PanelSalesperson.setVisible(false);
        PanelSale.setVisible(true);
        PanelCustomer.setVisible(false);
        PanelDealer.setVisible(false);
        
        lblDashboard.setForeground(Color.BLACK);
        lblUser.setForeground(Color.BLACK);
        lblItem.setForeground(Color.BLACK);
        lblSalesperson.setForeground(Color.BLACK);
        lblSales.setForeground(new Color (0,102,102));
        lblCustomer.setForeground(Color.BLACK);
        lblDealer.setForeground(Color.BLACK);
        lblOrders.setForeground(Color.BLACK);
        
        
   
    }//GEN-LAST:event_lblSalesMouseClicked

    private void lblSalespersonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalespersonMouseExited
        lblSalesperson.setBackground(Color.lightGray);
    }//GEN-LAST:event_lblSalespersonMouseExited

    private void lblSalespersonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalespersonMouseEntered
        lblSalesperson.setBackground(Color.gray);
    }//GEN-LAST:event_lblSalespersonMouseEntered

    private void lblSalespersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalespersonMouseClicked
        PanelDashboard.setVisible(false);
        PanelUser.setVisible(false);
        PanelOrder.setVisible(false);
        PanelItem.setVisible(false);
        PanelSalesperson.setVisible(true);
        PanelSale.setVisible(false);
        PanelCustomer.setVisible(false);
        PanelDealer.setVisible(false);
        
        lblDashboard.setForeground(Color.BLACK);
        lblUser.setForeground(Color.BLACK);
        lblItem.setForeground(Color.BLACK);
        lblSalesperson.setForeground(new Color (0,102,102));
        lblSales.setForeground(Color.BLACK);
        lblCustomer.setForeground(Color.BLACK);
        lblDealer.setForeground(Color.BLACK);
        lblOrders.setForeground(Color.BLACK);
        
  
    }//GEN-LAST:event_lblSalespersonMouseClicked

    private void lblItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblItemMouseExited
        lblItem.setBackground(Color.lightGray);
    }//GEN-LAST:event_lblItemMouseExited

    private void lblItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblItemMouseEntered
        lblItem.setBackground(Color.gray);
    }//GEN-LAST:event_lblItemMouseEntered

    private void lblItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblItemMouseClicked
        PanelDashboard.setVisible(false);
        PanelUser.setVisible(false);
        PanelOrder.setVisible(false);
        PanelItem.setVisible(true);
        PanelSalesperson.setVisible(false);
        PanelSale.setVisible(false);
        PanelCustomer.setVisible(false);
        PanelDealer.setVisible(false);
        
        lblDashboard.setForeground(Color.BLACK);
        lblUser.setForeground(Color.BLACK);
        lblItem.setForeground(new Color (0,102,102));
        lblSalesperson.setForeground(Color.BLACK);
        lblSales.setForeground(Color.BLACK);
        lblCustomer.setForeground(Color.BLACK);
        lblDealer.setForeground(Color.BLACK);
        lblOrders.setForeground(Color.BLACK);
        
        
       
    }//GEN-LAST:event_lblItemMouseClicked

    private void lblOrdersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOrdersMouseExited
        lblOrders.setBackground(Color.lightGray);
    }//GEN-LAST:event_lblOrdersMouseExited

    private void lblOrdersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOrdersMouseEntered
        lblOrders.setBackground(Color.gray);
    }//GEN-LAST:event_lblOrdersMouseEntered

    private void lblOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOrdersMouseClicked
        PanelDashboard.setVisible(false);
        PanelUser.setVisible(false);
        PanelOrder.setVisible(true);
        PanelItem.setVisible(false);
        PanelSalesperson.setVisible(false);
        PanelSale.setVisible(false);
        PanelCustomer.setVisible(false);
        PanelDealer.setVisible(false);
        
        lblDashboard.setForeground(Color.BLACK);
        lblUser.setForeground(Color.BLACK);
        lblItem.setForeground(Color.BLACK);
        lblSalesperson.setForeground(Color.BLACK);
        lblSales.setForeground(Color.BLACK);
        lblCustomer.setForeground(Color.BLACK);
        lblDealer.setForeground(Color.BLACK);
        lblOrders.setForeground(new Color (0,102,102));
        
        btnOrder3.setVisible(false);
        btnOrder4.setVisible(false);
        
      
    }//GEN-LAST:event_lblOrdersMouseClicked

    private void lblUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserMouseExited
        lblUser.setBackground(Color.lightGray);
    }//GEN-LAST:event_lblUserMouseExited

    private void lblUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserMouseEntered
        lblUser.setBackground(Color.gray);
    }//GEN-LAST:event_lblUserMouseEntered

    private void lblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserMouseClicked
        Database db = new Database();
        int q = db.credential_check("select * from tb_employee where username = '"+txtUserName.getText()+"' and usertype in ('Admin')");
        if(q==1)
        {
            PanelDashboard.setVisible(false);
            PanelUser.setVisible(true);
            PanelOrder.setVisible(false);
            PanelItem.setVisible(false);
            PanelSalesperson.setVisible(false);
            PanelSale.setVisible(false);
            PanelCustomer.setVisible(false);
            PanelDealer.setVisible(false);

            lblDashboard.setForeground(Color.BLACK);
            lblUser.setForeground(new Color (0,102,102));
            lblItem.setForeground(Color.BLACK);
            lblSalesperson.setForeground(Color.BLACK);
            lblSales.setForeground(Color.BLACK);
            lblCustomer.setForeground(Color.BLACK);
            lblDealer.setForeground(Color.BLACK);
            lblOrders.setForeground(Color.BLACK);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You don't have privileges to access this menu","No Access",JOptionPane.WARNING_MESSAGE);
        }
        
      
    }//GEN-LAST:event_lblUserMouseClicked

    private void lblDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseExited
        lblDashboard.setBackground(Color.lightGray);
    }//GEN-LAST:event_lblDashboardMouseExited

    private void lblDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseEntered
        lblDashboard.setBackground(Color.gray);
    }//GEN-LAST:event_lblDashboardMouseEntered

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
        PanelDashboard.setVisible(true);
        PanelUser.setVisible(false);
        PanelOrder.setVisible(false);
        PanelItem.setVisible(false);
        PanelSalesperson.setVisible(false);
        PanelSale.setVisible(false);
        PanelCustomer.setVisible(false);
        PanelDealer.setVisible(false);
        
        lblDashboard.setForeground(new Color (0,102,102));
        lblUser.setForeground(Color.BLACK);
        lblItem.setForeground(Color.BLACK);
        lblSalesperson.setForeground(Color.BLACK);
        lblSales.setForeground(Color.BLACK);
        lblCustomer.setForeground(Color.BLACK);
        lblDealer.setForeground(Color.BLACK);
        lblOrders.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblDashboardMouseClicked

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        int i = JOptionPane.showConfirmDialog(null, "Do you want to logout?", "Logout",JOptionPane.YES_NO_OPTION);
        if(i!=1){
            Login l = new Login();
            l.setVisible(true);
            new AnnualSalesReport().dispose();
            new DailySalesReport().dispose();
            new DynamicSalesReport().dispose();
            new ForgetPassword().dispose();
            new GoodsReceiveNote().dispose();
            new ManageReturns().dispose();
            new MonthlySalesReport().dispose();
            new SaleCustomerOrder().dispose();
            new SaleDealerOrder().dispose();
            new StockAdjusment().dispose();
            new StockReport().dispose();
            new UserReport().dispose();
            new ViewInvoice().dispose();
            StaticSalesReportMenu f = new StaticSalesReportMenu(); 
            f.setVisible(false);            
            this.dispose();
        }else{
            
        }
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void btnModifyUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifyUserMouseClicked
        PanelAddUser.setVisible(false);
        PanelViewUser.setVisible(false);    
        panelDeleteUser.setVisible(false);
        PanelModifyUser.setVisible(true);
        PanelResetPassword.setVisible(false);
        PanelUserOperation.setVisible(false);
        
    }//GEN-LAST:event_btnModifyUserMouseClicked

    private void btnAddUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddUserMouseClicked
        PanelAddUser.setVisible(true);
        PanelViewUser.setVisible(false);    
        panelDeleteUser.setVisible(false);
        PanelModifyUser.setVisible(false);
        PanelResetPassword.setVisible(false);
        PanelUserOperation.setVisible(false);
        
    }//GEN-LAST:event_btnAddUserMouseClicked

    private void btnDeleteUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteUserMouseClicked
        PanelAddUser.setVisible(false);
        PanelViewUser.setVisible(false);    
        panelDeleteUser.setVisible(true);
        PanelModifyUser.setVisible(false);
        PanelResetPassword.setVisible(false);
        PanelUserOperation.setVisible(false);
    }//GEN-LAST:event_btnDeleteUserMouseClicked

    private void btnResetPasswordUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetPasswordUserMouseClicked
        PanelAddUser.setVisible(false);
        PanelViewUser.setVisible(false);    
        panelDeleteUser.setVisible(false);
        PanelModifyUser.setVisible(false);
        PanelResetPassword.setVisible(true);
        PanelUserOperation.setVisible(false);
    }//GEN-LAST:event_btnResetPasswordUserMouseClicked

    private void btnUserOperationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserOperationMouseClicked
        PanelAddUser.setVisible(false);
        PanelViewUser.setVisible(false);    
        panelDeleteUser.setVisible(false);
        PanelModifyUser.setVisible(false);
        PanelResetPassword.setVisible(false);
        PanelUserOperation.setVisible(true);
    }//GEN-LAST:event_btnUserOperationMouseClicked

    private void btnViewUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewUserMouseClicked
        PanelAddUser.setVisible(false);
        PanelViewUser.setVisible(true);    
        panelDeleteUser.setVisible(false);
        PanelModifyUser.setVisible(false);
        PanelResetPassword.setVisible(false);
        PanelUserOperation.setVisible(false);
        
        DefaultTableModel tmodel = (DefaultTableModel)tblViewUser.getModel();
        tmodel.getDataVector().removeAllElements();
        
        User u = new User();
        ResultSet rs = u.viewuser("");
        if(rs != null)
        {
            try {
                while(rs.next())
                {
                    String username = String.valueOf(rs.getString("username"));
                    String fullname = String.valueOf(rs.getString("fullname"));
                    String telephone = String.valueOf(rs.getInt("telephone"));
                    String address = String.valueOf(rs.getString("address"));
                    String email = String.valueOf(rs.getString("email"));
                    String userType = String.valueOf(rs.getString("userType"));
                
                    String tbData[] = {username,fullname,telephone,address,email,userType};
                    DefaultTableModel tbmodel = (DefaultTableModel)tblViewUser.getModel();
                
                    tbmodel.addRow(tbData);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Cannot Load User Data Right Now "+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No user found","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnViewUserMouseClicked

    private void txtAddUserFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddUserFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddUserFullNameActionPerformed

    private void txtModifyUserFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModifyUserFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyUserFullNameActionPerformed
    
    void AddUserClear(){
        txtAddUserFullName.setText(null);
        txtAddUserAddress.setText(null);
        txtAddUserTelephone.setText(null);
        txtAddUserEmailID.setText(null);
        txtAddUserName.setText(null);
        txtAddUserPassword.setText(null);
        txtAddUserRetypepassword.setText(null);
        txtAddUserPhoto.setIcon(null);
        txtAddUserPhoto.setText(null);
    }
    private void btnAddUserCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserCancelActionPerformed
        // TODO add your handling code here:
        AddUserClear();
    }//GEN-LAST:event_btnAddUserCancelActionPerformed

    private void btnAddUserSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserSaveActionPerformed
           
        String password = String.valueOf(txtAddUserPassword.getPassword());
        String confirmPassword = String.valueOf(txtAddUserRetypepassword.getPassword());
        
        //regex for texts
        Pattern emailRegex = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        Matcher emailMatcher = emailRegex.matcher(txtAddUserEmailID.getText());
        Pattern telephoneRegex = Pattern.compile("^[0-9]*$");
        Matcher telephoneMatacher = telephoneRegex.matcher(txtAddUserTelephone.getText());
        Pattern fullnameRegex = Pattern.compile("^[a-zA-Z ]*$");
        Matcher fullnameMatacher = fullnameRegex.matcher(txtAddUserFullName.getText());
        
        if(new Database().credential_check("select * from tb_employee where username = '"+txtAddUserName.getText()+"'")==1)
        {
            JOptionPane.showMessageDialog(this, "This Username is already exsists!","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(txtAddUserFullName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Full Name Cannot Be Blank!","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(fullnameMatacher.matches()==false)
        {
            JOptionPane.showMessageDialog(this, "Full Name Cannot Have Numbers or Symbols\nHint : Use Space over full-stop ( . )","Invalid Name!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtAddUserAddress.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Address Cannot Be Blank","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(txtAddUserTelephone.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Telephone Number Cannot Be Blank","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(telephoneMatacher.matches()==false)
        {
            JOptionPane.showMessageDialog(this, "Telephone Number Cannot Have Letters","Invalid Telephone Number!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtAddUserTelephone.getText().length() !=10)
        {
            JOptionPane.showMessageDialog(this, "Telephone Number is not valid! Please give valid telephone number!","Invalid Telephone Number!",JOptionPane.ERROR_MESSAGE);
        }       
        else if(txtAddUserEmailID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Email Cannot Be Blank","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(emailMatcher.matches()==false)
        {
            JOptionPane.showMessageDialog(this, "Its does not llike a email address! Please give valid email!","Invalid Email Address!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtAddUserName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Username Cannot Be Blank","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(txtAddUserName.getText().length()<6)
        {
            JOptionPane.showMessageDialog(this, "Username Must Contain more than 6 characters","Error!",JOptionPane.ERROR_MESSAGE);
        }
        else if(password.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Password Cannot Be Blank","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(password.length()<8)
        {
            JOptionPane.showMessageDialog(this, "Password Must Contain more than 8 characters","Week Password!",JOptionPane.ERROR_MESSAGE);
        }
        else if(confirmPassword.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Confirm Your Password!","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(!password.equals(confirmPassword))
        {
            JOptionPane.showMessageDialog(this, "Passwords are mismatching! try again!","Password didn't match!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtAddUserPhoto.getIcon()==null)
        {
            JOptionPane.showMessageDialog(this, "User Image Cannot Be Blank","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            //String password = new String(txtAddUserPassword.getPassword());
            User u = new User();
            int x = u.addUser(txtAddUserName.getText(),password,txtAddUserFullName.getText(),txtAddUserTelephone.getText(),txtAddUserAddress.getText(),txtAddUserEmailID.getText(),cmbAddUserType.getSelectedItem().toString(),txtAddUserPhoto.getText());
            u.recordUserOperation(txtUserName.getText(), "User", "Add New User", "Username : "+txtAddUserName.getText());
            if(x==1)
            {
                AddUserClear();
            }
        }
        
    }//GEN-LAST:event_btnAddUserSaveActionPerformed

    
    private void btnAddUserPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserPhotoActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png","jpeg");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            ImageResizer ir = new ImageResizer();
            txtAddUserPhoto.setIcon(ir.ResizeImage(path,txtAddUserPhoto));
            txtAddUserPhoto.setText(path);
        }
        else if(result == JFileChooser.CANCEL_OPTION)
        {
            txtAddUserPhoto.setIcon(null);
            JOptionPane.showMessageDialog(this, "Image not selected", "Select Image",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddUserPhotoActionPerformed

    private void tblViewUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblViewUserMouseClicked
        // TODO add your handling code here:
        txtViewUsername.setText("Username : ");
        txtViewUserFullname.setText("Full Name : ");
        txtViewUserAddress.setText("Address : ");
        txtViewTelephone.setText("Telephone : ");
        txtViewUserType.setText("User Type : ");
        txtViewUserEmailID.setText("Email ID : ");
                
        int row = tblViewUser.getSelectedRow();
        
        String username = tblViewUser.getValueAt(row, 0).toString();
        String fullname = tblViewUser.getValueAt(row, 1).toString();
        String telephone = tblViewUser.getValueAt(row, 2).toString();
        String address = tblViewUser.getValueAt(row, 3).toString();
        String emailID = tblViewUser.getValueAt(row, 4).toString();
        String userType = tblViewUser.getValueAt(row, 5).toString();
            
        txtViewUsername.setText(txtViewUsername.getText()+" "+username);
        txtViewUserFullname.setText(txtViewUserFullname.getText()+" "+fullname);
        txtViewUserAddress.setText(txtViewUserAddress.getText()+" "+address);
        txtViewTelephone.setText(txtViewTelephone.getText()+" "+telephone);
        txtViewUserType.setText(txtViewUserType.getText()+" "+userType);
        txtViewUserEmailID.setText(txtViewUserEmailID.getText()+" "+emailID);
        
        loaduserImage(username);
    }//GEN-LAST:event_tblViewUserMouseClicked

    private void loaduserImage(String userName)
    {
        Database db = new Database();
        ResultSet rs = db.selectData("select photo from tb_employee where username = '"+userName+"'");
        if(rs !=null)
        {
            try {
                while(rs.next())
                {
                    byte[] imagebytes = rs.getBytes("photo");
                    Image image=getToolkit().createImage(imagebytes);
                    Image img = image.getScaledInstance(100,100,Image.SCALE_SMOOTH);
                    ImageIcon icon=new ImageIcon(img);
                    txtViewUserPhoto.setIcon(icon);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error while loading image try again", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void btnViewUserSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUserSearchActionPerformed
        // TODO add your handling code here:
        User u = new User();
        ResultSet rs = null;
        
        if(!txtViewUserSearchUsername.getText().isEmpty())
        {
            Database db = new Database();
            int i = db.credential_check("select*from tb_employee where UserName = '"+txtViewUserSearchUsername.getText()+"'");
            if(i!=1){
                JOptionPane.showMessageDialog(null,"Can't find username! Try again!","Not Found!", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                rs = u.viewuser(txtViewUserSearchUsername.getText());
            }
        }
        else
        {
            rs = u.viewuser(txtViewUserSearchUsername.getText());
        }
        txtViewUsername.setText("Username : ");
        txtViewUserFullname.setText("Full Name : ");
        txtViewUserAddress.setText("Address : ");
        txtViewTelephone.setText("Telephone : ");
        txtViewUserType.setText("User Type : ");
        txtViewUserEmailID.setText("Email ID : ");        
        DefaultTableModel tmodel = (DefaultTableModel)tblViewUser.getModel();
        tmodel.setRowCount(0);
        if(rs != null)
        {
            try {
                while(rs.next())
                {
                    String username = String.valueOf(rs.getString("username"));
                    String fullname = String.valueOf(rs.getString("fullname"));
                    String telephone = String.valueOf(rs.getInt("telephone"));
                    String address = String.valueOf(rs.getString("address"));
                    String email = String.valueOf(rs.getString("email"));
                    String userType = String.valueOf(rs.getString("userType"));
                
                    String tbData[] = {username,fullname,telephone,address,email,userType};
                    DefaultTableModel tbmodel = (DefaultTableModel)tblViewUser.getModel();
                
                    tbmodel.addRow(tbData);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Cannot Load User Data Right Now "+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No user found","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnViewUserSearchActionPerformed

    private void btnModifyUserSearchUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyUserSearchUsernameActionPerformed
        // TODO add your handling code here:
        Database db = new Database();
        int i = db.credential_check("select* from tb_employee where UserName = '"+txtModifyUserSearchUsername.getText()+"'");
        if(i==1)
        {
            txtModifyUserFullName.setText(null);
            ModifyUserAddress.setText(null);
            txtModifyUserTelephone.setText(null);
            txtModifyUserEmailID.setText(null);
            txtModifyUserType.setText(null);
            txtModifyUserName.setText(null);
            txtModifyUserPassword.setText(null);
            txtModifyUserRetypepassword.setText(null);
            txtModifyUserPhoto.setText(null);
            txtModifyUserPhoto.setIcon(null);

            User u = new User();
            ResultSet rs = u.viewuser(txtModifyUserSearchUsername.getText());
            if(rs != null)
            {
                try {
                    while(rs.next())
                    {
                        String username = String.valueOf(rs.getString("username"));
                        String password = rs.getString("password");
                        String fullname = String.valueOf(rs.getString("fullname"));
                        String telephone = String.valueOf(rs.getInt("telephone"));
                        String address = String.valueOf(rs.getString("address"));
                        String email = String.valueOf(rs.getString("email"));
                        String userType = String.valueOf(rs.getString("userType"));
                        byte[] imagebytes = rs.getBytes("photo");

                        Image image=getToolkit().createImage(imagebytes);
                        Image img = image.getScaledInstance(100,100,Image.SCALE_SMOOTH);
                        ImageIcon icon=new ImageIcon(img);
                        txtModifyUserName.setText(username);
                        txtModifyUserFullName.setText(fullname);
                        txtModifyUserTelephone.setText("0"+telephone);
                        ModifyUserAddress.setText(address);
                        txtModifyUserEmailID.setText(email);
                        txtModifyUserType.setText(userType);
                        txtModifyUserPhoto.setIcon(icon);

                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Cannot Load User Data Right Now "+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "No such user found try again","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Can't find username! Try again!","Not Found!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnModifyUserSearchUsernameActionPerformed

    void ModifyUserClear(){
        txtModifyUserSearchUsername.setText(null);
        txtModifyUserFullName.setText(null);
        ModifyUserAddress.setText(null);
        txtModifyUserTelephone.setText(null);
        txtModifyUserEmailID.setText(null);
        txtModifyUserType.setText(null);
        txtModifyUserName.setText(null);
        txtModifyUserPassword.setText(null);
        txtModifyUserRetypepassword.setText(null);
        txtModifyUserPhoto.setIcon(null);
    }
    private void btnModifyUserCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyUserCancelActionPerformed
        // TODO add your handling code here:
        ModifyUserClear();
    }//GEN-LAST:event_btnModifyUserCancelActionPerformed

    private void btnModifyUserPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyUserPhotoActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png","jpeg");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            ImageResizer ir = new ImageResizer();
            txtModifyUserPhoto.setIcon(ir.ResizeImage(path,txtModifyUserPhoto));
            txtModifyUserPhoto.setText(path);
        }
        else if(result == JFileChooser.CANCEL_OPTION)
        {
            txtAddUserPhoto.setIcon(null);
            JOptionPane.showMessageDialog(this, "Image not selected", "Select Image",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModifyUserPhotoActionPerformed

    private void btnModifyUserSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyUserSaveActionPerformed
        String password = String.valueOf(txtModifyUserPassword.getPassword());
        String confirmPassword = String.valueOf(txtModifyUserRetypepassword.getPassword());
        
        //regex for texts
        Pattern emailRegex = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        Matcher emailMatcher = emailRegex.matcher(txtModifyUserEmailID.getText());
        Pattern telephoneRegex = Pattern.compile("^[0-9]*$");
        Matcher telephoneMatacher = telephoneRegex.matcher(txtModifyUserTelephone.getText());
        Pattern fullnameRegex = Pattern.compile("^[a-zA-Z ]*$");
        Matcher fullnameMatacher = fullnameRegex.matcher(txtModifyUserFullName.getText());
        
        if(txtModifyUserFullName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Full Name Cannot Be Blank!","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(fullnameMatacher.matches()==false)
        {
            JOptionPane.showMessageDialog(this, "Full Name Cannot Have Numbers or Symbols\nHint : User Space over full-stop ( . )","Invalid Name!",JOptionPane.ERROR_MESSAGE);
        }
        else if(ModifyUserAddress.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Address Cannot Be Blank!","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(txtModifyUserTelephone.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Telephone Number Cannot Be Blank","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(telephoneMatacher.matches()==false)
        {
            JOptionPane.showMessageDialog(this, "Telephone Number Cannot Have Letters","Invalid Telephone Number!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtModifyUserTelephone.getText().length() !=10)
        {
            JOptionPane.showMessageDialog(this, "Telephone Number is not valid! Please give valid telephone number!","Invalid Telephone Number!",JOptionPane.ERROR_MESSAGE);
        }       
        else if(txtModifyUserEmailID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Email Cannot Be Blank!","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(emailMatcher.matches()==false)
        {
            JOptionPane.showMessageDialog(this, "Its does not llike a email address! Please give valid email!","Invalid Email Address!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtModifyUserName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Username Cannot Be Blank!","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(txtModifyUserName.getText().length()<6)
        {
            JOptionPane.showMessageDialog(this, "Username Must Contain more than 6 characters","Error!",JOptionPane.ERROR_MESSAGE);
        }
        else if(password.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Password Cannot Be Blank!","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(password.length()<8)
        {
            JOptionPane.showMessageDialog(this, "Password Must Contain more than 8 characters","Week Password!",JOptionPane.ERROR_MESSAGE);
        }
        else if(confirmPassword.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Confirm Your Password!","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(!password.equals(confirmPassword))
        {
            JOptionPane.showMessageDialog(this, "Passwords are mismatching! try again!","Password didn't match!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtModifyUserPhoto.getIcon()==null)
        {
            JOptionPane.showMessageDialog(this, "User Image Cannot Be Blank","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            User u = new User();
            u.updateUser(txtModifyUserName.getText(),password,txtModifyUserFullName.getText(),txtModifyUserTelephone.getText(),ModifyUserAddress.getText(),txtModifyUserEmailID.getText(),txtModifyUserType.getText(),txtModifyUserPhoto.getText());  
            u.recordUserOperation(txtUserName.getText(), "User", "Modify User", "Username : "+txtModifyUserName.getText());
            ModifyUserClear();
        }
            //String password = new String(txtAddUserPassword.getPassword());
            //User u = new User();
            //u.updateUser(txtAddUserName.getText(),password,txtAddUserFullName.getText(),txtAddUserTelephone.getText(),txtAddUserAddress.getText(),txtAddUserEmailID.getText(),cmbAddUserType.getSelectedItem().toString(),txtAddUserPhoto.getText());   
        
        
    }//GEN-LAST:event_btnModifyUserSaveActionPerformed

    private void txtAddItemNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddItemNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddItemNoActionPerformed

    private void txtUpdateItemNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateItemNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateItemNoActionPerformed

    private void txtUpdateQuantityItemNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateQuantityItemNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateQuantityItemNoActionPerformed

    private void btnDeleteUserDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserDeleteActionPerformed
        Database db = new Database();
        int i = db.credential_check("select * from tb_employee where username = '"+txtDeleteUsername.getText()+"' and email ='"+txtDeleteUserEmailID.getText()+"'");
        
        if(txtDeleteUsername.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Username Cannot be blank","Enter Username!",JOptionPane.WARNING_MESSAGE);
        }
        else if(txtDeleteUserEmailID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Username Email be blank","Enter Email!",JOptionPane.WARNING_MESSAGE);
        }
        else if(i!=1)
        {
            JOptionPane.showMessageDialog(this, "Check your credentials again and try","No Such User Found",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            int c = JOptionPane.showConfirmDialog(this, "Are you Sure to delete this user","Warning !",JOptionPane.WARNING_MESSAGE,JOptionPane.YES_NO_OPTION);
            if(c==0)
            {
                User u = new User();
                u.deleteUser(txtDeleteUsername.getText());
                u.recordUserOperation(txtUserName.getText(), "User", "Delete User", "Username : "+txtDeleteUsername.getText());
                txtDeleteUsername.setText(null);
                txtDeleteUserEmailID.setText(null);
                txtDeleteUsername.setText("");
                txtDeleteUserEmailID.setText("");
            }            
        }        
    }//GEN-LAST:event_btnDeleteUserDeleteActionPerformed

    private void btnAddItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemSaveActionPerformed
        // TODO add your handling code here:
        Database db = new Database();
        int q = db.credential_check("select * from tb_employee where username = '"+txtUserName.getText()+"' and usertype in ('Admin','Manager')");
        if(q==1)
        {
            int i1 = db.credential_check("select * from tb_item where ino = "+txtAddItemNo.getText()+"");
            Pattern itemNumberRegex = Pattern.compile("^[0-9]*$");
            Matcher itemNumberMatacher = itemNumberRegex.matcher(txtAddItemNo.getText());
            Pattern decimalRegex = Pattern.compile("^(\\d{1,5}|\\d{0,5}\\.\\d{1,2})$");
            Matcher priceMatacher = decimalRegex.matcher(txtAddItemPrice.getText());
            Matcher itemQuantity = itemNumberRegex.matcher(txtAddItemQuantity.getText());
            Matcher discountMatacher = decimalRegex.matcher(txtAddItemDiscount.getText());
            if(i1==1)
            {
                JOptionPane.showMessageDialog(this, "The Item number already exsist try again","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(txtAddItemNo.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Item Number Cannot be Empty","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else if(itemNumberMatacher.matches()==false)
            {
                JOptionPane.showMessageDialog(this, "Item Number Cannot have letters or Symbols","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(txtAddItemName.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Item Name Cannot be Empty","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else if(txtAddItemPrice.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Item Price Cannot be Empty","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else if(priceMatacher.matches()==false)
            {
                JOptionPane.showMessageDialog(this, "Check Item Price again\nHint : it contain only 2 decimal points","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(Double.parseDouble(txtAddItemPrice.getText())<=0)
            {
                JOptionPane.showMessageDialog(this, "Item Price Cannot be 0 or less than 0","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else if(txtAddItemQuantity.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Item Quantity Cannot be Empty","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else if(itemQuantity.matches()==false)
            {
                JOptionPane.showMessageDialog(this, "Check Item Quantity again","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(txtAddItemDiscount.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Item Discount Margine Cannot be Empty","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else if(discountMatacher.matches()==false)
            {
                JOptionPane.showMessageDialog(this, "Check Item Discount Margine again\nHint : it contain only 2 decimal points","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                Item p = new Item();
                int i = p.addItem(txtAddItemNo.getText(), txtAddItemName.getText(), txtAddItemPrice.getText(), txtAddItemQuantity.getText(), txtAddItemDiscount.getText());
                if(i==1)
                {
                    User u = new User();                        
                    u.recordUserOperation(txtUserName.getText(), "Item", "New Item", "Item ID : "+txtAddItemNo.getText());
                    txtAddItemNo.setText(null);
                    txtAddItemName.setText(null);
                    txtAddItemPrice.setText(null);
                    txtAddItemQuantity.setText(null);
                    txtAddItemDiscount.setText(null);
                }
            }     
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You don't have privileges to access this menu","No Access",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAddItemSaveActionPerformed

    private void btnViewItemAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewItemAllActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tmodel = (DefaultTableModel)tblViewItem.getModel();
        tmodel.setRowCount(0);
        txtViewItemCategory.setText(null);
        cmbViewItemCategory.setSelectedItem(0);
        
        Item p = new Item();
        ResultSet rs = p.viewItem(null, null);
        if(rs != null)
        {
            try {
                while(rs.next())
                {
                    String ino = String.valueOf(rs.getString("ino"));
                    String iname = String.valueOf(rs.getString("iname"));
                    String qty = String.valueOf(rs.getInt("QtyInHand"));
                    String dis = String.valueOf(rs.getDouble("DiscountMargine"));
                    String price = String.valueOf(rs.getDouble("Price"));
                
                    String tbData[] = {ino,iname,price,qty,dis};
                    DefaultTableModel tbmodel = (DefaultTableModel)tblViewItem.getModel();
                
                    tbmodel.addRow(tbData);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Cannot Load Item Data Try Again","Error",JOptionPane.ERROR_MESSAGE);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Item Data Not found","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnViewItemAllActionPerformed

    private void btnViewItemClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewItemClearActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tmodel = (DefaultTableModel)tblViewItem.getModel();
        tmodel.setRowCount(0);
        txtViewItemCategory.setText(null);
        cmbViewItemCategory.setSelectedItem(0);
    }//GEN-LAST:event_btnViewItemClearActionPerformed

    private void btnViewItemSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewItemSearchActionPerformed
        // TODO add your handling code here:
        if(txtViewItemCategory.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter Value to search item","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            DefaultTableModel tmodel = (DefaultTableModel)tblViewItem.getModel();
            tmodel.setRowCount(0);
            String filter="";
            String searchValue = txtViewItemCategory.getText();

            ///////// get combo box selection
            if(cmbViewItemCategory.getSelectedIndex()==0){
                filter="INO";
            }
            if(cmbViewItemCategory.getSelectedIndex()==1){
                filter="IName";
            }
            if(cmbViewItemCategory.getSelectedIndex()==2){
                filter="price";
            }
            if(cmbViewItemCategory.getSelectedIndex()==3){
                filter="qtyInHand";
            }
            if(cmbViewItemCategory.getSelectedIndex()==4){
                filter="DiscountMargine";
            }

            Item p = new Item();
            ResultSet rs = p.viewItem(searchValue,filter);

            if(rs != null)
            {
                try {
                    while(rs.next())
                    {
                        String ino = String.valueOf(rs.getString("ino"));
                        String iname = String.valueOf(rs.getString("iname"));
                        String qty = String.valueOf(rs.getInt("QtyInHand"));
                        String dis = String.valueOf(rs.getDouble("DiscountMargine"));
                        String price = String.valueOf(rs.getDouble("Price"));

                        String tbData[] = {ino,iname,price,qty,dis};
                        DefaultTableModel tbmodel = (DefaultTableModel)tblViewItem.getModel();

                        tbmodel.addRow(tbData);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Cannot Load Item Data Try Again","Error",JOptionPane.ERROR_MESSAGE);
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Item Data Not found","Error",JOptionPane.ERROR_MESSAGE);
            } 
            if(tblViewItem.getRowCount()<=0)
            {
                JOptionPane.showMessageDialog(this, "Cannot Find such Item Data Try Again","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btnViewItemSearchActionPerformed

    private void txtAddItemCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddItemCancelActionPerformed
        // TODO add your handling code here:
        txtAddItemNo.setText(null);
        txtAddItemName.setText(null);
        txtAddItemPrice.setText(null);
        txtAddItemQuantity.setText(null);
        txtAddItemDiscount.setText(null);
    }//GEN-LAST:event_txtAddItemCancelActionPerformed

    private void txtUpdateItemNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateItemNoKeyTyped
        // TODO add your handling code here:
        if((txtUpdateItemNo.getText()).equals(""))
            {
                txtUpdateItemName.setText("");
                txtUpdateItemPrice.setText("");
                txtUpdateItemQuantity.setText("");
                txtUpdateItemDiscount.setText("");
            }
        
        if(txtUpdateItemNo.getText() != null)
        {
            Database db = new Database();
            ResultSet rs = db.selectData("select * from tb_item where INO = '"+txtUpdateItemNo.getText()+"'");
            if(rs != null)
            {
                try {
                    while(rs.next())
                    {
                        String iname = rs.getString("IName");
                        String price = String.valueOf(rs.getDouble("price"));
                        String qty = String.valueOf(rs.getInt("QtyInHand"));
                        String discount = String.valueOf(rs.getDouble("discountMargine"));
                        
                        txtUpdateItemName.setText(iname);
                        txtUpdateItemPrice.setText(price);
                        txtUpdateItemQuantity.setText(qty);
                        txtUpdateItemDiscount.setText(discount);
                    }
                } catch (SQLException ex) {
                    //Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "Cannot Load Item Data","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            
        }
        
    }//GEN-LAST:event_txtUpdateItemNoKeyTyped

    private void btnUpdateItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateItemSaveActionPerformed
        Database db = new Database();
        int q = db.credential_check("select * from tb_employee where username = '"+txtUserName.getText()+"' and usertype in ('Admin','Manager')");
        if(q==1)
        {
            Pattern itemNumberRegex = Pattern.compile("^[0-9]*$");
            Matcher itemNumberMatacher = itemNumberRegex.matcher(txtUpdateItemNo.getText());
            Pattern decimalRegex = Pattern.compile("^(\\d{1,5}|\\d{0,5}\\.\\d{1,2})$");
            Matcher priceMatacher = decimalRegex.matcher(txtUpdateItemPrice.getText());
            Matcher itemQuantity = itemNumberRegex.matcher(txtUpdateItemQuantity.getText());
            Matcher discountMatacher = decimalRegex.matcher(txtUpdateItemDiscount.getText());

            if(txtUpdateItemNo.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Item Number Cannot be Empty","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else if(itemNumberMatacher.matches()==false)
            {
                JOptionPane.showMessageDialog(this, "Item Number Cannot have letters or Symbols","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(txtUpdateItemName.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Item Name Cannot be Empty","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else if(txtUpdateItemPrice.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Item Price Cannot be Empty","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else if(priceMatacher.matches()==false)
            {
                JOptionPane.showMessageDialog(this, "Check Item Price again\nHint : it contain only 2 decimal points","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(txtUpdateItemQuantity.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Item Quantity Cannot be Empty","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else if(itemQuantity.matches()==false)
            {
                JOptionPane.showMessageDialog(this, "Check Item Quantity again","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(txtUpdateItemDiscount.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Item Discount Margine Cannot be Empty","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else if(discountMatacher.matches()==false)
            {
                JOptionPane.showMessageDialog(this, "Check Item Discount Margine again\nHint : it contain only 2 decimal points","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                Item p = new Item();            
                int i = p.updateItem(txtUpdateItemNo.getText(), txtUpdateItemName.getText(), txtUpdateItemPrice.getText(), txtUpdateItemQuantity.getText(), txtUpdateItemDiscount.getText());
                if(i==1)
                {
                    User u = new User();                        
                    u.recordUserOperation(txtUserName.getText(), "Item", "Update Item", "Item ID : "+txtUpdateItemNo.getText());
                    txtUpdateItemNo.setText("");
                    txtUpdateItemName.setText("");
                    txtUpdateItemPrice.setText("");
                    txtUpdateItemQuantity.setText("");
                    txtUpdateItemDiscount.setText("");
                }
            }        
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You don't have privileges to access this menu","No Access",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateItemSaveActionPerformed

    private void txtUpdateItemNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateItemNoKeyReleased
        // TODO add your handling code here:
        if((txtUpdateItemNo.getText()).equals(""))
            {
                txtUpdateItemName.setText("");
                txtUpdateItemPrice.setText("");
                txtUpdateItemQuantity.setText("");
                txtUpdateItemDiscount.setText("");
            }
        
        if(txtUpdateItemNo.getText() != null)
        {
            Database db = new Database();
            ResultSet rs = db.selectData("select * from tb_item where INO = '"+txtUpdateItemNo.getText()+"'");
            if(rs != null)
            {
                try {
                    while(rs.next())
                    {
                        String iname = rs.getString("IName");
                        String price = String.valueOf(rs.getDouble("price"));
                        String qty = String.valueOf(rs.getInt("QtyInHand"));
                        String discount = String.valueOf(rs.getDouble("discountMargine"));
                        
                        txtUpdateItemName.setText(iname);
                        txtUpdateItemPrice.setText(price);
                        txtUpdateItemQuantity.setText(qty);
                        txtUpdateItemDiscount.setText(discount);
                    }
                } catch (SQLException ex) {
                    
                    JOptionPane.showMessageDialog(this, "Cannot Load Item Data","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_txtUpdateItemNoKeyReleased

    private void txtUpdateItemNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateItemNoKeyPressed
        // TODO add your handling code here:
        if((txtUpdateItemNo.getText()).equals(""))
            {
                txtUpdateItemName.setText("");
                txtUpdateItemPrice.setText("");
                txtUpdateItemQuantity.setText("");
                txtUpdateItemDiscount.setText("");
            }
        
        if(txtUpdateItemNo.getText() != null)
        {
            Database db = new Database();
            ResultSet rs = db.selectData("select * from tb_item where INO = '"+txtUpdateItemNo.getText()+"'");
            if(rs != null)
            {
                try {
                    while(rs.next())
                    {
                        String iname = rs.getString("IName");
                        String price = String.valueOf(rs.getDouble("price"));
                        String qty = String.valueOf(rs.getInt("QtyInHand"));
                        String discount = String.valueOf(rs.getDouble("discountMargine"));
                        
                        txtUpdateItemName.setText(iname);
                        txtUpdateItemPrice.setText(price);
                        txtUpdateItemQuantity.setText(qty);
                        txtUpdateItemDiscount.setText(discount);
                    }
                } catch (SQLException ex) {
                    
                    JOptionPane.showMessageDialog(this, "Cannot Load Item Data","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_txtUpdateItemNoKeyPressed

    private void txtUpdateItemCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateItemCancelActionPerformed
        // TODO add your handling code here:
        txtUpdateItemNo.setText("");
        txtUpdateItemName.setText("");
        txtUpdateItemPrice.setText("");
        txtUpdateItemQuantity.setText("");
        txtUpdateItemDiscount.setText("");
    }//GEN-LAST:event_txtUpdateItemCancelActionPerformed

    private void btnUpdateQuantityItemNoSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateQuantityItemNoSearchActionPerformed
        txtUpdateQuantityExist.setText("");
        UpdateQuantityNew.setText("");
        if(txtUpdateQuantityItemNo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter Item Number to load data","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Database dbw = new Database();
            int i = dbw.credential_check("select*from tb_item where INO = "+txtUpdateQuantityItemNo.getText()+"");
            if(i!=1){
                JOptionPane.showMessageDialog(null,"Item number not found! Try again!","Not Found", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                Database db = new Database();
                ResultSet rs = db.selectData("select * from tb_item where INO = '"+txtUpdateQuantityItemNo.getText()+"'");
                if(rs != null)
                {
                    try {
                        while(rs.next())
                        {
                            String qty = String.valueOf(rs.getInt("QtyInHand"));

                            txtUpdateQuantityExist.setText(qty);
                        }
                    } catch (SQLException ex) {

                        JOptionPane.showMessageDialog(this, "Cannot Load Item Data","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnUpdateQuantityItemNoSearchActionPerformed

    private void btnUpdateQuantityCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateQuantityCancelActionPerformed
        // TODO add your handling code here:
        txtUpdateQuantityItemNo.setText("");
        txtUpdateQuantityExist.setText("");
        UpdateQuantityNew.setText("");
        UpdateQuantityAdd.setText("");
    }//GEN-LAST:event_btnUpdateQuantityCancelActionPerformed

    private void btnUpdateQuantitySaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateQuantitySaveActionPerformed
        // TODO add your handling code here:
        Pattern qtyRegex = Pattern.compile("^[0-9]*$");
        Matcher qtyMatacher = qtyRegex.matcher(UpdateQuantityNew.getText());
        Date now = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        if(txtUpdateQuantityItemNo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Item Number Cannot be blank","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if(UpdateQuantityNew.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter new item quantity","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if(qtyMatacher.matches()==false)
        {
            JOptionPane.showMessageDialog(this, "Item Quantity Cannot have letters or symbols","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(Integer.parseInt(txtUpdateQuantityExist.getText())>=Integer.parseInt(UpdateQuantityNew.getText()))
        {
            JOptionPane.showMessageDialog(this, "New Quantity must be greater than exsiting quantity","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Database db = new Database();
            if(db.insertUpdateDelete("INSERT INTO `tb_stockadjustment` VALUES (NULL, '"+txtUpdateQuantityItemNo.getText()+"', '"+df.format(now)+"', 'Warehose Stock Update', '"+txtUpdateQuantityExist.getText()+"', '"+UpdateQuantityNew.getText()+"')")==1)
            {
                Item p = new Item();
                int i2 = p.updateItem(txtUpdateQuantityItemNo.getText(), UpdateQuantityNew.getText());
                if(i2==1)
                {
                    User u = new User();                        
                    u.recordUserOperation(txtUserName.getText(), "Item", "Stock Addition", "Item ID : "+txtUpdateQuantityItemNo.getText());
                    txtUpdateQuantityItemNo.setText("");
                    txtUpdateQuantityExist.setText("");
                    UpdateQuantityNew.setText("");
                    UpdateQuantityAdd.setText("");
                }
            }
        }
    }//GEN-LAST:event_btnUpdateQuantitySaveActionPerformed

    private void btnUpdateSalespersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateSalespersonMouseClicked
        Database db = new Database();
        int p = db.credential_check("select * from tb_employee where username = '"+txtUserName.getText()+"' and usertype in ('Admin','Manager')");
        if(p==1)
        {
            PanelAddSalesperson.setVisible(false);
            PanelUpdateSalesperson.setVisible(true);
            PanelDeleteSalesperson.setVisible(false);
            btnDeleteSalesperson.setBackground(new Color(0,102,102));
            btnUpdateSalesperson.setBackground(Color.GRAY);
            btnAddSalesperson.setBackground(new Color(0,102,102));
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You don't have privileges to access this menu","No Access",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateSalespersonMouseClicked

    private void btnAddSalespersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddSalespersonMouseClicked
        PanelAddSalesperson.setVisible(true);
        PanelUpdateSalesperson.setVisible(false);
        PanelDeleteSalesperson.setVisible(false);
        btnDeleteSalesperson.setBackground(new Color(0,102,102));
        btnUpdateSalesperson.setBackground(new Color(0,102,102));
        btnAddSalesperson.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnAddSalespersonMouseClicked

    private void btnDeleteSalespersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteSalespersonMouseClicked
        Database db = new Database();
        int p = db.credential_check("select * from tb_employee where username = '"+txtUserName.getText()+"' and usertype in ('Admin','Manager')");
        if(p==1)
        {
            PanelAddSalesperson.setVisible(false);
            PanelUpdateSalesperson.setVisible(false);
            PanelDeleteSalesperson.setVisible(true);
            btnDeleteSalesperson.setBackground(Color.GRAY);
            btnUpdateSalesperson.setBackground(new Color(0,102,102));
            btnAddSalesperson.setBackground(new Color(0,102,102));
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You don't have privileges to access this menu","No Access",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnDeleteSalespersonMouseClicked

    private void btnDeleteSalespersonIDSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSalespersonIDSearchActionPerformed
        // TODO add your handling code here:
        txtDeleteSalespersonPhoto.setIcon(null);
        txtDeleteSalespersonName.setText("Name : ");
        txtDeleteSalespersonAddressNo.setText("Address no : ");
        txtDeleteSalespersonAddressLine1.setText("Line1 : ");
        txtDeleteSalespersonAddressLine2.setText("Line2 : ");
        txtDeleteSalespersonCity.setText("City : ");
        txtDeleteSalespersonTelephone.setText("Telephone : ");
        txtDeleteSalespersonEmailID.setText("Email : ");
        txtDeleteSalespersonSalary.setText("Salary : ");
        Database db = new Database();
        int i = db.credential_check("select*from  tb_salesperson where SID = "+txtDeleteSalespersonIDSearch.getText()+"");
        if(!(i==1)){
            JOptionPane.showMessageDialog(null,"ID not found! Try again!","Not Found", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            txtDeleteSalespersonPhoto.setIcon(null);
            txtDeleteSalespersonName.setText("Name : ");
            txtDeleteSalespersonAddressNo.setText("Address no : ");
            txtDeleteSalespersonAddressLine1.setText("Line1 : ");
            txtDeleteSalespersonAddressLine2.setText("Line2 : ");
            txtDeleteSalespersonCity.setText("City : ");
            txtDeleteSalespersonTelephone.setText("Telephone : ");
            txtDeleteSalespersonEmailID.setText("Email : ");
            txtDeleteSalespersonSalary.setText("Salary : ");

            Database db5 = new Database();
            ResultSet rs = db5.selectData("select * from tb_salesperson where sid = '"+txtDeleteSalespersonIDSearch.getText()+"'");
            if(rs != null)
            {
                try {
                    while(rs.next())
                    {
                        String sname = rs.getString("SName");
                        String email = rs.getString("Email");
                        String addressNO = rs.getString("AddressNO");
                        String addressLine1 = rs.getString("Line1");
                        String addressLine2 = rs.getString("line2");
                        String city = rs.getString("city");
                        String tele = String.valueOf(rs.getInt("telephone"));
                        String salary = String.valueOf(rs.getDouble("salary"));
                        byte[] photo = rs.getBytes("Photo");

                        ImageResizer ir = new ImageResizer();
                        txtDeleteSalespersonPhoto.setIcon(ir.ResizeImage(photo, txtDeleteSalespersonPhoto));
                        txtDeleteSalespersonName.setText("Name : "+sname);
                        txtDeleteSalespersonAddressNo.setText("Address no : "+addressNO);
                        txtDeleteSalespersonAddressLine1.setText("Line1 : "+addressLine1);
                        txtDeleteSalespersonAddressLine2.setText("Line2 : "+addressLine2);
                        txtDeleteSalespersonCity.setText("City : "+city);
                        txtDeleteSalespersonTelephone.setText("Telephone : "+tele);
                        txtDeleteSalespersonEmailID.setText("Email : "+email);
                        txtDeleteSalespersonSalary.setText("Salary : "+salary);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Cannot load user data try search again", "Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "User not found try search again", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btnDeleteSalespersonIDSearchActionPerformed

    private void btnResetUserPasswordResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetUserPasswordResetActionPerformed
        // TODO add your handling code here:
        Database db = new Database();
        int i = db.credential_check("select * from tb_employee where username = '"+txtResetPasswordUsername.getText()+"'");
        if(i!=1){
            JOptionPane.showMessageDialog(this, "User not found try search again", "Not Found!",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            User u = new User();
            u.resetPassword(txtResetPasswordUsername.getText());
            u.recordUserOperation(txtUserName.getText(), "User", "Reset User Password", "Username : "+txtResetPasswordUsername.getText());
            txtResetPasswordUsername.setText("");
        }
    }//GEN-LAST:event_btnResetUserPasswordResetActionPerformed

    private void btnAddSalespersonPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSalespersonPhotoActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png","jpeg");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            ImageResizer ir = new ImageResizer();
            txtAddSalespersonPhoto.setIcon(ir.ResizeImage(path,txtAddSalespersonPhoto));
            txtAddSalespersonPhoto.setText(path);
        }
        else if(result == JFileChooser.CANCEL_OPTION)
        {
            txtAddSalespersonPhoto.setIcon(null);
            JOptionPane.showMessageDialog(this, "Image not selected", "Select Image",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddSalespersonPhotoActionPerformed

    private void btnAddSalespersonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSalespersonSaveActionPerformed
        // TODO add your handling code here:
        Database db = new Database();
        int p = db.credential_check("select * from tb_employee where username = '"+txtUserName.getText()+"' and usertype in ('Admin','Manager')");
        if(p==1)
        {
            Pattern nic = Pattern.compile("^([0-9]{9}[x|X|v|V]|[0-9]{12})$");
            Matcher mnic = nic.matcher(txtAddSalespersonID.getText());

            Pattern sname = Pattern.compile("^[a-zA-Z ]+$");
            Matcher msname = sname.matcher(txtAddSalespersonName.getText());

            Pattern saddline1 = Pattern.compile("^[a-zA-Z]+$");
            Matcher msaddline1 = saddline1.matcher(txtAddSalespersonAddressLine1.getText());

            Pattern saddline2 = Pattern.compile("^[a-zA-Z]+$");
            Matcher msaddline2 = saddline2.matcher(txtAddSalespersonAddressLine2.getText());

            Pattern city = Pattern.compile("^[a-zA-Z]+$");
            Matcher mcity = city.matcher(txtAddSalespersonCity.getText());

            Pattern tele = Pattern.compile("^[a-zA-Z]+$");
            Matcher mtele = tele.matcher(txtAddSalespersonTelephone.getText());

            Pattern email = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
            Matcher memail = email.matcher(txtAddSalespersonEmailID.getText());

            Pattern salary = Pattern.compile("^\\d*(\\.\\d{1,4})?$");
            Matcher msalary = salary.matcher(txtAddSalespersonSalary.getText());

            Database dbsno = new Database();
            int i = dbsno.credential_check("select * from tb_salesperson where SID = "+txtAddSalespersonID.getText()+"");

            if(i==1)
            {
                JOptionPane.showMessageDialog(this, "This Salesperson ID already in the database!", "Warning!",JOptionPane.WARNING_MESSAGE);
            }
            else if(txtAddSalespersonID.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Salesperson NIC cannot be blank!", "Warning!",JOptionPane.WARNING_MESSAGE);
            }
            else if(mnic.matches()==false)
            {
                JOptionPane.showMessageDialog(this,"Salesperson NIC is invalid. Please give valid NIC number!","Invalid NIC!", JOptionPane.ERROR_MESSAGE);
            }
            else if(txtAddSalespersonName.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Salesperson name cannot be blank!", "Warning!",JOptionPane.WARNING_MESSAGE);
            }
            else if(msname.matches()==false)
            {
                JOptionPane.showMessageDialog(this, "Its does not like a name. Please give real name!", "Invalid Name!",JOptionPane.ERROR_MESSAGE);
            }
            else if(txtAddSalespersonAddressLine1.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "First address line cannot be blank!", "Warning!",JOptionPane.WARNING_MESSAGE);
            }
            else if(txtAddSalespersonCity.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "City name cannot be blank!", "Warning!",JOptionPane.WARNING_MESSAGE);
            }
            else if(txtAddSalespersonPhoto.getIcon()==null)
            {
                JOptionPane.showMessageDialog(this, "Please select salesperson image!", "Warning!",JOptionPane.WARNING_MESSAGE);
            }
            else if(txtAddSalespersonTelephone.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Telephone number cannot be blank!", "Warning!",JOptionPane.WARNING_MESSAGE);
            }
            else if(mtele.matches()==true)
            {
                JOptionPane.showMessageDialog(this, "Telephone number must have numbers only!", "Invalid Telephone Number!",JOptionPane.ERROR_MESSAGE);
            }
            else if(txtAddSalespersonTelephone.getText().length()!=10)
            {
                JOptionPane.showMessageDialog(this, "This does not like a telephone number. Please give valid telephone number!", "Invalid Telephone Number!",JOptionPane.ERROR_MESSAGE);
            }
            else if(txtAddSalespersonEmailID.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Email cannot be blank!", "Warning!",JOptionPane.WARNING_MESSAGE);
            }
            else if(memail.matches()==false)
            {
                JOptionPane.showMessageDialog(this, "This does not like a email address. Please give valid email!", "Invalid Email!",JOptionPane.ERROR_MESSAGE);
            }
            else if(txtAddSalespersonSalary.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Salary cannot be blank!", "Warning!",JOptionPane.WARNING_MESSAGE);
            }
            else if(msalary.matches()==false)
            {
                 JOptionPane.showMessageDialog(this, "Salary amount must be numbers only. Please give real salary!", "Invalid Salary Amount!",JOptionPane.ERROR_MESSAGE);
            }
            else if(Double.parseDouble(txtAddSalespersonSalary.getText())<=10)
            {
                JOptionPane.showMessageDialog(this, "Salary amount must greater than 0.00. Please give real salary!", "Invalid Salary Amount!",JOptionPane.ERROR_MESSAGE);
            }
            else{
                Salesperson sp = new Salesperson();
                int c = sp.addSalesperson(txtAddSalespersonID.getText(), txtAddSalespersonName.getText(), txtAddSalespersonEmailID.getText(), txtAddSalespersonAddressNo.getText(), txtAddSalespersonAddressLine1.getText(), txtAddSalespersonAddressLine2.getText(), txtAddSalespersonCity.getText(), txtAddSalespersonTelephone.getText(), txtAddSalespersonSalary.getText(), txtAddSalespersonPhoto.getText());
                if(c==1)
                {
                    User u = new User();                        
                    u.recordUserOperation(txtUserName.getText(), "Salesperson", "Add Salesperson", "Salesperson ID : "+txtAddSalespersonID.getText());
                    AddSalespersonClear();
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You don't have privileges to access this menu","No Access",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAddSalespersonSaveActionPerformed

    private void btnViewSalespersonViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSalespersonViewAllActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tmodel = (DefaultTableModel)TblViewSalespersons.getModel();
        tmodel.getDataVector().removeAllElements();
        txtViewSalespersonSearch.setText(null);
        cmbViewSalespersonSearch.setSelectedItem(0);
        
        Salesperson sp = new Salesperson();
        ResultSet rs = sp.viewSalesperson(null,null);
        if(rs != null)
        {
            try {
                while(rs.next())
                {
                    String sid = String.valueOf(rs.getInt("SID"));
                    String sname = rs.getString("SName");
                    String email = rs.getString("Email");
                    String addressNO = rs.getString("AddressNO");
                    String addressLine1 = rs.getString("Line1");
                    String addressLine2 = rs.getString("line2");
                    String city = rs.getString("city");
                    String tele = String.valueOf(rs.getInt("telephone"));
                    String salary = String.valueOf(rs.getDouble("salary"));
                
                    String tbData[] = {sid,sname,addressNO,addressLine1,addressLine2,city,tele,email,salary};

                    
                    DefaultTableModel tbmodel = (DefaultTableModel)TblViewSalespersons.getModel();
                
                    tbmodel.addRow(tbData);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage()+"Cannot Load Salesperson Data Try Again","Error",JOptionPane.ERROR_MESSAGE);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Salesperson Data Not found","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnViewSalespersonViewAllActionPerformed

    private void TblViewSalespersonsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblViewSalespersonsMouseClicked
        try {
            // TODO add your handling code here:
            
            txtViewSalespersonID.setText("ID : ");
            txtViewSalespersonName.setText("Name : ");
            txtViewSalespersonAddressNo.setText("Address : ");
            txtViewSalespersonAddressLine1.setText("");
            txtViewSalespersonAddressLine2.setText("");
            txtViewSalespersonCity.setText("");
            txtViewSalespersonTelephone.setText("Telephone ");
            txtViewSalespersonEmailID.setText("Email ID : ");
            txtViewSalespersonSalary.setText("Salary : ");
            txtViewSalespersonPhoto.setIcon(null);
            
            int row = TblViewSalespersons.getSelectedRow();
            
            String sid = TblViewSalespersons.getValueAt(row, 0).toString();
            String sname = TblViewSalespersons.getValueAt(row, 1).toString();
            String adno = TblViewSalespersons.getValueAt(row, 2).toString();
            String adl1 = TblViewSalespersons.getValueAt(row, 3).toString();
            String adl2 = TblViewSalespersons.getValueAt(row, 4).toString();
            String city = TblViewSalespersons.getValueAt(row, 5).toString();
            String tp = TblViewSalespersons.getValueAt(row, 6).toString();
            String email = TblViewSalespersons.getValueAt(row, 7).toString();
            String sal = TblViewSalespersons.getValueAt(row, 8).toString();
            
            txtViewSalespersonID.setText("ID : "+sid);
            txtViewSalespersonName.setText("Name : "+sname);
            txtViewSalespersonAddressNo.setText("Address : ");
            txtViewSalespersonAddressLine1.setText(""+adno+" "+adl1);
            txtViewSalespersonAddressLine2.setText(""+adl2);
            txtViewSalespersonCity.setText(""+city);
            txtViewSalespersonTelephone.setText("Telephone "+tp);
            txtViewSalespersonEmailID.setText("Email ID : "+email);
            txtViewSalespersonSalary.setText("Salary : "+sal);
            
            Database db = new Database();
            ResultSet rs = db.selectData("select * from tb_salesperson where sid = '"+sid+"'");
            while(rs.next())
            {
                byte[] spImage = rs.getBytes("photo");
                ImageResizer ir = new ImageResizer();
                txtViewSalespersonPhoto.setIcon(ir.ResizeImage(spImage,txtViewSalespersonPhoto));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Unable to load Salesperson Image at this moment","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_TblViewSalespersonsMouseClicked

    private void btnViewSalespersonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSalespersonClearActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tmodel = (DefaultTableModel)TblViewSalespersons.getModel();
        tmodel.setRowCount(0);
        txtViewSalespersonSearch.setText(null);
        cmbViewSalespersonSearch.setSelectedItem(0);
    }//GEN-LAST:event_btnViewSalespersonClearActionPerformed

    private void btnViewSalespersonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSalespersonSearchActionPerformed
        // TODO add your handling code here:
        if(txtViewSalespersonSearch.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please first enter data to sarch!","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else{
            String filter = "";
        if(cmbViewSalespersonSearch.getSelectedIndex()==0)
        {
            filter = "sid";
        }
        if(cmbViewSalespersonSearch.getSelectedIndex()==1)
        {
            filter = "sname";
        }
        if(cmbViewSalespersonSearch.getSelectedIndex()==2)
        {
            filter = "telephone";
        }
        if(cmbViewSalespersonSearch.getSelectedIndex()==3)
        {
            filter = "email";
        }
        if(cmbViewSalespersonSearch.getSelectedIndex()==4)
        {
            filter = "city";
        }
        if(cmbViewSalespersonSearch.getSelectedIndex()==5)
        {
            filter = "salary";
        }
        
        DefaultTableModel tmodel = (DefaultTableModel)TblViewSalespersons.getModel();
        tmodel.getDataVector().removeAllElements();
        
        Salesperson sp = new Salesperson();
        ResultSet rs = sp.viewSalesperson(txtViewSalespersonSearch.getText(),filter);
        if(rs != null)
        {
            try {
                while(rs.next())
                {
                    String sid = String.valueOf(rs.getInt("SID"));
                    String sname = rs.getString("SName");
                    String email = rs.getString("Email");
                    String addressNO = rs.getString("AddressNO");
                    String addressLine1 = rs.getString("Line1");
                    String addressLine2 = rs.getString("line2");
                    String city = rs.getString("city");
                    String tele = String.valueOf(rs.getInt("telephone"));
                    String salary = String.valueOf(rs.getDouble("salary"));
                
                    String tbData[] = {sid,sname,addressNO,addressLine1,addressLine2,city,tele,email,salary};
                    DefaultTableModel tbmodel = (DefaultTableModel)TblViewSalespersons.getModel();
                
                    tbmodel.addRow(tbData);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Cannot Load Salesperson Data Try Again","Error",JOptionPane.ERROR_MESSAGE);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Salesperson Data Not found","Error",JOptionPane.ERROR_MESSAGE);
        }
        }
        
        
        
    }//GEN-LAST:event_btnViewSalespersonSearchActionPerformed

    private void btnDeleteSalespersonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSalespersonClearActionPerformed
        // TODO add your handling code here:
        txtDeleteSalespersonPhoto.setIcon(null);
        txtDeleteSalespersonName.setText("Name : ");
        txtDeleteSalespersonAddressNo.setText("Address no : ");
        txtDeleteSalespersonAddressLine1.setText("Line1 : ");
        txtDeleteSalespersonAddressLine2.setText("Line2 : ");
        txtDeleteSalespersonCity.setText("City : ");
        txtDeleteSalespersonTelephone.setText("Telephone : ");
        txtDeleteSalespersonEmailID.setText("Email : ");
        txtDeleteSalespersonSalary.setText("Salary : ");
        txtDeleteSalespersonIDSearch.setText("");
    }//GEN-LAST:event_btnDeleteSalespersonClearActionPerformed

    private void btnDeleteSalespersonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSalespersonSaveActionPerformed
        // TODO add your handling code here;
        Database db = new Database();
        if(txtDeleteSalespersonIDSearch.getText()==null)
        {
            JOptionPane.showMessageDialog(this, "Enter Salesperson ID to delete Salesperson","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if(db.credential_check("select * from tb_dealerorder where SID = "+txtDeleteSalespersonIDSearch.getText()+"")==1)
        {
            JOptionPane.showMessageDialog(this, "This salesperson cannot be deleted\n\t*This Salesperson have made dealer orders","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if(db.credential_check("select * from tb_salesperson where SID = "+txtDeleteSalespersonIDSearch.getText()+"")!=1)
        {
            JOptionPane.showMessageDialog(this, "This salesperson ID not valied","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Salesperson sp = new Salesperson();
            int i = sp.deleteSalesperson(txtDeleteSalespersonIDSearch.getText());
            if(i==1)
            {
                User u = new User();                        
                u.recordUserOperation(txtUserName.getText(), "Salesperson", "Delete Salesperson", "Salesperson ID : "+txtDeleteSalespersonIDSearch.getText());
                txtDeleteSalespersonPhoto.setIcon(null);
                txtDeleteSalespersonName.setText("Name : ");
                txtDeleteSalespersonAddressNo.setText("Address no : ");
                txtDeleteSalespersonAddressLine1.setText("Line1 : ");
                txtDeleteSalespersonAddressLine2.setText("Line2 : ");
                txtDeleteSalespersonCity.setText("City : ");
                txtDeleteSalespersonTelephone.setText("Telephone : ");
                txtDeleteSalespersonEmailID.setText("Email : ");
                txtDeleteSalespersonSalary.setText("Salary : ");
                txtDeleteSalespersonIDSearch.setText("");
            }
        }
        
    }//GEN-LAST:event_btnDeleteSalespersonSaveActionPerformed

    private void btnUpdateSalespersonIDSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSalespersonIDSearchActionPerformed
        // TODO add your handling code here:s
        txtUpdateSalespersonName.setText(null);
        txtUpdateSalespersonAddressNo.setText(null);
        txtUpdateSalespersonAddressLine1.setText(null);
        txtUpdateSalespersonAddressLine2.setText(null);
        txtUpdateSalespersonCity.setText(null);
        txtUpdateSalespersonTelephone.setText(null);
        txtUpdateSalespersonEmailID.setText(null);
        txtUpdateSalespersonSalary.setText(null);
        txtUpdateSalespersonPhoto.setIcon(null);
        txtUpdateSalespersonPhoto.setText(null);
        Database db1 = new Database();
        int i = db1.credential_check("select*from tb_salesperson where SID = "+txtUpdateSalespersonID.getText()+"");
        if(i!=1){
            JOptionPane.showMessageDialog(this,"ID not found! Try again!","Not Found", JOptionPane.WARNING_MESSAGE);
        }else{
            Database db = new Database();
        ResultSet rs = db.selectData("select * from tb_salesperson where sid ='"+txtUpdateSalespersonID.getText()+"'");
        if(rs != null)
        {
            try {
                while(rs.next())
                {
                    String sname = rs.getString("sName");
                    String adNO = rs.getString("addressno");
                    String adl1 = rs.getString("line1");
                    String adl2 = rs.getString("line2");
                    String city = rs.getString("city");
                    String tp = String.valueOf(rs.getInt("telephone"));
                    String email = rs.getString("email");
                    String salary = String.valueOf(rs.getDouble("salary"));
                    byte[] photo = rs.getBytes("photo");
                    
                    txtUpdateSalespersonName.setText(sname);
                    txtUpdateSalespersonAddressNo.setText(adNO);
                    txtUpdateSalespersonAddressLine1.setText(adl1);
                    txtUpdateSalespersonAddressLine2.setText(adl2);
                    txtUpdateSalespersonCity.setText(city);
                    txtUpdateSalespersonTelephone.setText("0"+tp);
                    txtUpdateSalespersonEmailID.setText(email);
                    txtUpdateSalespersonSalary.setText(salary);
                    ImageResizer ir = new ImageResizer();
                    txtUpdateSalespersonPhoto.setIcon(ir.ResizeImage(photo, txtUpdateSalespersonPhoto));
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Salesperson Data Not found","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Salesperson Data Not found","Error",JOptionPane.ERROR_MESSAGE);
        }
        }
        
        
    }//GEN-LAST:event_btnUpdateSalespersonIDSearchActionPerformed

    private void btnUpdateSalespersonPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSalespersonPhotoActionPerformed
        // TODO add your handling code here:
        if(txtUpdateSalespersonPhoto.getText()==null){
            JOptionPane.showMessageDialog(this, "Please select salesperson's image!","Image not selected!",JOptionPane.ERROR_MESSAGE);
        }
        
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png","jpeg");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            ImageResizer ir = new ImageResizer();
            txtUpdateSalespersonPhoto.setIcon(ir.ResizeImage(path,txtUpdateSalespersonPhoto));
            txtUpdateSalespersonPhoto.setText(path);
        }
        else if(result == JFileChooser.CANCEL_OPTION)
        {
            JOptionPane.showMessageDialog(this, "Image not selected", "Select Image",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateSalespersonPhotoActionPerformed

    private void btnUpdateSalespersonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSalespersonClearActionPerformed
        // TODO add your handling code here:
        txtUpdateSalespersonID.setText(null);
        txtUpdateSalespersonName.setText(null);
        txtUpdateSalespersonAddressNo.setText(null);
        txtUpdateSalespersonAddressLine1.setText(null);
        txtUpdateSalespersonAddressLine2.setText(null);
        txtUpdateSalespersonCity.setText(null);
        txtUpdateSalespersonTelephone.setText(null);
        txtUpdateSalespersonEmailID.setText(null);
        txtUpdateSalespersonSalary.setText(null);
        txtUpdateSalespersonPhoto.setIcon(null);
        txtUpdateSalespersonPhoto.setText(null);
    }//GEN-LAST:event_btnUpdateSalespersonClearActionPerformed

    private void btnUpdateSalespersonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSalespersonSaveActionPerformed
        // TODO add your handling code here:
        
        Pattern sno = Pattern.compile("^[0-9]*$");
        Matcher msno = sno.matcher(txtUpdateSalespersonID.getText());
        
        Pattern sname = Pattern.compile("^[a-zA-Z ]*$");
        Matcher msname = sname.matcher(txtUpdateSalespersonName.getText());
        
        Pattern saddline1 = Pattern.compile("^[a-zA-Z]+$");
        Matcher msaddline1 = saddline1.matcher(txtUpdateSalespersonAddressLine1.getText());
        
        Pattern saddline2 = Pattern.compile("^[a-zA-Z]+$");
        Matcher msaddline2 = saddline2.matcher(txtUpdateSalespersonAddressLine2.getText());
        
        Pattern city = Pattern.compile("^[a-zA-Z]+$");
        Matcher mcity = city.matcher(txtUpdateSalespersonCity.getText());
        
        Pattern tele = Pattern.compile("^[a-zA-Z]+$");
        Matcher mtele = tele.matcher(txtUpdateSalespersonTelephone.getText());
        
        Pattern email = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
        Matcher memail = email.matcher(txtUpdateSalespersonEmailID.getText());
        
        Pattern salary = Pattern.compile("^\\d*(\\.\\d{1,4})?$");
        Matcher msalary = salary.matcher(txtUpdateSalespersonSalary.getText());
        
        if(msno.matches()==false)
        {
            JOptionPane.showMessageDialog(this, "Salesperson ID must be a number!", "Invalid ID!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtUpdateSalespersonID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Salesperson ID cannot be blank!", "Waring!",JOptionPane.WARNING_MESSAGE);
        }
        else if(txtUpdateSalespersonName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Salesperson name cannot be blank!", "Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(msname.matches()==false)
        {
            JOptionPane.showMessageDialog(this, "Its does not like a name. Please give real name!", "Invalid Name!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtUpdateSalespersonAddressLine1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "First address line cannot be blank!", "Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(msaddline1.matches()==false)
        {
            JOptionPane.showMessageDialog(this, "First address line is invalid! Please give valid address line!", "Invalid Address Line!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtUpdateSalespersonAddressLine2.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Second address line cannot be blank!", "Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(msaddline2.matches()==false)
        {
            JOptionPane.showMessageDialog(this, "Second address line is invalid! Please give valid address line!", "Invalid Address Line!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtUpdateSalespersonCity.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "City name cannot be blank!", "Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(txtUpdateSalespersonPhoto.getIcon()==null)
        {
            JOptionPane.showMessageDialog(this, "Please select salesperson image!", "Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(mcity.matches()==false)
        {
            JOptionPane.showMessageDialog(this, "City is invalid! Please give real city name!", "Invalid City Name!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtUpdateSalespersonTelephone.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Telephone number cannot be blank!", "Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(mtele.matches()==true)
        {
            JOptionPane.showMessageDialog(this, "Telephone number must have numbers only!", "Invalid Telephone Number!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtUpdateSalespersonTelephone.getText().length()!=10)
        {
            JOptionPane.showMessageDialog(this, "This does not like a telephone number. Please give valid telephone number!", "Invalid Telephone Number!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtUpdateSalespersonEmailID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Email cannot be blank!", "Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(memail.matches()==false)
        {
            JOptionPane.showMessageDialog(this, "This does not like a email address. Please give valid email!", "Invalid Email!",JOptionPane.ERROR_MESSAGE);
        }
        else if(txtUpdateSalespersonSalary.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Salary cannot be blank!", "Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else if(msalary.matches()==false)
        {
             JOptionPane.showMessageDialog(this, "Salary amount must be numbers only. Please give real salary!", "Invalid Salary Amount!",JOptionPane.ERROR_MESSAGE);
        }
        else if(Double.parseDouble(txtUpdateSalespersonSalary.getText())<=10)
        {
            JOptionPane.showMessageDialog(this, "Salary amount must greater than 0.00. Please give real salary!", "Invalid Salary Amount!",JOptionPane.ERROR_MESSAGE);
        }else{
            Salesperson sp = new Salesperson();
            int i = sp.updateSalesperson(txtUpdateSalespersonID.getText(), txtUpdateSalespersonName.getText(), txtUpdateSalespersonEmailID.getText(), txtUpdateSalespersonAddressNo.getText(), txtUpdateSalespersonAddressLine1.getText(), txtUpdateSalespersonAddressLine2.getText(), txtUpdateSalespersonCity.getText(), txtUpdateSalespersonTelephone.getText(), txtUpdateSalespersonSalary.getText(), txtUpdateSalespersonPhoto.getText());
            if(i==1)
            {
                User u = new User();                        
                u.recordUserOperation(txtUserName.getText(), "Salesperson", "Update Salesperson", "Salesperson ID : "+txtUpdateSalespersonID.getText());
                txtUpdateSalespersonID.setText(null);
                txtUpdateSalespersonName.setText(null);
                txtUpdateSalespersonAddressNo.setText(null);
                txtUpdateSalespersonAddressLine1.setText(null);
                txtUpdateSalespersonAddressLine2.setText(null);
                txtUpdateSalespersonCity.setText(null);
                txtUpdateSalespersonTelephone.setText(null);
                txtUpdateSalespersonEmailID.setText(null);
                txtUpdateSalespersonSalary.setText(null);
                txtUpdateSalespersonPhoto.setIcon(null);
                txtUpdateSalespersonPhoto.setText(null);
            }
        }
        
        
    }//GEN-LAST:event_btnUpdateSalespersonSaveActionPerformed

    private void lblBtnAddUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnAddUserMouseClicked
        Database db = new Database();
        int i = db.credential_check("select * from tb_employee where username = '"+txtUserName.getText()+"' and usertype = 'Admin'");
        if(i==1)
        {
            lblBtnAddUser.setBackground(Color.GRAY);
            lblBtnViewUser.setBackground(new Color (0,102,102));
            lblBtnDeleteUser.setBackground(new Color (0,102,102));
            lblBtnModifyUser.setBackground(new Color (0,102,102));
            lblBtnResetPasswordUser.setBackground(new Color (0,102,102));
            lblBtnUserOperationUser.setBackground(new Color (0,102,102));


            PanelAddUser.setVisible(true);
            PanelViewUser.setVisible(false);    
            panelDeleteUser.setVisible(false);
            PanelModifyUser.setVisible(false);
            PanelResetPassword.setVisible(false);
            PanelUserOperation.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You don't have privileges to access this menu","No Access",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_lblBtnAddUserMouseClicked

    private void lblBtnViewUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnViewUserMouseClicked
        Database db = new Database();
        int i = db.credential_check("select * from tb_employee where username = '"+txtUserName.getText()+"' and usertype in ('Admin','Manager')");
        if(i==1)
        {
            lblBtnAddUser.setBackground(new Color (0,102,102));
            lblBtnViewUser.setBackground(Color.GRAY);
            lblBtnDeleteUser.setBackground(new Color (0,102,102));
            lblBtnModifyUser.setBackground(new Color (0,102,102));
            lblBtnResetPasswordUser.setBackground(new Color (0,102,102));
            lblBtnUserOperationUser.setBackground(new Color (0,102,102));


            PanelAddUser.setVisible(false);
            PanelViewUser.setVisible(true);    
            panelDeleteUser.setVisible(false);
            PanelModifyUser.setVisible(false);
            PanelResetPassword.setVisible(false);
            PanelUserOperation.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You don't have privileges to access this menu","No Access",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_lblBtnViewUserMouseClicked

    private void lblBtnDeleteUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnDeleteUserMouseClicked
        Database db = new Database();
        int i = db.credential_check("select * from tb_employee where username = '"+txtUserName.getText()+"' and usertype in ('Admin','Manager')");
        if(i==1)
        {
            lblBtnAddUser.setBackground(new Color (0,102,102));
            lblBtnViewUser.setBackground(new Color (0,102,102));
            lblBtnDeleteUser.setBackground(Color.GRAY);
            lblBtnModifyUser.setBackground(new Color (0,102,102));
            lblBtnResetPasswordUser.setBackground(new Color (0,102,102));
            lblBtnUserOperationUser.setBackground(new Color (0,102,102));


            PanelAddUser.setVisible(false);
            PanelViewUser.setVisible(false);    
            panelDeleteUser.setVisible(true);
            PanelModifyUser.setVisible(false);
            PanelResetPassword.setVisible(false);
            PanelUserOperation.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You don't have privileges to access this menu","No Access",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_lblBtnDeleteUserMouseClicked

    private void lblBtnModifyUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnModifyUserMouseClicked
        lblBtnAddUser.setBackground(new Color (0,102,102));
        lblBtnViewUser.setBackground(new Color (0,102,102));
        lblBtnDeleteUser.setBackground(new Color (0,102,102));
        lblBtnModifyUser.setBackground(Color.GRAY);
        lblBtnResetPasswordUser.setBackground(new Color (0,102,102));
        lblBtnUserOperationUser.setBackground(new Color (0,102,102));
        
        
        PanelAddUser.setVisible(false);
        PanelViewUser.setVisible(false);    
        panelDeleteUser.setVisible(false);
        PanelModifyUser.setVisible(true);
        PanelResetPassword.setVisible(false);
        PanelUserOperation.setVisible(false);
    }//GEN-LAST:event_lblBtnModifyUserMouseClicked

    private void lblBtnResetPasswordUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnResetPasswordUserMouseClicked
        Database db = new Database();
        int i = db.credential_check("select * from tb_employee where username = '"+txtUserName.getText()+"' and usertype in ('Admin','Manager')");
        if(i==1)
        {
            lblBtnAddUser.setBackground(new Color (0,102,102));
            lblBtnViewUser.setBackground(new Color (0,102,102));
            lblBtnDeleteUser.setBackground(new Color (0,102,102));
            lblBtnModifyUser.setBackground(new Color (0,102,102));
            lblBtnResetPasswordUser.setBackground(Color.GRAY);
            lblBtnUserOperationUser.setBackground(new Color (0,102,102));  


            PanelAddUser.setVisible(false);
            PanelViewUser.setVisible(false);    
            panelDeleteUser.setVisible(false);
            PanelModifyUser.setVisible(false);
            PanelResetPassword.setVisible(true);
            PanelUserOperation.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You don't have privileges to access this menu","No Access",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_lblBtnResetPasswordUserMouseClicked

    private void lblBtnUserOperationUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnUserOperationUserMouseClicked
        Database db = new Database();
        int i = db.credential_check("select * from tb_employee where username = '"+txtUserName.getText()+"' and usertype = 'Admin'");
        if(i==1)
        {
            UserReport u = new UserReport();
            u.setUsername(txtUserName.getText());
            u.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You don't have privileges to access this menu","No Access",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_lblBtnUserOperationUserMouseClicked

    private void lblBtnAddDealerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnAddDealerMouseClicked
        lblBtnAddDealer.setBackground(Color.GRAY);
        lblBtnViewDealer.setBackground(new Color (0,102,102));
        lblBtnModifyDealer.setBackground(new Color (0,102,102));
        
        PanelAddDealer.setVisible(true);
        PanelViewDealer.setVisible(false);    
        PanelDeleteDealer.setVisible(false);
        PanelModifyDealer.setVisible(false);
        
    }//GEN-LAST:event_lblBtnAddDealerMouseClicked

    private void lblBtnViewDealerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnViewDealerMouseClicked
        lblBtnAddDealer.setBackground(new Color (0,102,102));
        lblBtnViewDealer.setBackground(Color.GRAY);
        lblBtnModifyDealer.setBackground(new Color (0,102,102));
              
        PanelAddDealer.setVisible(false);
        PanelViewDealer.setVisible(true);    
        PanelDeleteDealer.setVisible(false);
        PanelModifyDealer.setVisible(false);
        
    }//GEN-LAST:event_lblBtnViewDealerMouseClicked

    private void lblBtnModifyDealerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnModifyDealerMouseClicked
        lblBtnAddDealer.setBackground(new Color (0,102,102));
        lblBtnViewDealer.setBackground(new Color (0,102,102));
        lblBtnModifyDealer.setBackground(Color.GRAY);
        
        PanelAddDealer.setVisible(false);
        PanelViewDealer.setVisible(false);    
        PanelDeleteDealer.setVisible(false);
        PanelModifyDealer.setVisible(true);
        
    }//GEN-LAST:event_lblBtnModifyDealerMouseClicked

    private void btnAddDealerSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDealerSaveActionPerformed
        // TODO add your handling code here:
        Pattern no = Pattern.compile("^[a-zA-Z ]*$");
        Matcher mno = no.matcher(txtAddDealerID.getText());
        
        Pattern name = Pattern.compile("^[a-zA-Z ]*$");
        Matcher mname = name.matcher(txtAddDealerName.getText());
        
        Pattern telephone = Pattern.compile("^[a-zA-Z]+$");
        Matcher mtelephone = telephone.matcher(txtAddDealerTelephone.getText());
        
        Pattern email = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
        Matcher memail = email.matcher(txtAddDealerEmailID.getText());
        
        Database db = new Database();
        
        if(db.credential_check("select * from tb_dealer where DID = "+txtAddDealerID.getText()+"")==1)
        {
            JOptionPane.showMessageDialog(null,"This ID alredy in use!","Already Inserted!!", JOptionPane.WARNING_MESSAGE);
        }
        else if(txtAddDealerID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Dealer ID cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(mno.matches()==true){
            JOptionPane.showMessageDialog(this,"Delaer ID is invalid. Please give valid ID number!","Invalid ID!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtAddDealerName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Dealer name cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(mname.matches()==false){
            JOptionPane.showMessageDialog(this,"Its does not like a name!","Invalid Name!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtAddDealerAddressNo.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Address number cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(txtAddDealerAddressLine1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"First address line cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(txtAddDealerCity.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"City cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(txtAddDealerTelephone.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Telephone number cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(mtelephone.matches()){
            JOptionPane.showMessageDialog(this,"Telephone number must have numbers only!","Invalid Telephone Number!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtAddDealerTelephone.getText().length()!=10){
            JOptionPane.showMessageDialog(this,"Its does not like a telephone number!","Invalid Telephone Number!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtAddDealerEmailID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Email cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(memail.matches()==false){
            JOptionPane.showMessageDialog(this,"Its does not like a email address!","Invalid Email!", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Dealer d = new Dealer();
            int i2 = d.addDealer(txtAddDealerName.getText(),txtAddDealerEmailID.getText(),txtAddDealerAddressNo.getText(),txtAddDealerAddressLine1.getText(),txtAddDealerAddressLine2.getText(),txtAddDealerCity.getText(),txtAddDealerTelephone.getText());
            if(i2==1)
            {
                User u = new User();                        
                u.recordUserOperation(txtUserName.getText(), "Dealer", "Add Dealer", "Dealer ID : "+txtAddDealerID.getText());
                txtAddDealerID.setText(null);
                txtAddDealerID.setText(d.loadDealerID());
                txtAddDealerName.setText(null);
                txtAddDealerEmailID.setText(null);
                txtAddDealerAddressNo.setText(null);
                txtAddDealerAddressLine1.setText(null);
                txtAddDealerAddressLine2.setText(null);
                txtAddDealerCity.setText(null);
                txtAddDealerTelephone.setText(null);
            }
        }       
    }//GEN-LAST:event_btnAddDealerSaveActionPerformed

    private void btnAddDealerClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDealerClearActionPerformed
        // TODO add your handling code here:
        Dealer d = new Dealer();
        txtAddDealerID.setText(null);
        txtAddDealerID.setText(d.loadDealerID());
        txtAddDealerName.setText(null);
        txtAddDealerEmailID.setText(null);
        txtAddDealerAddressNo.setText(null);
        txtAddDealerAddressLine1.setText(null);
        txtAddDealerAddressLine2.setText(null);
        txtAddDealerCity.setText(null);
        txtAddDealerTelephone.setText(null);
    }//GEN-LAST:event_btnAddDealerClearActionPerformed

    private void btnModifyDealerSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyDealerSaveActionPerformed
        // TODO add your handling code here:
        Pattern no = Pattern.compile("^[a-zA-Z ]*$");
        Matcher mno = no.matcher(txtModifyDealerID.getText());
        
        Pattern name = Pattern.compile("^[a-zA-Z ]*$");
        Matcher mname = name.matcher(txtModifyDealerName.getText());
        
        Pattern line01 = Pattern.compile("^[a-zA-Z ]*$");
        Matcher mline01 = line01.matcher(txtModifyDealerAddressLine2.getText());
        
        Pattern line02 = Pattern.compile("^[a-zA-Z ]*$");
        Matcher mline02 = line02.matcher(txtModifyDealerAddressLine1.getText());
        
        Pattern city = Pattern.compile("^[a-zA-Z]+$");
        Matcher mcity = city.matcher(txtModifyDealerCity.getText());
        
        Pattern telephone = Pattern.compile("^[a-zA-Z]+$");
        Matcher mtelephone = telephone.matcher(txtModifyDealerTelephone.getText());
        
        Pattern email = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
        Matcher memail = email.matcher(txtModifyDealerEmailID.getText());
        
        if(txtModifyDealerID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Dealer ID cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(mno.matches()==true){
            JOptionPane.showMessageDialog(this,"Delaer ID is invalid. Please give valid ID number!","Invalid ID!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtModifyDealerName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Customer name cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(mname.matches()==false){
            JOptionPane.showMessageDialog(this,"Its does not like a name!","Invalid Name!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtModifyDealerAddressNo.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Address number cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(txtModifyDealerAddressLine1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"First address line cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(mline01.matches()==false){
            JOptionPane.showMessageDialog(this,"First address line is invalid!","Invalid Address Line!", JOptionPane.ERROR_MESSAGE);
        }
        else if(mline02.matches()==false){
            JOptionPane.showMessageDialog(this,"Second address line is invalid!","Invalid Address Line!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtModifyDealerCity.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"City cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(mcity.matches()==false){
            JOptionPane.showMessageDialog(this,"Its does not like a city. Please give real city name!","Invalid City Name!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtModifyDealerTelephone.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Telephone number cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(mtelephone.matches()){
            JOptionPane.showMessageDialog(this,"Telephone number must have numbers only!","Invalid Telephone Number!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtModifyDealerTelephone.getText().length()!=10){
            JOptionPane.showMessageDialog(this,"Its does not like a telephone number!","Invalid Telephone Number!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtModifyDealerEmailID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Email cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(memail.matches()==false){
            JOptionPane.showMessageDialog(this,"Its does not like a email address!","Invalid Email!", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Dealer d = new Dealer();
            int i = d.updateDealer(txtModifyDealerID.getText(), txtModifyDealerName.getText(), txtModifyDealerEmailID.getText(), txtModifyDealerAddressNo.getText(), txtModifyDealerAddressLine1.getText(), txtModifyDealerAddressLine2.getText(), txtModifyDealerCity.getText(), txtModifyDealerTelephone.getText());
            if(i==1)
            {
                User u = new User();                        
                u.recordUserOperation(txtUserName.getText(), "Dealer", "Update Dealer", "Dealer ID : "+txtModifyDealerID.getText());
                txtModifyDealerID.setText("");
                txtModifyDealerName.setText("");
                txtModifyDealerAddressNo.setText("");
                txtModifyDealerAddressLine1.setText("");
                txtModifyDealerAddressLine2.setText("");
                txtModifyDealerCity.setText("");
                txtModifyDealerTelephone.setText("");
                txtModifyDealerEmailID.setText("");
            }
        }              
    }//GEN-LAST:event_btnModifyDealerSaveActionPerformed

    private void btnModifyDealerClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyDealerClearActionPerformed
        // TODO add your handling code here:
        txtModifyDealerID.setText("");
        txtModifyDealerName.setText("");
        txtModifyDealerAddressNo.setText("");
        txtModifyDealerAddressLine1.setText("");
        txtModifyDealerAddressLine2.setText("");
        txtModifyDealerCity.setText("");
        txtModifyDealerTelephone.setText("");
        txtModifyDealerEmailID.setText("");
    }//GEN-LAST:event_btnModifyDealerClearActionPerformed

    private void btnModifyDealerIDSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyDealerIDSearchActionPerformed
        // TODO add your handling code here:
        Database dbe = new Database();
        int i = dbe.credential_check("select * from tb_dealer where DID = "+txtModifyDealerID.getText()+"");
        if(!(i==1)){
            JOptionPane.showMessageDialog(null,"Entered data not found! Try again!","Not Found!", JOptionPane.WARNING_MESSAGE);
        }else{
            Database db = new Database();
            ResultSet rs = db.selectData("select * from tb_dealer where DID = '"+txtModifyDealerID.getText()+"'");
            if(rs!=null)
            {
                try {
                    while(rs.next())
                    {
                        String dName = rs.getString("DName");
                        String email = rs.getString("Email");
                        String adNO = rs.getString("AddressNo");
                        String l1 = rs.getString("AddressLine01");
                        String l2 = rs.getString("AddressLine02");
                        String city = rs.getString("City");
                        String tp = String.valueOf(rs.getInt("telephone"));

                        txtModifyDealerName.setText(dName);
                        txtModifyDealerAddressNo.setText(adNO);
                        txtModifyDealerAddressLine1.setText(l1);
                        txtModifyDealerAddressLine2.setText(l2);
                        txtModifyDealerCity.setText(city);
                        txtModifyDealerTelephone.setText("0"+tp);
                        txtModifyDealerEmailID.setText(email);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Cannot load Dealer Data try to search again","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No Such Dealer Found try to search again","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
    }//GEN-LAST:event_btnModifyDealerIDSearchActionPerformed

    private void btnViewDealerSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDealerSearchActionPerformed
        // TODO add your handling code here:       
        if(txtViewDealerSearch.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please first enter some data to search dealer's data!","Empty!",JOptionPane.WARNING_MESSAGE);
        }else{
            String filter = "";
        if(cmbViewDealerSearch.getSelectedIndex()==0)
        {
            filter = "DName";
        }
        if(cmbViewDealerSearch.getSelectedIndex()==1)
        {
            filter = "DID";
        }
        if(cmbViewDealerSearch.getSelectedIndex()==2)
        {
            filter = "City";
        }
        if(cmbViewDealerSearch.getSelectedIndex()==3)
        {
            filter = "Telephone";
        }
        if(cmbViewDealerSearch.getSelectedIndex()==4)
        {
            filter = "Email";
        }
        if(cmbViewDealerSearch.getSelectedIndex()==5)
        {
            filter = "TotalSale";
        }
        
        DefaultTableModel tmodel = (DefaultTableModel)TblViewDealer.getModel();
        tmodel.getDataVector().removeAllElements();
        Dealer d = new Dealer();
        ResultSet rs = d.viewDealer(txtViewDealerSearch.getText(), filter);
        try {
            while(rs.next())
            {
                String dID = String.valueOf(rs.getInt("DID"));
                String dName = rs.getString("DName");
                String email = rs.getString("Email");
                String adNO = rs.getString("AddressNo");
                String l1 = rs.getString("AddressLine01");
                String l2 = rs.getString("AddressLine02");
                String city = rs.getString("City");
                String tp = String.valueOf(rs.getInt("telephone"));
                String totSale = String.valueOf(rs.getDouble("TotalSale"));
                
                String tbData[] = {dID,dName,adNO,l1,l2,city,tp,email,totSale};
                
                DefaultTableModel tbmodel = (DefaultTableModel)TblViewDealer.getModel();
                
                tbmodel.addRow(tbData);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()+" Dealer Data didn't load correclty Try again to load","Error",JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_btnViewDealerSearchActionPerformed

    private void btnViewDealerClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDealerClearActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tmodel = (DefaultTableModel)TblViewDealer.getModel();
        tmodel.setRowCount(0);
        
        txtViewDealerID.setText("ID :\t");
        txtViewDealerName.setText("Name :\t");
        txtViewDealerAddressNo.setText("Address,");
        txtViewDealerAddressLine1.setText("\t");
        txtViewDealerAddressLine2.setText("\t");
        txtViewDealerCity.setText("\t");
        txtViewDealerTelephone.setText("Telephone :\t");
        txtViewDealerEmailID.setText("Email :\t");
        txtViewDealerSearch.setText(null);
    }//GEN-LAST:event_btnViewDealerClearActionPerformed

    private void btnViewDealerAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDealerAllActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tmodel = (DefaultTableModel)TblViewDealer.getModel();
        tmodel.setRowCount(0);
        
        Dealer d = new Dealer();
        ResultSet rs = d.viewDealer(null, null);
        try {
            while(rs.next())
            {
                String dID = String.valueOf(rs.getInt("DID"));
                String dName = rs.getString("DName");
                String email = rs.getString("Email");
                String adNO = rs.getString("AddressNo");
                String l1 = rs.getString("AddressLine01");
                String l2 = rs.getString("AddressLine02");
                String city = rs.getString("City");
                String tp = String.valueOf(rs.getInt("telephone"));
                String totSale = String.valueOf(rs.getDouble("TotalSale"));
                
                String tbData[] = {dID,dName,adNO,l1,l2,city,tp,email,totSale};
                
                DefaultTableModel tbmodel = (DefaultTableModel)TblViewDealer.getModel();
                
                tbmodel.addRow(tbData);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()+" Dealer Data didn't load correclty Try again to load","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnViewDealerAllActionPerformed

    private void TblViewDealerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblViewDealerMouseClicked
        // TODO add your handling code here:
        txtViewDealerID.setText("ID :\t");
        txtViewDealerName.setText("Name :\t");
        txtViewDealerAddressNo.setText("Address,");
        txtViewDealerAddressLine1.setText("\t");
        txtViewDealerAddressLine2.setText("\t");
        txtViewDealerCity.setText("\t");
        txtViewDealerTelephone.setText("Telephone :\t");
        txtViewDealerEmailID.setText("Email :\t");
        
        int row = TblViewDealer.getSelectedRow();
            
        String id = TblViewDealer.getValueAt(row, 0).toString();
        String name = TblViewDealer.getValueAt(row, 1).toString();
        String adno = TblViewDealer.getValueAt(row, 2).toString();
        String adl1 = TblViewDealer.getValueAt(row, 3).toString();
        String adl2 = TblViewDealer.getValueAt(row, 4).toString();
        String city = TblViewDealer.getValueAt(row, 5).toString();
        String tp = TblViewDealer.getValueAt(row, 6).toString();
        String email = TblViewDealer.getValueAt(row, 7).toString();
        
        txtViewDealerID.setText("ID :\t"+id);
        txtViewDealerName.setText("Name :\t"+name);
        txtViewDealerAddressNo.setText("Address,");
        txtViewDealerAddressLine1.setText("\t"+adno+" "+adl1);
        txtViewDealerAddressLine2.setText("\t"+adl2);
        txtViewDealerCity.setText("\t"+city);
        txtViewDealerTelephone.setText("Telephone :\t"+tp);
        txtViewDealerEmailID.setText("Email :\t"+email);
    }//GEN-LAST:event_TblViewDealerMouseClicked

    private void btnDeleteDealerDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDealerDeleteActionPerformed
        // TODO add your handling code here:
        if(txtDeleteDealerName.getText().equals("Name :"))
        {
            JOptionPane.showMessageDialog(this, "First Search Dealer and select one!","Delaer not found!",JOptionPane.WARNING_MESSAGE);
        }else{
            Dealer d = new Dealer();
            int i = d.deleteDealer(txtDeleteDealerIDSearch.getText());
            if(i==1)
            {
                txtDeleteDealerIDSearch.setText("");
                txtDeleteDealerName.setText("Name : ");
                txtDeleteDealerAddressNo.setText("Address No : ");
                txtDeleteDealerAddressLine1.setText("Address Line 1 : ");
                txtDeleteDealerAddressLine2.setText("Address Line 2 : ");
                txtDeleteDealerCity.setText("City : ");
                txtDeleteDealerTelephone.setText("Telephone : ");
                txtDeleteDealerEmailID.setText("Email ID : ");
            }
        }
        
    }//GEN-LAST:event_btnDeleteDealerDeleteActionPerformed

    private void btnDeleteDealerClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDealerClearActionPerformed
        // TODO add your handling code here:
        txtDeleteDealerIDSearch.setText("");
        txtDeleteDealerName.setText("Name : ");
        txtDeleteDealerAddressNo.setText("Address No : ");
        txtDeleteDealerAddressLine1.setText("Address Line 1 : ");
        txtDeleteDealerAddressLine2.setText("Address Line 2 : ");
        txtDeleteDealerCity.setText("City : ");
        txtDeleteDealerTelephone.setText("Telephone : ");
        txtDeleteDealerEmailID.setText("Email ID : ");
    }//GEN-LAST:event_btnDeleteDealerClearActionPerformed

    private void btnDeleteDealerIDSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDealerIDSearchActionPerformed
        // TODO add your handling code here:
        if(txtDeleteDealerIDSearch.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter Delaer ID to get dealer's data!","Empty!",JOptionPane.WARNING_MESSAGE);
        }else{
            txtDeleteDealerName.setText("Name : ");
            txtDeleteDealerAddressNo.setText("Address No : ");
            txtDeleteDealerAddressLine1.setText("Address Line 1 : ");
            txtDeleteDealerAddressLine2.setText("Address Line 2 : ");
            txtDeleteDealerCity.setText("City : ");
            txtDeleteDealerTelephone.setText("Telephone : ");
            txtDeleteDealerEmailID.setText("Email ID : ");

            Database db = new Database();
            ResultSet rs = db.selectData("select * from tb_dealer where DID = '"+txtDeleteDealerIDSearch.getText()+"'");
            if(rs!=null)
            {
                try {
                    while(rs.next())
                    {
                        String dName = rs.getString("DName");
                        String email = rs.getString("Email");
                        String adNO = rs.getString("AddressNo");
                        String l1 = rs.getString("AddressLine01");
                        String l2 = rs.getString("AddressLine02");
                        String city = rs.getString("City");
                        String tp = String.valueOf(rs.getInt("telephone"));

                        txtDeleteDealerName.setText("Name : "+dName);
                        txtDeleteDealerAddressNo.setText("Address No : "+adNO);
                        txtDeleteDealerAddressLine1.setText("Address Line 1 : "+l1);
                        txtDeleteDealerAddressLine2.setText("Address Line 2 : "+l2);
                        txtDeleteDealerCity.setText("City : "+city);
                        txtDeleteDealerTelephone.setText("Telephone : "+tp);
                        txtDeleteDealerEmailID.setText("Email ID : "+email);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Cannot load Dealer Data try to search again","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No Such Dealer Found try to search again","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
    }//GEN-LAST:event_btnDeleteDealerIDSearchActionPerformed

    private void txtAddDealerIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddDealerIDMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "The next available Dealer ID","Information",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtAddDealerIDMouseClicked

    private void lblBtnAddCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnAddCustomerMouseClicked
        PanelAddCustomer.setVisible(true);
        PanelViewCustomer.setVisible(false);
        PanelModifyCustomer.setVisible(false);
        PanelDeleteCustomer.setVisible(false);
        
        lblBtnAddCustomer.setBackground(Color.GRAY);
        lblBtnViewCustomer.setBackground(new Color (0,102,102));
        lblBtnModifyCustomer.setBackground(new Color (0,102,102));
        
        
    }//GEN-LAST:event_lblBtnAddCustomerMouseClicked

    private void lblBtnViewCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnViewCustomerMouseClicked
        PanelAddCustomer.setVisible(false);
        PanelViewCustomer.setVisible(true);
        PanelModifyCustomer.setVisible(false);
        PanelDeleteCustomer.setVisible(false);
        
        lblBtnAddCustomer.setBackground(new Color (0,102,102));
        lblBtnViewCustomer.setBackground(Color.GRAY);
        lblBtnModifyCustomer.setBackground(new Color (0,102,102));
    }//GEN-LAST:event_lblBtnViewCustomerMouseClicked

    private void lblBtnModifyCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnModifyCustomerMouseClicked
        PanelAddCustomer.setVisible(false);
        PanelViewCustomer.setVisible(false);
        PanelModifyCustomer.setVisible(true);
        PanelDeleteCustomer.setVisible(false);
        
        lblBtnAddCustomer.setBackground(new Color (0,102,102));
        lblBtnViewCustomer.setBackground(new Color (0,102,102));
        lblBtnModifyCustomer.setBackground(Color.GRAY);
    }//GEN-LAST:event_lblBtnModifyCustomerMouseClicked

    private void txtAddCustomerNICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddCustomerNICMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddCustomerNICMouseClicked

    private void btnAddCustomerSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerSaveActionPerformed
        // TODO add your handling code here:
        Pattern nic = Pattern.compile("^([0-9]{9}[x|X|v|V]|[0-9]{12})$");
        Matcher mnic = nic.matcher(txtAddCustomerNIC.getText());
        
        Pattern name = Pattern.compile("^[a-zA-Z ]*$");
        Matcher mname = name.matcher(txtAddCustomerName.getText());
        
        Pattern telephone = Pattern.compile("^[a-zA-Z]+$");
        Matcher mtelephone = telephone.matcher(txtAddCustomerTelephone.getText());
        
        Pattern email = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
        Matcher memail = email.matcher(txtAddCustomerEmailID.getText());
        
        Database db = new Database();
        int i1 = db.credential_check("select * from tb_customer where CusNIC = '"+txtAddCustomerNIC.getText()+"'");
        if(i1==1)
        {
            JOptionPane.showMessageDialog(this, "Customer NIC Already Exist!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(txtAddCustomerNIC.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Customer NIC cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(mnic.matches()==false){
            JOptionPane.showMessageDialog(this,"Customer NIC is invalid. Please give valid NIC number!","Invalid NIC!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtAddCustomerName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Customer name cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(mname.matches()==false){
            JOptionPane.showMessageDialog(this,"Its does not like a name!","Invalid Name!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtAddCustomerAddressNo.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Address number cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(txtAddCustomerAddressLine1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"First address line cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(txtAddCustomerCity.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"City cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(txtAddCustomerTelephone.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Telephone number cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(mtelephone.matches()){
            JOptionPane.showMessageDialog(this,"Telephone number must have numbers only!","Invalid Telephone Number!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtAddCustomerTelephone.getText().length()!=10){
            JOptionPane.showMessageDialog(this,"Its does not like a telephone number!","Invalid Telephone Number!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtAddCustomerEmailID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Email cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(memail.matches()==false){
            JOptionPane.showMessageDialog(this,"Its does not like a email address!","Invalid Email!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
            Customer c = new Customer();
            int i = c.addCustomer(txtAddCustomerNIC.getText(), txtAddCustomerName.getText(), txtAddCustomerTelephone.getText(), txtAddCustomerEmailID.getText(), txtAddCustomerAddressNo.getText(), txtAddCustomerAddressLine1.getText(), txtAddCustomerAddressLine2.getText(), txtAddCustomerCity.getText());
            if(i==1)
            {
                User u = new User();                        
                u.recordUserOperation(txtUserName.getText(), "Customer", "Add Customer", "Customer NIC : "+txtAddCustomerNIC.getText());
                txtAddCustomerNIC.setText(null);
                txtAddCustomerName.setText(null);
                txtAddCustomerAddressNo.setText(null);
                txtAddCustomerAddressLine1.setText(null);
                txtAddCustomerAddressLine2.setText(null);
                txtAddCustomerCity.setText(null);
                txtAddCustomerTelephone.setText(null);
                txtAddCustomerEmailID.setText(null);
            }
        }
        
        
        
        
    }//GEN-LAST:event_btnAddCustomerSaveActionPerformed

    private void btnAddCustomerClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerClearActionPerformed
        // TODO add your handling code here:
        txtAddCustomerNIC.setText(null);
        txtAddCustomerName.setText(null);
        txtAddCustomerAddressNo.setText(null);
        txtAddCustomerAddressLine1.setText(null);
        txtAddCustomerAddressLine2.setText(null);
        txtAddCustomerCity.setText(null);
        txtAddCustomerTelephone.setText(null);
        txtAddCustomerEmailID.setText(null);
    }//GEN-LAST:event_btnAddCustomerClearActionPerformed

    private void btnViewCustomerSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustomerSearchActionPerformed
        // TODO add your handling code here:
        if(txtViewCustomerSearch.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please give some data to search customer's data!","Empty!", JOptionPane.WARNING_MESSAGE);
        }else{
            DefaultTableModel tmodel = (DefaultTableModel)TblViewCustomer.getModel();
        tmodel.setRowCount(0);
        String filter =null;
        Customer c = new Customer();
        ResultSet rs=null;
        if(cmbViewCustomerSearch.getSelectedIndex()==0)
        {
            filter="CusName";
        }
        if(cmbViewCustomerSearch.getSelectedIndex()==1)
        {
            filter="CusNIC";
        }
        if(cmbViewCustomerSearch.getSelectedIndex()==2)
        {
            filter="Telephone";
        }
        if(cmbViewCustomerSearch.getSelectedIndex()==3)
        {
            filter="City";
        }
        if(cmbViewCustomerSearch.getSelectedIndex()==4)
        {
            filter="TotalSale";
        }
        if(cmbViewCustomerSearch.getSelectedIndex()==5)
        {
            filter="Email";
        }
        /*if(cmbViewCustomerAccounttypeSelect.getSelectedIndex()==0)
        {
            
            txtViewCustomerPhoto.setVisible(false);        
            
        }
        if(cmbViewCustomerAccounttypeSelect.getSelectedIndex()==1)
        {
            rs = c.viewCustomer("Online", txtViewCustomerSearch.getText(), filter);
            txtViewCustomerPhoto.setVisible(true); 
        }*/
        rs = c.viewCustomer("Offline", txtViewCustomerSearch.getText(), filter);
        try {
            while(rs.next())
            {
                String cusNIC = rs.getString("CusNIC");
                String cusName = rs.getString("CusName");
                String telephone = String.valueOf(rs.getInt("Telephone"));
                String email = rs.getString("Email");
                String adno = rs.getString("AddressNO");
                String l1 = rs.getString("AddressLine01");
                String l2 = rs.getString("AddressLine02");
                String city = rs.getString("City");
                String totSale = String.valueOf(rs.getDouble("TotalSale"));

                String tbData[] = {cusNIC,cusName,telephone,email,adno,l1,l2,city,totSale};
                DefaultTableModel tbmodel = (DefaultTableModel)TblViewCustomer.getModel();
                tbmodel.addRow(tbData);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()+" Customer Data didn't load correclty Try again to load","Error",JOptionPane.ERROR_MESSAGE);
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()+" Customer Data didn't load correclty Try again to load","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(TblViewCustomer.getRowCount()==0)
        {
            JOptionPane.showMessageDialog(null,"Customer Data Not Found Try to different keyword","Error",JOptionPane.ERROR_MESSAGE);
        }
        }
        
        
    }//GEN-LAST:event_btnViewCustomerSearchActionPerformed

    private void btnViewCustomerClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustomerClearActionPerformed
        // TODO add your handling code here:
        txtViewCustomerNIC.setText("NIC : ");
        txtViewCustomerName.setText("Name : ");
        txtViewCustomerAddressNo.setText("Address,");
        txtViewCustomerAddressLine1.setText("");
        txtViewCustomerAddressLine2.setText("");
        txtViewCustomerCity.setText("");
        txtViewCustomerTelephone.setText("Telephone : ");
        txtViewCustomerEmailID.setText("Email ID : ");
        txtViewCustomerTotalSale.setText("Total Sale : ");
        
        
        DefaultTableModel tmodel = (DefaultTableModel)TblViewCustomer.getModel();
        tmodel.setRowCount(0);
        
        txtViewCustomerSearch.setText(null);
    }//GEN-LAST:event_btnViewCustomerClearActionPerformed

    private void btnViewCustomerAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustomerAllActionPerformed
        // TODO add your handling code here:
        txtViewCustomerNIC.setText("NIC : ");
        txtViewCustomerName.setText("Name : ");
        txtViewCustomerAddressNo.setText("Address,");
        txtViewCustomerAddressLine1.setText("");
        txtViewCustomerAddressLine2.setText("");
        txtViewCustomerCity.setText("");
        txtViewCustomerTelephone.setText("Telephone : ");
        txtViewCustomerEmailID.setText("Email ID : ");
        txtViewCustomerTotalSale.setText("Total Sale : ");
        
        DefaultTableModel tmodel = (DefaultTableModel)TblViewCustomer.getModel();
        tmodel.setRowCount(0);
        
        Customer c = new Customer();
        ResultSet rs = null;
        /*if(cmbViewCustomerAccounttypeSelect.getSelectedIndex()==0)
        {*/
            rs = c.viewCustomer("Offline",null,null);            
            try {
                while(rs.next())
                {
                    String cusNIC = rs.getString("CusNIC");
                    String cusName = rs.getString("CusName");
                    String telephone = String.valueOf(rs.getInt("Telephone"));
                    String email = rs.getString("Email");
                    String adno = rs.getString("AddressNO");
                    String l1 = rs.getString("AddressLine01");
                    String l2 = rs.getString("AddressLine02");
                    String city = rs.getString("City");
                    String totSale = String.valueOf(rs.getDouble("TotalSale"));

                    String tbData[] = {cusNIC,cusName,telephone,email,adno,l1,l2,city,totSale};
                    DefaultTableModel tbmodel = (DefaultTableModel)TblViewCustomer.getModel();

                    tbmodel.addRow(tbData);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage()+" Customer Data didn't load correclty Try again to load","Error",JOptionPane.ERROR_MESSAGE);
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage()+" Customer Data didn't load correclty Try again to load","Error",JOptionPane.ERROR_MESSAGE);
            }
        //}
        /*if(cmbViewCustomerAccounttypeSelect.getSelectedIndex()==1)
        {
            txtViewCustomerPhoto.setVisible(true);
            rs = c.viewCustomer("Online",null,null);
            try {
                while(rs.next())
                {
                    String cusNIC = String.valueOf(rs.getInt("CusNIC"));
                    String cusName = rs.getString("CusName");
                    String telephone = String.valueOf(rs.getInt("Telephone"));
                    String email = rs.getString("Email");
                    String adno = rs.getString("AddressNO");
                    String l1 = rs.getString("AddressLine01");
                    String l2 = rs.getString("AddressLine02");
                    String city = rs.getString("City");
                    String totSale = String.valueOf(rs.getDouble("TotalSale"));

                    String tbData[] = {cusNIC,cusName,telephone,email,adno,l1,l2,city,totSale};

                    DefaultTableModel tbmodel = (DefaultTableModel)TblViewCustomer.getModel();

                    tbmodel.addRow(tbData);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage()+" Customer Data didn't load correclty Try again to load","Error",JOptionPane.ERROR_MESSAGE);
            }
        }*/
        
    }//GEN-LAST:event_btnViewCustomerAllActionPerformed

    private void btnDeleteCustomerDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCustomerDeleteActionPerformed
        // TODO add your handling code here:
        Database dbe = new Database();
        int i2 = dbe.credential_check("select * from tb_customer where CusNIC = "+txtDeleteCustomerNICSearch.getText()+"" );
        if(txtDeleteCustomerNICSearch.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please first give valid NIC number to search data!","Empty!", JOptionPane.WARNING_MESSAGE);
        }
        else if(i2!=1){
            JOptionPane.showMessageDialog(null,"Customer not found! Try again using using valid NIC number!","Not Found!", JOptionPane.WARNING_MESSAGE);
        }else{
            Customer c = new Customer();
            int i = c.deleteCustomer(txtDeleteCustomerNICSearch.getText());
            if(i==1)
            {
                txtDeleteCustomerNICSearch.setText("");
                txtDeleteCustomerName.setText("Name : ");
                txtDeleteCustomerAddressNo.setText("Address,");
                txtDeleteCustomerAddressLine1.setText("");
                txtDeleteCustomerAddressLine2.setText("");
                txtDeleteCustomerCity.setText("");
                txtDeleteCustomerTelephone.setText("Telephone : ");
                txtDeleteCustomerEmailID.setText("Email : ");
                txtDeleteCustomerAccountType.setText("Account Type : ");
                txtDeleteCustomerPhoto.setIcon(null);
                txtDeleteCustomerPhoto.setVisible(true);
            }
        }
        
        
    }//GEN-LAST:event_btnDeleteCustomerDeleteActionPerformed

    private void btnDeleteCustomerClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCustomerClearActionPerformed
        // TODO add your handling code here:
        txtDeleteCustomerNICSearch.setText("");
        txtDeleteCustomerName.setText("Name : ");
        txtDeleteCustomerAddressNo.setText("Address,");
        txtDeleteCustomerAddressLine1.setText("");
        txtDeleteCustomerAddressLine2.setText("");
        txtDeleteCustomerCity.setText("");
        txtDeleteCustomerTelephone.setText("Telephone : ");
        txtDeleteCustomerEmailID.setText("Email : ");
        txtDeleteCustomerAccountType.setText("Account Type : ");
        txtDeleteCustomerPhoto.setIcon(null);
        txtDeleteCustomerPhoto.setVisible(true);
    }//GEN-LAST:event_btnDeleteCustomerClearActionPerformed

    private void btnDeleteCustomerNICSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCustomerNICSearchActionPerformed
        // TODO add your handling code here:
        Database dbe = new Database();
        int i = dbe.credential_check("select * from tb_customer where CusNIC = "+txtDeleteCustomerNICSearch.getText()+"" );
        if(!(i==1)){
            JOptionPane.showMessageDialog(null,"NIC  is invalid! Please give valid NIC number!","Invalid NIC!", JOptionPane.ERROR_MESSAGE);
        }else{
            txtDeleteCustomerName.setText("Name : ");
        txtDeleteCustomerAddressNo.setText("Address,");
        txtDeleteCustomerAddressLine1.setText("");
        txtDeleteCustomerAddressLine2.setText("");
        txtDeleteCustomerCity.setText("");
        txtDeleteCustomerTelephone.setText("Telephone : ");
        txtDeleteCustomerEmailID.setText("Email : ");
        txtDeleteCustomerAccountType.setText("Account Type : ");
        txtDeleteCustomerPhoto.setIcon(null);
        
        try {
            // TODO add your handling code here:
            ImageResizer ir = new ImageResizer();
            Database db = new Database();
            ResultSet rs = db.selectData("select * from tb_customer where cusNIC = '"+txtDeleteCustomerNICSearch.getText()+"'");
            if(rs==null)
            {
                JOptionPane.showMessageDialog(null,"Customer Data Not Found Try again to load","Error",JOptionPane.ERROR_MESSAGE);
            }
            while(rs.next())
            {
                String name = rs.getString("CusName");
                String adNO = rs.getString("AddressNo");
                String adL1 = rs.getString("AddressLine01");
                String adL2 = rs.getString("AddressLine02");
                String city = rs.getString("city");
                String telephone = String.valueOf(rs.getInt("Telephone"));
                String email = rs.getString("Email");
                /*String type = rs.getString("Type");
                JOptionPane.showMessageDialog(null,"This is "+type+" Customer Account","Information",JOptionPane.INFORMATION_MESSAGE);*/
                
                txtDeleteCustomerName.setText("Name : "+name);
                txtDeleteCustomerAddressNo.setText("Address,");
                txtDeleteCustomerAddressLine1.setText(adNO+","+adL1);
                txtDeleteCustomerAddressLine2.setText(adL2);
                txtDeleteCustomerCity.setText(city);
                txtDeleteCustomerTelephone.setText("Telephone : "+telephone);
                txtDeleteCustomerEmailID.setText("Email : "+email);
                /*txtDeleteCustomerAccountType.setText("Account Type : "+type);
                if(type.equals("Online"))
                {
                    txtDeleteCustomerPhoto.setVisible(true);
                    ResultSet rs1 = db.selectData("select * from tb_onlineaccount where cusNIC ='"+txtDeleteCustomerNICSearch.getText()+"'");
                    while(rs1.next())
                    {
                        byte[] photo = rs1.getBytes("Photo");
                        txtDeleteCustomerPhoto.setIcon(ir.ResizeImage(photo,txtDeleteCustomerPhoto));
                    }
                }
                else
                {
                    txtDeleteCustomerPhoto.setVisible(false);
                }*/
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Customer Data didn't load correclty Try again to load","Error",JOptionPane.ERROR_MESSAGE);
        }
        catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage()+" Something went wrong Try again to load","Error",JOptionPane.ERROR_MESSAGE);
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage()+" Something went wrong Try again to load","Error",JOptionPane.ERROR_MESSAGE);
        }
        }
        
        
    }//GEN-LAST:event_btnDeleteCustomerNICSearchActionPerformed

    private void btnModifyCustomerSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyCustomerSaveActionPerformed
        // TODO add your handling code here:
        
        Pattern nic = Pattern.compile("^([0-9]{9}[x|X|v|V]|[0-9]{12})$");
        Matcher mnic = nic.matcher(txtModifyCustomerNIC.getText());
        
        Pattern name = Pattern.compile("^[a-zA-Z ]*$");
        Matcher mname = name.matcher(txtModifyCustomerName.getText());
        
        Pattern telephone = Pattern.compile("^[a-zA-Z]+$");
        Matcher mtelephone = telephone.matcher(txtModifyCustomerTelephone.getText());
        
        Pattern email = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
        Matcher memail = email.matcher(txtModifyCustomerEmailID.getText());
        
        if(txtModifyCustomerNIC.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Customer NIC cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(mnic.matches()==false){
            JOptionPane.showMessageDialog(this,"Customer NIC is invalid. Please give valid NIC number!","Invalid NIC!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtModifyCustomerName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Customer name cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(mname.matches()==false){
            JOptionPane.showMessageDialog(this,"Its does not like a name!","Invalid Name!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtModifyCustomerAddressNo.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Address number cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(txtModifyCustomerAddressLine1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"First address line cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(txtModifyCustomerCity.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"City cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(txtModifyCustomerTelephone.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Telephone number cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(mtelephone.matches()){
            JOptionPane.showMessageDialog(this,"Telephone number must have numbers only!","Invalid Telephone Number!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtModifyCustomerTelephone.getText().length()!=10){
            JOptionPane.showMessageDialog(this,"Its does not like a telephone number!","Invalid Telephone Number!", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtModifyCustomerEmailID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Email cannot be blank!","Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if(memail.matches()==false){
            JOptionPane.showMessageDialog(this,"Its does not like a email address!","Invalid Email!", JOptionPane.ERROR_MESSAGE);
        }else{
            Customer c = new Customer();
            int i = c.updateCustomer(txtModifyCustomerNIC.getText(), txtModifyCustomerName.getText(), txtModifyCustomerTelephone.getText(), txtModifyCustomerEmailID.getText(), txtModifyCustomerAddressNo.getText(), txtModifyCustomerAddressLine1.getText(), txtModifyCustomerAddressLine2.getText(), txtModifyCustomerCity.getText());
            if(i==1)
            {
                User u = new User();                        
                u.recordUserOperation(txtUserName.getText(), "Customer", "Update Customer", "Customer NIC : "+txtModifyCustomerNIC.getText());
                txtModifyCustomerNIC.setText(null);
                txtModifyCustomerName.setText(null);
                txtModifyCustomerAddressNo.setText(null);
                txtModifyCustomerAddressLine1.setText(null);
                txtModifyCustomerAddressLine2.setText(null);
                txtModifyCustomerCity.setText(null);
                txtModifyCustomerTelephone.setText(null);
                txtModifyCustomerEmailID.setText(null);
            }
        }
    }//GEN-LAST:event_btnModifyCustomerSaveActionPerformed

    private void btnModifyCustomerClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyCustomerClearActionPerformed
        // TODO add your handling code here:
        txtModifyCustomerNIC.setText(null);
        txtModifyCustomerName.setText(null);
        txtModifyCustomerAddressNo.setText(null);
        txtModifyCustomerAddressLine1.setText(null);
        txtModifyCustomerAddressLine2.setText(null);
        txtModifyCustomerCity.setText(null);
        txtModifyCustomerTelephone.setText(null);
        txtModifyCustomerEmailID.setText(null);
    }//GEN-LAST:event_btnModifyCustomerClearActionPerformed

    private void btnModifyCustomerNICSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyCustomerNICSearchActionPerformed
        
        Database dbnic = new Database();
        int i = dbnic.credential_check("select * from tb_customer where cusNIC = '"+txtModifyCustomerNIC.getText()+"'");
        
        if(txtModifyCustomerNIC.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please first give NIC number to search data!","Empty!",JOptionPane.WARNING_MESSAGE);
        }else if(i!=1){
            JOptionPane.showMessageDialog(this,"Customer not found! Try again!","Not Found!",JOptionPane.WARNING_MESSAGE);
        }else{
            try {
            // TODO add your handling code here:
            Database db = new Database();
            ResultSet rs = db.selectData("select * from tb_customer where cusNIC = '"+txtModifyCustomerNIC.getText()+"'");
            if(rs==null)
            {
                JOptionPane.showMessageDialog(null,"Customer Data Not Found Try again to load","Error",JOptionPane.ERROR_MESSAGE);
            }
            while(rs.next())
            {
                String name = rs.getString("CusName");
                String adNO = rs.getString("AddressNo");
                String adL1 = rs.getString("AddressLine01");
                String adL2 = rs.getString("AddressLine02");
                String city = rs.getString("city");
                String telephone = String.valueOf(rs.getInt("Telephone"));
                String email = rs.getString("Email");
                /*String type = rs.getString("Type");
                JOptionPane.showMessageDialog(null,"This is "+type+" Customer Account","Information",JOptionPane.INFORMATION_MESSAGE);*/
                
                txtModifyCustomerName.setText(name);
                txtModifyCustomerAddressNo.setText(adNO);
                txtModifyCustomerAddressLine1.setText(adL1);
                txtModifyCustomerAddressLine2.setText(adL2);
                txtModifyCustomerCity.setText(city);
                txtModifyCustomerTelephone.setText("0"+telephone);
                txtModifyCustomerEmailID.setText(email);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Customer Data didn't load correclty Try again to load","Error",JOptionPane.ERROR_MESSAGE);
        }
        catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage()+" Something went wrong Try again to load","Error",JOptionPane.ERROR_MESSAGE);
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage()+" Something went wrong Try again to load","Error",JOptionPane.ERROR_MESSAGE);
        }
        }
        
        
    }//GEN-LAST:event_btnModifyCustomerNICSearchActionPerformed

    private void TblViewCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblViewCustomerMouseClicked
        // TODO add your handling code here:
        txtViewCustomerNIC.setText("NIC : ");
        txtViewCustomerName.setText("Name : ");
        txtViewCustomerAddressNo.setText("Address,");
        txtViewCustomerAddressLine1.setText("");
        txtViewCustomerAddressLine2.setText("");
        txtViewCustomerCity.setText("");
        txtViewCustomerTelephone.setText("Telephone : ");
        txtViewCustomerEmailID.setText("Email ID : ");
        txtViewCustomerTotalSale.setText("Total Sale : ");
        
        int row = TblViewCustomer.getSelectedRow();
        
        String nic = TblViewCustomer.getValueAt(row, 0).toString();
        String name = TblViewCustomer.getValueAt(row, 1).toString();
        String telephone = TblViewCustomer.getValueAt(row, 2).toString();
        String email = TblViewCustomer.getValueAt(row, 3).toString();
        String adno = TblViewCustomer.getValueAt(row, 4).toString();
        String l1 = TblViewCustomer.getValueAt(row, 5).toString();
        String l2 = TblViewCustomer.getValueAt(row, 6).toString();
        String city = TblViewCustomer.getValueAt(row, 7).toString();
        String totSale = TblViewCustomer.getValueAt(row, 8).toString();
            
        txtViewCustomerNIC.setText("NIC : "+nic);
        txtViewCustomerName.setText("Name : "+name);
        txtViewCustomerAddressNo.setText("Address,");
        txtViewCustomerAddressLine1.setText(""+adno+" "+l1);
        txtViewCustomerAddressLine2.setText(""+l2);
        txtViewCustomerCity.setText(""+city);
        txtViewCustomerTelephone.setText("Telephone : "+telephone);
        txtViewCustomerEmailID.setText("Email ID : "+email);
        txtViewCustomerTotalSale.setText("Total Sale : "+totSale);
        
        /*if(cmbViewCustomerAccounttypeSelect.getSelectedIndex()==1)
        {
            try {
                Customer c = new Customer();
                ResultSet rs = c.viewCustomerPhoto(nic);
                ImageResizer ir = new ImageResizer();
                while(rs.next())
                {
                    byte[] photo = rs.getBytes("Photo");
                    txtViewCustomerPhoto.setIcon(ir.ResizeImage(photo, txtViewCustomerPhoto));
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage()+" Customer Data didn't load correclty Try again to load","Error",JOptionPane.ERROR_MESSAGE);
            }
        }*/
    }//GEN-LAST:event_TblViewCustomerMouseClicked

    private void txtUpdateItemQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateItemQuantityActionPerformed
        // TODO add your handling code here:
        //int i = JOptionPane.showConfirmDialog(this, "To Update the item quntity need Administrator or Manager login\nAre you Sure to proceed?","update Item Quantity",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_txtUpdateItemQuantityActionPerformed

    private void txtUpdateItemQuantityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUpdateItemQuantityMouseClicked
        // TODO add your handling code here:
        if(txtUpdateItemNo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter Item ID to make stock adjustments","No Item ID",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            int i = JOptionPane.showConfirmDialog(this, "To Update the item quntity need Administrator or Manager login\nAre you Sure to proceed?","update Item Quantity",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
            if(i==0)
            {
                JPanel panel = new JPanel();
                JLabel l1 = new JLabel("Username");
                JTextField t = new JTextField(15);
                JLabel label = new JLabel("Password");
                JPasswordField verifycode = new JPasswordField(15);
                panel.add(l1);
                panel.add(t);
                panel.add(label);
                panel.add(verifycode);
                int option = JOptionPane.showConfirmDialog(null, panel, "Verify Admin or Manager Account",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(option==0)
                {
                    String password = new String(verifycode.getPassword());
                    Database db = new Database();
                    int c = db.credential_check("SELECT * FROM tb_employee WHERE UserType in ('Admin','Manager') AND UserName='"+t.getText()+"' AND Password='"+password+"'");
                    if(c==1)
                    {
                        StockAdjusment sa = new StockAdjusment();
                        sa.setUsername(t.getText());
                        sa.pack();
                        sa.setLocationRelativeTo(null);
                        sa.setVisible(true);
                        try {
                            sa.setItemData(txtUpdateItemNo.getText());
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, ex.getMessage()+" Item Data didn't load correclty Try again to load","Error",JOptionPane.ERROR_MESSAGE);
                        }

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Something went wrong while searching user below reasons can caused\n"
                                + "\t* No such User found in given username & password\n"
                                + "\t* User Type dosen't support for this operation","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }        
    }//GEN-LAST:event_txtUpdateItemQuantityMouseClicked

    private void lblBtnPlaceOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnPlaceOrderMouseClicked
        PanelPlaceOrder.setVisible(true);
        PanelViewOrder.setVisible(false);
        PanelOrder3.setVisible(false);
        PanelOrder4.setVisible(false);
        
        lblBtnPlaceOrder.setBackground(Color.GRAY);
        lblBtnViewOrder.setBackground(new Color (0,102,102));
    }//GEN-LAST:event_lblBtnPlaceOrderMouseClicked

    private void lblBtnViewOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnViewOrderMouseClicked
        PanelPlaceOrder.setVisible(false);
        PanelViewOrder.setVisible(true);
        PanelOrder3.setVisible(false);
        PanelOrder4.setVisible(false);
        
        lblBtnViewOrder.setBackground(Color.GRAY);
        lblBtnPlaceOrder.setBackground(new Color (0,102,102));
    }//GEN-LAST:event_lblBtnViewOrderMouseClicked

    private void lblBtnOrder4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnOrder4MouseClicked
        PanelPlaceOrder.setVisible(false);
        PanelViewOrder.setVisible(false);
        PanelOrder3.setVisible(true);
        PanelOrder4.setVisible(false);
    }//GEN-LAST:event_lblBtnOrder4MouseClicked

    private void lblBtnOrder3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnOrder3MouseClicked
        PanelPlaceOrder.setVisible(false);
        PanelViewOrder.setVisible(false);
        PanelOrder3.setVisible(false);
        PanelOrder4.setVisible(true);
    }//GEN-LAST:event_lblBtnOrder3MouseClicked

    private void btnPlaceOrderItemSearchViewallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderItemSearchViewallActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tmodel = (DefaultTableModel)TablePlaceOrderViewItem.getModel();
        tmodel.setRowCount(0);
        
        Database db = new Database();
        ResultSet rs = db.selectData("select * from tb_item");
        try {
            while(rs.next())
            {
                String ino = String.valueOf(rs.getInt("ino"));
                String iname = rs.getString("iname");
                String qty = String.valueOf(rs.getInt("qtyinhand"));
                String discount = String.valueOf(rs.getDouble("DiscountMargine"));
                String price = String.valueOf(rs.getDouble("Price"));
                
                String tbData[] = {ino,iname,price,qty,discount};
                DefaultTableModel tbmodel = (DefaultTableModel)TablePlaceOrderViewItem.getModel();

                tbmodel.addRow(tbData);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Item Data Cannot Load now try again","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPlaceOrderItemSearchViewallActionPerformed

    private void btnPlaceOrderItemSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderItemSearchActionPerformed
        // TODO add your handling code here:
        if(txtPlaceOrderItemSearch.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter Credentials to seach item","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            String sql = null;
            if(cmbPlaceOrderItemSearch.getSelectedIndex()==0)
            {
                sql="select * from tb_item where ino = '"+txtPlaceOrderItemSearch.getText()+"'";
            }
            if(cmbPlaceOrderItemSearch.getSelectedIndex()==1)
            {
                sql="select * from tb_item where iname LIKE '%"+txtPlaceOrderItemSearch.getText()+"%'";
            }
            if(cmbPlaceOrderItemSearch.getSelectedIndex()==2)
            {
                sql="select * from tb_item where price LIKE '%"+txtPlaceOrderItemSearch.getText()+"%'";
            }

            DefaultTableModel tmodel = (DefaultTableModel)TablePlaceOrderViewItem.getModel();
            tmodel.setRowCount(0);

            Database db = new Database();
            ResultSet rs = db.selectData(sql);
            try {
                while(rs.next())
                {
                    String ino = String.valueOf(rs.getInt("ino"));
                    String iname = rs.getString("iname");
                    String qty = String.valueOf(rs.getInt("qtyinhand"));
                    String discount = String.valueOf(rs.getDouble("DiscountMargine"));
                    String price = String.valueOf(rs.getDouble("Price"));
                    String tbData[] = {ino,iname,price,qty,discount};

                    tmodel.addRow(tbData);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Item Data Cannot Load now try again","Error",JOptionPane.ERROR_MESSAGE);
            }
            if(TablePlaceOrderViewItem.getRowCount()<=0)
            {
                JOptionPane.showMessageDialog(this, "No Data Found check your credentials and search again","Error",JOptionPane.ERROR_MESSAGE);
            }
        }        
    }//GEN-LAST:event_btnPlaceOrderItemSearchActionPerformed

    private void txtPlaceOrderItemIDClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlaceOrderItemIDClearActionPerformed
        // TODO add your handling code here:
        txtPlaceOrderEnterItemId.setText(null);
        txtPlaceOrderQty.setText(null);
        txtPlaceOrderQtyInHand.setText("----------------");
    }//GEN-LAST:event_txtPlaceOrderItemIDClearActionPerformed

    private void TablePlaceOrderViewItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePlaceOrderViewItemMouseClicked
        // TODO add your handling code here:
        txtPlaceOrderEnterItemId.setText(null);
        txtPlaceOrderQty.setText(null);
        txtPlaceOrderQtyInHand.setText("----------------");
        
        int row = TablePlaceOrderViewItem.getSelectedRow();
        
        txtPlaceOrderEnterItemId.setText((TablePlaceOrderViewItem.getValueAt(row, 0)).toString());
        txtPlaceOrderQtyInHand.setText((TablePlaceOrderViewItem.getValueAt(row, 3)).toString());
    }//GEN-LAST:event_TablePlaceOrderViewItemMouseClicked

    private void txtPlaceOrderAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlaceOrderAddActionPerformed
        Pattern addQtyRegex = Pattern.compile("^[0-9]*$");
        Matcher addQtyMatacher = addQtyRegex.matcher(txtPlaceOrderQty.getText());
        if(txtPlaceOrderEnterItemId.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Item Not Selected, select item to add","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(addQtyMatacher.matches()==false)
        {
            JOptionPane.showMessageDialog(this, "Quantity can only have Number","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            int row = TablePlaceOrderViewItem.getSelectedRow();
            String ino = (TablePlaceOrderViewItem.getValueAt(row, 0)).toString();
            String iname = (TablePlaceOrderViewItem.getValueAt(row, 1)).toString();
            String qty = txtPlaceOrderQty.getText();

            String tbData[] = {ino,iname,qty};
            DefaultTableModel tbmodel = (DefaultTableModel)TablePlaceOrderViewAmount.getModel();
            tbmodel.addRow(tbData);
        }        
    }//GEN-LAST:event_txtPlaceOrderAddActionPerformed

    private void TablePlaceOrderViewAmountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePlaceOrderViewAmountMouseClicked
        // TODO add your handling code here:
        int row = TablePlaceOrderViewAmount.getSelectedRow();
        String itemName = (TablePlaceOrderViewAmount.getValueAt(row, 1).toString());
        
        int i = JOptionPane.showConfirmDialog(this, "Are you Sure to remove "+itemName+" from this Order","Warning",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(i==0)
        {
            
            
            DefaultTableModel tbmodel = (DefaultTableModel)TablePlaceOrderViewAmount.getModel();
            tbmodel.removeRow(row);
        }
    }//GEN-LAST:event_TablePlaceOrderViewAmountMouseClicked

    private void btnPlaceOrderItemSearchClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderItemSearchClearActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tmodel = (DefaultTableModel)TablePlaceOrderViewItem.getModel();
        tmodel.setRowCount(0);        
        
        txtPlaceOrderNumber.setText("");
        txtPlaceOrderDate.setText("");
        cmbPlaceOrderItemSearch.setSelectedIndex(0);
        txtPlaceOrderItemSearch.setText("");
    }//GEN-LAST:event_btnPlaceOrderItemSearchClearActionPerformed

    private void btnPlaceOrderClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderClearActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(this, "If the Order Not Placed the order details no longer available\n\t*Are you sure to Clear Data","Warning",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(i==0)
        {
            txtPlaceOrderDate.setText(null);
            txtPlaceOrderNumber.setText(null);
            txtPlaceOrderEnterItemId.setText(null);
            txtPlaceOrderQty.setText(null);
            
            txtPlaceOrderQtyInHand.setText("----------------");
            
            DefaultTableModel tmodel = (DefaultTableModel)TablePlaceOrderViewAmount.getModel();
            tmodel.setRowCount(0);
        }
    }//GEN-LAST:event_btnPlaceOrderClearActionPerformed

    private void txtPlaceOrderNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlaceOrderNumberMouseClicked
        // TODO add your handling code here:
        loadOrderIDAndDate();
    }//GEN-LAST:event_txtPlaceOrderNumberMouseClicked

    private void btnPlaceOrderPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderPlaceActionPerformed
        // TODO add your handling code here:
        if(txtPlaceOrderSPID.getText().isEmpty() || txtPlaceOrderDID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill both fields!","Warning",JOptionPane.WARNING_MESSAGE);
        }else{
            Database db = new Database();
            int spID = db.credential_check("select * from tb_salesperson where SID = "+txtPlaceOrderSPID.getText()+"");
            int dID = db.credential_check("select * from tb_dealer where DID = "+txtPlaceOrderDID.getText()+"");
            int oID = db.credential_check("select * from tb_dealerorder where DOID = "+txtPlaceOrderNumber.getText()+"");
            if(txtPlaceOrderNumber.getText().isEmpty() && txtPlaceOrderDate.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Order ID not loaded\nHelp : Click on box nere the Order ID to Load","Warning",JOptionPane.WARNING_MESSAGE);
            }
            if(oID!=0)
            {
                JOptionPane.showMessageDialog(this, "The Order ID is already used, clear the order ID and try again","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(TablePlaceOrderViewAmount.getRowCount()<=0)
            {
                JOptionPane.showMessageDialog(this, "Items not contain in order add items and try again","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(txtPlaceOrderSPID.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Enter Salesperson ID","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else if(spID!=1)
            {
                JOptionPane.showMessageDialog(this, "No Such Salesperson found","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(txtPlaceOrderDID.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Enter Dealer ID","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else if(dID!=1)
            {
                JOptionPane.showMessageDialog(this, "No Such Dealer found","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int row = TablePlaceOrderViewAmount.getRowCount();
                int c3=1;
                DealerOrder d = new DealerOrder();
                int i2 = d.addDealerOrder(txtPlaceOrderSPID.getText(), txtPlaceOrderDID.getText(), txtPlaceOrderDate.getText());
                if(i2==1)
                {
                    for(int c=0;c<row;c++)
                    {
                        String ino = TablePlaceOrderViewAmount.getValueAt(c, 0).toString();
                        String qty = TablePlaceOrderViewAmount.getValueAt(c, 2).toString();
                        int c2 = d.addItemInDealerOrder(txtPlaceOrderNumber.getText(), ino, qty);
                        if(c2==1)
                        {
                            c3++;
                        }
                    }
                    if(c3>row)
                    {
                        JOptionPane.showMessageDialog(this, "Order Placed Successfully","Done",JOptionPane.INFORMATION_MESSAGE);                        
                        User u = new User();                        
                        u.recordUserOperation(txtUserName.getText(), "Order", "Place Order", "Order ID : "+txtPlaceOrderNumber.getText());
                        loadOrderIDAndDate();
                        DefaultTableModel tmodel = (DefaultTableModel)TablePlaceOrderViewAmount.getModel();
                        tmodel.setRowCount(0);
                        txtPlaceOrderQty.setText(null);
                        txtPlaceOrderEnterItemId.setText(null);
                        txtPlaceOrderQtyInHand.setText("----------------");
                        txtPlaceOrderSPID.setText(null);
                        txtPlaceOrderDID.setText(null);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Order Not Placed Successfully","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }        
    }//GEN-LAST:event_btnPlaceOrderPlaceActionPerformed

    private void btnViewGoodsReceiveNoteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewGoodsReceiveNoteMouseClicked

        Database dbc = new Database();
        int q = dbc.credential_check("select * from tb_employee where username = '"+txtUserName.getText()+"' and usertype in ('Admin','Manager')");
        if(q==1)
        {
            int row = tblViewItem.getSelectedRow();
            if(row!=-1)
            {
                int i = JOptionPane.showConfirmDialog(this, "To View Item GRN and Stock Adjustment need Administrator or Manager Login\nAre you Sure to proceed?","View GRN and Stock Adjustment",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
                if(i==0)
                {
                    JPanel panel = new JPanel();
                    JLabel l1 = new JLabel("Username");
                    JTextField t = new JTextField(15);
                    JLabel label = new JLabel("Password");
                    JPasswordField verifycode = new JPasswordField(15);
                    panel.add(l1);
                    panel.add(t);
                    panel.add(label);
                    panel.add(verifycode);
                    int option = JOptionPane.showConfirmDialog(null, panel, "Verify Admin or Manager Account",
                            JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(option==0)
                    {
                        String password = new String(verifycode.getPassword());
                        Database db = new Database();
                        int c = db.credential_check("SELECT * FROM tb_employee WHERE UserType in ('Admin','Manager') AND UserName='"+t.getText()+"' AND Password='"+password+"'");
                        if(c==1)
                        {
                            String ino = tblViewItem.getValueAt(row, 0).toString();
                            GoodsReceiveNote g = new GoodsReceiveNote();
                            g.setVisible(true);
                            g.setusername(txtUserName.getText());
                            g.loadGRN(ino);
                            g.loadStockAdjustment();

                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Something went wrong while searching user below reasons can caused\n"
                                    + "\t* No such User found in given username & password\n"
                                    + "\t* User Type dosen't support for this operation","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Select Item to View GRN and Stock Adjustments","Select Row",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You don't have privileges to access this menu","No Access",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnViewGoodsReceiveNoteMouseClicked

    private void btnViewGoodsReceiveNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewGoodsReceiveNoteActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnViewGoodsReceiveNoteActionPerformed

    private void btnViewOrderSearchAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderSearchAllActionPerformed
        // TODO add your handling code here:
        viewAllDealerOrders();
    }//GEN-LAST:event_btnViewOrderSearchAllActionPerformed

    private void viewAllDealerOrders()
    {
        txtViewOrderSearch.setText("");
        cmbViewOrderSearch.setSelectedIndex(0);
        DefaultTableModel tmodel1 = (DefaultTableModel)tableViewOrder.getModel();
        tmodel1.setRowCount(0);
        DefaultTableModel tmodel2 = (DefaultTableModel)tableViewOrderItem.getModel();
        tmodel2.setRowCount(0);
        
        DefaultTableModel tmodel = (DefaultTableModel)tableViewOrder.getModel();
        tmodel.setRowCount(0);
        
        DealerOrder o = new DealerOrder();
        ResultSet rs = o.viewDOrder();
        if(rs!=null)
        {
            try {
                while(rs.next())
                {
                    String oid = String.valueOf(rs.getInt("DOID"));
                    String date = String.valueOf(rs.getDate("Date"));
                    String dealerID = String.valueOf(rs.getInt("DID"));
                    String dealerName = rs.getString("DName");
                    String salespersonName = rs.getString("SName");
                    String status = rs.getString("Status");
                    
                    String tbData[] = {oid,date,dealerID,dealerName,salespersonName,status};
                    tmodel.addRow(tbData);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Dealer Order Details Not Loaded Successfully Try to Reload","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No Data Found on Dealer Order","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(tableViewOrder.getRowCount()<=0)
        {
            JOptionPane.showMessageDialog(this, "No Data Found on Dealer Order Check your credentials and try again","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    private void tableViewOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableViewOrderMouseClicked
        // TODO add your handling code here:
        int row = tableViewOrder.getSelectedRow();
        String dOID=(tableViewOrder.getValueAt(row, 0)).toString();
        DefaultTableModel tmodel = (DefaultTableModel)tableViewOrderItem.getModel();
        tmodel.setRowCount(0);
        
        Database db = new Database();
        ResultSet rs = db.selectData("SELECT * FROM tb_itemindealerorder,tb_item WHERE tb_itemindealerorder.INO = tb_item.INO AND DOID = '"+dOID+"'");
        if(rs !=null)
        {
            try {
                while(rs.next())
                {
                    String ino = String.valueOf(rs.getInt("INO"));
                    String iname = rs.getString("IName");
                    String qty = String.valueOf(rs.getInt("QtyOrdered"));
                    
                    String tbData[] = {ino,iname,qty};
                    tmodel.addRow(tbData);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Dealer Order Details Not Loaded Successfully Try to Reload","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No Item Data Found","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tableViewOrderMouseClicked

    private void btnViewOrderSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderSearchActionPerformed
        // TODO add your handling code here:
        if(txtViewOrderSearch.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter Credentials to search Orders","Warning",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            String filter=null;
            if(cmbViewOrderSearch.getSelectedIndex()==0)
            {
                filter = "DOID";
            }
            if(cmbViewOrderSearch.getSelectedIndex()==1)
            {
                filter = "Date";
            }
            if(cmbViewOrderSearch.getSelectedIndex()==2)
            {
                filter = "DID";
            }
            if(cmbViewOrderSearch.getSelectedIndex()==3)
            {
                filter = "DName";
            }
            if(cmbViewOrderSearch.getSelectedIndex()==4)
            {
                filter = "SName";
            }
            if(cmbViewOrderSearch.getSelectedIndex()==5)
            {
                filter = "Status";
            }

            DefaultTableModel tmodel = (DefaultTableModel)tableViewOrder.getModel();
            tmodel.setRowCount(0);

            DealerOrder o = new DealerOrder();
            ResultSet rs = o.viewDOrder(filter,txtViewOrderSearch.getText());
            if(rs!=null)
            {
                try {
                    while(rs.next())
                    {
                        String oid = String.valueOf(rs.getInt("DOID"));
                        String date = String.valueOf(rs.getDate("Date"));
                        String dealerID = String.valueOf(rs.getInt("DID"));
                        String dealerName = rs.getString("DName");
                        String salespersonName = rs.getString("SName");
                        String status = rs.getString("Status");

                        String tbData[] = {oid,date,dealerID,dealerName,salespersonName,status};
                        tmodel.addRow(tbData);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Dealer Order Details Not Loaded Successfully Try to Reload","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "No Data Found on Dealer Order","Error",JOptionPane.ERROR_MESSAGE);
            }
            if(tableViewOrder.getRowCount()<=0)
            {
                JOptionPane.showMessageDialog(this, "No Data Found on Dealer Order Check your credentials and try again","Error",JOptionPane.ERROR_MESSAGE);
            }
        }        
    }//GEN-LAST:event_btnViewOrderSearchActionPerformed

    private void btnViewOrderSearchClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderSearchClearActionPerformed
        // TODO add your handling code here:
        txtViewOrderSearch.setText("");
        cmbViewOrderSearch.setSelectedIndex(0);
        DefaultTableModel tmodel1 = (DefaultTableModel)tableViewOrder.getModel();
        tmodel1.setRowCount(0);
        DefaultTableModel tmodel2 = (DefaultTableModel)tableViewOrderItem.getModel();
        tmodel2.setRowCount(0);
    }//GEN-LAST:event_btnViewOrderSearchClearActionPerformed

    private void txtViewOrderCancelClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViewOrderCancelClearActionPerformed
        // TODO add your handling code here:
        txtViewOrderCancelOrderID.setText("");
    }//GEN-LAST:event_txtViewOrderCancelClearActionPerformed

    private void btnViewOrderCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderCancelActionPerformed
        Database db = new Database();
        int p = db.credential_check("select * from tb_employee where username = '"+txtUserName.getText()+"' and usertype in ('Admin','Manager')");
        if(p==1)
        {
            Pattern cancelOIDRegex = Pattern.compile("^[0-9]*$");
            Matcher cancelOIDMatacher = cancelOIDRegex.matcher(txtViewOrderCancelOrderID.getText());
            int oID = db.credential_check("select * from tb_dealerorder where status = 'pending' and DOID = "+txtViewOrderCancelOrderID.getText()+"");
            if(cancelOIDMatacher.matches()==false)
            {
                JOptionPane.showMessageDialog(this, "Order ID must contain only numbers","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(oID!=1)
            {
                JOptionPane.showMessageDialog(this, "This order not found else this order is canceled or placed","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int c = JOptionPane.showConfirmDialog(this, "Are you sure to Cancel this Dealer Order","Are you Sure !!!",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                if(c==0)
                {
                    DealerOrder o = new DealerOrder();
                    int i = o.updateOrderStatus(txtViewOrderCancelOrderID.getText(),"Canceled");
                    User u = new User();                        
                    u.recordUserOperation(txtUserName.getText(), "Order", "Cancel Order", "Order ID : "+txtViewOrderCancelOrderID.getText());
                    if(i==1)
                    {
                        txtViewOrderCancelOrderID.setText("");
                        viewAllDealerOrders();            
                    }
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You don't have privileges to access this menu","No Access",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnViewOrderCancelActionPerformed

    private void lblBtnSaleDealerOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSaleDealerOrderMouseClicked
        
        new SaleDealerOrder().setVisible(true);
    }//GEN-LAST:event_lblBtnSaleDealerOrderMouseClicked

    private void lblBtnViewSalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnViewSalesMouseClicked
        new ViewInvoice().setVisible(true);
    }//GEN-LAST:event_lblBtnViewSalesMouseClicked

    private void lblBtnManageReturnsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnManageReturnsMouseClicked
        new ManageReturns().setVisible(true);
    }//GEN-LAST:event_lblBtnManageReturnsMouseClicked

    private void lblBtnSaleCustomerOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSaleCustomerOrderMouseClicked
         new SaleCustomerOrder().setVisible(true);
    }//GEN-LAST:event_lblBtnSaleCustomerOrderMouseClicked

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnExitMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setBackground(Color.RED);
        lblLogout.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        lblLogout.setBackground(Color.lightGray);
        lblLogout.setForeground(Color.RED);
    }//GEN-LAST:event_lblLogoutMouseExited
       

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }
        
    private void btnDashboardDynamicSalesReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardDynamicSalesReportMouseClicked
        
        
        DynamicSalesReport f = new DynamicSalesReport();
        f.setVisible(true);
        f.setUserName(txtUserName.getText());

    }//GEN-LAST:event_btnDashboardDynamicSalesReportMouseClicked

    private void btnDashboardStockReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardStockReportMouseClicked
        StockReport f = new StockReport();
        f.setVisible(true);
        f.setusername(txtUserName.getText());
    }//GEN-LAST:event_btnDashboardStockReportMouseClicked

    private void btnDashboardUserReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardUserReportMouseClicked
        UserReport u = new UserReport();
        u.setVisible(true);
        u.setUsername(txtUserName.getText());
    }//GEN-LAST:event_btnDashboardUserReportMouseClicked

    private void btnDashboardDynamicSalesReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardDynamicSalesReportMouseEntered
        btnDashboardDynamicSalesReport.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnDashboardDynamicSalesReportMouseEntered

    private void btnDashboardDynamicSalesReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardDynamicSalesReportMouseExited
        btnDashboardDynamicSalesReport.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnDashboardDynamicSalesReportMouseExited

    private void btnDashboardStockReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardStockReportMouseEntered
        btnDashboardStockReport.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnDashboardStockReportMouseEntered

    private void btnDashboardStockReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardStockReportMouseExited
        btnDashboardStockReport.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnDashboardStockReportMouseExited

    private void btnDashboardUserReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardUserReportMouseEntered
         btnDashboardUserReport.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnDashboardUserReportMouseEntered

    private void btnDashboardUserReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardUserReportMouseExited
        btnDashboardUserReport.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnDashboardUserReportMouseExited

    private void txtUserEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserEmailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserEmailMouseClicked
    int time=1500;
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        setDashboardItems(time);
        time=time+(time+1500);
    }//GEN-LAST:event_formWindowActivated

    private void setDashboardItems(int time)
    {               
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();
        DefaultTableModel tmodel = (DefaultTableModel)tblDashboardItem.getModel();
        tmodel.setRowCount(0);
        Database db = new Database();
        ResultSet rs = db.selectData("select * from tb_item");
        ResultSet rs1 = db.selectData("select count(DOID) as dealerOrders from tb_dealerorder where status = 'Pending'");
        ResultSet rs2 = db.selectData("select sum(Amount) as totSale from tb_invoice where Date = '"+df.format(now)+"'");
        ResultSet rs3 = db.selectData("select sum(Amount) as cusReturnAmount from tb_customerreturn where Date = '"+df.format(now)+"'");
        ResultSet rs4 = db.selectData("select sum(Amount) as deaReturnAmount from tb_dealerreturn where Date = '"+df.format(now)+"'");
        ResultSet rs5 = db.selectData("SELECT COUNT(CusNIC) as noOfCusReturns FROM tb_customerreturn WHERE Date = '"+df.format(now)+"'");
        ResultSet rs6 = db.selectData("SELECT COUNT(DID) as noOfDeaReturn FROM tb_dealerorder WHERE Date = '"+df.format(now)+"'");
        double totCusReturn = 0.0;
        double totDeaReturn = 0.0;
        int noOfCusReturns = 0;
        int noOfDeaReturn = 0;
        DecimalFormat dec = new DecimalFormat("0.00");
        try {
            while(rs.next())
            {
                if(rs!=null)
                {
                    String iNo = String.valueOf(rs.getInt("INO"));
                    String iName = rs.getString("IName");
                    String qty = String.valueOf(rs.getInt("Qtyinhand"));
                    String price = String.valueOf(rs.getDouble("price"));
                    String rowData[] = {iNo,iName,qty,price};
                    tmodel.addRow(rowData);
                }                
            }
            while(rs1.next())
            {
                String totOrders = String.valueOf(rs1.getInt("dealerOrders"));
                txtTotalOrders1.setText("0"+totOrders);
            }
            while(rs2.next())
            {
                String totSale = String.valueOf(rs2.getDouble("totSale"));
                txtTotalSales1.setText(totSale);
            }
            while(rs3.next())
            {
                totCusReturn = rs3.getDouble("cusReturnAmount");
            }
            while(rs4.next())
            {
                totDeaReturn = rs4.getDouble("deaReturnAmount");
            }
            txtTotalProfit1.setText(dec.format((totCusReturn+totDeaReturn)));
            while(rs5.next())
            {
                noOfCusReturns = rs5.getInt("noOfCusReturns");
            }
            while(rs6.next())
            {
                noOfDeaReturn = rs6.getInt("noOfDeaReturn");
            }
            txtTotalReturns1.setText(""+(noOfCusReturns+noOfDeaReturn));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Dashboard Widgets Cannot load.\nTry to reopen the application","Error",JOptionPane.ERROR_MESSAGE);
            //new Login().setVisible(true);
            //this.dispose();
        } catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error Occured while loading Dashboard Widgets.\nTry to reopen the application","Error",JOptionPane.ERROR_MESSAGE);
            //new Login().setVisible(true);
            //this.dispose();
        }
        try
        {
            runClock();
        }
        catch(Exception e)
        {
            
        }
        
        tblDashboardItem.getColumnModel().getColumn(2).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (Integer.parseInt(table.getValueAt(row, 2).toString()) < 10) {
                    c.setBackground(Color.decode("#F93838"));
                    //////////////////
                    
                    String lowQuantityName="Low Quantities";
                    String lowQuantity="";
                    for(int i=0;i<tblDashboardItem.getRowCount();i++)
                    {
                        if(Integer.parseInt(tblDashboardItem.getValueAt(i, 2).toString())<10)
                        {
                            lowQuantityName = lowQuantityName+"-"+tblDashboardItem.getValueAt(i, 1).toString();
                            lowQuantity = lowQuantity+"- Remaning : "+tblDashboardItem.getValueAt(i, 2).toString();
                        }
                    }
                    String lowQuantityNameArray[] = lowQuantityName.split("-");
                    String lowQuantityArray[] = lowQuantity.split("-");
                    t1 = new Thread(){
                        @Override
                        public void run(){
                            while(true)
                            {
                                for(int n=0;n<lowQuantityNameArray.length;n++)
                                {
                                    jLabel2.setText("");
                                    try
                                    {
                                        jLabel2.setText(lowQuantityNameArray[n]+lowQuantityArray[n]);
                                        Thread.sleep(time);
                                    }
                                    catch(Exception ex)
                                    {

                                    }
                                }
                            }
                        }
                    };
                    t1.start();
        
                } else {
                    jLabel2.setText("");
                    c.setBackground(Color.decode("#FFFFFF"));
                }
                if(isSelected)
                {
                    c.setForeground(Color.decode("#000000"));
                }
                return c;
            }
        });
    }
    
    private static boolean clockSet = false;
    Thread t,t1;
    void runClock(){
        t = new Thread(){
            @Override
            public void run(){
                Date now = new Date();
                
                while(!clockSet)
                {
                    Calendar cal = Calendar.getInstance();
                    int hour = cal.get(Calendar.HOUR_OF_DAY);
                    int min = cal.get(Calendar.MINUTE);
                    int sec = cal.get(Calendar.SECOND);
                    int year = cal.get(Calendar.YEAR);
                    int mon = cal.get(Calendar.MONTH);
                    int day = cal.get(Calendar.DATE);
                    jLabel149.setText("Date : "+year+"-"+(mon+1)+"-"+day);
                    txtDashboardDate.setText(year+"-"+(mon+1)+"-"+day);
                    if(hour>12)
                    {
                        hour = hour-12;                        
                        if(sec<10)
                        {
                            txtDashboardTime.setText(hour+":"+min+":0"+sec+" pm");
                            jLabel150.setText("Time : "+hour+":"+min+":0"+sec+" pm");
                        }
                        else
                        {
                            txtDashboardTime.setText(hour+":"+min+":"+sec+" pm");
                            jLabel150.setText("Time : "+hour+":"+min+":"+sec+" pm");
                        }
                        
                        
                    }
                    else
                    {
                        if(sec<10)
                        {
                            txtDashboardTime.setText(hour+":"+min+":0"+sec+" am");
                            jLabel150.setText("Time : "+hour+":"+min+":0"+sec+" am");
                        }
                        else
                        {
                            txtDashboardTime.setText(hour+":"+min+":"+sec+" am");
                            jLabel150.setText("Time : "+hour+":"+min+":"+sec+" am");
                        }                       
                    }
                    try{
                        Thread.sleep(100);
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }
        }
                
        
        };
        t.start();
    }
    
    private void txtAddUserFullNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddUserFullNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddUserFullNameKeyReleased

    private void txtAddUserAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddUserAddressKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddUserAddressKeyReleased

    private void txtAddUserTelephoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddUserTelephoneKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddUserTelephoneKeyReleased

    private void txtAddUserEmailIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddUserEmailIDKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddUserEmailIDKeyReleased

    private void txtAddUserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddUserNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddUserNameKeyReleased

    private void txtAddUserPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddUserPasswordKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtAddUserPasswordKeyReleased

    private void txtAddUserRetypepasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddUserRetypepasswordKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddUserRetypepasswordKeyReleased

    private void txtModifyUserFullNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyUserFullNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyUserFullNameKeyReleased

    private void ModifyUserAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ModifyUserAddressKeyReleased

    }//GEN-LAST:event_ModifyUserAddressKeyReleased

    private void txtModifyUserTelephoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyUserTelephoneKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyUserTelephoneKeyReleased

    private void txtModifyUserEmailIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyUserEmailIDKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyUserEmailIDKeyReleased

    private void txtModifyUserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyUserNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyUserNameKeyReleased

    private void txtModifyUserPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyUserPasswordKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyUserPasswordKeyReleased

    private void txtModifyUserRetypepasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyUserRetypepasswordKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyUserRetypepasswordKeyReleased

    private void txtModifyUserSearchUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyUserSearchUsernameKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtModifyUserSearchUsernameKeyReleased

    private void txtViewUserSearchUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtViewUserSearchUsernameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViewUserSearchUsernameKeyReleased

    private void txtResetPasswordUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResetPasswordUsernameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResetPasswordUsernameKeyReleased

    private void cmbAddUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAddUserTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAddUserTypeActionPerformed

    private void txtDeleteUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeleteUsernameKeyReleased
        // TODO add your handling code here
        /*Database db = new Database();
        int i = db.credential_check("select*from tb_employee where UserName = "+txtDeleteUsername.getText()+"");
        if(!(i==1)){
            //JOptionPane.showMessageDialog(null,"Username is not acceptable!","Invaild Username", JOptionPane.ERROR_MESSAGE);
            btnDeleteUserDelete.setEnabled(false);
        }else{
            btnDeleteUserDelete.setEnabled(true);
        }*/
    }//GEN-LAST:event_txtDeleteUsernameKeyReleased

    private void txtDeleteUserEmailIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeleteUserEmailIDKeyReleased
        // TODO add your handling code here:
        /*Database db = new Database();
        int i = db.credential_check("select*from tb_employee where Email = "+txtDeleteUserEmailID.getText()+"");
        if(!(i==1)){
            //JOptionPane.showMessageDialog(null,"Email is not acceptable!","Invaild Email", JOptionPane.ERROR_MESSAGE);
            btnDeleteUserDelete.setEnabled(false);
        }*/
    }//GEN-LAST:event_txtDeleteUserEmailIDKeyReleased

    private void btnDeleteUserCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserCancelActionPerformed
        // TODO add your handling code here:
        txtDeleteUsername.setText("");
        txtDeleteUserEmailID.setText("");
    }//GEN-LAST:event_btnDeleteUserCancelActionPerformed

    private void txtPlaceOrderItemSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlaceOrderItemSearchKeyReleased
        // TODO add your handling code here:
        if(txtPlaceOrderItemSearch.getText().equals("")){
            btnPlaceOrderItemSearch.setEnabled(false);
        }else{
            btnPlaceOrderItemSearch.setEnabled(true);
        }
    }//GEN-LAST:event_txtPlaceOrderItemSearchKeyReleased

    private void txtPlaceOrderQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlaceOrderQtyKeyReleased
        // TODO add your handling code here:
        Pattern qty = Pattern.compile("^[0-9]*$");
        Matcher mqty = qty.matcher(txtPlaceOrderQty.getText());
        
        if(mqty.matches()==false){
            JOptionPane.showMessageDialog(this,"You must enter numbers only!","Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtPlaceOrderQtyKeyReleased

    private void txtPlaceOrderEnterItemIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlaceOrderEnterItemIdKeyReleased
        // TODO add your handling code here:
        Database db = new Database();
        int i = db.credential_check("select*from tb_item where INO = "+txtPlaceOrderEnterItemId.getText()+"");
        if(!(i==1)){
            JOptionPane.showMessageDialog(null,"Entered Data Not Found!","Not Found!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtPlaceOrderEnterItemIdKeyReleased

    private void txtPlaceOrderSPIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlaceOrderSPIDKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtPlaceOrderSPIDKeyReleased

    private void txtPlaceOrderDIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlaceOrderDIDKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtPlaceOrderDIDKeyReleased

    private void txtViewOrderSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtViewOrderSearchKeyReleased
        // TODO add your handling code here:
         if(txtViewOrderSearch.getText().isEmpty()){
            btnViewOrderSearch.setEnabled(false);
        }else{
            btnViewOrderSearch.setEnabled(true);
        }
    }//GEN-LAST:event_txtViewOrderSearchKeyReleased

    private void txtViewOrderCancelOrderIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtViewOrderCancelOrderIDKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViewOrderCancelOrderIDKeyReleased

    private void txtAddItemNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddItemNoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddItemNoKeyReleased

    private void txtAddItemNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddItemNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddItemNameKeyReleased

    private void txtAddItemPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddItemPriceKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddItemPriceKeyReleased

    private void txtAddItemQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddItemQuantityKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddItemQuantityKeyReleased

    private void txtAddItemDiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddItemDiscountKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddItemDiscountKeyReleased

    private void txtUpdateItemNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateItemNameKeyReleased
        // TODO add your handling code here:
        Pattern itemnreg = Pattern.compile("^[a-zA-Z]+$");
        Matcher m = itemnreg.matcher(txtAddItemName.getText());
        
        if(m.find()){
            JOptionPane.showMessageDialog(null,"You must enter letters only!","Wrong Input!", JOptionPane.ERROR_MESSAGE);
            btnAddItemSave.setEnabled(false);
        }
    }//GEN-LAST:event_txtUpdateItemNameKeyReleased

    private void txtUpdateItemPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateItemPriceKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateItemPriceKeyReleased

    private void txtUpdateItemQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateItemQuantityKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateItemQuantityKeyReleased

    private void txtUpdateItemDiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateItemDiscountKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateItemDiscountKeyReleased

    private void txtUpdateQuantityItemNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateQuantityItemNoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateQuantityItemNoKeyReleased

    private void txtUpdateQuantityExistKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateQuantityExistKeyReleased
        // TODO add your handling code here:
         Pattern itemaddqtyreg = Pattern.compile("^[0-9]*$");
        Matcher m = itemaddqtyreg.matcher(txtUpdateQuantityExist.getText());
        
        if(m.find()){
            JOptionPane.showMessageDialog(null,"You must enter numbers only!","Wrong Input!", JOptionPane.ERROR_MESSAGE);
            btnUpdateQuantitySave.setEnabled(false);
        }else{
            btnUpdateQuantitySave.setEnabled(true);
        }
    }//GEN-LAST:event_txtUpdateQuantityExistKeyReleased

    private void UpdateQuantityNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UpdateQuantityNewKeyReleased
        
    }//GEN-LAST:event_UpdateQuantityNewKeyReleased

    private void UpdateQuantityNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateQuantityNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateQuantityNewActionPerformed

    private void txtViewItemCategoryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtViewItemCategoryKeyReleased
        // TODO add your handling code here:
        if(txtViewItemCategory.getText().isEmpty()){
            btnViewItemSearch.setEnabled(false);
        }else{
            btnViewItemSearch.setEnabled(true);
        }
    }//GEN-LAST:event_txtViewItemCategoryKeyReleased

    private void txtUpdateSalespersonIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateSalespersonIDKeyReleased
        // TODO add your handling code here:
        if(txtUpdateSalespersonID.getText().isEmpty()){
            btnUpdateSalespersonIDSearch.setEnabled(false);
        }else{
            btnUpdateSalespersonIDSearch.setEnabled(true);
        }
    }//GEN-LAST:event_txtUpdateSalespersonIDKeyReleased

    private void txtUpdateSalespersonNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateSalespersonNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateSalespersonNameKeyReleased

    private void txtUpdateSalespersonAddressNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateSalespersonAddressNoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateSalespersonAddressNoKeyReleased

    private void txtUpdateSalespersonAddressLine1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateSalespersonAddressLine1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateSalespersonAddressLine1KeyReleased

    private void txtUpdateSalespersonAddressLine2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateSalespersonAddressLine2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateSalespersonAddressLine2KeyReleased

    private void txtUpdateSalespersonCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateSalespersonCityKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateSalespersonCityKeyReleased

    private void txtUpdateSalespersonTelephoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateSalespersonTelephoneKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateSalespersonTelephoneKeyReleased

    private void txtUpdateSalespersonEmailIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateSalespersonEmailIDKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateSalespersonEmailIDKeyReleased

    private void txtUpdateSalespersonSalaryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateSalespersonSalaryKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateSalespersonSalaryKeyReleased

    private void txtDeleteSalespersonIDSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeleteSalespersonIDSearchKeyReleased
        // TODO add your handling code here:
        if(txtDeleteSalespersonIDSearch.getText().isEmpty()){
            btnDeleteSalespersonIDSearch.setEnabled(false);
            btnDeleteSalespersonSave.setEnabled(false);
        }else{
             btnDeleteSalespersonIDSearch.setEnabled(true);
             btnDeleteSalespersonSave.setEnabled(true);
        }
    }//GEN-LAST:event_txtDeleteSalespersonIDSearchKeyReleased

    private void txtAddCustomerNICKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCustomerNICKeyReleased
        // TODO add your handling code here:        
    }//GEN-LAST:event_txtAddCustomerNICKeyReleased

    private void txtAddCustomerNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCustomerNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddCustomerNameKeyReleased

    private void txtAddCustomerAddressNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCustomerAddressNoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddCustomerAddressNoKeyReleased

    private void txtAddCustomerAddressLine1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCustomerAddressLine1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddCustomerAddressLine1KeyReleased

    private void txtAddCustomerAddressLine2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCustomerAddressLine2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddCustomerAddressLine2KeyReleased

    private void txtAddCustomerCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCustomerCityKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddCustomerCityKeyReleased

    private void txtAddCustomerTelephoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCustomerTelephoneKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddCustomerTelephoneKeyReleased

    private void txtAddCustomerEmailIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCustomerEmailIDKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddCustomerEmailIDKeyReleased

    private void txtModifyCustomerNICKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyCustomerNICKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyCustomerNICKeyReleased

    private void txtModifyCustomerNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyCustomerNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyCustomerNameKeyReleased

    private void txtModifyCustomerAddressNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyCustomerAddressNoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyCustomerAddressNoKeyReleased

    private void txtModifyCustomerAddressLine1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyCustomerAddressLine1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyCustomerAddressLine1KeyReleased

    private void txtModifyCustomerAddressLine2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyCustomerAddressLine2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyCustomerAddressLine2KeyReleased

    private void txtModifyCustomerCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyCustomerCityKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyCustomerCityKeyReleased

    private void txtModifyCustomerTelephoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyCustomerTelephoneKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyCustomerTelephoneKeyReleased

    private void txtModifyCustomerEmailIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyCustomerEmailIDKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyCustomerEmailIDKeyReleased

    private void txtDeleteCustomerNICSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeleteCustomerNICSearchKeyReleased
        // TODO add your handling code here:
        if(txtDeleteCustomerNICSearch.getText().isEmpty()){
            btnDeleteCustomerNICSearch.setEnabled(false);
        }else{
            btnDeleteCustomerNICSearch.setEnabled(true);
        }
    }//GEN-LAST:event_txtDeleteCustomerNICSearchKeyReleased

    private void txtViewCustomerSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtViewCustomerSearchKeyReleased
        // TODO add your handling code here:
        if(txtViewCustomerSearch.getText().isEmpty()){
            btnViewCustomerSearch.setEnabled(false);
        }else{
             btnViewCustomerSearch.setEnabled(true);
        }
    }//GEN-LAST:event_txtViewCustomerSearchKeyReleased

    private void txtAddDealerNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddDealerNameKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtAddDealerNameKeyReleased

    private void txtAddDealerAddressNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddDealerAddressNoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddDealerAddressNoKeyReleased

    private void txtAddDealerAddressLine1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddDealerAddressLine1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddDealerAddressLine1KeyReleased

    private void txtAddDealerAddressLine2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddDealerAddressLine2KeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtAddDealerAddressLine2KeyReleased

    private void txtAddDealerCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddDealerCityKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddDealerCityKeyReleased

    private void txtAddDealerTelephoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddDealerTelephoneKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddDealerTelephoneKeyReleased

    private void txtAddDealerEmailIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddDealerEmailIDKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddDealerEmailIDKeyReleased

    private void txtModifyDealerIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyDealerIDKeyReleased
        // TODO add your handling code here:
        if(txtModifyDealerID.getText().isEmpty()){
            btnModifyDealerIDSearch.setEnabled(false);
        }else{
            btnModifyDealerIDSearch.setEnabled(true);
        }
        
    }//GEN-LAST:event_txtModifyDealerIDKeyReleased

    private void txtModifyDealerNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyDealerNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyDealerNameKeyReleased

    private void txtModifyDealerAddressNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyDealerAddressNoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyDealerAddressNoKeyReleased

    private void txtModifyDealerAddressLine1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyDealerAddressLine1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyDealerAddressLine1KeyReleased

    private void txtModifyDealerAddressLine2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyDealerAddressLine2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyDealerAddressLine2KeyReleased

    private void txtModifyDealerCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyDealerCityKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyDealerCityKeyReleased

    private void txtModifyDealerTelephoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyDealerTelephoneKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyDealerTelephoneKeyReleased

    private void txtModifyDealerEmailIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyDealerEmailIDKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyDealerEmailIDKeyReleased

    private void txtDeleteDealerIDSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeleteDealerIDSearchKeyReleased
        // TODO add your handling code here:
        Database db = new Database();
        int i = db.credential_check("select * from tb_dealer where DID = "+txtDeleteDealerIDSearch.getText()+"");
        if(!(i==1)){
            btnDeleteDealerIDSearch.setEnabled(false);
            btnDeleteDealerDelete.setEnabled(false);
        }else{
            btnDeleteDealerIDSearch.setEnabled(true);
            btnDeleteDealerDelete.setEnabled(true);
        }
    }//GEN-LAST:event_txtDeleteDealerIDSearchKeyReleased

    private void txtViewDealerSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtViewDealerSearchKeyReleased
        // TODO add your handling code here:
        if(txtViewDealerSearch.getText().isEmpty()){
            btnViewDealerSearch.setEnabled(false);
        }else{
            btnViewDealerSearch.setEnabled(true);
        }
    }//GEN-LAST:event_txtViewDealerSearchKeyReleased

    private void txtModifyUserSearchUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifyUserSearchUsernameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyUserSearchUsernameKeyPressed

    private void txtViewSalespersonSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtViewSalespersonSearchKeyReleased
        // TODO add your handling code here:
        if(txtViewSalespersonSearch.getText().isEmpty()){
            btnViewSalespersonSearch.setEnabled(false);
        }else{
            btnViewSalespersonSearch.setEnabled(true);
        }
    }//GEN-LAST:event_txtViewSalespersonSearchKeyReleased

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        try
        {
            t.stop();
            t1.stop();
        }
        catch(Exception ex)
        {
            
        }
    }//GEN-LAST:event_formWindowClosed

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        // TODO add your handling code here:
        try
        {
            t.stop();
            t1.stop();
        }
        catch(Exception ex)
        {
        }
    }//GEN-LAST:event_formWindowDeactivated

    private void txtAddUserEmailIDInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtAddUserEmailIDInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddUserEmailIDInputMethodTextChanged

    private void txtUpdateSalespersonTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateSalespersonTelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateSalespersonTelephoneActionPerformed

    private void txtUpdateSalespersonEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateSalespersonEmailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateSalespersonEmailIDActionPerformed

    private void txtAddCustomerAddressLine2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddCustomerAddressLine2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddCustomerAddressLine2ActionPerformed

    private void txtModifyCustomerNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModifyCustomerNICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyCustomerNICActionPerformed

    private void btnDashboardStaticSalesReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardStaticSalesReportMouseClicked
        StaticSalesReportMenu f = new StaticSalesReportMenu();   
        f.getUserDetails(txtUserName.getText());
        f.setVisible(true);
        
        
    }//GEN-LAST:event_btnDashboardStaticSalesReportMouseClicked

    private void btnDashboardStaticSalesReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardStaticSalesReportMouseEntered
        btnDashboardStaticSalesReport.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnDashboardStaticSalesReportMouseEntered

    private void btnDashboardStaticSalesReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardStaticSalesReportMouseExited
        btnDashboardStaticSalesReport.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnDashboardStaticSalesReportMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    void AddSalespersonClear(){
        txtAddSalespersonID.setText(null);
        txtAddSalespersonName.setText(null);
        txtAddSalespersonAddressNo.setText(null);
        txtAddSalespersonAddressLine1.setText(null);
        txtAddSalespersonAddressLine2.setText(null);
        txtAddSalespersonCity.setText(null);
        txtAddSalespersonPhoto.setIcon(null);
        txtAddSalespersonTelephone.setText(null);
        txtAddSalespersonEmailID.setText(null);
        txtAddSalespersonSalary.setText(null);
    }
    private void btnAddSalespersonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSalespersonClearActionPerformed
        AddSalespersonClear();
    }//GEN-LAST:event_btnAddSalespersonClearActionPerformed

    private void lblBtnUserOperationUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnUserOperationUserMouseEntered
       
        
        lblBtnUserOperationUser.setBackground(Color.GRAY);
    }//GEN-LAST:event_lblBtnUserOperationUserMouseEntered

    private void lblBtnUserOperationUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnUserOperationUserMouseExited
        lblBtnUserOperationUser.setBackground(new Color (0,102,102));
    }//GEN-LAST:event_lblBtnUserOperationUserMouseExited

    private void lblBtnSaleDealerOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSaleDealerOrderMouseEntered
        lblBtnSaleDealerOrder.setBackground(Color.GRAY);
    }//GEN-LAST:event_lblBtnSaleDealerOrderMouseEntered

    private void lblBtnSaleDealerOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSaleDealerOrderMouseExited
        lblBtnSaleDealerOrder.setBackground(new Color (0,102,102));
    }//GEN-LAST:event_lblBtnSaleDealerOrderMouseExited

    private void lblBtnSaleCustomerOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSaleCustomerOrderMouseEntered
        lblBtnSaleCustomerOrder.setBackground(Color.GRAY);
    }//GEN-LAST:event_lblBtnSaleCustomerOrderMouseEntered

    private void lblBtnSaleCustomerOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSaleCustomerOrderMouseExited
        lblBtnSaleCustomerOrder.setBackground(new Color (0,102,102));
    }//GEN-LAST:event_lblBtnSaleCustomerOrderMouseExited

    private void lblBtnManageReturnsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnManageReturnsMouseEntered
        lblBtnManageReturns.setBackground(Color.GRAY);
    }//GEN-LAST:event_lblBtnManageReturnsMouseEntered

    private void lblBtnManageReturnsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnManageReturnsMouseExited
        lblBtnManageReturns.setBackground(new Color (0,102,102));
    }//GEN-LAST:event_lblBtnManageReturnsMouseExited

    private void lblBtnViewSalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnViewSalesMouseEntered
        lblBtnViewSales.setBackground(Color.GRAY);
    }//GEN-LAST:event_lblBtnViewSalesMouseEntered

    private void lblBtnViewSalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnViewSalesMouseExited
        lblBtnViewSales.setBackground(new Color (0,102,102));
    }//GEN-LAST:event_lblBtnViewSalesMouseExited

    private void btnResetUserPasswordResetCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetUserPasswordResetCancelActionPerformed
        txtResetPasswordUsername.setText("");
    }//GEN-LAST:event_btnResetUserPasswordResetCancelActionPerformed

    private void btnDashboardItemSalesReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardItemSalesReportMouseClicked
        ItemSalesReport f = new ItemSalesReport();
        f.setVisible(true);
    }//GEN-LAST:event_btnDashboardItemSalesReportMouseClicked

    private void btnDashboardItemSalesReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardItemSalesReportMouseEntered
        btnDashboardItemSalesReport.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnDashboardItemSalesReportMouseEntered

    private void btnDashboardItemSalesReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardItemSalesReportMouseExited
        btnDashboardItemSalesReport.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnDashboardItemSalesReportMouseExited

    private void UpdateQuantityAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateQuantityAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateQuantityAddActionPerformed

    private void UpdateQuantityAddKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UpdateQuantityAddKeyTyped
        // TODO add your handling code here:
        try {
                int oldqty=0;
                int newqty=0;
                if(!UpdateQuantityAdd.getText().equals(""))
                {
                    oldqty=Integer.parseInt(txtUpdateQuantityExist.getText());
                    newqty=Integer.parseInt(UpdateQuantityAdd.getText());
                    UpdateQuantityNew.setText(""+(oldqty+newqty));            
                }
                else{
                    UpdateQuantityNew.setText("");
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "You must enter integer numbers only!",
      "Error!", JOptionPane.ERROR_MESSAGE);
            UpdateQuantityAdd.setText("");
        }
    }//GEN-LAST:event_UpdateQuantityAddKeyTyped

    private void txtUpdateQuantityExistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateQuantityExistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateQuantityExistActionPerformed

    private void UpdateQuantityAddKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UpdateQuantityAddKeyReleased
        // TODO add your handling code here:
        try {
                int oldqty=0;
                int newqty=0;
                if(!UpdateQuantityAdd.getText().equals(""))
                {
                    oldqty=Integer.parseInt(txtUpdateQuantityExist.getText());
                    newqty=Integer.parseInt(UpdateQuantityAdd.getText());
                    UpdateQuantityNew.setText(""+(oldqty+newqty));              
                }
                else{
                    UpdateQuantityNew.setText("");
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "You must enter integer numbers only!",
      "Error!", JOptionPane.ERROR_MESSAGE);
            UpdateQuantityAdd.setText("");
        }
    }//GEN-LAST:event_UpdateQuantityAddKeyReleased

    private void UpdateQuantityAddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UpdateQuantityAddKeyPressed
        // TODO add your handling code here:
        try {
                int oldqty=0;
                int newqty=0;
                if(!UpdateQuantityAdd.getText().equals(""))
                {
                    oldqty=Integer.parseInt(txtUpdateQuantityExist.getText());
                    newqty=Integer.parseInt(UpdateQuantityAdd.getText());
                    UpdateQuantityNew.setText(""+(oldqty+newqty));             
                }
                else{
                    UpdateQuantityNew.setText("");
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "You must enter integer numbers only!",
      "Error!", JOptionPane.ERROR_MESSAGE);
            UpdateQuantityAdd.setText("");
        }
        
    }//GEN-LAST:event_UpdateQuantityAddKeyPressed

    private void loadOrderIDAndDate()
    {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
        LocalDateTime now = LocalDateTime.now();
        txtPlaceOrderDate.setText(df.format(now));

        
        Database db = new Database();
        ResultSet rs = null;
        
        
            
            rs = db.selectData("select max(DOID) as DOID from tb_dealerorder");
            try {
                while(rs.next())
                {
                    int oID = rs.getInt("DOID");
                    txtPlaceOrderNumber.setText(""+(oID+1));
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Order ID Cannot Load now Reopen and Try again","Error",JOptionPane.ERROR_MESSAGE);
            }
          
    }
    public void setuser(String username)
    {
        //
        Database db = new Database();
        ResultSet rs = db.selectData("select * from tb_employee where username = '"+username+"' ");
        
        try {
            while(rs.next())
            {
                String uName = rs.getString("username");
                String email = rs.getString("Email");
                String type = rs.getString("usertype");
                byte[] photo = rs.getBytes("Photo");
                
                txtUserName.setText(uName);
                txtUserEmail.setText(email);
                txtUserType.setText(type);
                ImageResizer ir = new ImageResizer();
                LblUserImage.setIcon(ir.ResizeImage(photo, LblUserImage));                
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "User details not loaded this will close now","Error",JOptionPane.ERROR_MESSAGE);
            new Dashboard().setVisible(false);
            this.dispose();
        }
        
        if(txtUserName.getText().equals("Name") || txtUserName.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "User details not loaded this will close now","Error",JOptionPane.ERROR_MESSAGE);
            
            this.dispose();
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JLabel LableDeleteUser;
    private javax.swing.JLabel LableResetUser;
    private javax.swing.JLabel LableViewUserContents;
    private javax.swing.JLabel LableViewUserDeatails;
    private javax.swing.JLabel LblUserImage;
    private javax.swing.JTextArea ModifyUserAddress;
    private javax.swing.JPanel PanelAddCustomer;
    private javax.swing.JPanel PanelAddCustomerContent;
    private javax.swing.JPanel PanelAddDealer;
    private javax.swing.JPanel PanelAddDealerContent;
    private javax.swing.JPanel PanelAddItemContent;
    private javax.swing.JPanel PanelAddSalesperson;
    private javax.swing.JPanel PanelAddUpdateDeleteSalesperson;
    private javax.swing.JPanel PanelAddUser;
    private javax.swing.JPanel PanelAddUserDetails;
    private javax.swing.JPanel PanelAddUserPersonalDetails;
    private javax.swing.JPanel PanelAddUserPhoto;
    private javax.swing.JPanel PanelControlCustomer;
    private javax.swing.JPanel PanelControlDealer;
    private javax.swing.JPanel PanelControlOrder;
    private javax.swing.JPanel PanelControlSale;
    private javax.swing.JPanel PanelControlUser;
    private javax.swing.JPanel PanelCustomer;
    private javax.swing.JPanel PanelDashboard;
    private javax.swing.JPanel PanelDashboardContent;
    private javax.swing.JPanel PanelDealer;
    private javax.swing.JPanel PanelDeleteCustomer;
    private javax.swing.JPanel PanelDeleteCustomerContent;
    private javax.swing.JPanel PanelDeleteDealer;
    private javax.swing.JPanel PanelDeleteDealerContent;
    private javax.swing.JPanel PanelDeleteSalesperson;
    private javax.swing.JPanel PanelDeleteUserContents;
    private javax.swing.JPanel PanelItem;
    private javax.swing.JPanel PanelItemDisplay;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelModifyCustomer;
    private javax.swing.JPanel PanelModifyCustomerContent;
    private javax.swing.JPanel PanelModifyDealer;
    private javax.swing.JPanel PanelModifyDealerContent;
    private javax.swing.JPanel PanelModifyUser;
    private javax.swing.JPanel PanelModifyUserDetails;
    private javax.swing.JPanel PanelModifyUserPersonalDetails;
    private javax.swing.JPanel PanelModifyUserPhoto;
    private javax.swing.JPanel PanelOrder;
    private javax.swing.JPanel PanelOrder3;
    private javax.swing.JPanel PanelOrder4;
    private javax.swing.JPanel PanelPlaceOrder;
    private javax.swing.JPanel PanelPlaceOrderSDContent;
    private javax.swing.JPanel PanelResetPassword;
    private javax.swing.JPanel PanelSale;
    private javax.swing.JPanel PanelSalesperson;
    private javax.swing.JPanel PanelTotalOrders;
    private javax.swing.JPanel PanelTotalProfit;
    private javax.swing.JPanel PanelTotalReturns;
    private javax.swing.JPanel PanelTotalSales;
    private javax.swing.JPanel PanelUpdateItemContent;
    private javax.swing.JPanel PanelUpdateQuantityItemContent;
    private javax.swing.JPanel PanelUpdateSalesperson;
    private javax.swing.JPanel PanelUser;
    private javax.swing.JPanel PanelUserOperation;
    private javax.swing.JPanel PanelViewCustomer;
    private javax.swing.JPanel PanelViewCustomerContent;
    private javax.swing.JPanel PanelViewDealer;
    private javax.swing.JPanel PanelViewDealerContent;
    private javax.swing.JPanel PanelViewOrder;
    private javax.swing.JPanel PanelViewOrderCancelContent;
    private javax.swing.JPanel PanelViewSalespersonDetailsContent;
    private javax.swing.JPanel PanelViewUser;
    private javax.swing.JPanel PanelresetUserContents;
    private javax.swing.JPanel PanelviewUserContents;
    private javax.swing.JPanel PlaceOrderContent1;
    private javax.swing.JPanel PlaceOrderContent2;
    private javax.swing.JTable TablePlaceOrderViewAmount;
    private javax.swing.JTable TablePlaceOrderViewItem;
    private javax.swing.JTable TblViewCustomer;
    private javax.swing.JTable TblViewDealer;
    private javax.swing.JTable TblViewSalespersons;
    private javax.swing.JTextField UpdateQuantityAdd;
    private javax.swing.JTextField UpdateQuantityNew;
    private javax.swing.JPanel btnAddCustomer;
    private javax.swing.JButton btnAddCustomerClear;
    private javax.swing.JButton btnAddCustomerSave;
    private javax.swing.JPanel btnAddDealer;
    private javax.swing.JButton btnAddDealerClear;
    private javax.swing.JButton btnAddDealerSave;
    private javax.swing.JButton btnAddItemSave;
    private javax.swing.JLabel btnAddSalesperson;
    private javax.swing.JButton btnAddSalespersonClear;
    private javax.swing.JButton btnAddSalespersonPhoto;
    private javax.swing.JButton btnAddSalespersonSave;
    private javax.swing.JPanel btnAddUser;
    private javax.swing.JButton btnAddUserCancel;
    private javax.swing.JButton btnAddUserPhoto;
    private javax.swing.JButton btnAddUserSave;
    private javax.swing.JLabel btnDashboardDynamicSalesReport;
    private javax.swing.JLabel btnDashboardItemSalesReport;
    private javax.swing.JLabel btnDashboardStaticSalesReport;
    private javax.swing.JLabel btnDashboardStockReport;
    private javax.swing.JLabel btnDashboardUserReport;
    private javax.swing.JButton btnDeleteCustomerClear;
    private javax.swing.JButton btnDeleteCustomerDelete;
    private javax.swing.JButton btnDeleteCustomerNICSearch;
    private javax.swing.JButton btnDeleteDealerClear;
    private javax.swing.JButton btnDeleteDealerDelete;
    private javax.swing.JButton btnDeleteDealerIDSearch;
    private javax.swing.JLabel btnDeleteSalesperson;
    private javax.swing.JButton btnDeleteSalespersonClear;
    private javax.swing.JButton btnDeleteSalespersonIDSearch;
    private javax.swing.JButton btnDeleteSalespersonSave;
    private javax.swing.JPanel btnDeleteUser;
    private javax.swing.JButton btnDeleteUserCancel;
    private javax.swing.JButton btnDeleteUserDelete;
    private javax.swing.JLabel btnExit;
    private javax.swing.JPanel btnManageReturns;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JPanel btnModifyCustomer;
    private javax.swing.JButton btnModifyCustomerClear;
    private javax.swing.JButton btnModifyCustomerNICSearch;
    private javax.swing.JButton btnModifyCustomerSave;
    private javax.swing.JPanel btnModifyDealer;
    private javax.swing.JButton btnModifyDealerClear;
    private javax.swing.JButton btnModifyDealerIDSearch;
    private javax.swing.JButton btnModifyDealerSave;
    private javax.swing.JPanel btnModifyUser;
    private javax.swing.JButton btnModifyUserCancel;
    private javax.swing.JButton btnModifyUserPhoto;
    private javax.swing.JButton btnModifyUserSave;
    private javax.swing.JButton btnModifyUserSearchUsername;
    private javax.swing.JPanel btnOrder3;
    private javax.swing.JPanel btnOrder4;
    private javax.swing.JPanel btnPlaceOrder;
    private javax.swing.JButton btnPlaceOrderClear;
    private javax.swing.JButton btnPlaceOrderItemSearch;
    private javax.swing.JButton btnPlaceOrderItemSearchClear;
    private javax.swing.JButton btnPlaceOrderItemSearchViewall;
    private javax.swing.JButton btnPlaceOrderPlace;
    private javax.swing.JPanel btnResetPasswordUser;
    private javax.swing.JButton btnResetUserPasswordReset;
    private javax.swing.JButton btnResetUserPasswordResetCancel;
    private javax.swing.JPanel btnSaleCustomerOrder;
    private javax.swing.JPanel btnSaleDealerOrder;
    private javax.swing.JButton btnUpdateItemSave;
    private javax.swing.JButton btnUpdateQuantityCancel;
    private javax.swing.JButton btnUpdateQuantityItemNoSearch;
    private javax.swing.JButton btnUpdateQuantitySave;
    private javax.swing.JLabel btnUpdateSalesperson;
    private javax.swing.JButton btnUpdateSalespersonClear;
    private javax.swing.JButton btnUpdateSalespersonIDSearch;
    private javax.swing.JButton btnUpdateSalespersonPhoto;
    private javax.swing.JButton btnUpdateSalespersonSave;
    private javax.swing.JPanel btnUserOperation;
    private javax.swing.JPanel btnViewCustomer;
    private javax.swing.JButton btnViewCustomerAll;
    private javax.swing.JButton btnViewCustomerClear;
    private javax.swing.JButton btnViewCustomerSearch;
    private javax.swing.JPanel btnViewDealer;
    private javax.swing.JButton btnViewDealerAll;
    private javax.swing.JButton btnViewDealerClear;
    private javax.swing.JButton btnViewDealerSearch;
    private javax.swing.JButton btnViewGoodsReceiveNote;
    private javax.swing.JButton btnViewItemAll;
    private javax.swing.JButton btnViewItemClear;
    private javax.swing.JButton btnViewItemSearch;
    private javax.swing.JPanel btnViewOrder;
    private javax.swing.JButton btnViewOrderCancel;
    private javax.swing.JButton btnViewOrderSearch;
    private javax.swing.JButton btnViewOrderSearchAll;
    private javax.swing.JButton btnViewOrderSearchClear;
    private javax.swing.JPanel btnViewSales;
    private javax.swing.JButton btnViewSalespersonClear;
    private javax.swing.JButton btnViewSalespersonSearch;
    private javax.swing.JButton btnViewSalespersonViewAll;
    private javax.swing.JPanel btnViewUser;
    private javax.swing.JButton btnViewUserSearch;
    private javax.swing.JComboBox<String> cmbAddUserType;
    private javax.swing.JComboBox<String> cmbPlaceOrderItemSearch;
    private javax.swing.JComboBox<String> cmbViewCustomerSearch;
    private javax.swing.JComboBox<String> cmbViewDealerSearch;
    private javax.swing.JComboBox<String> cmbViewItemCategory;
    private javax.swing.JComboBox<String> cmbViewOrderSearch;
    private javax.swing.JComboBox<String> cmbViewSalespersonSearch;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblBtnAddCustomer;
    private javax.swing.JLabel lblBtnAddDealer;
    private javax.swing.JLabel lblBtnAddUser;
    private javax.swing.JLabel lblBtnDeleteUser;
    private javax.swing.JLabel lblBtnManageReturns;
    private javax.swing.JLabel lblBtnModifyCustomer;
    private javax.swing.JLabel lblBtnModifyDealer;
    private javax.swing.JLabel lblBtnModifyUser;
    private javax.swing.JLabel lblBtnOrder3;
    private javax.swing.JLabel lblBtnOrder4;
    private javax.swing.JLabel lblBtnPlaceOrder;
    private javax.swing.JLabel lblBtnResetPasswordUser;
    private javax.swing.JLabel lblBtnSaleCustomerOrder;
    private javax.swing.JLabel lblBtnSaleDealerOrder;
    private javax.swing.JLabel lblBtnUserOperationUser;
    private javax.swing.JLabel lblBtnViewCustomer;
    private javax.swing.JLabel lblBtnViewDealer;
    private javax.swing.JLabel lblBtnViewOrder;
    private javax.swing.JLabel lblBtnViewSales;
    private javax.swing.JLabel lblBtnViewUser;
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblDealer;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblOrders;
    private javax.swing.JLabel lblSales;
    private javax.swing.JLabel lblSalesperson;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel panelDeleteUser;
    private javax.swing.JPanel panelReportMenu;
    private javax.swing.JTable tableViewOrder;
    private javax.swing.JTable tableViewOrderItem;
    private javax.swing.JTable tblDashboardItem;
    private javax.swing.JTable tblViewItem;
    private javax.swing.JTable tblViewUser;
    private javax.swing.JTextField txtAddCustomerAddressLine1;
    private javax.swing.JTextField txtAddCustomerAddressLine2;
    private javax.swing.JTextField txtAddCustomerAddressNo;
    private javax.swing.JTextField txtAddCustomerCity;
    private javax.swing.JTextField txtAddCustomerEmailID;
    private javax.swing.JTextField txtAddCustomerNIC;
    private javax.swing.JTextField txtAddCustomerName;
    private javax.swing.JTextField txtAddCustomerTelephone;
    private javax.swing.JTextField txtAddDealerAddressLine1;
    private javax.swing.JTextField txtAddDealerAddressLine2;
    private javax.swing.JTextField txtAddDealerAddressNo;
    private javax.swing.JTextField txtAddDealerCity;
    private javax.swing.JTextField txtAddDealerEmailID;
    private javax.swing.JTextField txtAddDealerID;
    private javax.swing.JTextField txtAddDealerName;
    private javax.swing.JTextField txtAddDealerTelephone;
    private javax.swing.JButton txtAddItemCancel;
    private javax.swing.JTextField txtAddItemDiscount;
    private javax.swing.JTextField txtAddItemName;
    private javax.swing.JTextField txtAddItemNo;
    private javax.swing.JTextField txtAddItemPrice;
    private javax.swing.JTextField txtAddItemQuantity;
    private javax.swing.JTextField txtAddSalespersonAddressLine1;
    private javax.swing.JTextField txtAddSalespersonAddressLine2;
    private javax.swing.JTextField txtAddSalespersonAddressNo;
    private javax.swing.JTextField txtAddSalespersonCity;
    private javax.swing.JTextField txtAddSalespersonEmailID;
    private javax.swing.JTextField txtAddSalespersonID;
    private javax.swing.JTextField txtAddSalespersonName;
    private javax.swing.JLabel txtAddSalespersonPhoto;
    private javax.swing.JTextField txtAddSalespersonSalary;
    private javax.swing.JTextField txtAddSalespersonTelephone;
    private javax.swing.JTextArea txtAddUserAddress;
    private javax.swing.JTextField txtAddUserEmailID;
    private javax.swing.JTextField txtAddUserFullName;
    private javax.swing.JTextField txtAddUserName;
    private javax.swing.JPasswordField txtAddUserPassword;
    private javax.swing.JLabel txtAddUserPhoto;
    private javax.swing.JPasswordField txtAddUserRetypepassword;
    private javax.swing.JTextField txtAddUserTelephone;
    private javax.swing.JLabel txtDashboardDate;
    private javax.swing.JLabel txtDashboardTime;
    private javax.swing.JLabel txtDeleteCustomerAccountType;
    private javax.swing.JLabel txtDeleteCustomerAddressLine1;
    private javax.swing.JLabel txtDeleteCustomerAddressLine2;
    private javax.swing.JLabel txtDeleteCustomerAddressNo;
    private javax.swing.JLabel txtDeleteCustomerCity;
    private javax.swing.JLabel txtDeleteCustomerEmailID;
    private javax.swing.JTextField txtDeleteCustomerNICSearch;
    private javax.swing.JLabel txtDeleteCustomerName;
    private javax.swing.JLabel txtDeleteCustomerPhoto;
    private javax.swing.JLabel txtDeleteCustomerTelephone;
    private javax.swing.JLabel txtDeleteDealerAddressLine1;
    private javax.swing.JLabel txtDeleteDealerAddressLine2;
    private javax.swing.JLabel txtDeleteDealerAddressNo;
    private javax.swing.JLabel txtDeleteDealerCity;
    private javax.swing.JLabel txtDeleteDealerEmailID;
    private javax.swing.JTextField txtDeleteDealerIDSearch;
    private javax.swing.JLabel txtDeleteDealerName;
    private javax.swing.JLabel txtDeleteDealerTelephone;
    private javax.swing.JLabel txtDeleteSalespersonAddressLine1;
    private javax.swing.JLabel txtDeleteSalespersonAddressLine2;
    private javax.swing.JLabel txtDeleteSalespersonAddressNo;
    private javax.swing.JLabel txtDeleteSalespersonCity;
    private javax.swing.JLabel txtDeleteSalespersonEmailID;
    private javax.swing.JTextField txtDeleteSalespersonIDSearch;
    private javax.swing.JLabel txtDeleteSalespersonName;
    private javax.swing.JLabel txtDeleteSalespersonPhoto;
    private javax.swing.JLabel txtDeleteSalespersonSalary;
    private javax.swing.JLabel txtDeleteSalespersonTelephone;
    private javax.swing.JTextField txtDeleteUserEmailID;
    private javax.swing.JTextField txtDeleteUsername;
    private javax.swing.JTextField txtModifyCustomerAddressLine1;
    private javax.swing.JTextField txtModifyCustomerAddressLine2;
    private javax.swing.JTextField txtModifyCustomerAddressNo;
    private javax.swing.JTextField txtModifyCustomerCity;
    private javax.swing.JTextField txtModifyCustomerEmailID;
    private javax.swing.JTextField txtModifyCustomerNIC;
    private javax.swing.JTextField txtModifyCustomerName;
    private javax.swing.JTextField txtModifyCustomerTelephone;
    private javax.swing.JTextField txtModifyDealerAddressLine1;
    private javax.swing.JTextField txtModifyDealerAddressLine2;
    private javax.swing.JTextField txtModifyDealerAddressNo;
    private javax.swing.JTextField txtModifyDealerCity;
    private javax.swing.JTextField txtModifyDealerEmailID;
    private javax.swing.JTextField txtModifyDealerID;
    private javax.swing.JTextField txtModifyDealerName;
    private javax.swing.JTextField txtModifyDealerTelephone;
    private javax.swing.JTextField txtModifyUserEmailID;
    private javax.swing.JTextField txtModifyUserFullName;
    private javax.swing.JTextField txtModifyUserName;
    private javax.swing.JPasswordField txtModifyUserPassword;
    private javax.swing.JLabel txtModifyUserPhoto;
    private javax.swing.JPasswordField txtModifyUserRetypepassword;
    private javax.swing.JTextField txtModifyUserSearchUsername;
    private javax.swing.JTextField txtModifyUserTelephone;
    private javax.swing.JTextField txtModifyUserType;
    private javax.swing.JButton txtPlaceOrderAdd;
    private javax.swing.JTextField txtPlaceOrderDID;
    private javax.swing.JFormattedTextField txtPlaceOrderDate;
    private javax.swing.JTextField txtPlaceOrderEnterItemId;
    private javax.swing.JButton txtPlaceOrderItemIDClear;
    private javax.swing.JTextField txtPlaceOrderItemSearch;
    private javax.swing.JTextField txtPlaceOrderNumber;
    private javax.swing.JTextField txtPlaceOrderQty;
    private javax.swing.JLabel txtPlaceOrderQtyInHand;
    private javax.swing.JTextField txtPlaceOrderSPID;
    private javax.swing.JTextField txtResetPasswordUsername;
    private javax.swing.JLabel txtTotalOrders1;
    private javax.swing.JLabel txtTotalProfit1;
    private javax.swing.JLabel txtTotalReturns1;
    private javax.swing.JLabel txtTotalSales1;
    private javax.swing.JButton txtUpdateItemCancel;
    private javax.swing.JTextField txtUpdateItemDiscount;
    private javax.swing.JTextField txtUpdateItemName;
    private javax.swing.JTextField txtUpdateItemNo;
    private javax.swing.JTextField txtUpdateItemPrice;
    private javax.swing.JTextField txtUpdateItemQuantity;
    private javax.swing.JTextField txtUpdateQuantityExist;
    private javax.swing.JTextField txtUpdateQuantityItemNo;
    private javax.swing.JTextField txtUpdateSalespersonAddressLine1;
    private javax.swing.JTextField txtUpdateSalespersonAddressLine2;
    private javax.swing.JTextField txtUpdateSalespersonAddressNo;
    private javax.swing.JTextField txtUpdateSalespersonCity;
    private javax.swing.JTextField txtUpdateSalespersonEmailID;
    private javax.swing.JTextField txtUpdateSalespersonID;
    private javax.swing.JTextField txtUpdateSalespersonName;
    private javax.swing.JLabel txtUpdateSalespersonPhoto;
    private javax.swing.JTextField txtUpdateSalespersonSalary;
    private javax.swing.JTextField txtUpdateSalespersonTelephone;
    private javax.swing.JLabel txtUserEmail;
    private javax.swing.JLabel txtUserName;
    private javax.swing.JLabel txtUserType;
    private javax.swing.JLabel txtViewCustomerAddressLine1;
    private javax.swing.JLabel txtViewCustomerAddressLine2;
    private javax.swing.JLabel txtViewCustomerAddressNo;
    private javax.swing.JLabel txtViewCustomerCity;
    private javax.swing.JLabel txtViewCustomerEmailID;
    private javax.swing.JLabel txtViewCustomerNIC;
    private javax.swing.JLabel txtViewCustomerName;
    private javax.swing.JTextField txtViewCustomerSearch;
    private javax.swing.JLabel txtViewCustomerTelephone;
    private javax.swing.JLabel txtViewCustomerTotalSale;
    private javax.swing.JLabel txtViewDealerAddressLine1;
    private javax.swing.JLabel txtViewDealerAddressLine2;
    private javax.swing.JLabel txtViewDealerAddressNo;
    private javax.swing.JLabel txtViewDealerCity;
    private javax.swing.JLabel txtViewDealerEmailID;
    private javax.swing.JLabel txtViewDealerID;
    private javax.swing.JLabel txtViewDealerName;
    private javax.swing.JTextField txtViewDealerSearch;
    private javax.swing.JLabel txtViewDealerTelephone;
    private javax.swing.JTextField txtViewItemCategory;
    private javax.swing.JButton txtViewOrderCancelClear;
    private javax.swing.JTextField txtViewOrderCancelOrderID;
    private javax.swing.JTextField txtViewOrderSearch;
    private javax.swing.JLabel txtViewSalespersonAddressLine1;
    private javax.swing.JLabel txtViewSalespersonAddressLine2;
    private javax.swing.JLabel txtViewSalespersonAddressNo;
    private javax.swing.JLabel txtViewSalespersonCity;
    private javax.swing.JLabel txtViewSalespersonEmailID;
    private javax.swing.JLabel txtViewSalespersonID;
    private javax.swing.JLabel txtViewSalespersonName;
    private javax.swing.JLabel txtViewSalespersonPhoto;
    private javax.swing.JLabel txtViewSalespersonSalary;
    private javax.swing.JTextField txtViewSalespersonSearch;
    private javax.swing.JLabel txtViewSalespersonTelephone;
    private javax.swing.JLabel txtViewTelephone;
    private javax.swing.JLabel txtViewUserAddress;
    private javax.swing.JLabel txtViewUserEmailID;
    private javax.swing.JLabel txtViewUserFullname;
    private javax.swing.JLabel txtViewUserPhoto;
    private javax.swing.JTextField txtViewUserSearchUsername;
    private javax.swing.JLabel txtViewUserType;
    private javax.swing.JLabel txtViewUsername;
    // End of variables declaration//GEN-END:variables
}

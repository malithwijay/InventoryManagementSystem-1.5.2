/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Database;
import java.sql.ResultSet;

/**
 *
 * @author navod
 */
public class StockAdjustment {
    public ResultSet viewStockAdjustment(String ino)
    {
        ResultSet rs = null;
        Database db = new Database();
        rs = db.selectData("SELECT * FROM tb_stockadjustment WHERE ItemNo ="+ino+"");
        return rs;
    }
    public ResultSet viewStockAdjustment(String ino,String filter,String searchString)
    {
        ResultSet rs = null;
        Database db = new Database();
        rs = db.selectData("SELECT * FROM tb_stockadjustment WHERE ItemNo ="+ino+" and "+filter+" LIKE '%"+searchString+"%'");
        return rs;
    }
}

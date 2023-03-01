/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author navod
 */
public class ImageResizer {
    public ImageIcon ResizeImage(byte[] imageToResize)
    {
        ImageIcon MyImage = new ImageIcon(imageToResize);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    public ImageIcon ResizeImage(String ImagePath,JLabel label)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    public ImageIcon ResizeImage(byte[] imageToResize,JLabel label)
    {
        ImageIcon MyImage = new ImageIcon(imageToResize);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
}

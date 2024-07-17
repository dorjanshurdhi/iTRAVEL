package com.cindytech.itravel.main;


import java.awt.Color;
import java.util.Random;

import javax.swing.UIManager;

import com.cindytech.itravel.controller.MainController;
import com.cindytech.itravel.view.Login;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class Main {

	public static void main(String[] args) {
        
		SplashScreen screen = new SplashScreen();
        MainController controller = new MainController();
        screen.setVisible(true);
        Random rand = new Random();
		int n = rand.nextInt(25);
		n += 5;
        try {
            for (int row = 0; row <=100; row++) {
                Thread.sleep(n);
                screen.loadingNumber.setText(Integer.toString(row)+"%");
                screen.loadingProgress.setValue(row);
                if (row == 10) {
                	screen.lComment.setText(" Aplikacioni po karikohet...");
                }
                if (row == 30) {
                	screen.lComment.setText(" Po krijohet lidhja me database-in...");
                }
                if (row == 60) {
                	screen.lComment.setText(" Database u karikua me sukses!");
                }
                if (row == 70) {
                	screen.lComment.setText(" Po karikohet skermata e Login...");
                }
                if (row == 90) {
                	screen.lComment.setText(" Gati per Login...Success!");
                }
                if (row == 100) {
                    
                	screen.dispose();
                	
                	try {
            			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            				if ("Nimbus".equals(info.getName())) {
            					//javax.swing.UIManager.setLookAndFeel(info.getClassName());
            					javax.swing.UIManager.setLookAndFeel( new FlatMacLightLaf());
            			        UIManager.put("TabbedPane.selectedBackground", new Color(0, 122, 255));
            			        UIManager.put("TabbedPane.selectedForeground", Color.WHITE);
            			        UIManager.put("TabbedPane.background", Color.WHITE);
            			        UIManager.put("TabbedPane.hoverColor", new Color(0, 122, 255));
            			        UIManager.put("TabbedPane.focusColor", new Color(0, 122, 255));
            			        UIManager.put("TabbedPane.contentAreaColor", Color.WHITE);
            			        UIManager.put("TabbedPane.tabAreaBackground", Color.WHITE);
            					break;         				 
            				}
            			}
            		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            		}

            		/* Create and display the form */
            		java.awt.EventQueue.invokeLater(new Runnable() {
            			public void run() {
            				//new Login().setVisible(true);
            				controller.checkFirstLogin();            			
            			}
            		});
                }
            }
        } catch (Exception e) {
        }
    }

}
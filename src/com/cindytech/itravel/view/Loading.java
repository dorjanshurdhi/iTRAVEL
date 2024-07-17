package com.cindytech.itravel.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class Loading extends JFrame {

	private static final long serialVersionUID = -7170477213960257167L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loading frame = new Loading();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Loading() {
		setType(Type.UTILITY);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Loading.class.getResource("/icon/splashscreen/loading_frame.png")));
		setUndecorated(true);
		setAlwaysOnTop(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 150, 150);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		getContentPane().setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Loading.class.getResource("/icon/splashscreen/load-splash.gif")));
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
		
	}

}

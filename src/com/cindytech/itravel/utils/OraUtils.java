package com.cindytech.itravel.utils;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.Timer;

public class OraUtils {

	public OraUtils () {};
	
	
	public void showDate(JLabel lDate) {
		new Timer(0, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Date d = new Date();
				//d.setHours(d.getHours() + 8);
				SimpleDateFormat s = new SimpleDateFormat("dd/MM/YYYY");

				//Aggiungo l'ora ai frame
				lDate.setText(s.format(d));
			}
		}
				).start();
	}
	
	public void showTime(JLabel lOra) {
		new Timer(0, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Date d = new Date();
				SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");

				//Aggiungo l'ora ai frame
				lOra.setText(s.format(d));
			}
		}
				).start();
	}
	
	public void showDateTime(JLabel lData) {
		new Timer(0, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Date d = new Date();
				SimpleDateFormat s = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");

				//Aggiungo la data ai frame
				lData.setText(s.format(d));
			}
		}
				).start();
	}
	
	public void showTimeBoard(JLabel lDate) {
		new Timer(0, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Date d = new Date();
				SimpleDateFormat s = new SimpleDateFormat("EEEE, d MMMM y  HH:mm:ss", new Locale("sq"));
				//Aggiungo la data ai frame
				lDate.setText(s.format(d));
			}
		}
				).start();
	}


}

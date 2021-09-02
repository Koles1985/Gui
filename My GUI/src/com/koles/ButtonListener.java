package com.koles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonListener implements ActionListener {

	JButton b;
	public ButtonListener(JButton b) {
		this.b = b;
	}
	protected void setButton(JButton b) {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());
		b.setText("Fuck you too!");
		
	}

}

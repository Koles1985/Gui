package com.koles;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyDrawPanel extends JPanel{
	public void paintComponent(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(100, 100, 50, 60);
		Graphics2D g2d = (Graphics2D)g;
	}
	
}

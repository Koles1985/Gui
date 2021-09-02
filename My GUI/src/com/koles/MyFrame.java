package com.koles;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame {

	
	private JFrame jframe = new JFrame();
	private JButton click = new JButton("Fuck You");
	
	protected void createFrame() {
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		click.addActionListener(new ButtonListener(click));
		jframe.getContentPane().add(click);
		jframe.getContentPane().add(new MyDrawPanel());
		jframe.setSize(300,300);
		jframe.setVisible(true);
	}
}

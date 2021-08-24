package de.tk.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Start extends JFrame{

	public Start() {
		setTitle("Hallo Hamburg");
		
		getContentPane().setLayout(new GridLayout(2, 5));
		
		for (int i = 0; i < 9; i++) {
			JButton bt=new JButton("Hamburg");
			getContentPane().add(bt);
		}
		JButton bt=new JButton("Berlin");
		getContentPane().add(bt);
		
		bt.addActionListener((evt)->{
			JOptionPane.showConfirmDialog(this, "Hallo Berlin");
		});
		bt.addMouseListener(new MouseAdapter() {
			Color old;
			@Override
			public void mouseEntered(MouseEvent e) {
				old=bt.getBackground();
				bt.setBackground(new Color(255,0,0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				bt.setBackground(old);
			}
		});
		
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Start();
	}

}

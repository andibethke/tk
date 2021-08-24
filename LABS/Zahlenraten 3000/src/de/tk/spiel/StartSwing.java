package de.tk.spiel;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StartSwing extends JFrame{
	
	JTextField txZahl=new JTextField(20);
	JButton btOk=new JButton("OK");
	JLabel lbBild=new JLabel();
	JLabel lbInfo=new JLabel("Digga...");
	
	DasSpiel spiel=new DasSpiel();

	public StartSwing() {
		getContentPane().setLayout(new BorderLayout());
		
		JPanel pNorth=new JPanel();
		pNorth.add(txZahl);
		pNorth.add(btOk);
		
		getContentPane().add("North", pNorth);
		getContentPane().add(lbBild);
		getContentPane().add("South", lbInfo);
		
		btOk.addActionListener((x)->eingabe());
		
		setSize(400,400);
		setVisible(true);
	}
	
	protected void eingabe() {
		spiel.eingabe(Integer.parseInt(txZahl.getText()));
		if (spiel.isEnde()) {
			lbBild.setIcon(new ImageIcon("c:/temp/tk/images/success.png"));
		}
		else if (spiel.isKleiner()) {
			lbBild.setIcon(new ImageIcon("c:/temp/tk/images/down.png"));
		}
		else {
			lbBild.setIcon(new ImageIcon("c:/temp/tk/images/up.png"));
		}
		lbInfo.setText(spiel.getVersuche()+". Versuch, Alter!");
		
	}
	
	public static void main(String[] args) {
		new StartSwing();
	}

}

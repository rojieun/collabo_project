package project;

import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DB {
	
	public void image(JLabel[] lbl,JPanel main_panel,int sum) {
		
		try {
				lbl = new JLabel[sum];
				for(int i=0; i<lbl.length;i++) {
					lbl[i]=new JLabel("No image");
					int width = lbl[i].getWidth(); 
					int height = lbl[i].getHeight();
					lbl[i].setSize(width, height);
					main_panel.add(lbl[i],main_panel.CENTER_ALIGNMENT);
				}	
				
	} catch(NullPointerException e) {
		e.getMessage();
		}	
	}
}

package edu.wit.comp2000.group36.train.visual;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.plaf.PanelUI;

public class InfoUI extends PanelUI {
	
	public void paint(Graphics g, JComponent c) {
		Graphics2D g2d = (Graphics2D) g;
		
		int width = c.getWidth();
		int height = c.getHeight();
		
		g2d.setColor(new Color(210, 180, 140));
		g2d.fillRect(0, 0, width, height);
	}
}

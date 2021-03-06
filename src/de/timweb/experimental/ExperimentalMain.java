package de.timweb.experimental;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import de.timweb.experimental.game.ExperimentalCanvas;

public class ExperimentalMain {
	
	public static void main(String[] args) {
		ExperimentalCanvas evocanvas = new ExperimentalCanvas(1024, 600, 10);
		JFrame frame = new JFrame("Experimental");
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(evocanvas);
		frame.setContentPane(panel);
		frame.pack();
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		evocanvas.start();
	}
	
}

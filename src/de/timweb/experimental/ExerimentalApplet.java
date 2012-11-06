package de.timweb.evolevel;

import java.applet.Applet;

import de.timweb.evolevel.game.ExperimentalCanvas;


public class ExerimentalApplet extends Applet{
	@Override
	public void init() {
		super.init();
		ExperimentalCanvas game = new ExperimentalCanvas(getWidth(),getHeight(),0);
		add(game);
		game.start();
	}
	
	@Override
	public void stop() {
		super.stop();
		System.exit(0);
	}
	
	@Override
	public void destroy() {
		super.destroy();
		System.exit(0);
	}
}

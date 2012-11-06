package de.timweb.experimental.game;

import java.awt.Graphics;

public class Game {
	public static final Game g = new Game();

	public static boolean VK_UP;
	public static boolean VK_DOWN;
	public static boolean VK_LEFT;
	public static boolean VK_RIGHT;

	private Game() {

	}

	public void update(int delta) {

		World.w.update(delta);
	}

	public void render(Graphics g) {

		World.w.render(g);
	}

}

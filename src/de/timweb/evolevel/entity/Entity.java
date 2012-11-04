package de.timweb.evolevel.entity;

import java.awt.Graphics;

import de.timweb.evolevel.util.Vector2d;

public abstract class Entity {
	protected boolean isAlive = true;

	protected Vector2d pos;

	public Entity(Vector2d pos) {
		this.pos = pos.copy();
	}

	public void move(double x, double y) {
		pos.add(x, y);
	}

	public Vector2d getPos() {
		return pos;
	}

	public void kill() {
		onKilled();
		isAlive = false;
	}

	protected void onKilled() {
	}

	public boolean isAlive() {
		return isAlive;
	}

	public abstract void update(int delta);

	public abstract void render(Graphics g);
}

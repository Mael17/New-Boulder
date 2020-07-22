package model.element.entity;

public interface Moveable {
	/**
	 * Does the rotation of the entity. Using states.
	 */
	public abstract void rotate();

	/**
	 * Behavior to move the entity upwards.
	 */
	public abstract void makeMoveUp();

	/**
	 *  Behavior to move the entity down.
	 */
	public abstract void makeMoveDown();

	/**
	 * Behavior to move the entity to the left.
	 */
	public abstract void makeMoveLeft();

	/**
	 * Behavior to move the entity to the right.
	 */
	public abstract void makeMoveRight();
}

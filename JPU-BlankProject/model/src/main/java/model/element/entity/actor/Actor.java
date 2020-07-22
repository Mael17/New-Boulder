package model.element.entity.actor;

import model.Direction;
import model.element.Position;
import model.element.entity.Entity;
import model.element.entity.ListOfEntities;
import model.element.entity.Moveable;
import model.map.MapElement;
import model.map.MapInstance;

public abstract class Actor extends Entity implements Moveable
{
	protected StatusActorEnum state;

	/**
	 * Actor Constructoe.
	 * 
	 * @param pos
	 */
	public Actor(Position pos)
	{
		super(pos);
		this.state = StatusActorEnum.IDLE;
		this.putEmptyPassable();
	}

	/**
	 * Returns the state of the actor.
	 * 
	 * @return StatusActorEnum
	 */
	public StatusActorEnum getState()
	{
		return state;
	}

	/**
	 * Set actor status.
	 * 
	 * @param stat
	 */
	public void setState(StatusActorEnum stat)
	{
		state = stat;
	}

	/**
	 * Explosion, put empty cells around the character. Square blast
     * 3x3.
	 */
	public void explode()
	{
		MapInstance.getInstance().kill(this.getPosition().getX(), this.getPosition().getY());
		MapInstance.getInstance().kill(this.getPosition().getX(), this.getPosition().checkUp());
		MapInstance.getInstance().kill(this.getPosition().checkRight(), this.getPosition().checkUp());
		MapInstance.getInstance().kill(this.getPosition().checkRight(), this.getPosition().getY());
		MapInstance.getInstance().kill(this.getPosition().checkRight(), this.getPosition().checkDown());
		MapInstance.getInstance().kill(this.getPosition().getX(), this.getPosition().checkDown());
		MapInstance.getInstance().kill(this.getPosition().checkLeft(), this.getPosition().checkDown());
		MapInstance.getInstance().kill(this.getPosition().checkLeft(), this.getPosition().getY());
		MapInstance.getInstance().kill(this.getPosition().checkLeft(), this.getPosition().checkUp());
	}

	/**
	 *Use direction and change state for movement.
	 * 
	 * @param direction
	 */
	public void move(Direction direction)
	{
		switch (direction)
		{
			case UP:
				this.state = StatusActorEnum.MOVINGUP;
				break;
			case DOWN:
				this.state = StatusActorEnum.MOVINGDOWN;
				break;
			case LEFT:
				this.state = StatusActorEnum.MOVINGLEFT;
				break;
			case RIGHT:
				this.state = StatusActorEnum.MOVINGRIGHT;
				break;
			default:
				break;
		}
	}

	@Override
	public void changePosition()
	{
		MapElement.removeElement(this.getPosition());
		this.makeMove();
		MapElement.setActor(this);
	}

	@Override
	public void die()
	{
		if (state != StatusActorEnum.DEAD)
		{
			state = StatusActorEnum.DEAD;
			this.explode();
		}
		ListOfEntities.getList().remove(this);
		MapElement.removeElement(this.getPosition());
	}

}

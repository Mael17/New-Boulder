package model.element.cell;

import model.element.Element;
import model.element.Position;
import model.map.MapElement;

public abstract class Cell extends Element
{

	/**
	 * Cell Constructor
	 * 
	 * @param pos
	 */
	Cell(Position pos)
	{
		super(pos);
	}

	/**
	 * Do a behavior and delete a cell.
	 */
	public void die()
	{
		MapElement.removeElement(this.getPosition());
	}

}

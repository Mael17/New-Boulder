package model.element.entity.item;

import model.element.Position;
import model.element.ElementTypes;

/**
 * Class that represents the empty item.
 */
/**
 * @author mael
 *
 */
public class Empty extends Item
{

	/**
	 * Empty Constructor .
	 * 
	 * @param pos
	 */
	public Empty(Position pos)
	{
		super(pos, false, false, false);
		this.setElementType(ElementTypes.Empty);
	}

	@Override
	public void changePosition()
	{

	}

	@Override
	public void makeMove()
	{

	}

}

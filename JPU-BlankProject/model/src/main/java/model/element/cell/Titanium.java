package model.element.cell;

import model.element.ElementTypes;
import model.element.Position;

public class Titanium extends Cell
{

	public Titanium(Position pos)
	{
		super(pos);
		this.setElementType(ElementTypes.Titanium);
	}

}

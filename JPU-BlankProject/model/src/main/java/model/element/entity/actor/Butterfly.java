package model.element.entity.actor;

import model.element.ElementTypes;
import model.element.Position;

public class Butterfly extends Enemy
{

	/**
	 * Butterfly Constructor.
	 * 
	 * @param pos
	 */
	public Butterfly(Position pos)
	{
		super(pos);
		this.setElementType(ElementTypes.Butterfly);
		this.state = StatusActorEnum.MOVINGUP;
	}

	@Override
	public void rotate()
	{
		switch (this.state)
		{
			case MOVINGUP:
				this.state = StatusActorEnum.MOVINGLEFT;
				break;
			case MOVINGLEFT:
				this.state = StatusActorEnum.MOVINGDOWN;
				break;
			case MOVINGDOWN:
				this.state = StatusActorEnum.MOVINGRIGHT;
				break;
			case MOVINGRIGHT:
				this.state = StatusActorEnum.MOVINGUP;
				break;
			default:
				break;
		}
	}

}

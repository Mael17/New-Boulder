package model.element.cell;

import model.element.ElementTypes;
import model.element.Position;
import model.element.entity.actor.Rockford;
import model.map.MapInstance;

public class Exit extends Cell
{

	private boolean isOpen;
	private static Exit exit;

	/**
	 * Output constructor.
	 * 
	 * @param pos
	 */
	private Exit()
	{
		super(new Position(0, 0));
		this.setElementType(ElementTypes.ExitClosed);
		this.isOpen = false;
	}

	/**
	 * Output Singleton .
	 * 
	 * @return
	 */
	public static Exit getInstance()
	{
		if (exit == null)
		{
			exit = new Exit();
		}
		return exit;
	}

	/**
	 * Reset the output to its default values.
	 */
	public void close()
	{
		this.setElementType(ElementTypes.ExitClosed);
		this.isOpen = false;
	}

	/**
	 * Open the exit.
	 */
	public void open()
	{
		Rockford player = Rockford.getInstance();
		if (player.getDiamonds() >= MapInstance.getInstance().getDiamondsneeded())
		{
			this.setElementType(ElementTypes.ExitOpen);
			this.isOpen = true;
		}
	}

	/**
	 * 
	 * @return if the exit is open for the player
	 */
	public boolean isOpen()
	{
		return isOpen;
	}

}

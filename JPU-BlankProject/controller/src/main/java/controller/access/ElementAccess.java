package controller.access;

import model.element.cell.Exit;
import model.element.entity.Entity;
import model.element.entity.ListOfEntities;

public class ElementAccess {
	public static boolean entityIsAlive(Entity ent)
	{
		return ListOfEntities.getList().contains(ent);
	}
	public static void openExit()
	{
		Exit.getInstance().open();
	}

}

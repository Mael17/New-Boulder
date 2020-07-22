package controller.input;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import model.element.entity.actor.Rockford;
import model.map.MapInstance;
import view.FrameMap;

public class Mouse extends MouseAdapter
{
	@Override
	public void mouseClicked(MouseEvent e)
	{
		JLabel label = (JLabel) e.getSource();

		if (label.getText().equals("<"))
		{
			MapInstance.getInstance().levelPrevious();
			Rockford.getInstance().reset();
			FrameMap.getInstance().refreshLevelLabel();
		}

		if (label.getText().equals(">"))
		{
			MapInstance.getInstance().levelNext();
			Rockford.getInstance().reset();
			FrameMap.getInstance().refreshLevelLabel();
		}

	}
}

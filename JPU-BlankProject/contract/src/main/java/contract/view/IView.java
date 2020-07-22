package contract.view;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import contract.model.IEntity;
public interface IView {
	/**
     * Display message.
     *
     * @param message the message
     */
    void displayMessage(String message);

    /**
     * @param image the image
     */
    void drawMap(BufferedImage image);

    /**
     * @param entities the entities
     */
    void drawEntities(ArrayList<IEntity> entities);

    /**
     * @param width the width
     * @param height the height
     */
    void createWindow(int width, int height);


    void closeWindow();

    /**
     * Draw the score
     * @param score the score
     */
    void drawScore(String score);
}

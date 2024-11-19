import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class TutorialWorld extends World
{

    /**
     * Constructor for objects of class TutorialWorld.
     */
    public TutorialWorld()
    {
        super(Settings.worldWidth, Settings.worldHeight, 1);
        prepare();
    }

    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(65);
        bg.setFont(font);
        bg.setColor(Color.GREEN);
        bg.drawString(message, x, y);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Knight knight = new Knight();
        addObject(knight,149,352);
        Potion potion = new Potion();
        addObject(potion,62,24);
        potion.setLocation(21,36);
        PotionText potionText = new PotionText();
        addObject(potionText,54,40);
        DiamondChest diamondChest = new DiamondChest();
        addObject(diamondChest,447,365);
        diamondChest.setLocation(462,365);
        diamondChest.setLocation(468,379);
        DiamondChest diamondChest2 = new DiamondChest();
        addObject(diamondChest2,714,378);
        DiamondChest diamondChest3 = new DiamondChest();
        addObject(diamondChest3,208,373);
    }
}

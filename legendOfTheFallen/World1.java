import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class World1 extends World
{

    /**
     * Constructor for objects of class World1.
     */
    public World1()
    {
        super(Settings.worldWidth, Settings.worldHeight, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        StonePlatform stonePlatform =  new  StonePlatform();
        addObject(stonePlatform, 285, 255);
        stonePlatform.setLocation(163, 257);
        Knight knight =  new  Knight();
        addObject(knight, 460, 261);
        stonePlatform.setLocation(167, 320);

        Zombie zombie = new Zombie();
        addObject(zombie,819,259);
        Potion potion = new Potion();
        addObject(potion,62,24);
        potion.setLocation(21,36);
        PotionText potionText = new PotionText();
        addObject(potionText,54,40);
        Werewolf werewolf = new Werewolf();
        addObject(werewolf,777,263);
        removeObject(zombie);
    }
}

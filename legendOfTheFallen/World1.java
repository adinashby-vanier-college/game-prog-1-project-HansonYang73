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
        Werewolf werewolf2 = new Werewolf();
        addObject(werewolf2,921,210);
        Werewolf werewolf3 = new Werewolf();
        addObject(werewolf3,46,165);
        Zombie zombie2 = new Zombie();
        addObject(zombie2,865,337);
        Zombie zombie3 = new Zombie();
        addObject(zombie3,678,240);
        IronChest ironChest = new IronChest();
        addObject(ironChest,236,281);
        IronChest ironChest2 = new IronChest();
        addObject(ironChest2,153,282);
        IronChest ironChest3 = new IronChest();
        addObject(ironChest3,79,287);
        IronChest ironChest4 = new IronChest();
        addObject(ironChest4,232,378);
        IronChest ironChest5 = new IronChest();
        addObject(ironChest5,139,372);
        IronChest ironChest6 = new IronChest();
        addObject(ironChest6,47,371);
    }
}

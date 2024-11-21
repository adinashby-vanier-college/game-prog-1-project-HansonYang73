import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class World1 extends TemplateWorld
{
    private Knight knight;
    /**
     * Constructor for objects of class World1.
     */
    public World1(Knight knight)
    {
        super();
        this.knight = knight;
        prepare();
    }
    
    public void act(){
        if (canGoNextWorld(knight)){
            goNextWorld(new TutorialWorld());
        }
    }
    private void prepare()
    {
        StonePlatform stonePlatform =  new  StonePlatform(20, 100);
        addObject(stonePlatform, 285, 255);
        stonePlatform.setLocation(163, 257);
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
        removeObject(werewolf3);
        removeObject(zombie3);
        removeObject(werewolf);
        DiamondChest diamondChest = new DiamondChest();
        addObject(diamondChest,321,372);
        removeObject(ironChest4);
        DiamondChest diamondChest2 = new DiamondChest();
        addObject(diamondChest2,223,368);
        Werewolf werewolf4 = new Werewolf();
        addObject(werewolf4,966,326);
        Werewolf werewolf5 = new Werewolf();
        addObject(werewolf5,824,252);
        Zombie zombie4 = new Zombie();
        addObject(zombie4,745,348);
    }
}

import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class World2 extends TemplateWorld
{

    /**
     * Constructor for objects of class World2.
     */
    public World2(Knight knight)
    {
        super();
        this.knight = knight;
        prepare();
    }
    
    public void act(){
        if (canGoNextWorld(knight)){
            goNextWorld(new World3(knight));
        }
    }
    
    public void prepare(){
        addObject(knight, 5, knight.getY()); 
        showPotion();
        showCoin();

        StonePlatform stonePlatform = new StonePlatform();
        addObject(stonePlatform,559,315);
        stonePlatform.setLocation(238,307);
        StonePlatform stonePlatform2 = new StonePlatform();
        addObject(stonePlatform2,491,223);
        stonePlatform2.setLocation(482,217);
        StonePlatform stonePlatform3 = new StonePlatform();
        addObject(stonePlatform3,750,302);
        Zombie zombie = new Zombie();
        addObject(zombie,816,361);
        Werewolf werewolf = new Werewolf();
        addObject(werewolf,955,350);
        Zombie zombie2 = new Zombie();
        addObject(zombie2,443,356);

        addChest(488,185);
    }
}

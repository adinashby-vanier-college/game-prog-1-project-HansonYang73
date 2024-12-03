import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class World4 extends TemplateWorld
{

    /**
     * Constructor for objects of class World4.
     */
     public World4(Knight knight)
    {
        super();
        this.knight = knight;
        prepare();
    }
    
    public World4()
    {
        super();
        this.knight = new Knight();
        addObject(knight, 5, 5);
        prepare();
    }
    
    public void act(){
        if (canGoNextWorld(knight)){
            goNextWorld(new Shop(knight));
        }
    }
    
    public void prepare(){
        // addObject(knight, 5, knight.getY()); 
        showPotion();
        showCoin();
        StonePlatform stonePlatform = new StonePlatform();
        addObject(stonePlatform,500,200);
        StonePlatform stonePlatform2 = new StonePlatform(70, 20);
        addObject(stonePlatform2,743,127);
        stonePlatform2.setLocation(817,113);
        StonePlatform stonePlatform3 = new StonePlatform();
        addObject(stonePlatform3,136,277);
        stonePlatform3.setLocation(144,300);
        stonePlatform2.setLocation(887,112);
        stonePlatform3.setLocation(187,311);
        stonePlatform.setLocation(490,205);
        IronChest ironChest = new IronChest();
        addObject(ironChest,868,75);
        stonePlatform.setLocation(536,208);
        stonePlatform.setLocation(594,205);
        stonePlatform.setLocation(563,218);
        stonePlatform2.setLocation(824,142);
        ironChest.setLocation(860,100);
        stonePlatform.setLocation(581,209);
    }
}

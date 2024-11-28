import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class World3 extends TemplateWorld
{

    /**
     * Constructor for objects of class World3.
     */
    public World3()
    {
        super();
        //this.knight = knight;
        prepare();
    }
    
    public void act(){
        //if (canGoNextWorld(knight)){
            //goNextWorld(new TutorialWorld());
        //}
    }
    
    public void prepare(){
        //addObject(knight, 5, knight.getY()); 
        showPotion();
        showCoin();
        StonePlatform stonePlatform = new StonePlatform();
        addObject(stonePlatform,765,222);
        StonePlatform stonePlatform2 = new StonePlatform();
        addObject(stonePlatform2,360,160);
        StonePlatform stonePlatform3 = new StonePlatform();
        addObject(stonePlatform3,647,86);
        StonePlatform stonePlatform4 = new StonePlatform();
        addObject(stonePlatform4,298,313);
        stonePlatform2.setLocation(220,131);
        stonePlatform4.setLocation(247,315);
        stonePlatform.setLocation(713,223);
        stonePlatform3.setLocation(720,90);
        addChest(761,55);
        Zombie zombie = new Zombie();
        addObject(zombie,881,347);
        Werewolf werewolf = new Werewolf();
        addObject(werewolf,713,363);
        zombie.setLocation(897,355);
        werewolf.setLocation(716,360);
        Werewolf werewolf2 = new Werewolf();
        addObject(werewolf2,703,44);
        Knight knight = new Knight();
        addObject(knight,137,360);
        werewolf2.setLocation(348,363);
        werewolf.setLocation(717,370);
        removeObject(knight);
    }
}

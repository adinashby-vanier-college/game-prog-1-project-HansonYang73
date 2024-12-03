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
        
        createTorch();
    }
    
    public World4()
    {
        super();
        this.knight = new Knight();
        addObject(knight, 5, 5);
        prepare();
        
        createTorch();
    }
    
    public void act(){
        if (canGoNextWorld(knight)){
            goNextWorld(new World5(knight));
        }
    }
    
    public void prepare(){
        addObject(knight, 5, knight.getY()); 
        showPotion();
        showCoin();

        StonePlatform stonePlatform = new StonePlatform();
        addObject(stonePlatform,222,290);
        stonePlatform.setLocation(201,301);
        StonePlatform stonePlatform2 = new StonePlatform();
        addObject(stonePlatform2,723,196);
        StonePlatform stonePlatform3 = new StonePlatform(60, 20);
        addObject(stonePlatform3,179,119);
        stonePlatform2.setLocation(607,219);
        stonePlatform3.setLocation(124,138);
        IronChest ironChest = new IronChest();
        addObject(ironChest,126,103);
        stonePlatform.setLocation(280,316);
        Werewolf werewolf = new Werewolf();
        addObject(werewolf,616,343);
        Werewolf werewolf2 = new Werewolf();
        addObject(werewolf2,755,344);
        Werewolf werewolf3 = new Werewolf();
        addObject(werewolf3,670,344);
        Zombie zombie = new Zombie();
        addObject(zombie,317,343);
        werewolf.setLocation(603,344);
        werewolf.setLocation(664,333);
        werewolf3.setLocation(684,350);
        werewolf2.setLocation(749,352);
        Zombie zombie2 = new Zombie();
        addObject(zombie2,394,344);
        zombie.setLocation(242,362);
        zombie.setLocation(242,344);
        zombie.setLocation(237,313);
        werewolf.setLocation(704,313);
        werewolf2.setLocation(811,315);
        werewolf.setLocation(737,308);
        werewolf3.setLocation(639,333);
    }
}

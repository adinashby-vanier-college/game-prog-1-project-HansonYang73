import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class World1 extends TemplateWorld
{
    /**
     * Constructor for objects of class World1.
     */
    public World1(Knight knight)
    {
        super();
        this.knight = knight;
        prepare();
        
        showTextWithBigBlackFont("Press 'F' to drink a potion (heals 50hp)", 350, 80, Color.BLACK, 20);
    }
    
    public void act(){
        if (canGoNextWorld(knight)){
            goNextWorld(new World2(knight));
        }
    }
    
    private void prepare()
    {
        addObject(knight, 5, knight.getY()); 

        Zombie zombie = new Zombie();
        addObject(zombie,819,259);
        
        showPotion();
        showCoin();

        StonePlatform stonePlatform = new StonePlatform(200, 20);
        addObject(stonePlatform,830,297);

        stonePlatform.setLocation(806,309);
        zombie.setLocation(644,362);
        
        addChest(817, 271);
    }
}

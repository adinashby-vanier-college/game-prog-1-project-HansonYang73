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
        super(1000, 400, 1);
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
        for (int i = 0; i < 20; i++){
            Zombie zombie = new Zombie();
            addObject(zombie,(int) (Math.random()*1000),134);
        }
        
    }
}

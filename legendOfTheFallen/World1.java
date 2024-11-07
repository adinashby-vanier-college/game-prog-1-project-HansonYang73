// WARNING: This file is auto-generated and any changes to it will be overwritten
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
        super(600, 400, 1);
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
        Attack attack =  new  Attack();
        addObject(attack, 397, 136);
    }
}

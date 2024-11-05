import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class StonePlatform extends Actor
{
    private GreenfootImage platform = new GreenfootImage("Stone1.jpg");
    /**
     * Act - do whatever the StonePlatform wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }

    
    public double getTopY(){
        return getY() + platform.getHeight() / 2;
    }
    
}

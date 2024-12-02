import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Price extends Actor
{
    private int price;
    
    public Price(int price){
        this.price = price;
        setImage(new GreenfootImage("X " + price, 30, Color.BLACK, new Color(0,0,0,0)));
    }
    
    /**
     * Act - do whatever the Price wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }
}

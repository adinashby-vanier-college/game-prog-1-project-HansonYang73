import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CoinText extends Actor
{

    /**
     * Act - do whatever the CoinText wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(new GreenfootImage("X " + Settings.coins, 30, Color.BLACK, new Color(0,0,0,0)));
    }
}

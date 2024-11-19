import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PotionText extends Actor
{

    public void act()
    {
        setImage(new GreenfootImage("X " + Settings.potionAmount, 30, Color.BLACK, new Color(0,0,0,0)));
    }
}

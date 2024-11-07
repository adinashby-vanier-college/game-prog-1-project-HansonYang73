import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Attack extends Actor
{

    /**
     * Act - do whatever the Attack wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        scaleImage();
    }

    /**
     * 
     */
    public void scaleImage(){
        getImage().scale(25, 15);
    }
}

import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Parry extends Actor
{
    private SimpleTimer timer = new SimpleTimer();
    
    public Parry(){
        
        scaleImage();
        timer.mark();
    }
    /**
     * Act - do whatever the Attack wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        if (timer.millisElapsed() >= 20){
            getWorld().removeObject(this);
        }
    }

    public void scaleImage(){
        getImage().scale(20, 15);
    }
}

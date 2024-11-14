import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Attack extends Actor
{
    private SimpleTimer timer = new SimpleTimer();
    private double DMG = Settings.baseDMG;
    public Attack(){
        
        scaleImage();
        timer.mark();
    }
    /**
     * Act - do whatever the Attack wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        if (timer.millisElapsed() >= 200){
            getWorld().removeObject(this);
        }
    }

    public double getDMG(){
        return DMG;
    }
    public void scaleImage(){
        getImage().scale(20, 15);
    }
}

import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class EnemyAttack extends Actor
{
    private SimpleTimer timer = new SimpleTimer();
    private double DMG = Settings.enemyBaseDMG;
    private boolean canParry = true;
    
    public EnemyAttack(){
        
        scaleImage();
        timer.mark();
    }
    /**
     * Act - do whatever the Attack wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (canParry && isTouching(Parry.class)){
            // can not attack
            // mult dmg
            // speed = 0 (stun)
            // stun time
        }
        else if (timer.millisElapsed() >= 200){
            canParry = false;
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

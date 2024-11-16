import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Parry extends Actor
{
    private SimpleTimer timer = new SimpleTimer();
    // can not attack
    // mult dmg
    // speed = 0 (stun)
    // stun time
    public Parry(){
        scaleImage();
        timer.mark();
    }
    
    public void act()
    {
        getsParried();
        if (timer.millisElapsed() >= Settings.parryTime){
            EnemyAttack attack = new EnemyAttack();
            getWorld().addObject(attack, getX(), getY());
            getWorld().removeObject(this);
        }
    }
    
    public void getsParried(){
        Attack attack = (Attack) getOneIntersectingObject(Attack.class);
        if (attack != null){
            getWorld().removeObject(attack);
            getWorld().removeObject(this);
        }
    }

    public void scaleImage(){
        getImage().scale(50, 15);
    }
}

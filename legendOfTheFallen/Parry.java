import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Parry extends Actor
{
    private SimpleTimer timer = new SimpleTimer();
    Enemy enemy;
    private boolean isDed = false;
    // can not attack
    // mult dmg by 1.5x
    // speed = 0 (stun)
    // stun time
    public Parry(Enemy enemy){
        this.enemy = enemy;
        scaleImage();
        timer.mark();
    }
    
    public void act()
    {
        getsParried();
        if (timer.millisElapsed() >= Settings.parryTime){
            EnemyAttack attack = new EnemyAttack();
            getWorld().addObject(attack, getX(), getY());
            isDed = true;
        }
        if (isDed){
            getWorld().removeObject(this);
        }
    }
    
    public void getsParried(){
        Attack attack = (Attack) getOneIntersectingObject(Attack.class);
        if (attack != null){
            enemy.stun();
            isDed = true;
        }
    }

    public void scaleImage(){
        getImage().scale(50, 15);
    }
}

import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class BossParry extends Actor
{
    private SimpleTimer timer = new SimpleTimer();
    Enemy enemy;
    private boolean isDed = false;
    
    private GreenfootSound parrySound = new GreenfootSound("parry.mp3");
    // can not attack
    // mult dmg by 1.5x
    // speed = 0 (stun)
    // stun time
    public BossParry(Enemy enemy){
        this.enemy = enemy;
        scaleImage();
        timer.mark();
    }
    
    public void act()
    {
        getsParried();
        if (timer.millisElapsed() >= 400){
            BossAttack attack = new BossAttack(enemy.atk, enemy.isFacingRight);
            getWorld().addObject(attack, getX(), 375);
            isDed = true;
        }
        if (isDed){
            getWorld().removeObject(this);
        }
    }
    
    public void getsParried(){
        Attack attack = (Attack) getOneIntersectingObject(Attack.class);
        if (attack != null && timer.millisElapsed() <= Settings.parryTime){
            parrySound.play();
            enemy.stun();
            isDed = true;
        }
    }

    public void scaleImage(){
        getImage().scale(300, 50);
    }
}

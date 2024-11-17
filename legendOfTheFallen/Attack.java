import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Attack extends Actor
{
    private SimpleTimer timer = new SimpleTimer();
    private double atk = Settings.baseAtk;
    public Attack(double mult){
        atk *= mult;
        scaleImage();
        timer.mark();
    }
    /**
     * Act - do whatever the Attack wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        attackEnemy();
        if (timer.millisElapsed() >= Settings.atkTime){
            getWorld().removeObject(this);
        }
    }
    
    public void attackEnemy(){
        Enemy enemy = (Enemy) getOneIntersectingObject(Enemy.class);
        if (enemy != null){
            if (enemy.isStun){
                enemy.atkToEnemy(atk * 1.5);
            }
            else{
                enemy.atkToEnemy(atk);
            }
            //lifesteal
            Knight knight = getWorld().getObjects(Knight.class).get(0);
            knight.heal(Settings.lifesteal);
            getWorld().removeObject(this);
        }
    }
    
    public double getAtk(){
        return atk;
    }

    public void scaleImage(){
        getImage().scale(20, 50);
    }
}

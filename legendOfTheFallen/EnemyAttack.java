import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class EnemyAttack extends Actor
{
    private SimpleTimer timer = new SimpleTimer();
    public double atk;
    
    public EnemyAttack(double enemyAtk){
        atk = enemyAtk;
        scaleImage();
    }
    
    public void act()
    {
        attackKnight();
        if (timer.millisElapsed() >= Settings.enemyAtkTime){
            getWorld().removeObject(this);
        }
    }

    public void attackKnight(){
        Knight knight = (Knight) getOneIntersectingObject(Knight.class);
        if (knight != null){
            knight.atkToKnight(atk);
            getWorld().removeObject(this);
        }
    }
    
    public void scaleImage(){
        getImage().scale(20, 15);
    }
}

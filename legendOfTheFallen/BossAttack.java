import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class BossAttack extends Actor
{
    private SimpleTimer timer = new SimpleTimer();
    public double atk;
    public boolean isGone = false;
    private int dir;
    public BossAttack(double enemyAtk, int direction){
        atk = enemyAtk;
        dir = direction;
        scaleImage();
    }
    
    public void act()
    {
        attackKnight();
        if (timer.millisElapsed() >= Settings.enemyAtkTime){
            isGone = true;
        }
        
        if (isGone){
            getWorld().removeObject(this);
        }
    }

    public void attackKnight(){
        Knight knight = (Knight) getOneIntersectingObject(Knight.class);
        if (knight != null){
            knight.atkToKnight(atk);
            knight.setLocation(knight.getX() + (200 * dir), knight.getY());
            isGone = true;
        }
    }
    
    public void scaleImage(){
        getImage().scale(300, 150);
    }
}

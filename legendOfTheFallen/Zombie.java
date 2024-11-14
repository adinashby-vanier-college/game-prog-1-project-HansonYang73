import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Zombie extends Enemy
{
    private double hp = Settings.zombieHP;
    private double zombieBottomY;
    public Zombie(){
        getImage().scale(Settings.zombieWidth/5, Settings.zombieHeight/5);
    }
    
    /**
     * Act - do whatever the Zombie wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        zombieBottomY = getY() + Settings.zombieHeight/5 / 2;
        
        getsAttacked();
        moveToKnight();
        gravity(zombieBottomY);
        checkDed();
    }
    
    public void getsAttacked(){
        Attack attack = (Attack) getOneIntersectingObject(Attack.class);
        
        if (attack != null){
            hp -= attack.getDMG();
            getWorld().removeObject(attack);
        }
    }
    
    public void checkDed(){
        if (hp <= 0){
            getWorld().removeObject(this);
        }
    }
    
   
}

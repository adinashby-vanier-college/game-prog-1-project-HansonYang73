import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Enemy extends Actor
{
    private double gravity = Settings.gravity;
    
    public void moveToKnight(){
        Knight knight = getWorld().getObjects(Knight.class).get(0);
        if (knight.getX() > getX()){
            move((int) Settings.enemySpeed);
        }
        else if (knight.getX() < getX()){
            move((int) -Settings.enemySpeed);
        }
    }
    
    public void gravity(double bottomY){
        if (bottomY < 400) {
            int roundGravity = (int) gravity;
            setLocation(getX(), getY() + roundGravity);
            gravity += Settings.ySpeed;
            
        }
    }
}

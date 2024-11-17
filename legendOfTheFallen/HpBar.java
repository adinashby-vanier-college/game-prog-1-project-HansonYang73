import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class HpBar extends Actor
{
    private double size, maxSize, posX, posY;
    

    public void act()
    {
        GreenfootImage bg = new GreenfootImage((int) maxSize + 2, 12);
        bg.setColor(Color.GRAY);
        bg.fill();

        GreenfootImage hpBar = new GreenfootImage((int) maxSize + 2, 12);
        hpBar.drawRect(0, 0, (int) maxSize+1, 11);
        hpBar.setColor(Color.RED);
        hpBar.fillRect(1, 1, (int) size, 10);

        bg.drawImage(hpBar, 0, 0);
        
        setImage(bg);
        setLocation((int) posX, (int) posY);

    }
    
    public void setSize(double size){
        this.size = size;
    }
    
    public void setMaxSize(double maxSize){
        this.maxSize = maxSize;
    }
    
    public void setPosX(double posX){
        this.posX = posX;
    }
    
    public void setPosY(double posY){
        this.posY = posY;
    }
}

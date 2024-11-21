import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class StonePlatform extends Actor
{
    public GreenfootImage platform = new GreenfootImage("Stone1.jpg");
    private int width;
    private int height;
    public StonePlatform(int width, int height){
        this.width = width;
        this.height = height;
        scale();
    }

    public void scale(){
        getImage().scale(width, height);
    }
    
    public double getTopY(){
        return getY() - height / 2;
    }
    
}

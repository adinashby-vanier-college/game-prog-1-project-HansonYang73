import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class TemplateWorld extends World
{

    /**
     * Constructor for objects of class TemplateWorld.
     */
    public TemplateWorld()
    {
        super(Settings.worldWidth, Settings.worldHeight, 1);
    }
    
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(15);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
    }
    
    public void goNextWorld(World nextWorld){
        World thisWorld = this;
        Greenfoot.setWorld(nextWorld);
    }
    
    public boolean canGoNextWorld(Knight knight){
        if (this.getObjects(Enemy.class).size() == 0 && knight.isAtEdge()){
            return true;
        }
        return false;
    }
}

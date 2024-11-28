import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class TemplateWorld extends World
{
    protected Knight knight;
    /**
     * Constructor for objects of class TemplateWorld.
     */
    public TemplateWorld()
    {
        super(Settings.worldWidth, Settings.worldHeight, 1);
    }
    
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        showTextWithBigBlackFont(message, x, y, Color.WHITE, 15);
    }
    
    public void showTextWithBigBlackFont(String message, int x, int y, Color color, int size)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(size);
        bg.setFont(font);
        bg.setColor(color);
        bg.drawString(message, x, y);
    }
    
    public void showCoin(){
        Coin coin = new Coin();
        addObject(coin,Settings.worldWidth-70,36);
        CoinText coinText = new CoinText();
        addObject(coinText,Settings.worldWidth-30,45);
    }
    
    public void showPotion(){
        Potion potion = new Potion();
        addObject(potion,21,36);
        PotionText potionText = new PotionText();
        addObject(potionText,60,45);
    }
    
    public void goNextWorld(World nextWorld){
        World thisWorld = this;
        Greenfoot.setWorld(nextWorld);
    }
    
    public boolean canGoNextWorld(Knight knight){
        if (this.getObjects(Enemy.class).size() == 0 && knight.getX() >= Settings.worldWidth - 1){
            return true;
        }
        return false;
    }
}

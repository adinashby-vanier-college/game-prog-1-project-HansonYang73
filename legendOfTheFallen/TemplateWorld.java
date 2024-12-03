import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class TemplateWorld extends World
{
    protected Knight knight;
    static GreenfootSound bgMusic = new GreenfootSound("Dungeon.mp3");
    /**
     * Constructor for objects of class TemplateWorld.
     */
    public TemplateWorld()
    {
        super(Settings.worldWidth, Settings.worldHeight, 1);
    }
    
    public TemplateWorld(int width, int height)
    {
        super(width, height, 1);
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
        addObject(coin,Settings.worldWidth-75,25);
        CoinText coinText = new CoinText();
        addObject(coinText,Settings.worldWidth-35,33);
    }
    
    public void showPotion(){
        Potion potion = new Potion();
        addObject(potion,30,25);
        PotionText potionText = new PotionText();
        addObject(potionText,70,33);
    }
    
    public void addChest(int x, int y){
        int rand = (int) (Math.random() * 100);
        if (rand <= 14){
            GoldChest goldChest = new GoldChest();
            addObject(goldChest,x,y);
        }
        else{
            IronChest ironChest = new IronChest();
            addObject(ironChest,x,y);
        }
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
    
    static void start(){
        bgMusic.playLoop();
    }
    
    static void stop(){
        bgMusic.stop();
    }
    
    public void createTorch(){
        for (int i = 1; i <= 9; i++){
            addObject(new Torch(), 100*i, 150);
        }
    }
}

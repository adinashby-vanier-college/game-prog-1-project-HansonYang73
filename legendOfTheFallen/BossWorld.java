import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossWorld extends TemplateWorld
{

    /**
     * Constructor for objects of class BossWorld.
     * 
     */
    public BossWorld(Knight knight)
    {
        super();
        this.knight = knight;
        prepare();
        
    }
    
    public BossWorld()
    {
        super();
        this.knight = new Knight();
        addObject(knight, 5, 5);
        prepare();
    }
    
    public void act(){
        if (canGoNextWorld(knight)){
            goNextWorld(new World2(knight));
        }
    }
    
    private void prepare()
    {
        addObject(knight, 5, knight.getY()); 

        showPotion();
        showCoin();
        
    }
}

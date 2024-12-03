import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossWorld extends TemplateWorld
{
    static GreenfootSound bgMusic = new GreenfootSound("FinalBossMusic.mp3");
    static GreenfootSound flap = new GreenfootSound("WingFlap.mp3");
    /**
     * Constructor for objects of class BossWorld.
     * 
     */
    public BossWorld(Knight knight)
    {
        super();
        this.knight = knight;
        prepare();
        TemplateWorld.stop();
        bgMusic.playLoop();
        flap.playLoop();
    }
    
    public BossWorld()
    {
        super();
        this.knight = new Knight();
        addObject(knight, 5, 5);
        prepare();
        TemplateWorld.stop();
        bgMusic.playLoop();
        flap.playLoop();
    }
    
    public void act(){
        if (getObjects(Enemy.class).size() == 0){
            BossWorld.stopMusic();
            goNextWorld(new Win());
        }
    }
    
    private void prepare()
    {
        addObject(knight, 5, knight.getY()); 

        showPotion();
        showCoin();

        Demon demon = new Demon();
        addObject(demon,866,214);
    }
    
    static void stopMusic(){
        bgMusic.stop();
        flap.stop();
    }
}

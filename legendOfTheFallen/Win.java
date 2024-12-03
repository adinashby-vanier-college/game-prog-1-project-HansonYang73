import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win extends TemplateWorld
{    
    private GreenfootSound win = new GreenfootSound("WinSong.mp3");
    
    /**
     * Constructor for objects of class Win.
     * 
     */
    public Win()
    {
        super();
        win.play();
    }
    
    public void act(){
         if (Greenfoot.isKeyDown("R")){
            win.stop();
            Settings.reset();
        }
    }
}

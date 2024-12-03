import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shield here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shield extends Artifact
{
    private GifImage shieldGif =  new  GifImage("FireShield.gif");
    public void act(){
        setImage(shieldGif.getCurrentImage());
    }
    
    public void getArtifact(){
        if (Settings.shieldAmt > 0){
            Settings.shieldAmt--;
            Settings.knockback = 0;
        }
        else{
            Settings.coins += 50;
        }
        getWorld().removeObject(this);
    }
}

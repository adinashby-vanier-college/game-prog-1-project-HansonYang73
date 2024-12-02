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
        Settings.knockback = 0;
        getWorld().removeObject(this);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Torch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Torch extends Actor
{
    private GifImage torchGif =  new  GifImage("Torch.gif");
    public void act(){
        setImage(torchGif.getCurrentImage());
    }

}

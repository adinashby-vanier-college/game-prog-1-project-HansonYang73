import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Gif extends Actor
{
    private Artifact artifact;
    private boolean yes = true;
    private int price;
    private GreenfootSound buySound = new GreenfootSound("buy.mp3");
    private GifImage gif;
    public Gif(String file, Artifact artifact, int price){
        this.price = price;
        gif = new GifImage(file);
        this.artifact = artifact;
    }
    /**
     * Act - do whatever the Image wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (yes){
            yes = false;
            create();
        }
        setImage(gif.getCurrentImage());
        Knight knight = (Knight) getOneIntersectingObject(Knight.class);
        if (Greenfoot.isKeyDown("E") && knight != null && Settings.coins >= price){
            buySound.play();
            
            getWorld().addObject(artifact, getX(), getY());
            artifact.getArtifact();
            Settings.coins -= price;
            
            setLocation(getX(), getY()-15);
            Coin coin = (Coin) getOneIntersectingObject(Coin.class);
            coin.delete();
            
            getWorld().removeObject(this);
        }
    }
    
    public void create(){
        getWorld().addObject(new Coin(), getX(), getY()-50);
        getWorld().addObject(new Price(price), getX()+50, getY()-40);
    }
}

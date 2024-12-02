import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Image extends Actor
{
    private Artifact artifact;
    private int price;
    private GreenfootSound buySound = new GreenfootSound("buy.mp3");
    public Image(String file, Artifact artifact, int price){
        this.price = price;
        setImage(file);
        this.artifact = artifact;
    }
    /**
     * Act - do whatever the Image wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
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
    
    
}

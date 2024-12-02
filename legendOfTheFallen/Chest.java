import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Chest extends Actor
{
    protected ArrayList<Artifact> legendArtifacts = new ArrayList<>();
    protected ArrayList<Artifact> mythArtifacts = new ArrayList<>();
    protected ArrayList<Artifact> commonArtifacts = new ArrayList<>();
    protected ArrayList<Artifact> rarityArtifacts;
    protected ArrayList<Artifact> artifacts = new ArrayList<>();
    private GreenfootSound openChestSound = new GreenfootSound("chest_opening.mp3");
    public Chest(){
        legendArtifacts.add(new LegendarySword());
        legendArtifacts.add(new ElixirStrength());
        
        mythArtifacts.add(new AncientPizza());
        mythArtifacts.add(new BloodTalisman());
        mythArtifacts.add(new LeftVampCrest());
        mythArtifacts.add(new RightVampCrest());
        mythArtifacts.add(new LeftVampCrest());
        
        commonArtifacts.add(new Potion2());
    }
    
     public void destroy(){
        randomArtifact();
        for (int i = 0; i < artifacts.size(); i++){
            getWorld().addObject(artifacts.get(i), getX()+(70*i), getY() + 5);  
        }
        openChestSound.play();
        getWorld().removeObject(this);
    }
    
    public void randomArtifact(){
    }
}

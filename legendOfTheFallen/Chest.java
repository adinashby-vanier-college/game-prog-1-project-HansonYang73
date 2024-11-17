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
    protected Artifact artifact;
    protected int rarity;
    public Chest(){
        legendArtifacts.add(new LegendarySword());
        
        mythArtifacts.add(new AncientPizza());
        mythArtifacts.add(new BloodTalisman());
        mythArtifacts.add(new ElixirStrength());
        mythArtifacts.add(new LeftVampCrest());
        mythArtifacts.add(new RightVampCrest());
        mythArtifacts.add(new LeftVampCrest());
        
        commonArtifacts.add(new Potion2());
        
        rarity = (int) (Math.random() * 100); // 0 = legend, 1-2 = myth, 3-9 = common
    }
    
    public void destroy(){
        randomArtifact();
        getWorld().addObject(artifact, getX(), getY());
        getWorld().removeObject(this);
    }
    
    public void randomArtifact(){
    }
}

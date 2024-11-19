import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.util.ArrayList;

/**
 * 
 */
public class IronChest extends Chest
{
    public IronChest(){
        super();
    }
    
    public void randomArtifact(){
        int rarity = (int) (Math.random() * 100);
        if (rarity >= 0 && rarity <= 4 && legendArtifacts.size() > 0) { //5%
            rarityArtifacts = legendArtifacts;
            
            int index = (int) (Math.random() * rarityArtifacts.size());
            artifacts.add(rarityArtifacts.get(index));
            rarityArtifacts.remove(index);
        } 
        else if (rarity >= 5 && rarity <= 24 && mythArtifacts.size() > 0) { //20%
            rarityArtifacts = mythArtifacts;
            
            int index = (int) (Math.random() * rarityArtifacts.size());
            artifacts.add(rarityArtifacts.get(index));
            rarityArtifacts.remove(index);
        } 
        else{ //75%
            rarityArtifacts = commonArtifacts;
            
            int index = (int) (Math.random() * rarityArtifacts.size());
            artifacts.add(rarityArtifacts.get(index));
        }
    }
}

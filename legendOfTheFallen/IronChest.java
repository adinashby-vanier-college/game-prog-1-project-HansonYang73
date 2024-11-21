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
        if (rarity == 0 && legendArtifacts.size() > 0) { //1%
            rarityArtifacts = legendArtifacts;
            
            int index = (int) (Math.random() * rarityArtifacts.size());
            artifacts.add(rarityArtifacts.get(index));
            rarityArtifacts.remove(index);
        } 
        else if (rarity >= 1 && rarity <= 10 && mythArtifacts.size() > 0) { //10%
            rarityArtifacts = mythArtifacts;
            
            int index = (int) (Math.random() * rarityArtifacts.size());
            artifacts.add(rarityArtifacts.get(index));
            rarityArtifacts.remove(index);
        } 
        else{ //89%
            rarityArtifacts = commonArtifacts;
            
            int index = (int) (Math.random() * rarityArtifacts.size());
            artifacts.add(rarityArtifacts.get(index));
        }
    }
}

import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class DiamondChest extends Chest
{
    public DiamondChest(){
        super();
    }
    
    public void randomArtifact(){
        for (int i = 0; i < 3; i++){
            int rarity = (int) (Math.random() * 100);
            if (rarity >= 0 && rarity <= 49 && legendArtifacts.size() > 0) { //50%
                rarityArtifacts = legendArtifacts;
                
                int index = (int) (Math.random() * rarityArtifacts.size());
                artifacts.add(rarityArtifacts.get(index));
                rarityArtifacts.remove(index);
            } 
            else if (rarity >= 50 && rarity <= 89 && mythArtifacts.size() > 0) { //40%
                rarityArtifacts = mythArtifacts;
                
                int index = (int) (Math.random() * rarityArtifacts.size());
                artifacts.add(rarityArtifacts.get(index));
                rarityArtifacts.remove(index);
            } 
            else{ //10%
                rarityArtifacts = commonArtifacts;
                
                int index = (int) (Math.random() * rarityArtifacts.size());
                artifacts.add(rarityArtifacts.get(index));
            }
        }
    }
}

import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GoldChest extends Chest
{

    public GoldChest(){
        super();
    }
    
    public void randomArtifact(){
        for (int i = 0; i < 2; i++){
            int rarity = (int) (Math.random() * 100);
            if (rarity >= 0 && rarity <= 9 && legendArtifacts.size() > 0) { //10%
                rarityArtifacts = legendArtifacts;
                
                int index = (int) (Math.random() * rarityArtifacts.size());
                artifacts.add(rarityArtifacts.get(index));
                rarityArtifacts.remove(index);
            } 
            else if (rarity >= 10 && rarity <= 59 && mythArtifacts.size() > 0) { //50%
                rarityArtifacts = mythArtifacts;
                
                int index = (int) (Math.random() * rarityArtifacts.size());
                artifacts.add(rarityArtifacts.get(index));
                rarityArtifacts.remove(index);
            } 
            else{ //40%
                rarityArtifacts = commonArtifacts;
                
                int index = (int) (Math.random() * rarityArtifacts.size());
                artifacts.add(rarityArtifacts.get(index));
            }
        }
    }
}

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
            if (rarity >= 0 && rarity <= 49) { //50%
                rarityArtifacts = legendArtifacts;
            } 
            else if (rarity >= 50 && rarity <= 89) { //40%
                rarityArtifacts = mythArtifacts;
            } 
            else if (rarity >= 90 && rarity <= 99) { //10%
                rarityArtifacts = commonArtifacts;
            }
            artifacts.add(rarityArtifacts.get((int) (Math.random() * rarityArtifacts.size())));
        }
    }
}

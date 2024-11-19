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
            if (rarity >= 0 && rarity <= 19) { //20%
                rarityArtifacts = legendArtifacts;
            } 
            else if (rarity >= 20 && rarity <= 59) { //40%
                rarityArtifacts = mythArtifacts;
            } 
            else if (rarity >= 60 && rarity <= 99) { //40%
                rarityArtifacts = commonArtifacts;
            }
            artifacts.add(rarityArtifacts.get((int) (Math.random() * rarityArtifacts.size())));
        }
    }
}

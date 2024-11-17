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
        if (rarity >= 0 && rarity <= 19) { //20%
            rarityArtifacts = legendArtifacts;
        } 
        else if (rarity >= 20 && rarity <= 59) { //40%
            rarityArtifacts = mythArtifacts;
        } 
        else if (rarity >= 60 && rarity <= 99) { //40%
            rarityArtifacts = commonArtifacts;
        }
        artifact = rarityArtifacts.get((int) (Math.random() * rarityArtifacts.size()));
    }
}

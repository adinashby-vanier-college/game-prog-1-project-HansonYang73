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
        if (rarity >= 0 && rarity <= 4) { //5%
            rarityArtifacts = legendArtifacts;
        } 
        else if (rarity >= 5 && rarity <= 24) { //20%
            rarityArtifacts = mythArtifacts;
        } 
        else if (rarity >= 25 && rarity <= 99) { //75%
            rarityArtifacts = commonArtifacts;
        }
        artifact = rarityArtifacts.get((int) (Math.random() * rarityArtifacts.size()));
    }
}

import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class TutorialWorld extends TemplateWorld
{
    private Chest ironChest2;
    /**
     * Constructor for objects of class TutorialWorld.
     */
    public TutorialWorld()
    {
        super();
        TemplateWorld.start();
        prepare();
        showTextWithBigBlackFont("These are the 3 tiers of chest: Iron, Gold, Diamond", 300, 80);
        showTextWithBigBlackFont("Use 'A' + 'D' or arrow keys to move", 20, 200);
        showTextWithBigBlackFont("Press Space to Jump", 20, 220);
        showTextWithBigBlackFont("Press 'LMB' or 'J' to attack", 700, 350);
        showTextWithBigBlackFont("Press 'E' to take the artifact", 700, 380);
        
        showTextWithBigBlackFont("Press 'Shift' + 'S' to drop down platforms", 300, 250);
        showTextWithBigBlackFont("Press 'Shift' + direction to dash", 600, 250);
    }
    
    public void act(){
        if (canGoNextWorld(knight)){
            goNextWorld(new World1(knight));
        }
    }
    
    private void prepare()
    {

        knight = new Knight();
        addObject(knight,149,352);

        showPotion();
        showCoin();

        DiamondChest diamondChest = new DiamondChest();
        addObject(diamondChest,595,29);
        GoldChest goldChest = new GoldChest();
        addObject(goldChest,466,35);
        IronChest ironChest = new IronChest();
        addObject(ironChest,324,32);
        goldChest.setLocation(466,38);
        StonePlatform stonePlatform = new StonePlatform(1200, 10);
        addObject(stonePlatform,450,317);
        stonePlatform.setLocation(468,322);
        knight.setLocation(32,295);
        knight.setLocation(39,256);
        knight.setLocation(42,271);
        IronChest ironChest2 = new IronChest();
        addObject(ironChest2,653,370);
        ironChest2.setLocation(660,374);
        Werewolf werewolf = new Werewolf();
        addObject(werewolf,896,244);
        removeObject(werewolf);
    }
}

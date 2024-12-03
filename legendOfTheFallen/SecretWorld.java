import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SecretWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecretWorld extends TemplateWorld
{

    /**
     * Constructor for objects of class SecretWorld.
     * 
     */
    public SecretWorld(Knight knight)
    {
        super();
        this.knight = knight;
        prepare();
        
        createTorch();
    }
    
    public SecretWorld()
    {
        super();
        this.knight = new Knight();
        addObject(knight, 5, 5);
        prepare();
        
        createTorch();
    }
    
    public void act(){
        if (canGoNextWorld(knight)){
            goNextWorld(new BossWorld(knight));
        }
    }
    
    public void prepare(){
        addObject(knight, 5, knight.getY()); 
        showPotion();
        showCoin();
        StonePlatform stonePlatform = new StonePlatform();
        addObject(stonePlatform,149,340);
        StonePlatform stonePlatform2 = new StonePlatform();
        addObject(stonePlatform2,383,347);
        stonePlatform2.setLocation(406,343);
        StonePlatform stonePlatform3 = new StonePlatform();
        addObject(stonePlatform3,601,342);
        StonePlatform stonePlatform4 = new StonePlatform();
        addObject(stonePlatform4,850,343);
        StonePlatform stonePlatform5 = new StonePlatform(200, 20);
        addObject(stonePlatform5,486,236);
        DiamondChest diamondChest = new DiamondChest();
        addObject(diamondChest,451,204);
        diamondChest.setLocation(447,232);
        Potion2 potion2 = new Potion2();
        addObject(potion2,149,307);
        Potion2 potion22 = new Potion2();
        addObject(potion22,388,312);
        Potion2 potion23 = new Potion2();
        addObject(potion23,602,309);
        Potion2 potion24 = new Potion2();
        addObject(potion24,847,307);
        stonePlatform2.setLocation(419,344);
        stonePlatform2.setLocation(384,353);
        stonePlatform2.setLocation(355,340);
        stonePlatform5.setLocation(471,223);
        diamondChest.setLocation(439,190);
        stonePlatform3.setLocation(710,344);
        potion23.setLocation(696,306);
        stonePlatform2.setLocation(354,343);
        potion22.setLocation(288,311);
        stonePlatform5.setLocation(478,216);
        stonePlatform5.setLocation(497,265);
        diamondChest.setLocation(431,240);
        stonePlatform2.setLocation(300,343);
        diamondChest.setLocation(435,237);
    }
}

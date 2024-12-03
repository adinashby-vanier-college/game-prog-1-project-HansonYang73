import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World6 extends TemplateWorld
{
    private int one = 1;
    private GreenfootSound growl = new GreenfootSound("MonsterGrowl2.mp3");
    /**
     * Constructor for objects of class World6.
     * 
     */
    public World6(Knight knight)
    {
        super();
        this.knight = knight;
        prepare();
    }
    
    public World6()
    {
        super();
        this.knight = new Knight();
        addObject(knight, 5, 5);
        prepare();
        createTorch();
    }
    
    public void act(){
        if (getObjects(Enemy.class).size() == 0 && one == 1){
            growl.play();
            one--;
        }
        if (canGoNextWorld(knight)){
            goNextWorld(new Shop2(knight));
        }
    }
    
    public void prepare(){
        addObject(knight, 5, knight.getY()); 
        showPotion();
        showCoin();
        StonePlatform stonePlatform = new StonePlatform(220, 20);
        addObject(stonePlatform,879,222);
        stonePlatform.setLocation(893,293);
        stonePlatform.setLocation(947,277);
        StonePlatform stonePlatform2 = new StonePlatform(20, 20);
        addObject(stonePlatform2,383,310);
        stonePlatform2.setLocation(505,314);
        stonePlatform.setLocation(841,247);
        stonePlatform.setLocation(891,242);
        IronChest ironChest = new IronChest();
        addObject(ironChest,967,205);
        stonePlatform2.setLocation(223,331);
        StonePlatform stonePlatform3 = new StonePlatform(20, 20);
        addObject(stonePlatform3,515,208);
        stonePlatform2.setLocation(287,345);
        stonePlatform3.setLocation(548,275);
        Werewolf werewolf = new Werewolf();
        addObject(werewolf,936,326);
        Werewolf werewolf2 = new Werewolf();
        addObject(werewolf2,804,334);
        Werewolf werewolf3 = new Werewolf();
        addObject(werewolf3,683,337);
        Werewolf werewolf4 = new Werewolf();
        addObject(werewolf4,517,329);
        werewolf3.setLocation(678,317);
        werewolf2.setLocation(781,303);
        werewolf.setLocation(928,329);
        Zombie zombie = new Zombie();
        addObject(zombie,268,299);
        Werewolf werewolf5 = new Werewolf();
        addObject(werewolf5,370,288);
        stonePlatform2.setLocation(216,381);
        stonePlatform3.setLocation(534,285);
        stonePlatform3.setLocation(536,281);
        werewolf4.setLocation(477,331);
        stonePlatform3.setLocation(513,293);
    }
}

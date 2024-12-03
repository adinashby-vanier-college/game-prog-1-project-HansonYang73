import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World5 extends TemplateWorld
{

    /**
     * Constructor for objects of class World5.
     * 
     */
     public World5(Knight knight)
    {
        super();
        this.knight = knight;
        prepare();
    }
    
    public World5()
    {
        super();
        this.knight = new Knight();
        addObject(knight, 5, 5);
        prepare();
    }
    
    public void act(){
        if (canGoNextWorld(knight)){
            goNextWorld(new World6(knight));
        }
    }
    
    public void prepare(){
        addObject(knight, 5, knight.getY()); 
        showPotion();
        showCoin();
        StonePlatform stonePlatform = new StonePlatform();
        addObject(stonePlatform,207,306);
        StonePlatform stonePlatform2 = new StonePlatform();
        addObject(stonePlatform2,842,314);
        stonePlatform2.setLocation(843,304);
        stonePlatform.setLocation(157,308);
        StonePlatform stonePlatform3 = new StonePlatform();
        addObject(stonePlatform3,461,212);
        stonePlatform3.setLocation(484,210);
        IronChest ironChest = new IronChest();
        addObject(ironChest,479,174);
        Werewolf werewolf = new Werewolf();
        addObject(werewolf,919,304);
        Werewolf werewolf2 = new Werewolf();
        addObject(werewolf2,754,288);
        Werewolf werewolf3 = new Werewolf();
        addObject(werewolf3,419,297);
        Werewolf werewolf4 = new Werewolf();
        addObject(werewolf4,254,288);
        Zombie zombie = new Zombie();
        addObject(zombie,577,285);
        Zombie zombie2 = new Zombie();
        addObject(zombie2,665,287);
        StonePlatform stonePlatform4 = new StonePlatform();
        addObject(stonePlatform4,800,116);
        Potion2 potion2 = new Potion2();
        addObject(potion2,800,69);
        potion2.setLocation(798,86);
        potion2.setLocation(809,87);
        potion2.setLocation(776,82);
        potion2.setLocation(785,92);
        potion2.setLocation(797,86);
    }
}

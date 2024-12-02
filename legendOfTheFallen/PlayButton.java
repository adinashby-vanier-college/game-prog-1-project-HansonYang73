import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton extends Actor
{
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MouseInfo mouseInfo = Greenfoot.getMouseInfo();
        if (Greenfoot.mousePressed(this)){
            new GreenfootSound("click.mp3").play();
            TitlePage.stop();
            Greenfoot.setWorld(new TutorialWorld());
        }
        if (isTouchingButton()){ //hover
            setImage("PlayButton2.png");
            setLocation(getX(), 304);
        }
        else{
            setImage("PlayButton.png");
            setLocation(getX(), 309);
        }
        int width = getImage().getWidth();
        int height = getImage().getHeight();
        getImage().scale((int) (width*1.5), (int) (height*1.5));
    }
    
    public boolean isTouchingButton(){
        MouseInfo mouseInfo = Greenfoot.getMouseInfo();
        if (mouseInfo != null){
            int x = mouseInfo.getX();
            int y = mouseInfo.getY();
            int xDist = Math.abs(getX() - x);
            int yDist = Math.abs(getY() - y);
            if (xDist < (getImage().getWidth()/2) && yDist < (getImage().getHeight()/2)){
                return true;
            }
        }
        return false;
    }
}

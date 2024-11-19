import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Artifact extends Actor
{
    
    public Artifact(){
        scaleImage();
    }
    
    public void getArtifact(){
    }
    
    public void scaleImage(){
        getImage().scale((int) (getImage().getWidth()/1.5),(int) (getImage().getHeight()/1.5));
    }
}

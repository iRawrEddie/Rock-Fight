import greenfoot.*;

/**
 * Write a description of class HardButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HardButton extends DifficultyMenu
{
    /**
     * Act - do whatever the HardButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Hard());
        }
    }    
}

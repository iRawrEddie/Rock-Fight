import greenfoot.*;

/**
 * Write a description of class EasyButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EasyButton extends DifficultyMenu
{
    /**
     * Act - do whatever the EasyButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Easy());
        }
    }    
}

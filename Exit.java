import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * This class exits the game whenever the player is done playing.
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends MainMenu
{
    /**
     * Act - do whatever the Exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.stop();
        }    
    }
}

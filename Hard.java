import greenfoot.*;

/**
 * Write a description of class Hard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hard extends BackDrop
{
    int counter = HARD;
    public Hard()
    {
        lives = 5;
        removeMainMenu();
    }

    public void act()
    {
        spawnRock();
        
        addVolumeButton();
        displayScore();
        displayLives();
        if(counter == HARD)
        {
            counter = 0;
            spawnBlackNormal(3);
            spawnBlueHard();
        }
        else
        {
            counter++;
        }
    }
}

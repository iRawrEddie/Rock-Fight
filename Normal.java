import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Normal extends BackDrop
{
    int counter = NORMAL;
    public Normal()
    {
        lives = 4;
        removeMainMenu();
    }

    public void act()
    {
        spawnRock();

        addVolumeButton();
        displayScore();
        displayLives();
        if(counter == NORMAL)
        {
            counter = 0;
            spawnBlueNormal();
            spawnBlackNormal(2);
        }
        else
        {
            counter++;
        }
    }
}
import greenfoot.*;

/**
 * Write a description of class BackDrop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackDrop extends World
{
    int easy = 3000;
    int normal = 1000;
    int hard = 500;
    
    StartGame startButton = new StartGame();
    Sound soundButton = new Sound();
    HighScore scoresButton = new HighScore();
    Exit exitButton = new Exit();

    EasyButton easyButton = new EasyButton();
    NormalButton normalButton = new NormalButton();
    HardButton hardButton = new HardButton();
    
    public BackDrop()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 538, 1); 
        
        addMainMenu();
    }

    public void addMainMenu()
    {
        addObject(startButton, getWidth()/2, getHeight()/2);
        addObject(soundButton, startButton.getX(), startButton.getY()+76);
        addObject(scoresButton, soundButton.getX(), soundButton.getY()+76);
        addObject(exitButton, scoresButton.getX(), scoresButton.getY()+76);
    }

    public void removeMainMenu()
    {
        removeObject(startButton);
        removeObject(soundButton);
        removeObject(scoresButton);
        removeObject(exitButton);
    }

    public void addDifficultySelect()
    {
        addObject(easyButton, getWidth()/2, getHeight()/4);
        addObject(normalButton, getWidth()/2, (getHeight()/4)*2);
        addObject(hardButton, getWidth()/2, (getHeight()/4)*3);
    }
}
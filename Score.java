import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    int score = 0;
    
    public Score(){
        setImage(new GreenfootImage("Score : "  + score, 50, Color.BLUE, Color.BLACK));
    }
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(new GreenfootImage("Score : "  + score, 50, Color.BLUE, Color.BLACK)); 
        win();
    }
    
    public void addScore(){
        score++;
    }
    
    public void win(){
        if (score > 20)
        {
            getWorld().addObject(new YouWin(), 300, 250);
            Greenfoot.playSound("win.wav");
            Greenfoot.stop();
        }
    }
}

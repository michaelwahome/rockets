import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lives here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lives extends Actor
{
    int lives = 3;
    
    public Lives(){
        setImage(new GreenfootImage("Lives : "  + lives, 50, Color.GREEN, Color.BLACK));
    }
    /**
     * Act - do whatever the Lives wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(new GreenfootImage("Lives : "  + lives, 50, Color.GREEN, Color.BLACK));
        loss();
    }
    
    public void deductLife(){
        lives--;
    }
    
    public void loss(){
        if (lives < 1)
        {
            getWorld().addObject(new YouLose(), 300, 250);
            Greenfoot.playSound("loss.wav");
            Greenfoot.stop();
        }
    }
}

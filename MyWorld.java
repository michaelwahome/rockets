import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Score score = new Score();
    Lives lives = new Lives();
    
    public Lives getLives()
    {
        return lives;
    }
    
    public Score getScore()
    {
        return score;
    }
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket,279,458);
        addObject(score,77,22);
        score.setLocation(88,26);
        score.setLocation(93,30);
        addObject(lives,530,25);
        lives.setLocation(515,30);
        lives.setLocation(515,30);
    }
    
    public void act()
    {
        addAsteroid();
    }
    
    public void addAsteroid()
    {
        if (Greenfoot.getRandomNumber(78)<1)
        {
            addObject(new Asteroid(), Greenfoot.getRandomNumber(600), 0);
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Actor
{
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        dropAsteroid();
        remove();
    }
    
    public void dropAsteroid(){
        setLocation(getX(), getY()+3);
    }
    
    public void remove(){
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if(bullet != null)
        {
            Greenfoot.playSound("explosion.wav");
            getWorld().removeObject(bullet);
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            Score score = myWorld.getScore();
            score.addScore();
            getWorld().removeObject(this);
        }
        else if (getY() == getWorld().getHeight() - 1)
        {
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            Lives lives = myWorld.getLives();
            lives.deductLife();
            getWorld().removeObject(this);
        }
    }
   
   
}

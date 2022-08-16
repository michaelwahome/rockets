import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        bulletUp();
        remove();
    }
    
    public void bulletUp()
    {
        setLocation(getX(), getY()-8);
    }
    
    public void remove()
    {        
        if(getY()==0)
        {
            getWorld().removeObject(this);
        }
    }
}

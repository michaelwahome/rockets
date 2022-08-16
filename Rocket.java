import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    boolean fire = true;
    
    public Rocket()
    {
        setRotation(270);
    }
    
    public void act()
    {
        moveAround();
        shoot();
    }
    
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+8, getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-8, getY());
        }
    }
    
    public void shoot()
    {
        if(Greenfoot.isKeyDown("space") && fire == true)
        {
            getWorld().addObject(new Bullet(), getX()-1, getY()-33);
            Greenfoot.playSound("pew.wav");
            fire = false;
        }
        if(!Greenfoot.isKeyDown("space"))
        {
            fire = true;
        }
    }
    
}

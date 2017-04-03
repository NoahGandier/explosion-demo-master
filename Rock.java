import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rock extends Actor
{
    public void explode()
    {
        Greenfoot.playSound("MetalExplosion.wav");
        for(int i=0;i<50;i++) {
            getWorld().addObject(new Debris(),getX(),getY());
        }
        getWorld().removeObject(this);
    }
    
    public void act()
    {
        explode();
    }
}

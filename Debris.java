import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Debris extends Actor
{
    private int speed;
    
    public Debris()
    {
        setRotation( Greenfoot.getRandomNumber(360) );
        int h = Greenfoot.getRandomNumber(20)+1;
        int w = Greenfoot.getRandomNumber(20)+1;
        getImage().scale(w,h);
        speed = Greenfoot.getRandomNumber(10)+5;
    }
    
    public void act() 
    {
        move(speed);
        if(isAtEdge()) {
            getWorld().removeObject(this);
        }
    }   
}

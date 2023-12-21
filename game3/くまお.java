import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class くまお here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class くまお extends Actor
{
    /**
     * Act - do whatever the くまお wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        getImage().scale( 60, 60 );
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(4);
    }
      if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(0);
        move(-4);
    }
      if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(90);
        move(-4);
    }
    if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(270);
        move(-4);
    }
 
    }    
}

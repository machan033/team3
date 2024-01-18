import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class くまお here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class くまお extends Actor
{
    Color meiro = new Color(61,163,26);
    
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
    
    //getWorld().showText( String.valueOf(getX()), 100, 50 );
   
   //getWorld().showText( String.valueOf( getWorld().getColorAt(getX(),getY()).getBlue() ), 200, 200 );
   //getWorld().showText( String.valueOf( getWorld().getColorAt(getX(),getY()).getGreen() ), 200, 250 );
   //getWorld().showText( String.valueOf( getWorld().getColorAt(getX(),getY()).getRed() ), 200, 300 );
    
   for( int x = -25; x<25;++x){
    if( getWorld().getColorAt(getX()+x,getY()).getBlue() < 5
    && getWorld().getColorAt(getX()+x,getY()).getGreen() < 5
    && getWorld().getColorAt(getX()+x,getY()).getRed() < 5
    ){
        Greenfoot.stop();
    }
}
for( int y = -15; y<15;++y){
    if( getWorld().getColorAt(getX(),getY()+y).getBlue() < 5
    && getWorld().getColorAt(getX(),getY()+y).getGreen() < 5
    && getWorld().getColorAt(getX(),getY()+y).getRed() < 5
    ){
        Greenfoot.stop();
    }
}
    
    /*
 Actor actor = getOneIntersectingObject( meiro.class );
      if( actor != null ){
    Greenfoot.stop();
}       */
 
    }    
}

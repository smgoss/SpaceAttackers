import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InvaderMissile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InvaderMissile extends Missile
{
    /**
     * Act - do whatever the InvaderMissile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (checkWorld()){
            move();
            checkHit();
            checkEdge();
        }
    }    
    public void move(){
        int curX = this.getX();
        int curY = this.getY();
        this.setLocation(curX, curY + 1);
    }
    public String toString(){
        return "Invader Missile";
    }
}

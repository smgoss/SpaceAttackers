import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Missile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Missile extends Mover
{
    private int health = 5;
    private int hitDamage = 5;
    /**
     * Act - do whatever the Missile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
    }
    public void checkEdge(){
        if(this.isAtEdge()){
            World W1 = this.getWorld();
            W1.removeObject(this);
        }
    }
    public void checkHealth(int healthLevel){
        if (healthLevel == 0){
            World W1 = this.getWorld();
            W1.removeObject(this);
        }
    }
    public void takeDamage(int damage){
        health = health - damage;
        if(health <= 0){
            World W1 = this.getWorld();
            W1.removeObject(this);
        }
    }
    public void checkHit(){
        Actor otherObject = (Actor) this.getOneIntersectingObject(null);
        if (otherObject != null){
            
            if (otherObject.getClass() == Missile.class){
                Missile M1 = (Missile) otherObject;
                M1.takeDamage(hitDamage);
                System.out.println("Missile Intersect");
            } else if( otherObject.getClass() == Players.class){
                
            }
            
        }
    }
    public boolean checkWorld(){
        if (this.getWorld() != null){
            return true;
        } else {
            return false;
        }
    }

}

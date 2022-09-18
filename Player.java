import java.awt.*;
import java.util.Random;

abstract class Player 
{
    protected String name;
    protected Weapon weapon;
    private Color color;
    private int health;
    private int atkPoint;
    private int dexPoint;
    private int statusPoint = 20;

    private int str = 0;
    private int dex = 0;
    private int vit = 0;

    public Player()
    {
        setName();
        setColor();
        setStat();
        setWeapon();

        atkPoint = str;
        atkPoint = weapon != null? atkPoint + weapon.getAttack(): atkPoint;
        

        dexPoint = dex * 2;
        dexPoint = weapon != null? dexPoint + weapon.getDex(): dexPoint;
        
        if (dexPoint > 100) dexPoint = 100;

        health = 100 + vit * 5;
        
    }

    protected abstract void setName();      
    protected abstract void setColor();     
    public final String getName() {return this.name;}

    protected abstract void setStat();          
    protected abstract void setWeapon();      

    protected final void setColor(int red, int green, int blue)
    {
        red = red > 255? 255: red;
        red = red < 0? 0: red;
        
        green = green > 255? 255: green;
        green = green < 0? 0: green;
        
        blue = blue > 255? 255: blue;
        blue = blue < 0? 0: blue;

        color = new Color(red, green, blue);
    }

    protected final void addStr()
    {
        if (statusPoint <= 0)    
        {
            System.out.println("No status points left. Cannot increase STR.");
            return;
        }

        statusPoint--;
        str++;

        System.out.println("STR is increased by 1! The current STR is " + str);
    }

    protected final void addDex()
    {
        if (statusPoint <= 0)    
        {
            System.out.println("No status points left. Cannot increase DEX.");
            return;
        }

        statusPoint--;
        dex++;

        System.out.println("DEX is increased by 1! The current DEX is " + dex);
    }

    protected final void addVit()
    {
        if (statusPoint <= 0)    
        {
            System.out.println("No status points left. Cannot increase VIT.");
            return;
        }

        statusPoint--;
        vit++;
        
        System.out.println("VIT is increased by 1! The current VIT is " + vit);
    }

    public final boolean isDead()
    {
        if (health <= 0) return true;
        else return false;
    }

    public final boolean checkReady()
    {
        if (name == null)   
        {
            System.out.println("Name has not been set");
            return false;
        }
        else
        {
            System.out.println("Welcome! " + name);
        }

        if (color == null)
        {
            System.out.println("Color has not been set");
            return false;
        }
        else
        {
            System.out.println("Your color is " + color.getRed()
            + ", " + color.getGreen()
            + ", " + color.getBlue());
        }

        System.out.println("Your status is : STR = " + str 
        + ", DEX = " + dex 
        + ", VIT = " + vit);

        
        if (color == null)
        {
            System.out.println("You do not have any weapon");
        }
        else 
        {
            System.out.println("Your weapon is : " + weapon.getName());
        }

        System.out.println("Attack point = " + atkPoint 
        + ", dexterity point = " + dexPoint 
        + ", health point = " + health);

        attack(null);

        return true;
    }

    public final void attack (Player enemy)
    {
        if (enemy == null)
        {
            System.out.println("You do not have an enemy but ready to attack!!");
            return;
        }

        Random rnd = new Random();

        if (rnd.nextInt(100) <= dexPoint)
        {
            
            System.out.println(name + " attacks " + enemy.getName() + " for " + atkPoint + " damage!");
            enemy.receiveAttack(atkPoint);
        }
        else
        {
            
            System.out.println(name + "'s attack missed!");
        }
    }

    public final void receiveAttack (int atkPoint)
    {
        health -= atkPoint;
        if (health < 0) health = 0;

        System.out.println(name + "'s health point left is " + health);
    }
}
abstract class Weapon 
{
    protected String name;
    protected int atkPoint = 0;
    protected int dexPoint = 0;
    public int getAttack() { return atkPoint; }
    public int getDex() { return dexPoint; }
    public String getName() { return name; }
}

class Sword extends Weapon
{
    public Sword()
    {
        name = "sword";
        atkPoint = 10;
        dexPoint = 50;
    }
}

class Axe extends Weapon
{
    public Axe()
    {
        name = "axe";
        atkPoint = 20;
        dexPoint = 30;
    }
}

class Knife extends Weapon
{
    public Knife()
    {
        name = "knife";
        atkPoint = 5;
        dexPoint = 70;
    }
}

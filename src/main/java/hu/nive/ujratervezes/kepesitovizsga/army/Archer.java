package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit{

    private int damage;
    private int hitPoints;
    private boolean armor = false;

    public Archer() {
        hitPoints = 50;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    @Override
    public int doDamage() {
        return 20;
    }

    @Override
    public void sufferDamage(int damage) {
        hitPoints -=  damage;
    }
}

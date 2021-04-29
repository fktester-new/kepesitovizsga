package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit{

    private int damage;
    private int hitPoints;
    private boolean armor = true;
    private static int numberOfDamages = 0;

    public HeavyCavalry() {
        hitPoints = 150;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    @Override
    public int doDamage() {
        int damage;
        if (numberOfDamages == 0) {
            damage = 60;
            numberOfDamages++;
        } else {
            damage = 20;
            numberOfDamages++;
        }
        return damage;
    }

    @Override
    public void sufferDamage(int damage) {
        hitPoints -= damage / 2;
    }
}

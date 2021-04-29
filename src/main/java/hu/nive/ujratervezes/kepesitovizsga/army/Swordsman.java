package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {

    private int damage;
    private int hitPoints;
    private boolean armor;
    private boolean shield;

    public Swordsman(boolean armor) {
        this.armor = armor;
        hitPoints = 100;
        shield = true;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    @Override
    public int doDamage() {
        return 10;
    }

    @Override
    public void sufferDamage(int damage) {
        int minus;
        if (shield){
            minus = 0;
            shield = false;
        } else if(armor){
            minus = damage / 2;

        } else {
            minus = damage;
        }
        hitPoints -= minus;
    }
}

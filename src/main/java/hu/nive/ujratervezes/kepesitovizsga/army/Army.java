package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.List;

public class Army {

private List<MilitaryUnit> army;

public void addUnit(MilitaryUnit militaryUnit){
    army.add(militaryUnit);
}

    public List<MilitaryUnit> getArmy() {
        return army;
    }
}

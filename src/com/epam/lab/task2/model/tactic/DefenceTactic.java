package com.epam.lab.task2.model.tactic;

import static com.epam.lab.task2.model.Constants.*;

public class DefenceTactic extends Tactic {
    int defence = DEFENCE_TACTIC_DEFENCE;
    int attack =  DEFENCE_TACTIC_ATTACK;

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public int getDefence() {
        return defence;
    }
}

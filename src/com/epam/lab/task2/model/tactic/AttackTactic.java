package com.epam.lab.task2.model.tactic;

import static com.epam.lab.task2.model.Constants.*;

public class AttackTactic extends Tactic {
    int defence = ATTACK_TACTIC_DEFENCE;
    int attack = ATTACK_TACTIC_ATTACK;

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public int getDefence() {
        return defence;
    }
}

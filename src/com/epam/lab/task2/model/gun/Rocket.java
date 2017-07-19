package com.epam.lab.task2.model.gun;

import com.epam.lab.task2.view.PrintToConsole;
import com.epam.lab.task2.model.Constants;

public class Rocket extends Gun {

    @Override
    public int timeForReload() {
        return Constants.ROCKET_TIME_T0_RELOAD;
    }

    @Override
    public int createDamage() {
        return Constants.ROCKET_DAMAGE;
    }

    @Override
    public void print() {
        PrintToConsole printToConsole = new PrintToConsole();
        printToConsole.printRocket();
    }
}

package com.epam.lab.task2.model.gun;

import com.epam.lab.task2.model.Constants;
import com.epam.lab.task2.view.PrintToConsole;

public class Blaster extends Gun {
    @Override
    public int timeForReload() {
        return Constants.BLASTER_TIME_T0_RELOAD;
    }

    @Override
    public int createDamage() {
        return Constants.BLASTER_DAMAGE;
    }

    @Override
    public void print() {
        PrintToConsole printToConsole = new PrintToConsole();
        printToConsole.printBlaster();
    }
}

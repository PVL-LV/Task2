package com.epam.lab.task2.model.droid;

import com.epam.lab.task2.Constants;
import com.epam.lab.task2.view.PrintToConsole;


public class B1Droid extends Droid {

    @Override
    public int getWalk() {
        return Constants.B1_DROID_WALK;
    }

    @Override
    public int getDefence() {
        return Constants.B1_DROID_DEFENCE;
    }


    @Override
    public void printDroid() {
        PrintToConsole printToConsole = new PrintToConsole();
        printToConsole.printDroidB1();
    }
}

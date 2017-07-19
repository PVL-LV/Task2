package com.epam.lab.task2;

import com.epam.lab.task2.controller.Controller;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.startGame();
        controller.createEnemyDroid();
        controller.startBattle();

    }
}

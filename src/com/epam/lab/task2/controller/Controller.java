package com.epam.lab.task2.controller;

import com.epam.lab.task2.model.droid.*;
import com.epam.lab.task2.model.gun.*;
import com.epam.lab.task2.view.PrintToConsole;
import java.util.Scanner;

public class Controller {
    private int usersDroid;
    private int usersGun;
    private int usersTactic;
    private int enemyDroid;
    private int enemyGun;
    private int enemyTactic;
    private Droid b1 = new B1Droid();
    private Droid b2 = new B2Droid();
    private Gun blaster = new Blaster();
    private Gun rocket = new Rocket();

    public Controller() {
        startGame();
        createEnemyDroid();
        startBattle();
    }

    public int getUsersDroid() {
        return usersDroid;
    }

    public int getUsersGun() {
        return usersGun;
    }

    public int getUsersTactic() {
        return usersTactic;
    }

    public int getEnemyDroid() {
        return enemyDroid;
    }

    public int getEnemyGun() {
        return enemyGun;
    }

    public int getEnemyTactic() {
        return enemyTactic;
    }

    public void startGame() {
        askUser("Game Started! \nChoose your Droid:  ");
        b1.printDroid();
        b2.printDroid();
        askUser("If you wish B1 - enter 1, B2 - enter 2");
        usersDroid = readFromConsole();
        askUser("Chose your gun:");
        blaster.print();
        rocket.print();
        askUser("Blaster - enter 1, rocket - enter 2");
        usersGun = readFromConsole();
        askUser("Chose your tactic:\n1. More attack.\n2.More Defence");
        usersTactic = readFromConsole();
    }

    public void createEnemyDroid() {
        String droid;
        String gun;
        String tactic;

        enemyDroid = random();
        enemyGun = random();
        enemyTactic = random();
        if (enemyDroid == 1) {
            droid = "B1";
        } else {
            droid = "B2";
        }
        if (enemyGun == 1) {
            gun = "Blaster";
        } else {
            gun = "Rocket";
        }
        if (enemyTactic == 1) {
            tactic = "more attack";
        } else {
            tactic = "more getDefence";
        }
        System.out.println(String.format("Your enemy is droid %s with %s and %s tactic.", droid, gun, tactic));
    }

    public void startBattle() {
        PrintToConsole printToConsole = new PrintToConsole();
        printToConsole.printStartBattle();
    }

    private int random() {
        int random = (int)( Math.random() * 2 + 1);
        return random;
    }

    private int readFromConsole() {
        int input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        return input;
    }

    private void askUser(String string) {
        System.out.println(string);
    }
}

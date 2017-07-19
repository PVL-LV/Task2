package com.epam.lab.task2.controller;

import com.epam.lab.task2.model.droid.B1Droid;
import com.epam.lab.task2.model.droid.B2Droid;
import com.epam.lab.task2.model.droid.Droid;
import com.epam.lab.task2.model.gun.Blaster;
import com.epam.lab.task2.model.gun.Gun;
import com.epam.lab.task2.model.gun.Rocket;
import com.epam.lab.task2.view.PrintToConsole;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Controller {
    int usersDroid;
    int usersGun;
    int usersTactic;
    int enemyDroid;
    int enemyGun;
    int enemyTactic;

    Droid b1 = new B1Droid();
    Droid b2 = new B2Droid();
    Gun blaster = new Blaster();
    Gun rocket = new Rocket();

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
        askUser("Chose your tactic:\n1. More attack.\n2.More getDefence");
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
        CountWhoWin countWhoWin = new CountWhoWin();
        countWhoWin.findWinner();
    }

    public int random() {
        int random = (int) ( Math.random() * 2 + 1);
        return random;
    }

    public int readFromConsole() {
        int input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        return input;
    }

    public void askUser(String string) {
        System.out.println(string);
    }
}

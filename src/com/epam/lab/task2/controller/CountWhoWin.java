package com.epam.lab.task2.controller;

import com.epam.lab.task2.model.droid.*;
import com.epam.lab.task2.model.gun.*;
import com.epam.lab.task2.model.tactic.*;

public class CountWhoWin {
    private Droid userDroid;
    private Droid enemyDroid;
    private Gun userGun;
    private Gun enemyGun;
    private Tactic userTactic;
    private Tactic enemyTactic;

    public void findWinner() {
        createDroidsForBattle();
        winnerIs();
    }

    private void createDroidsForBattle(){
        Controller controller = new Controller();
        userDroid = createDroid(controller.getUsersDroid());
        enemyDroid = createDroid(controller.getEnemyDroid());
        userGun = createGun(controller.getUsersGun());
        enemyGun = createGun(controller.getEnemyGun());
        userTactic = createTactic(controller.getUsersTactic());
        enemyTactic = createTactic(controller.getEnemyTactic());
    }

    private void winnerIs () {
        int userLife = userDroid.getEnergyLevel() * userTactic.getDefence() * userDroid.getWalk();
        int enemyLife = enemyDroid.getEnergyLevel() * enemyTactic.getDefence() * enemyDroid.getWalk();
        do {
            userLife -= enemyGun.createDamage() * enemyTactic.getAttack() * enemyDroid.getWalk() / enemyGun.timeForReload();
            enemyLife -= userGun.createDamage() * userTactic.getAttack() * userDroid.getWalk() / userGun.timeForReload();
        } while (userLife > 0 && enemyLife > 0);
        if (userLife > enemyLife) {
            System.out.println("You droid win!!");
        } else {
            System.out.println("Your droid loose, enemy is a winner!");
        }
    }

    private Droid createDroid(int drd) {
        Droid droid;
        if (drd == 1) {
            droid = new B1Droid();
        } else {
            droid = new B2Droid();
        }
        return droid;
    }

    private Gun createGun(int gn) {
        Gun gun;
        if (gn ==1) {
            gun = new Blaster();
        } else {
            gun = new Rocket();
        }
        return gun;
    }

    private Tactic createTactic(int tc) {
        Tactic tactic;
        if (tc == 1) {
            tactic = new AttackTactic();
        } else {
            tactic = new DefenceTactic();
        }
        return tactic;
    }
}
